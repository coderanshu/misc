package test;

import java.io.IOException;
import java.nio.file.Files;
import java.util.Iterator;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonRead {
public static void main(String[] args) throws IOException {
	byte[] jsonData ="{\"properties\":[{\"age\":{\"salary\":\"1000 USD\"}}]}".getBytes();

	//create ObjectMapper instance
	ObjectMapper objectMapper = new ObjectMapper();

	//read JSON like DOM Parser
	JsonNode rootNode = objectMapper.readTree(jsonData);
	//JsonNode idNode = rootNode.path("properties");
	//    System.out.println("id = "+idNode.get("age").asText());

	JsonNode phoneNosNode = rootNode.path("properties");
	Iterator<JsonNode> elements = phoneNosNode.elements();
	while(elements.hasNext()){
		JsonNode phone = elements.next();
		System.out.println("Phone No = "+phone.get("age").get("salary").asText());
	}

}
}
