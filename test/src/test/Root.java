package test;

import java.util.ArrayList;

public class Root {
private String status;
private Reference author;
private String authored;
private Reference source;

private ArrayList<itemDef> item = new ArrayList<itemDef>();
public Root(String status, Reference author, String authored, Reference source, ArrayList<itemDef> item) {
	super();
	this.status = status;
	this.author = author;
	this.authored = authored;
	this.source = source;
	this.item = item;
}
public Root() {
	super();
	// TODO Auto-generated constructor stub
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public Reference getAuthor() {
	return author;
}
public void setAuthor(Reference author) {
	this.author = author;
}
public String getAuthored() {
	return authored;
}
public void setAuthored(String authored) {
	this.authored = authored;
}
public Reference getSource() {
	return source;
}
public void setSource(Reference source) {
	this.source = source;
}
public ArrayList<itemDef> getItem() {
	return item;
}
public void setItem(ArrayList<itemDef> item) {
	this.item = item;
}
@Override
public String toString() {
	return "Root [status=" + status + ", author=" + author + ", authored=" + authored + ", source=" + source + ", item="
			+ item + "]";
}



}
