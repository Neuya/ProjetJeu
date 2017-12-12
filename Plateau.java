

public class Plateau
{

	private Case[] TabCases;
	private Robot[] ListeRobot;
	
	public Plateau()
	{
		TabCases = new Case[10][10];
		for (int i=0;i<10;i++)
		{
			for (int j=0;j<10;j++)
			{
				this.TabCases[i][j]=new CaseVide();
			}
		}
		ListeRobot = new Robot[2];
	}
	

	public String toString(){
		String s="";
		for(int i=0; i<this.TabCases.length;i++){
			for(int j=0;j<this.TabCases.length;j++){
				s+=this.TabCases[i][j];
			}
			s+="\n";
		}
		return s;
	}







}
