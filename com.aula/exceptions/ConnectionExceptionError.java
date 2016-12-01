package exceptions;

import java.util.Iterator;

public class ConnectionExceptionError extends Exception  implements Iterable<Throwable>{

	private static final long serialVersionUID = 1L;
	
	@Override
	public String getMessage() {
		return "The Connection wasn't established successfully";
	}

	@Override
	public Iterator<Throwable> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
