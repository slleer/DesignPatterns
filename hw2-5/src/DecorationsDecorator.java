public abstract class DecorationsDecorator extends Tree{
	Tree tree;
	int max = -1;
	String separator = ", ";
	public String getDescription() {
		if(this.max > 0 && this.tree.hasDecoration(this, 1) > this.max) {
			System.out.println("Tree already has " + this.description + "!");
			this.description = "";
			this.separator = "";
		}
		return this.tree.getDescription() + separator + this.description;
	}
	public int getCost() {
		if(this.max > 0 && this.tree.hasDecoration(this, 1) > 1) {
			cost = 0;
		}
		return this.tree.getCost() + cost;
	}
	public int hasDecoration(DecorationsDecorator dec, int count) {
		if(this.getClass() == dec.getClass()) {
			count++;
		}
		return this.tree.hasDecoration(dec, count);
	}
}