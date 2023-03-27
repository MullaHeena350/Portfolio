class Car
{
	private String color;
	private int maxSpeed;
	public void setColor(String color)
	{
		this.color=color;
	}
	public void setMaxSpeed(int maxSpeed)
	{
		this.maxSpeed=maxSpeed;
	}
	public void carInfo()
	{
		System.out.println("color:"+color+" "+"maxSpeed:"+maxSpeed);
	}
}
class Maruthi extends Car
{
		public void maruthiStartDemo()
		{
			Engine E=new Engine();
			E.startEngine();
		}
}
class Engine
{
public void startEngine()
{
	System.out.println("Engine has been started ");
}
}
class RelationsDemo
{
	public static void main(String[] args) {
		Maruthi M=new Maruthi();
		M.setColor("RED");
		M.setMaxSpeed(78);
		M.carInfo();
		M.maruthiStartDemo();
	}
}