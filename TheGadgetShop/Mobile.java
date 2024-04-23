
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
        }
        
        else 
        {
            System.out.println("Invalid input: please enter a positive amount");
        }

    }
    
   
    public void makeCall (String phoneNumber , int duration)
    {
        if (callCredit>=duration)
        {
            System.out.println("Make a call to " + phoneNumber + "for " + duration + "minute" );
        }
        else
        {
           System.out.println("your balance is insuficiet, please top up and try again");
        }
    }
}