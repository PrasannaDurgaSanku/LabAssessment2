
public class Sportcar extends Car 
{

	private int noofDoor;

	public int getNoofDoor() {
		return noofDoor;
	}
	public void setNoofDoor(int noofDoor) {
		setNoofDoor(2);
	}
	public Sportcar(int noOfWheel, int noOfPaasenger, int model, 
			String make, int noofDoor) 
	{
		super(noOfWheel, noOfPaasenger, model, make, noofDoor);
		
		
	}

	

	@Override
	public void display() 
	{
		super.display();
	}

}
