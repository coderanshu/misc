package test;

import java.io.IOException;
import java.util.Iterator;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class test {
	public static void main(String[] args) throws IOException {
		String json = "{\"resourceType\":\"QuestionnaireResponse\",\"id\":\"7415281520971309915\","
				+ "\"meta\":{\"versionId\":\"1\",\"lastUpdated\":\"2018-03-13T16:01:49.916-04:00\"}"
				+ ",\"identifier\":{\"value\":\"7415281520971309915\"},\"status\":\"completed\","
				+ "\"author\":{\"reference\":\"Practitioner/tnurse\"},\"authored\":\"2018-03-13T16:01:49-04:00\","
				+ "\"source\":{\"reference\":\"Patient/5000000835\"},\"item\":"
				+ "[{\"linkId\":\"Plan of care team evaluation assessment\",\"text\":"
				+ "\"Plan of care team evaluation assessment\"}]}";
		
		String json2="{\"resourceType\":\"QuestionnaireResponse\",\"id\":\"7415281520971309915\",\"meta\":{\"versionId\":\"1\",\"lastUpdated\":\"2018-03-13T16:01:49.916-04:00\"},\"identifier\":{\"value\":\"7415281520971309915\"},\"status\":\"completed\",\"author\":{\"reference\":\"Practitioner/tnurse\"},\"authored\":\"2018-03-13T16:01:49-04:00\",\"source\":{\"reference\":\"Patient/5000000835\"},\"item\":[{\"linkId\":\"Plan of care team evaluation assessment\",\"text\":\"Plan of care team evaluation assessment\",\"item\":[{\"linkId\":\"POCTE_Reason\",\"answer\":[{\"valueString\":\"Annual CIA\"}]},{\"linkId\":\"POCTE_Co_Morbidity\",\"text\":\"CO-MORBIDITY REVIEW COMPLETED\",\"answer\":[{\"valueBoolean\":true}]},{\"linkId\":\"Extended or frequent hospitalization\",\"text\":\"Extended or frequent hospitalization\",\"item\":[{\"linkId\":\"POCTE_Hosp15Disch30\",\"answer\":[{\"valueBoolean\":false}]},{\"linkId\":\"POCTE_3Adm\",\"answer\":[{\"valueBoolean\":false}]}]},{\"linkId\":\"Marked deterioration in health status\",\"text\":\"Marked deterioration in health status\",\"item\":[{\"linkId\":\"POCTE_AmbulChange\",\"answer\":[{\"valueBoolean\":false}]},{\"linkId\":\"POCTE_Symptoms\",\"answer\":[{\"valueBoolean\":false}]},{\"linkId\":\"POCTE_CardArrhythm\",\"answer\":[{\"valueBoolean\":false}]},{\"linkId\":\"POCTE_ReccInf\",\"answer\":[{\"valueBoolean\":false}]},{\"linkId\":\"POCTE_HeartFail\",\"answer\":[{\"valueBoolean\":false}]},{\"linkId\":\"POCTE_OrgSysDisease\",\"answer\":[{\"valueBoolean\":false}]},{\"linkId\":\"POCTE_ChrPeriton\",\"answer\":[{\"valueBoolean\":false}]}]},{\"linkId\":\"Significant change in psychosocial needs\",\"text\":\"Significant change in psychosocial needs\",\"item\":[{\"linkId\":\"POCTE_ChgPsycho\",\"answer\":[{\"valueBoolean\":false}]}]},{\"linkId\":\"Concurrent poor nutrition status, unmanaged anemia and inadequate dialysis \",\"text\":\"Concurrent poor nutrition status, unmanaged anemia and inadequate dialysis \",\"item\":[{\"linkId\":\"POCTE_AlbHGBKTV\",\"answer\":[{\"valueBoolean\":false}]}]},{\"linkId\":\"Acute Kidney Injury\",\"text\":\"Acute Kidney Injury\",\"item\":[{\"linkId\":\"POCTE_ActKidyInj\",\"answer\":[{\"valueBoolean\":false}]}]},{\"linkId\":\"Other\",\"text\":\"Other\",\"item\":[{\"linkId\":\"POCTE_FreeText\"}]},{\"linkId\":\"MD Approval\",\"text\":\"MD Approval\",\"item\":[{\"linkId\":\"POCTE_MDSign\",\"answer\":[{\"valueBoolean\":false}]},{\"linkId\":\"POCTE_MDComment\"},{\"linkId\":\"POCTE_MDApprvDate\"},{\"linkId\":\"POCTE_MDName\"},{\"linkId\":\"POCTE_MDPresence\",\"answer\":[{\"valueString\":\"Attended in Person\"}]}]},{\"linkId\":\"RN Approval\",\"text\":\"RN Approval\",\"item\":[{\"linkId\":\"POCTE_RNSign\",\"answer\":[{\"valueBoolean\":true}]},{\"linkId\":\"POCTE_RNComment\"},{\"linkId\":\"POCTE_RNApprvDate\",\"answer\":[{\"valueDateTime\":\"2018-03-13T20:01:47.530Z\"}]},{\"linkId\":\"POCTE_RNName\",\"answer\":[{\"valueString\":\"SC1 RN\"}]},{\"linkId\":\"POCTE_RNPresence\",\"answer\":[{\"valueString\":\"Attended in Person\"}]}]},{\"linkId\":\"SW Approval\",\"text\":\"SW Approval\",\"item\":[{\"linkId\":\"POCTE_SWSign\",\"answer\":[{\"valueBoolean\":false}]},{\"linkId\":\"POCTE_SWComment\"},{\"linkId\":\"POCTE_SWApprvDate\"},{\"linkId\":\"POCTE_SWName\"},{\"linkId\":\"POCTE_SWPresence\",\"answer\":[{\"valueString\":\"Attended in Person\"}]}]},{\"linkId\":\"RD Approval\",\"text\":\"RD Approval\",\"item\":[{\"linkId\":\"POCTE_RDSign\",\"answer\":[{\"valueBoolean\":false}]},{\"linkId\":\"POCTE_RDComment\"},{\"linkId\":\"POCTE_RDApprvDate\"},{\"linkId\":\"POCTE_RDName\"},{\"linkId\":\"POCTE_RDPresence\",\"answer\":[{\"valueString\":\"Attended in Person\"}]}]},{\"linkId\":\"PE Approval\",\"text\":\"PE Approval\",\"item\":[{\"linkId\":\"POCTE_PESign\",\"answer\":[{\"valueBoolean\":false}]},{\"linkId\":\"POCTE_PEComment\"},{\"linkId\":\"POCTE_PEApprvDate\"},{\"linkId\":\"POCTE_PEName\"},{\"linkId\":\"POCTE_PEPresence\",\"answer\":[{\"valueString\":\"Attended in Person\"}]}]},{\"linkId\":\"Other Approval\",\"text\":\"Other Approval\",\"item\":[{\"linkId\":\"pocte_OTHERSign\",\"answer\":[{\"valueBoolean\":false}]},{\"linkId\":\"pocte_OTHERComment\"},{\"linkId\":\"pocte_OTHERApprvDate\"},{\"linkId\":\"pocte_OTHERName\"}]},{\"linkId\":\"Missing Signatures\",\"text\":\"Missing Signatures\",\"item\":[{\"linkId\":\"POCTE_MSComment\"}]}]}]}";
		ObjectMapper mapper = new ObjectMapper();
		//Root rt= mapper.readValue(json, Root.class);

		JsonNode jsonNode = mapper.readTree(json2);
		JsonNode item = jsonNode.get("item");
		System.out.println(item);
		String it=item.toString().substring(1, item.toString().length()-1);
		//System.out.println());

		/*itemDef itemm= new itemDef();
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
			itemm.getItem().add(subItem);*/
			//System.out.println(mapper.writeValueAsString(itemm));
		//}
		// rt.getItem().add(itemm);
		 json = json.substring(0, json.length() - 1);
		 json = json.substring(0, json.length() - 1);
		 System.out.println(json+","+it+"]}");
	}

}
