package kr.co.inspien.Recruit.WebService;
import java.io.ByteArrayInputStream;
import java.util.Base64;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import kr.co.inspien.Recruit.Factory.SetWebProxy;
import kr.co.inspien.Recruit.Ftpinfo.FtpInfo;
import kr.co.inspien.Recruit.Ftpinfo.ManageFtpData;
import kr.co.inspien.Recruit.Test.DT_RecruitingTestServices;
import kr.co.inspien.Recruit.Test.DT_RecruitingTestServicesResponse;
import kr.co.inspien.Recruit.Test.InspienGetRecruitingTestServicesInfoProxy;
import kr.co.inspien.Recruit.Xmlinfo.ManageXmlData;

public class WebServiceClient {
    public static void main(String[] args) {
        try {
        	
        	// 1. WebProxy 객체를 생성합니다.
        	SetWebProxy setWebProxy = new SetWebProxy();
        	InspienGetRecruitingTestServicesInfoProxy proxy = setWebProxy.MakeProxy();
        	
        	
         
        	//------------------------------------------------------------------------------------------------
            // 입력 데이터를 저장할 DT_RecruitingTestServices 인스턴스 생성
        	
            DT_RecruitingTestServices input = new DT_RecruitingTestServices();
            // 데이터 insert
            input.setNAME("이형주");
            input.setPHONE_NUMBER("01066389914");
            input.setE_MAIL("ccmchanggo@gmail.com");

            System.out.println("입력 데이터:");
            System.out.println("이름: " + input.getNAME());
            System.out.println("전화번호: " + input.getPHONE_NUMBER());
            System.out.println("이메일: " + input.getE_MAIL());
            
            
        	//------------------------------------------------------------------------------------------------
            // 프록시를 사용하여 웹 서비스 메서드 호출
            DT_RecruitingTestServicesResponse response = null;

            try {
                response = proxy.inspienGetRecruitingTestServicesInfo(input);
                System.out.println("웹 서비스 호출 완료");
            } catch (Exception e) {
                System.out.println("웹 서비스 호출 중 오류 발생: " + e.getMessage());
                e.printStackTrace();
            }

            if (response != null) {
                // 입력 데이터가 제대로 설정되었는지 확인
                if (input.getNAME() != null && input.getPHONE_NUMBER() != null && input.getE_MAIL() != null) {
                    System.out.println("입력 데이터 설정 성공");
                } else {
                    System.out.println("입력 데이터 설정 실패");
                }
                
        	//------------------------------------------------------------------------------------------------
            // XML 데이터 처리 및 DB Insert
//                DT_RecruitingTestServicesResponseDB_CONN_INFO dbConnInfo = new DT_RecruitingTestServicesResponseDB_CONN_INFO();
//                DT_RecruitingTestServicesResponseFTP_CONN_INFO ftpConnInfo = new DT_RecruitingTestServicesResponseFTP_CONN_INFO();
//                위 메서드는 설정을 위해 사용할까하다가 단순 오라클 연결이 더욱 코드 가독성이 높을 것이라 판단하여 사용하지 않고 진행

                String xmlData = new String(Base64.getDecoder().decode(response.getXML_DATA()), "EUC-KR");

                ManageXmlData manageXmlData = new   ManageXmlData();
                
                manageXmlData.XML_Data_parsing_inserting(xmlData);
                
          
        	//------------------------------------------------------------------------------------------------     
            // FTP 서버 연결 정보 설정
            //코드에 노출시킬 경우, 보안 우려가 있어서 따로 클래스로 뺏음
                FtpInfo ftpinfo = new FtpInfo();
                // FTP 클라이언트 생성 및 연결
                FTPClient ftpClient = new FTPClient();
                ftpClient.connect(ftpinfo.getFtpServer(), ftpinfo.getFtpPort());
                ftpClient.login(ftpinfo.getFtpUser(), ftpinfo.getFtpPassword());

                // FTP 전송 모드 설정 (이진 모드 또는 ASCII 모드)
                ftpClient.setFileType(FTP.BINARY_FILE_TYPE); // 이진 모드

                // JSON 데이터를 파싱하고 필요한 형식으로 가공
                String jsonData = new String(Base64.getDecoder().decode(response.getJSON_DATA()), "UTF-8");
                // 여기에서 JSON 데이터를 파싱하고 필요한 정보를 추출하고 가공합니다.
                try {
                	
                	ManageFtpData parsingFtpData = new ManageFtpData();
                	StringBuilder parsedFtpData = parsingFtpData.PasingFtpData(jsonData);
                    // 업로드할 JSON 데이터 설정(네트워크로 전송하기 위해 가공하는 부분)
                    byte[]  parsedDatas  = parsedFtpData.toString().getBytes("UTF-8");

                    // 데이터를 FTP 서버에 업로드
                    boolean uploadResult = ftpClient.storeFile(ftpinfo.getRemoteFilePath() + ftpinfo.getJsonFileName(), new ByteArrayInputStream(parsedDatas));

                    if (uploadResult) {
                        System.out.println("JSON 데이터가 성공적으로 FTP 서버에 업로드되었습니다.");
                    } else {
                        System.out.println("JSON 데이터 업로드 실패");
                    }

                } catch (Exception e) {
                    System.out.println("JSON 데이터 가공 중 오류 발생: " + e.getMessage());
                    e.printStackTrace();
                }
            

                // FTP 연결 해제
                ftpClient.logout();
                ftpClient.disconnect();

              
                // 데이터를 필요한대로 처리
                // xmlData, dbConnInfo, ftpConnInfo는 추가 처리를 위해 사용 가능

            } else {
                System.out.println("웹 서비스 응답이 없습니다.");
            }

        } catch (Exception e) {
            // 예외 처리
            e.printStackTrace();
        }
    }
}
