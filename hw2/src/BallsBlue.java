public class BallsBlue extends DecorationsDecorator{

	public BallsBlue(Tree t) {
		this.tree = t;
		this.cost = 2;
		this.description = ", Balls Blue";
		// TODO Auto-generated constructor stub
	}
	public String getDescription() {
		return this.tree.getDescription() + this.description;
	}
	public int getCost() {
		return this.tree.getCost() + cost;
	}
}