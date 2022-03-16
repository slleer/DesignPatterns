import java.lang.reflect.*;
public class AdultInvocationHandler implements InvocationHandler {
	IRemote remote;
	public AdultInvocationHandler(IRemote remote) {
		this.remote = remote;
	}
	
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		try {
			return method.invoke(remote, args);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
		
	}
}