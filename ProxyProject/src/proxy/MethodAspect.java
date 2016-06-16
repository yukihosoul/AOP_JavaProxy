package proxy;
import java.lang.reflect.Method;

public interface MethodAspect {
	
	public void before(Object obj, Method m, Object[] args);
	
	public void after(Object obj, Method m, Object[] args);
	
}
