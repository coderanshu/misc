package test;

public class AnswerText {
private String valueString;


public AnswerText(String valueString) {
	super();
	this.valueString = valueString;
}

public AnswerText() {
	super();
	// TODO Auto-generated constructor stub
}

public String getValueString() {
	return valueString;
}

public void setValueString(String valueString) {
	this.valueString = valueString;
}

@Override
public String toString() {
	return "AnswerText [valueString=" + valueString + "]";
}


}
