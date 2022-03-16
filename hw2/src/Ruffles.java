public class Ruffles extends DecorationsDecorator{

	public Ruffles(Tree t) {
		this.tree = t;
		this.cost = 1;
		this.description = ", Ruffles";
		// TODO Auto-generated constructor stub
	}
	public String getDescription() {
		return this.tree.getDescription() + this.description;
	}
	public int getCost() {
		return this.tree.getCost() + cost;
	}
}