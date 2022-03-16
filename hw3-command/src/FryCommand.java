public class FryCommand implements Command{
	Cook cook;
	
	public FryCommand(Cook cook) {
		this.cook = cook;
	}
	public void execute() {
		cook.makeFries();
	}
}