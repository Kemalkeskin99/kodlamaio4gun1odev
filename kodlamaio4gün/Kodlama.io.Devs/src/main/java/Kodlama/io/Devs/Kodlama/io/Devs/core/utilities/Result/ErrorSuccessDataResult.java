package Kodlama.io.Devs.Kodlama.io.Devs.core.utilities.Result;

	public class ErrorSuccessDataResult<T> extends DataResult<T> {

		
		public  ErrorSuccessDataResult(T data) {
			super(data, true);
			
		}
		public  ErrorSuccessDataResult(T data,String message) {
			super(data, true, message);
			
		}
		public  ErrorSuccessDataResult() {
			super(null, true);
			
		}
		public  ErrorSuccessDataResult(T data, boolean success, String message) {
			super(null, true, message);
			
		}

	}


