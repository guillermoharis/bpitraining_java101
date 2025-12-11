package ph.com.bpi;

public class MSWord extends Executable {
	
	public MSWord(String name) {
		this.setName(name);
	}
	
	@Override
	public void run() {
		String message = "Opening MS Word...";
		setRun(true);
		System.out.println(message);

	}

	@Override
	public void stop() {
		String message = "Stopping MS Word...";
		setRun(false);
		System.out.println(message);
	}

}
