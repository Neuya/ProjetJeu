public class CaseMur extends Case
{

	private boolean MurHaut;
	private boolean MurBas;
	private boolean MurDroite;
	private boolean MurGauche;

	public CaseMur()
	{
		super();
		this.MurHaut=false;
		this.MurBas=false;
		this.MurDroite=false;
		this.MurGauche=false;
	} 

	public CaseMur(int x,int y)
	{
		super(x,y);
	}

	public void setMurHaut(boolean b)
	{
		this.MurHaut=b;
	}

	public void setMurBas(boolean b)
	{
		this.MurBas=b;
	}

	public void setMurDroite(boolean b)
	{
		this.MurDroite=b;
	}

	public void setMurGauche(boolean b)
	{
		this.MurGauche=b;
	}

	public boolean getMurHaut(){
		return this.MurHaut;
	}
	public boolean getMurBas(){
		return this.MurBas;
	}
	public boolean getMurDroite(){
		return this.MurDroite;
	}
	public boolean getMurGauche(){
		return this.MurGauche;
	}
	
	public String toString(){
		String s="|";
		if(this.MurGauche){
			s+="!";
		}
		else{
			s+=" ";
		}
		if(this.MurBas){
			s+="B";
		}
		else{
			s+=" ";
		}
		if(this.hasRobot()){
			s+="R";
		}
		else{
			s+=" ";
		}
		if(this.MurHaut){
			s+="H";
		}
		else{
			s+=" ";
		}
		if(this.MurDroite){
			s+="!";
		}
		else{
			s+=" ";
		}
		return s+"| ";
	
	}

	


}
