public class Car extends Vehicle {  
      
 	//Constructeur	

	public Car(String brand, int kilometers) 
	{  
	    super(brand, kilometers);   
	}
  
   	@Override
   	public String doStuff() 
	{
        return "I am " +this.getBrand() + " and I do vroum vroum! ";
    	}
}
