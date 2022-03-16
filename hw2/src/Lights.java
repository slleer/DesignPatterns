public class Lights extends DecorationsDecorator{

	public Lights(Tree t) {
		this.tree = t;
		this.cost = 5;
		this.description = ", Lights";
		// TODO Auto-generated constructor stub
	}
	public String getDescription() {
		return this.tree.getDescription() + this.description;
	}
	public int getCost() {
		return this.tree.getCost() + cost;
	}
}