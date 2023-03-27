class One
{
	public void printOverride()
	{
		System.out.println("This is parent class ONE");
	}
}
class Two extends One
{
	public void printOverride()
	{
		System.out.println("This is Child class TWO");
	}
	public  int add(int x,int y)
	{
		return x+y;
	}
	public  int add(int x,int y,int z)
	{
		return x*y*z;
	}
}
class Encaps
{
	private String name;
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
}
abstract class Abstract
{
	public void main(){}
}
class Fun extends Abstract
{
	public void main()
	{
		System.out.println("this is abstraction");
	}
}
interface Some
{
	void juned();
}
class Jun implements Some
{
	public void juned()
	{
		System.out.println("hello this is Interface");
	}
}
class Oops_Concept
{
	public static void main(String[] args) {
		One o=new One();
		o.printOverride();
		o=new Two();
		o.printOverride();
		Two t=new Two();
		System.out.println("the overloading"+t.add(2,3));
		System.out.println("the overloading"+t.add(2,3,6));
		Encaps e=new Encaps();
		e.setName("HEENA MULLA");
		System.out.println(e.getName());
		Abstract a=new Fun();
		a.main();
		Some s=new Jun();
		s.juned();
	}
}