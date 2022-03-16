public class ShakeCommand implements Command{
	Cook cook;
	
	public ShakeCommand(Cook cook) {
		this.cook = cook;
	}
	public void execute() {
		cook.makeShake();
	}
}