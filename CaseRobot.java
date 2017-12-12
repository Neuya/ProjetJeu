public class CaseRobot extends Case{
	private Robot Robot;
	
	public CaseRobot(){
		super();
		this.Robot=null;
	}
	
	public CaseRobot(Robot r){
		super();
		this.Robot=r;
	}
	
	public Robot getRobot(){
		return this.Robot;
	}
	
	public void setRobot(Robot r){
		this.Robot=r;
	}
}
