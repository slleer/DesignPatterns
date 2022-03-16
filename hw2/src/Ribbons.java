public class Ribbons extends DecorationsDecorator{

	public Ribbons(Tree t) {
		this.tree = t;
		this.cost = 2;
		this.description = ", Ribbons";
		// TODO Auto-generated constructor stub
	}
	public String getDescription() {
		return this.tree.getDescription() + this.description;
	}
	public int getCost() {
		return this.tree.getCost() + cost;
	}
}