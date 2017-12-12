public class Robot
{

	private String couleur;
	private int CoordRobotX;
	private int CoordRobotY;


	public Robot()
	{
		this.couleur=null;
	}

	public Robot(String c,int x,int y)
	{
		this.couleur = c;
		this.CoordRobotX= x;
		this.CoordRobotY= y;
	}

	public int getCoordX()
	{
		return this.CoordRobotX;
	}

	public int getCoordY()
	{
		return this.CoordRobotY;
	}

	public void setCoordX(int x)
	{
		this.CoordRobotX=x;
	}

	public void setCoordY(int y)
	{
		this.CoordRobotY=y;
	}

	public String toString()
	{
		String s = "r";
		return s;
	}


}