package kr.co.inspien.Recruit.Factory;

import kr.co.inspien.Recruit.Test.InspienGetRecruitingTestServicesInfoProxy;



public class SetWebProxy {
	
	public InspienGetRecruitingTestServicesInfoProxy MakeProxy(){
	  InspienGetRecruitingTestServicesInfoProxy proxy=  new InspienGetRecruitingTestServicesInfoProxy(); 
      // ��������Ʈ �ּҸ� ���� ������ ������ ����
	  
	  proxy.setEndpoint("http://211.106.171.36:50000/XISOAPAdapter/MessageServlet?senderParty=&senderService=INSPIEN&receiverParty=&receiverService=&interface=InspienGetRecruitingTestServicesInfo&interfaceNamespace=http%3A%2F%2Finspien.co.kr%2FRecruit%2FTest");

	  
      // ���Ͻ� ��ü�� ���������� �����Ǿ����� Ȯ��
      if (proxy != null) {
          System.out.println("���Ͻ� ��ü ���� ����");
      } else {
          System.out.println("���Ͻ� ��ü ���� ����");
      }
	return proxy;
	}

}
