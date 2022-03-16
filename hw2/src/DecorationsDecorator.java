public abstract class DecorationsDecorator extends Tree{
	Tree tree;
	public abstract String getDescription();
	public abstract int getCost();
	public boolean hasStar() {
		return this.tree.hasStar();
	}
}