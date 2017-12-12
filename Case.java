public class Case
{

	int coordonneeX;
	int coordonneeY;
	private Robot robot;

	public Case()
	{
		this.coordonneeY=0;
		this.coordonneeX=0;
		this.robot=null;
	}

	public Case(int x,int y)
	{
		this.coordonneeX=x;
		this.coordonneeY=y;
	}

	public int getCoordonneeX()
	{
		return this.coordonneeX;
	}

	public int getCoordonneeY()
	{
		return this.coordonneeY;
	}

	public void setCoordonneeX(int x)
	{
		this.coordonneeX=x;
	}

	public void setCoordonneeY(int y)
	{
		this.coordonneeY=y;
	}

	public void setRobot(Robot r)
	{
		this.robot = r;
	}

	public void deleteRobot()
	{
		this.robot=null;
	}

	public boolean hasRobot()
	{
		return !(this.robot==null);
	}
	
}