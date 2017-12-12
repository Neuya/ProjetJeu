

public class Plateau
{


	public Case[][] TabCases;



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

		this.TabCases[5][6]=new CaseMur();
		this.TabCases[5][6].setMurGauche(true);
		this.TabCases[5][6].setMurBas(true);

		Robot rouge=new Robot("rouge",5,6);
		this.TabCases[5][6].setRobot(rouge);


		ListeRobot = new Robot[2];
	}
	

	public String toString(){
		System.out.println("");
		String s="";
		for(int i=0; i<this.TabCases.length;i++){
			for(int j=0;j<this.TabCases.length;j++){
				s+=this.TabCases[i][j];
			}
			s+="\n\n";
		}
		return s;
	}







}
