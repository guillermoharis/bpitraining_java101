package ph.com.bpi;

public class MSExcel extends Executable {
	
	public MSExcel(String name) {
		this.setName(name);
	}
	
	@Override
	public void run() {
		String message = "Opening MS Excel...";
		setRun(true);
		System.out.println(message);

	}

	@Override
	public void stop() {
		String message = "Stopping MS Excel...";
		setRun(false);
		System.out.println(message);
	}

}
