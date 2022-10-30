package Kodlama.io.Devs.Kodlama.io.Devs.core.utilities.Result;

public class ErrorSuccessResult extends Result {

	public ErrorSuccessResult() {
		super(false);
	
	}
	public ErrorSuccessResult(boolean success, String message) {
		super(false, message);
	
	}

}
