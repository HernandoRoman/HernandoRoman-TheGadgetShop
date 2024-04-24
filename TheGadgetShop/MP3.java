
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
  
    public String deleteMusic(int memoryFree)
    {
        // Check if the memory freed after deleting the music is non-negative
        if (memoryFree >= 0)
        {
            // If it's non-negative, add the freed memory to the available memory
            memory += memoryFree;
            // Return true indicating the music was successfully deleted
            return "Music deleted successfully!";
        }
        else
        {
            // If it's negative, return false indicating deletion failure
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
