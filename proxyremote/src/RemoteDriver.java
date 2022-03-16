import java.lang.reflect.*;

public class RemoteDriver {
	public static void main(String[] args) {
		RemoteDriver rd = new RemoteDriver();
		rd.drive();
	}
	public RemoteDriver() {
		System.out.println("Lets test this dynamic proxy remote out.");
	}
	public void drive() {
		 IRemote remote = new Remote();
		 IRemote adultProxy = getAdultProxy(remote);
		 System.out.println("The Adults are using the adult remote.");
		 adultProxy.channelUp();
		 adultProxy.channelDown();
		 adultProxy.volumeUp();
		 adultProxy.volumeDown();
		 System.out.println("The Children are using the child remote.");
		 IRemote childProxy = getChildProxy(remote);
		 childProxy.volumeUp();
		 childProxy.volumeDown();
		 try {
			 childProxy.channelUp();			 
		 } catch (Exception e) {
			 System.out.println("Children are not allowed to change the channel.");
		 }
		 try {
			 childProxy.channelDown();			 
		 } catch (Exception e) {
			 System.out.println("Children are not allowed to change the channel.");
		 }
	}
	public IRemote getAdultProxy(IRemote remote) {
		return (IRemote) Proxy.newProxyInstance(
				remote.getClass().getClassLoader(),
				remote.getClass().getInterfaces(),
				new AdultInvocationHandler(remote));
	}
	public IRemote getChildProxy(IRemote remote) {
		return (IRemote) Proxy.newProxyInstance(
				remote.getClass().getClassLoader(),
				remote.getClass().getInterfaces(),
				new ChildInvocationHandler(remote));
	}
}