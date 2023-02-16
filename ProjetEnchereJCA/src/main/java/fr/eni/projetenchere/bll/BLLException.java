package fr.eni.projetenchere.bll;

public class BLLException extends Exception{
	
	public BLLException(String message, Throwable cause) {
		super(message, cause);
	}

	public BLLException(String message) {
		super(message);
	}

	@Override
	public String getMessage() {
		return "BLL - " + super.getMessage();
	}

}
