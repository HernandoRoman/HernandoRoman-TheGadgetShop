
public class MP3 extends Gadget
{
  private double memory = 0;
  
    
    public MP3(double memory, String model, double price, int weight, String size)
  {
      super(model, price, weight, size);
      this.memory = memory;
  }
  

  public double getMemory()
  {
    return memory;  
  }
  
  
   public void downloadingMusic(double needMemory)
  {
      if(needMemory > 0)
      {
          memory += needMemory;
      }
      else
      {
          System.out.println ("Error: The memory is less than the space needed, please add positive value");
      }
  }
  
  
    public String display()
  {
      super.display();
      
      return ("Available memory " + memory);
      
  }
  
  
}
