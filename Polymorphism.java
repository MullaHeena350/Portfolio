class Some
{
	int multiple(int a,int b)
	{
		return a*b;
	}
	int multiple(int a,int b,int c)
	{
		return a*b*c;
	}
}
class Main
{
	public static void main(String[] args) {
		Some p=new Some();
	System.out.println(	p.multiple(10,3));
	System.out.println(	p.multiple(10,60,89));
	}
}
class Parent
{
	void print()
	{
		System.out.println("this is parent calss version method");
	}
}
class Child extends Parent
{
	void print()
	{
		System.out.println("this is child class version method");
	}
	void m1()
	{
		System.out.println("juned");
	}
}
class Polymorphism
{
	public static void main(String[] args) {
		Parent p=new Parent();
		p.print();
		p=new Child();
		p.print();
	}
}