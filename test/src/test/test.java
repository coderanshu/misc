package test;

import java.io.IOException;
import java.util.Iterator;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class test {
	public static void main(String[] args) throws IOException {
		String json = "{\"status\":\"comp\",\"author\":{\"reference\":"
				+ "\"14454545\"},\"authored\":\"hghghg\",\"source\":"
				+ "{\"reference\":\"14454545\"},\"item\":[{\"linkId\""
				+ ":\"jkjk\",\"text\":\"text\",\"item\":[{\"linkId\":"
				+ "\"yyuy\",\"answer\":[{\"valueString\":\"cia\"}]},"
				+ "{\"linkId\":\"yyuy1222\",\"answer\":[{\"valueString\":"
				+ "\"cia1\"}]}]}]}";
		ObjectMapper mapper = new ObjectMapper();
		Root rt= mapper.readValue(json, Root.class);

		JsonNode jsonNode = mapper.readTree(json);
		JsonNode item = jsonNode.get("item");
		itemDef itemm= new itemDef();
		Iterator<JsonNode> items=item.elements();
		while(items.hasNext()) {
			JsonNode itemQ=items.next();
			JsonNode itm=itemQ.path("item");
			itemDef it=mapper.readValue(itemQ.toString(), itemDef.class);
			//System.out.println(it + "\n");

			itemm.setLinkId(it.getLinkId());
			itemm.setText(it.getText());

			AnswerText at=new AnswerText();
			//at.setValueString(it.getAnswer().get(0).getValueString());
			itemm.getAnswer().add(at);
			itemDef subItem=new itemDef();
			Iterator<JsonNode> itQ=itm.elements();
			while(itQ.hasNext()) {
				AnswerText at1=new AnswerText();
				JsonNode it1=itQ.next();
				//System.out.println(it1);
				subItem.setLinkId(it1.path("linkId").asText());
				at.setValueString(it1.path("answer").path(0).path("valueString").asText());
				subItem.getAnswer().add(at);

			}
			itemm.getItem().add(subItem);
			System.out.println(mapper.writeValueAsString(itemm));
		}
		rt.getItem().add(itemm);
		System.out.println(mapper.writeValueAsString(rt));
		// Output: color -> Black
		//System.out.println(json);


	}

}
