package ph.com.bpi;

public abstract class Executable {

	private String name;
	private boolean isRunning = false;
	
	public Executable() {
	}
	
	public Executable(String name) {
		this.name = name;
	}
	
	abstract void run();
	abstract void stop();
	
	public String getName() {
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public boolean getIsRunning()
	{
		return isRunning;
	}
	public void setRun(boolean isRunning)
	{
		this.isRunning = isRunning;
	}

}
