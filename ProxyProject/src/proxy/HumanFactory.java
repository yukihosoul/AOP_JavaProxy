package proxy;
import java.lang.reflect.Proxy;
import proxy.annon.AnnoInjection;
import proxy.impl.ProxyHandler;

public class HumanFactory {
	
/***
 * 获取对象方法
 * @param obj
 * @return
 */
private static Object getHuamnBase(Object obj, MethodAspect aspect){
	new AnnoInjection();
	//获取代理对象
	return Proxy.newProxyInstance(
			obj.getClass().getClassLoader(), 
			obj.getClass().getInterfaces(), 
			new ProxyHandler(AnnoInjection.getBean(obj), aspect)
			);
}
	

	@SuppressWarnings("unchecked")
	public static <T> T  getHuman(Class<?> clazz, MethodAspect aspect){
		Object obj=null;
		try {
			obj= getHuamnBase(clazz.newInstance(),aspect);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (T)obj;
	}
}
