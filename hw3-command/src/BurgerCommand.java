public class BurgerCommand implements Command{
	Cook cook;
	
	public BurgerCommand(Cook cook) {
		this.cook = cook;
	}
	public void execute() {
		cook.makeBurger();
	}
}