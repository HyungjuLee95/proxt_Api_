package kr.co.inspien.Recruit.Factory;

import kr.co.inspien.Recruit.Test.InspienGetRecruitingTestServicesInfoProxy;



public class SetWebProxy {
	
	public InspienGetRecruitingTestServicesInfoProxy MakeProxy(){
	  InspienGetRecruitingTestServicesInfoProxy proxy=  new InspienGetRecruitingTestServicesInfoProxy(); 
      // 엔드포인트 주소를 내가 제공한 것으로 변경
	  
	  proxy.setEndpoint("http://211.106.171.36:50000/XISOAPAdapter/MessageServlet?senderParty=&senderService=INSPIEN&receiverParty=&receiverService=&interface=InspienGetRecruitingTestServicesInfo&interfaceNamespace=http%3A%2F%2Finspien.co.kr%2FRecruit%2FTest");

	  
      // 프록시 객체가 정상적으로 생성되었는지 확인
      if (proxy != null) {
          System.out.println("프록시 객체 생성 성공");
      } else {
          System.out.println("프록시 객체 생성 실패");
      }
	return proxy;
	}

}
