public class Hangar 
{

	public static void main(String[] args)
	{
		Boat tracker = new Boat("Tracker", 700);
		Car ford = new Car("Ford Mondeo", 150000);

		System.out.println(tracker.doStuff());
		System.out.println(ford.doStuff());
	}
}
