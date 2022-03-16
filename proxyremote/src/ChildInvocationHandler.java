import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public class ChildInvocationHandler implements InvocationHandler {
	IRemote remote;
	public ChildInvocationHandler(IRemote remote) {
		this.remote = remote;
	}
	
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		try {
			if(method.getName().startsWith("volume")) {
				return method.invoke(remote, args);				
			}
			else if (method.getName().startsWith("channel")) {
				throw new IllegalAccessException();
			}
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
		
	}
}