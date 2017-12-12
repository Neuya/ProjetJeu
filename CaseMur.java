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

	public void setMurHaut()
	{
		this.MurHaut=true;
	}

	public void setMurBas()
	{
		this.MurBas=true;
	}

	public void setMurDroite()
	{
		this.MurDroite=true;
	}

	public void setMurGauche()
	{
		this.MurGauche=true;
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



}