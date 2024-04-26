/**
 * Represents an MP3 gadget extending the Gadget class with additional memory functionality.
 */
public class MP3 extends Gadget {

    // Instance variable
    private double memory = 0; // Holds the available memory in MB
    
    /**
     * Constructs an MP3 object with the specified attributes.
     * 
     * @param memory The available memory of the MP3 gadget in MB.
     * @param model The model of the MP3 gadget.
     * @param price The price of the MP3 gadget in pounds.
     * @param weight The weight of the MP3 gadget in grams.
     * @param size The size of the MP3 gadget in a specific format.
     */
    public MP3(double memory, String model, double price, int weight, String size) {
        super(model, price, weight, size); // Calls the constructor of the superclass (Gadget)
        this.memory = memory; // Initializes the memory attribute
    }
    
    /**
     * Retrieves the available memory of the MP3 gadget.
     * 
     * @return The available memory in MB.
     */
    public double getMemory() {
        return memory;
    }
    
    /**
     * Downloads music to the MP3 gadget.
     * 
     * @param memoryRequired The amount of memory required to download the music in MB.
     * @return A message indicating the success or failure of the music download.
     */
    public String downloadMusic(double memoryRequired) {
        if (memoryRequired <= memory) {
            memory -= memoryRequired; // Reduces the available memory by the required amount
            return "Music downloaded successfully!";
        } else {
            return null; // Returns null if there is insufficient memory to download the music
        }
    }
    
    /**
     * Deletes music from the MP3 gadget.
     * 
     * @param memoryFreed The amount of memory freed after deleting the music in MB.
     * @return A message indicating the success or failure of the music deletion.
     */
    public String deleteMusic(int memoryFreed) {
        // Check if the memory freed after deleting the music is non-negative
        if (memoryFreed >= 0) {
            // If it's non-negative, add the freed memory to the available memory
            memory += memoryFreed;
            // Return a message indicating successful music deletion
            return "Music deleted successfully!";
        } else {
            // If it's negative, return null indicating deletion failure
            return null;
        }
    }
    
    /**
     * Displays the details of the MP3 gadget, including available memory information.
     * 
     * @return A string containing the model, price, weight, size, and available memory of the MP3 gadget.
     */
    @Override
    public String display() {
        // Calls the display method of the superclass (Gadget) to retrieve basic gadget information,
        // Concatenates information about the available memory to the returned string
        return super.display() + "\nAvailable Memory: " + memory + " MB";
    }
}