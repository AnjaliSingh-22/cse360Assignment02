package cse360assignment02;

public class AddingMachine 
{
	//initializing variables
	private String result = "0";
	private int total;
	
	public AddingMachine() // constructor
	{
	    total = 0;  // not needed - included for clarity
	}
	  
	public int getTotal() //gets the total value
	{
	    return 0;
	}
	  
	public void add(int value) //method used to add
	{
		result = result + " + " + value; // printing result with +
		total = total + value;           // adding the two values
	}

	public void subtract(int value)  //method used to subtract 
	{
		result = result + " - " + value;  // printing result with +
		total = total - value;            // subtracting parameter from total
	}
 
	 public String toString()  // this method returns the string representation
	 {
	    return result;
	 }
	 
	 //main method
	 public static void main( String[] args )
	 {
		 //creating object machine
		 AddingMachine machine = new AddingMachine();
		 // commands for object
		 machine.add(4); 
		 machine.subtract(2); 
		 machine.add(5);
		 //prints output
		 System.out.println(machine.toString());
	 }

	  public void clear() //clears the history
	  {
		  
	  }
}
