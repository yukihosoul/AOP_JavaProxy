package proxy.impl;

import java.lang.reflect.Method;

import proxy.MethodAspect;

public class ManMethodAspect implements MethodAspect{

	@Override
	public void before(Object obj, Method m, Object[] args) {
		if (m.getName().equals("getWork")) {
			System.err.println("成功拦截" + m.getName() + "方法,启动");
		}
	}

	@Override
	public void after(Object obj, Method m, Object[] args) {
		if (m.getName().equals("getWork")) {
			System.err.println("成功拦截" + m.getName() + "方法,启动");
		}
	}
}
