package test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
/*
 * @author ansuman.nayak
 */
public class JsonCreate {
public static void main(String[] args) throws JsonProcessingException {
	ObjectMapper mapper = new ObjectMapper();
	  ArrayNode arrayNode = mapper.createArrayNode();
	JsonNode rootNode = mapper.createObjectNode();
	ObjectNode childNode1 = mapper.createObjectNode();
	for(int i=0; i<3;i++) {
		
		((ObjectNode) childNode1).put("name1", i);
		((ObjectNode) childNode1).put("name2", "val2");
		
	}
	

	((ObjectNode) rootNode).set("obj1", childNode1);

arrayNode.add(rootNode);

	String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(arrayNode);
	System.out.println(jsonString);
}
}
