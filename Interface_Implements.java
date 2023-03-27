// import java.io.*;
// interface Vehicle
// {
// 	void speedup(int a);
// 	void change_gear(int b);
// 	void apply_break(int c);
// }
// class Bike implements Vehicle
// {
// 	int speed;
// 	int gear;
// 	public void speedup(int increment)
// 	{
// 		speed=speed+increment;
// 	}
// 	public void change_gear(int newgear)
// 	{
// 		gear=newgear;
// 	}
// 	public void apply_break(int decrement)
// 	{
// 		speed=speed-decrement;
// 	// }
// 	public void printStates()
// 	{
// 		System.out.println("Speed"+speed+", "+"gear"+gear);
// 	}
// }
// class Car implements Vehicle
// {
// 	int speed;
// 	int gear;
// 	public void speedup(int increment)
// 	{
// 		speed=speed+increment;
// 	}
// 	public void change_gear(int newgear)
// 	{
// 		gear=newgear;
// 	}
// 	public void apply_break(int decrement)
// 	{
// 		speed=speed-decrement;
// 	}
// 	public void printStates()
// 	{
// 		System.out.println("Speed"+speed+", "+"gear"+gear);
// 	}
// }
// class Interface_Implements
// {
// 	public static void main(String[] args) {
// 		Bike B=new Bike();
// 		Car C=new Car();
// 		System.out.println("-------FOR BIKE-----------");
// 		B.change_gear(45);
// 		B.speedup(8);
// 		// B.apply_break(2);
// 		B.printStates();
// 		System.out.println("------FOR CAR-----------");
// 		C.change_gear(75);
// 		C.speedup(11);
// 		C.apply_break(4);
// 		C.printStates();


// 	}
// }
interface s
{
	void m1();
	void m2();
}
abstract class d implements s
{
	public void m1()
	{
		System.out.println("hello");
	}
}
class f extends d
{
	public void m2()
	{
		System.out.println("juned");
	}
}
class Interface_Implements
{
	public static void main(String[] args) {
		f h=new f();
		h.m1();
		h.m2();
	}
}