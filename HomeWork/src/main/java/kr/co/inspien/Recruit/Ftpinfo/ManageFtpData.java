package kr.co.inspien.Recruit.Ftpinfo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ManageFtpData {
	public StringBuilder PasingFtpData(String jsonData) throws JsonMappingException, JsonProcessingException {
		 StringBuilder pasrsedFtpData = new StringBuilder();
		 
		 ObjectMapper objectMapper = new ObjectMapper();
         JsonNode jsonNode = objectMapper.readTree(jsonData);
		 
		  if (jsonNode.has("record")) {
              JsonNode recordArray = jsonNode.get("record");
              
              for (JsonNode item : recordArray) {
                  String names = item.get("Names").asText();
                  String phone = item.get("Phone").asText();
                  String email = item.get("Email").asText();
                  String birthDate = item.get("BirthDate").asText();
                  String company = item.get("Company").asText();
                  String personalNumber = item.get("PersonalNumber").asText();
                  String organisationNumber = item.get("OrganisationNumber").asText();
                  String country = item.get("Country").asText();
                  String region = item.get("Region").asText();
                  String city = item.get("City").asText();
                  String street = item.get("Street").asText();
                  int zipCode = item.get("ZipCode").asInt();
                  long creditCard = item.get("CreditCard").asLong();
                  String guid = item.get("GUID").asText();

                  // 필요한 형식으로 가공
                  String delimiter = "^";
                  String formattedLine = String.join(delimiter, guid, names, phone, email, birthDate, company, personalNumber, organisationNumber, country, region, city, street, String.valueOf(zipCode), String.valueOf(creditCard), guid);

                  pasrsedFtpData.append(formattedLine).append("\n");
              }
          }

		  System.out.println("JSON 데이터 가공 결과:");
          System.out.println(pasrsedFtpData.toString());
		 
		return pasrsedFtpData;
		
	}
}
