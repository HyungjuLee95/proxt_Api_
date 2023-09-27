package kr.co.inspien.Recruit.Test;

public class InspienGetRecruitingTestServicesInfoProxy implements kr.co.inspien.Recruit.Test.InspienGetRecruitingTestServicesInfo {
  private String _endpoint = null;
  private kr.co.inspien.Recruit.Test.InspienGetRecruitingTestServicesInfo inspienGetRecruitingTestServicesInfo = null;
  
  public InspienGetRecruitingTestServicesInfoProxy() {
    _initInspienGetRecruitingTestServicesInfoProxy();
  }
  
  public InspienGetRecruitingTestServicesInfoProxy(String endpoint) {
    _endpoint = endpoint;
    _initInspienGetRecruitingTestServicesInfoProxy();
  }
  
  private void _initInspienGetRecruitingTestServicesInfoProxy() {
    try {
      inspienGetRecruitingTestServicesInfo = (new kr.co.inspien.Recruit.Test.InspienGetRecruitingTestServicesInfoServiceLocator()).getHTTPS_Port();
      if (inspienGetRecruitingTestServicesInfo != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)inspienGetRecruitingTestServicesInfo)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)inspienGetRecruitingTestServicesInfo)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (inspienGetRecruitingTestServicesInfo != null)
      ((javax.xml.rpc.Stub)inspienGetRecruitingTestServicesInfo)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public kr.co.inspien.Recruit.Test.InspienGetRecruitingTestServicesInfo getInspienGetRecruitingTestServicesInfo() {
    if (inspienGetRecruitingTestServicesInfo == null)
      _initInspienGetRecruitingTestServicesInfoProxy();
    return inspienGetRecruitingTestServicesInfo;
  }
  
  public kr.co.inspien.Recruit.Test.DT_RecruitingTestServicesResponse inspienGetRecruitingTestServicesInfo(kr.co.inspien.Recruit.Test.DT_RecruitingTestServices MT_RecruitingTestServices) throws java.rmi.RemoteException{
    if (inspienGetRecruitingTestServicesInfo == null)
      _initInspienGetRecruitingTestServicesInfoProxy();
    return inspienGetRecruitingTestServicesInfo.inspienGetRecruitingTestServicesInfo(MT_RecruitingTestServices);
  }
  
  
}