package model.excepitions;

public class UnacceptableValue extends Exception{
	private static final long serialVersionUID = 1L;
	
	public UnacceptableValue(String msg) {
		super(msg);
	}

}
