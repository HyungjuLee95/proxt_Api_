package kr.co.inspien.Recruit.Ftpinfo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FtpInfo {
	 String ftpServer = "218.144.76.55";
     int ftpPort = 21; 
     String ftpUser = "Hyungju";
     String ftpPassword = "1234";
     String remoteFilePath = "/"; // ���� ���͸� ���
     String participantName = "LeeHyungJu"; // ���⿡ �����ڸ��� �����ϼ���.
     String currentDateTime = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
     String jsonFileName = "INSPIEN_JSON_" + participantName + "_" + currentDateTime + ".txt"; // ���ε��� JSON ���� �̸�
	public String getFtpServer() {
		return ftpServer;
	}
	public void setFtpServer(String ftpServer) {
		this.ftpServer = ftpServer;
	}
	public int getFtpPort() {
		return ftpPort;
	}
	public void setFtpPort(int ftpPort) {
		this.ftpPort = ftpPort;
	}
	public String getFtpUser() {
		return ftpUser;
	}
	public void setFtpUser(String ftpUser) {
		this.ftpUser = ftpUser;
	}
	public String getFtpPassword() {
		return ftpPassword;
	}
	public void setFtpPassword(String ftpPassword) {
		this.ftpPassword = ftpPassword;
	}
	public String getRemoteFilePath() {
		return remoteFilePath;
	}
	public void setRemoteFilePath(String remoteFilePath) {
		this.remoteFilePath = remoteFilePath;
	}
	public String getParticipantName() {
		return participantName;
	}
	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}
	public String getCurrentDateTime() {
		return currentDateTime;
	}
	public void setCurrentDateTime(String currentDateTime) {
		this.currentDateTime = currentDateTime;
	}
	public String getJsonFileName() {
		return jsonFileName;
	}
	public void setJsonFileName(String jsonFileName) {
		this.jsonFileName = jsonFileName;
	}
     
     
}
