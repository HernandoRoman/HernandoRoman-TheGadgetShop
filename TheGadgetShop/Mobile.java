
public class Mobile extends Gadget
{
    //Instance variables - 
    private int callCredit = 0;
    
    
    public Mobile(String model,double price,int weight, String size, int callCredit)
    {
       super(model, price, weight, size);
       this.callCredit = callCredit;
    }
    
    
    
    public int getCredit()
    {
        return callCredit;
    }
    
   
    public void addCredit(int credit)
    {
        
        if (credit > 0)
        {
            this.callCredit +=credit;
            System.out.println("Credit added successfully!");
        }
        
        else 
        {
            System.out.println("Invalid input: please enter a positive amount");
        }

    }
    
   
    public String makeCall (String phoneNumber , int duration)
    {
        if (duration > 0 && callCredit >= duration)
        {
            callCredit -= duration;
            return("Make a call to " + phoneNumber + " for " + duration + " minute \n" );
            
        }
        else
        {
            return null;
           //return("your balance is insuficiet, please top up and try again");
        }
    }
    
    @Override
    public String display()
    {
        // Calls the display method of the superclass (presumably to display basic gadget information)
        // Concatenates information about the remaining calling credit to the returned string
        return super.display() + "\n " + " CALLING CREDIT: " + callCredit + " MINUTES.";

    }
}