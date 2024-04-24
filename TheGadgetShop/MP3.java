
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
  
  
   public String downloadMusic(double memoryRequered)
  {
      if(memoryRequered <= memory)
      {
          memory -= memoryRequered;
          return "Music downloaded successfully!";
          
      }
      else
      {
          return null;
      }
  }
  
  
  @Override
    public String display()
    {
        // Calls the display method of the superclass (presumably Gadget1) to get basic gadget information,
        // Concatenates information about the available memory to the returned string
        return super.display() + "\n " + "AVAILABLE MEMORY: " + memory + " MB";
    }
  
  
}
