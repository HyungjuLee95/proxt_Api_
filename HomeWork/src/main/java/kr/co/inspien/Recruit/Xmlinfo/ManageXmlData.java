package kr.co.inspien.Recruit.Xmlinfo;

import java.io.ByteArrayInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;


public class ManageXmlData {

	public void XML_Data_parsing_inserting(String xmlData) throws Exception {
		try {
			// XML �ļ��� ����
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			ByteArrayInputStream inputXml = new ByteArrayInputStream(xmlData.getBytes("UTF-8"));

			// XML �����͸� �Ľ��Ͽ� Document ��ü ����
			Document document = builder.parse(inputXml);

			// HEADER ������Ʈ�� ��������
			NodeList headerList = document.getElementsByTagName("HEADER");
			for (int i = 0; i < headerList.getLength(); i++) {
				Element headerElement = (Element) headerList.item(i);

				String orderNumStr = headerElement.getElementsByTagName("ORDER_NUM").item(0).getTextContent();
				String orderPriceStr = headerElement.getElementsByTagName("ORDER_PRICE").item(0).getTextContent();
				String orderQtyStr = headerElement.getElementsByTagName("ORDER_QTY").item(0).getTextContent();

				int orderNum = Integer.parseInt(orderNumStr);
				int orderPrice = Integer.parseInt(orderPriceStr);
				int orderQty = Integer.parseInt(orderQtyStr);

				// �� HEADER ������Ʈ���� �ʿ��� ������ ����
				String orderID = headerElement.getElementsByTagName("ORDER_ID").item(0).getTextContent();
				String orderDate = headerElement.getElementsByTagName("ORDER_DATE").item(0).getTextContent();
				String receiverName = headerElement.getElementsByTagName("RECEIVER_NAME").item(0).getTextContent();
				String receiverNo = headerElement.getElementsByTagName("RECEIVER_NO").item(0).getTextContent();
				String etaDate = headerElement.getElementsByTagName("ETA_DATE").item(0).getTextContent();
				String destination = headerElement.getElementsByTagName("DESTINATION").item(0).getTextContent();
				String description = headerElement.getElementsByTagName("DESCIPTION").item(0).getTextContent();

			

				// Oracle DB ���� ����
				String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
				String dbUser = "JAVA";
				String dbPassword = "hi123456";

				Connection connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);

				if (connection != null) {
					System.out.println("Oracle DB ���� ����");
				} else {
					System.out.println("Oracle DB ���� ����");
				}

				// SQL INSERT �� �ۼ�
				String insertSql = "INSERT INTO INSPIEN_XMLDATA_INFO (ORDER_NUM, ORDER_ID, ORDER_DATE, ORDER_PRICE, ORDER_QTY, RECEIVER_NAME, RECEIVER_NO, ETA_DATE, DESTINATION, DESCIPTION, CURR_DT)"
						+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, sysdate)";
				// �����͸� ������ PreparedStatement ����
				PreparedStatement preparedStatement = connection.prepareStatement(insertSql);

				// XML �����͸� PreparedStatement�� ����
				preparedStatement.setInt(1, orderNum);
				preparedStatement.setString(2, orderID);
				preparedStatement.setString(3, orderDate);
				preparedStatement.setInt(4, orderPrice);
				preparedStatement.setInt(5, orderQty);
				preparedStatement.setString(6, receiverName);
				preparedStatement.setString(7, receiverNo);
				preparedStatement.setString(8, etaDate);
				preparedStatement.setString(9, destination);
				preparedStatement.setString(10, description);
				// ������ ���� ����
				int rowsAffected = preparedStatement.executeUpdate();

				if (rowsAffected > 0) {
					System.out.println("XML �����Ͱ� ���������� INSPIEN_XMLDATA_INFO ���̺� ���ԵǾ����ϴ�.");
				} else {
					System.out.println("XML ������ ���� ����");
				}
			}
		} catch (Exception e) {
			System.out.println("XML ������ �Ľ� �� ���� �߻�: " + e.getMessage());
			e.printStackTrace();
		}

	}
}
