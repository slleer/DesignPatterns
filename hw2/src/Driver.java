public class Driver{
	public static void main(String[] args) {
		Tree mytree = new BlueSpruce();
		mytree = new Star(mytree);
		mytree = new Ruffles(mytree);
		mytree = new Star(mytree);
		mytree = new Ruffles(mytree);
		printTree(mytree);
	}
	public static void printTree(Tree t) {
		System.out.println(t.getDescription() + " costs $" + t.getCost());
	}
}