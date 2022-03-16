public class Star extends DecorationsDecorator{

	public Star(Tree t) {
		this.tree = t;
		this.cost = 4;
		this.description = ", a Star";
		// TODO Auto-generated constructor stub
	}
	public String getDescription() {
		if(this.tree.hasStar()) {
			this.description = "";
			System.out.println("Tree already has a Star!");
		}
		return this.tree.getDescription() + this.description;
	}
	public int getCost() {
		if(this.tree.hasStar()) {
			cost = 0;
		}
		return this.tree.getCost() + cost;
	}
	public boolean hasStar() {
		return true;
	}
}