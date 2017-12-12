public class Case
{

	int coordonneeX;
	int coordonneeY;

	public Case()
	{
		this.coordonneeY=0;
		this.coordonneeX=0;
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
	
	public void setMurGauche(boolean b){}
	public void setMurHaut(boolean b){}
	public void setMurDroite(boolean b){}
	public void setMurBas(boolean b){}
	


}
