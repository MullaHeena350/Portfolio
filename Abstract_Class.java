/*
An abstract class in Java is one that is declared with the abstract keyword. 
It may have both abstract and non-abstract methods(methods with bodies). 
An abstract is a java modifier applicable for classes and methods in java but not for Variables. 
*/
// abstract class Base
// {
// 	// Base()
// 	// {
// 	// 	System.out.println("hey this is abstract constructor");
// 	// }
// 	// public abstract void fun(int f);
// 	void juned()
// 	{
// 		System.out.println("hello");
// 	}
// }
// class Derived extends Base
// {
// 	Derived()
// 	{
// 		System.out.println("This is Derived class Constructor");
// 	}
// 	// public void fun(int h)
// 	// {
// 	// 	System.out.println(h);
// 	// 	System.out.println("HI HOW ARE YOU ABSTRACT!..");
// 	// }
// 	void gun()
// 	{
// 		System.out.println("this is non-abstract method");
// 	}
// }
// class Abstract_Class
// {
// 	public static void main(String[] args) {
// 		Derived d=new Derived();
// 		// d.fun(10);
// 		d.gun();
// 		d.juned();

// 	}
// }
abstract class Base
{
	abstract void m1();
	abstract void m2();
	abstract void m3();
}
abstract class First extends Base
{
	void m1()
	{
		System.out.println("This is M2");
	}
}
class Second extends Base
{
	void m2()
	{
		System.out.println("This is M3");
	}
	void m3()
	{
		System.out.println("this is m1");
	}
	void m1()
	{
		System.out.println("This is M2");
	}

}
class Abstract_Class
{
	public static void main(String[] args) {
		
		Second t=new Second();
		// First f=new First();
		t.m2();
		t.m3();
		// f.m1();
	}
}

