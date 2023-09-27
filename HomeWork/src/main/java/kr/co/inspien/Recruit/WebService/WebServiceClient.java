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
        	
        	// 1. WebProxy ��ü�� �����մϴ�.
        	SetWebProxy setWebProxy = new SetWebProxy();
        	InspienGetRecruitingTestServicesInfoProxy proxy = setWebProxy.MakeProxy();
        	
        	
         
        	//------------------------------------------------------------------------------------------------
            // �Է� �����͸� ������ DT_RecruitingTestServices �ν��Ͻ� ����
        	
            DT_RecruitingTestServices input = new DT_RecruitingTestServices();
            // ������ insert
            input.setNAME("������");
            input.setPHONE_NUMBER("01066389914");
            input.setE_MAIL("ccmchanggo@gmail.com");

            System.out.println("�Է� ������:");
            System.out.println("�̸�: " + input.getNAME());
            System.out.println("��ȭ��ȣ: " + input.getPHONE_NUMBER());
            System.out.println("�̸���: " + input.getE_MAIL());
            
            
        	//------------------------------------------------------------------------------------------------
            // ���Ͻø� ����Ͽ� �� ���� �޼��� ȣ��
            DT_RecruitingTestServicesResponse response = null;

            try {
                response = proxy.inspienGetRecruitingTestServicesInfo(input);
                System.out.println("�� ���� ȣ�� �Ϸ�");
            } catch (Exception e) {
                System.out.println("�� ���� ȣ�� �� ���� �߻�: " + e.getMessage());
                e.printStackTrace();
            }

            if (response != null) {
                // �Է� �����Ͱ� ����� �����Ǿ����� Ȯ��
                if (input.getNAME() != null && input.getPHONE_NUMBER() != null && input.getE_MAIL() != null) {
                    System.out.println("�Է� ������ ���� ����");
                } else {
                    System.out.println("�Է� ������ ���� ����");
                }
                
        	//------------------------------------------------------------------------------------------------
            // XML ������ ó�� �� DB Insert
//                DT_RecruitingTestServicesResponseDB_CONN_INFO dbConnInfo = new DT_RecruitingTestServicesResponseDB_CONN_INFO();
//                DT_RecruitingTestServicesResponseFTP_CONN_INFO ftpConnInfo = new DT_RecruitingTestServicesResponseFTP_CONN_INFO();
//                �� �޼���� ������ ���� ����ұ��ϴٰ� �ܼ� ����Ŭ ������ ���� �ڵ� �������� ���� ���̶� �Ǵ��Ͽ� ������� �ʰ� ����

                String xmlData = new String(Base64.getDecoder().decode(response.getXML_DATA()), "EUC-KR");

                ManageXmlData manageXmlData = new   ManageXmlData();
                
                manageXmlData.XML_Data_parsing_inserting(xmlData);
                
          
        	//------------------------------------------------------------------------------------------------     
            // FTP ���� ���� ���� ����
            //�ڵ忡 �����ų ���, ���� ����� �־ ���� Ŭ������ ����
                FtpInfo ftpinfo = new FtpInfo();
                // FTP Ŭ���̾�Ʈ ���� �� ����
                FTPClient ftpClient = new FTPClient();
                ftpClient.connect(ftpinfo.getFtpServer(), ftpinfo.getFtpPort());
                ftpClient.login(ftpinfo.getFtpUser(), ftpinfo.getFtpPassword());

                // FTP ���� ��� ���� (���� ��� �Ǵ� ASCII ���)
                ftpClient.setFileType(FTP.BINARY_FILE_TYPE); // ���� ���

                // JSON �����͸� �Ľ��ϰ� �ʿ��� �������� ����
                String jsonData = new String(Base64.getDecoder().decode(response.getJSON_DATA()), "UTF-8");
                // ���⿡�� JSON �����͸� �Ľ��ϰ� �ʿ��� ������ �����ϰ� �����մϴ�.
                try {
                	
                	ManageFtpData parsingFtpData = new ManageFtpData();
                	StringBuilder parsedFtpData = parsingFtpData.PasingFtpData(jsonData);
                    // ���ε��� JSON ������ ����(��Ʈ��ũ�� �����ϱ� ���� �����ϴ� �κ�)
                    byte[]  parsedDatas  = parsedFtpData.toString().getBytes("UTF-8");

                    // �����͸� FTP ������ ���ε�
                    boolean uploadResult = ftpClient.storeFile(ftpinfo.getRemoteFilePath() + ftpinfo.getJsonFileName(), new ByteArrayInputStream(parsedDatas));

                    if (uploadResult) {
                        System.out.println("JSON �����Ͱ� ���������� FTP ������ ���ε�Ǿ����ϴ�.");
                    } else {
                        System.out.println("JSON ������ ���ε� ����");
                    }

                } catch (Exception e) {
                    System.out.println("JSON ������ ���� �� ���� �߻�: " + e.getMessage());
                    e.printStackTrace();
                }
            

                // FTP ���� ����
                ftpClient.logout();
                ftpClient.disconnect();

              
                // �����͸� �ʿ��Ѵ�� ó��
                // xmlData, dbConnInfo, ftpConnInfo�� �߰� ó���� ���� ��� ����

            } else {
                System.out.println("�� ���� ������ �����ϴ�.");
            }

        } catch (Exception e) {
            // ���� ó��
            e.printStackTrace();
        }
    }
}
