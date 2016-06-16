package proxy.impl;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import proxy.MethodAspect;

public class ProxyHandler implements InvocationHandler{
	//保存对象
	private MethodAspect method;
	private Object obj_invoke;
	
	public ProxyHandler(Object o, MethodAspect method) {
		this.obj_invoke = o;
		this.method = method;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		this.method.before(proxy, method, args);
		Object obj = method.invoke(obj_invoke, args);
		this.method.after(proxy, method, args);
		return obj;
	}
}
