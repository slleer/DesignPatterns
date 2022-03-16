public abstract class Tree{
	String description;
	int cost;
	public String getDescription() {
		return description;
	}
	public int getCost() {
		return cost;
	}
	public int hasDecoration(DecorationsDecorator dec, int count) {
		return count;
	}
}
