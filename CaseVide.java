

public class CaseVide extends Case
{
	public CaseVide()
	{
		super();
	}


	public String toString()
	{
		String s = "| |";
		if (this.hasRobot())
		{
			 s = "|r|";
		}
		return s;
	}
}
