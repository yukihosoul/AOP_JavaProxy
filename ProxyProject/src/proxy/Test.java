package proxy;
import proxy.bean.Human;
import proxy.bean.Man;
import proxy.impl.ManMethodAspect;

public class Test {
	public static void main(String[] args) {
		Human man = HumanFactory.getHuman(Man.class, new ManMethodAspect());
		System.out.println("我的名字叫"+man.getName()+"，职业是"+man.getWork());
	}
}
