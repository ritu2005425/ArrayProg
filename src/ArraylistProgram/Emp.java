package ArraylistProgram;

public class Emp {
int id;
String name;
int sal;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}
public Emp(int id, String name, int sal) {
	super();
	this.id = id;
	this.name = name;
	this.sal = sal;
}
public Emp() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
}


}
