
public class Car extends Vehicle 
{
	private int noofDoor;

	public Car(int noOfWheel, int noOfPaasenger, int model, String make, int noofDoor) 
	{
		super(noOfWheel, noOfPaasenger, model, make);
		this.noofDoor = noofDoor;
	}

	public int getNoofDoor() 
	{
		return noofDoor;
	}

	public void setNoofDoor(int noofDoor) 
	{
		this.noofDoor = noofDoor;
	}

	@Override
	public void display() {
		super.display();
		System.out.println(" noofDoor=" + getNoofDoor());
	}
}
