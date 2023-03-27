class Encaps
{
	private String Name;
	private int Rollnum;
	private int Age;
	public void setName(String Name)
	{
		this.Name=Name;
	}
	public void setRollnum(int Rollnum)
	{
		this.Rollnum=Rollnum;
	}
	public void setAge(int Age)
	{
		this.Age=Age;
	}
	public String getName()
	{
		return Name;
	}
	public int getRollnum()
	{
		return Rollnum;
	}
	public int getAge()
	{
		return Age;
	}
}
class Encapsulate
{
	public static void main(String[] args) {
		Encaps E=new Encaps();
		E.setName("heenasulthan");
		E.setRollnum(15);
		E.setAge(22);
	System.out.println(	E.getName());
	System.out.println(	E.getRollnum());
	System.out.println(E.getAge());
	}
}