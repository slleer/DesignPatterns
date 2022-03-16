public class LED extends DecorationsDecorator{

	public LED(Tree t) {
		this.tree = t;
		this.cost = 10;
		this.description = ", LED's";
		// TODO Auto-generated constructor stub
	}
	public String getDescription() {
		return this.tree.getDescription() + this.description;
	}
	public int getCost() {
		return this.tree.getCost() + cost;
	}
}