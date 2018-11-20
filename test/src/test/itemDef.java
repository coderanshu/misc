package test;

import java.util.ArrayList;

public class itemDef {
private String linkId;
private String text;
private ArrayList<AnswerText> answer =new ArrayList<AnswerText>();
private ArrayList<itemDef> item=new ArrayList<itemDef>();
public itemDef(String linkId, String text, ArrayList<AnswerText> answer, ArrayList<itemDef> item) {
	super();
	this.linkId = linkId;
	this.text = text;
	this.answer = answer;
	this.item = item;
}
public itemDef() {
	super();
	// TODO Auto-generated constructor stub
}
public String getLinkId() {
	return linkId;
}
public void setLinkId(String linkId) {
	this.linkId = linkId;
}
public String getText() {
	return text;
}
public void setText(String text) {
	this.text = text;
}
public ArrayList<AnswerText> getAnswer() {
	return answer;
}
public void setAnswer(ArrayList<AnswerText> answer) {
	this.answer = answer;
}
public ArrayList<itemDef> getItem() {
	return item;
}
public void setItem(ArrayList<itemDef> item) {
	this.item = item;
}
@Override
public String toString() {
	return "itemDef [linkId=" + linkId + ", text=" + text + ", answer=" + answer + ", item=" + item + "]";
}




}
