public class BallsSilver extends DecorationsDecorator{

	public BallsSilver(Tree t) {
		this.tree = t;
		this.cost = 3;
		this.description = ", Balls Silver";
		// TODO Auto-generated constructor stub
	}
	public String getDescription() {
		return this.tree.getDescription() + this.description;
	}
	public int getCost() {
		return this.tree.getCost() + cost;
	}
}