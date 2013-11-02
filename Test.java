
import echode.Program;
import echode.RespondsTo;
import java.io.PrintStream;


public class Test implements Program {

	@Override
	
	public String help() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RespondsTo(command = "test")
	public void run(PrintStream o) {
		o.println("Hehlo!");

	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

}
