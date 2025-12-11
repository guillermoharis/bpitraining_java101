package ph.com.bpi;

public class MyApplication {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Executable excel = new MSExcel("MsExcel");
		Executable word = new MSWord("MsWord");
		
		runProgram(excel);
		runProgram(word);
		
		checkProgramStatus(excel);
		checkProgramStatus(word);
		
		stopProgram(excel);
		stopProgram(word);
		
		checkProgramStatus(excel);
		checkProgramStatus(word);
	}
	
	private static void runProgram(Executable executableProgram) {
		executableProgram.run();
	}
	
	private static void stopProgram(Executable executableProgram) {
		executableProgram.stop();
	}
	
	private static void checkProgramStatus(Executable executableProgram) {
		
		if(executableProgram.getIsRunning() ) {
			
			System.out.println("Program " + executableProgram.getName() + " is running. ");
			
		} else {
			
			System.out.println("Program " + executableProgram.getName() + " is stopped. ");
		}
		
	}

}
