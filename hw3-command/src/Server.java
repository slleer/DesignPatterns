import java.util.ArrayList;
public class Server{
	ArrayList<Command> order;
	public Server() {
		order = new ArrayList<Command>();
	}
	public void takeOrder(Command order) {
		this.order.add(order);
	}
	public void orderUp() {
		for(int i = 0; i < this.order.size(); i++) {
			order.get(i).execute();
		}
		this.newTicket();
	}
	public void newTicket() {
		this.order.clear();
	}
}