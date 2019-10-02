public abstract class Vehicle {
  
    	// attributs  
   
	private String brand;  
	private int kilometers;  
  
    	// constructeurs  

	public Vehicle (String brand, int kilometers) 
	{  
		this.brand = brand;  
		this.kilometers = kilometers ;  
    	}  
  
    	// getters 
    
	public String getBrand() 
	{  
        	return this.brand;  
   	}  

	public int getKilometers() 
	{  
        	return this.kilometers;  
   	}  
  
	// setters

    	public void setBrand(String brand) 
	{  
        this.brand = brand; 
    	}  

	public void setKilometers(int kilometers) 
	{  
        this.kilometers = kilometers; 
    	}  
  
   	

    	// méthodes

    	public abstract String doStuff();
}
		



