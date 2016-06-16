package proxy.bean;
import proxy.annon.Prop;

public class Man implements Human{
@Prop(value="王大锤")
private String name;
private String age;
private String work;

@Override
public void setName(String name) {
	this.name = name;
}
@Override
public String getName() {
	return name;
}
@Override
public String getWork() {
	return work;
}
@Override
@Prop(value="Java开发工程师")
public void setWork(String work) {
	this.work = work;
	
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
}