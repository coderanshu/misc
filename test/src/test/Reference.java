package test;

public class Reference {
private String reference;

public Reference(String reference) {
	super();
	this.reference = reference;
}

public Reference() {
	super();
	// TODO Auto-generated constructor stub
}

public String getReference() {
	return reference;
}

public void setReference(String reference) {
	this.reference = reference;
}

@Override
public String toString() {
	return "Reference [reference=" + reference + "]";
}


}
