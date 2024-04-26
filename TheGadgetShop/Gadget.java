/**
 * Represents a general gadget with model, price, weight, and size attributes.
 */
public class Gadget {
   
    // Attributes
    private String model;   // Holds the model of the gadget
    private double price;   // Holds the price of the gadget in £
    private int weight;     // Holds the weight of the gadget in grams
    private String size;    // Holds the size of the gadget (e.g., "71mm x 137mm x 9mm")
                            // The size parameter accepts a string value, allowing the user to define the unit as well.
                           
    /**
     * Constructs a Gadget object with the specified attributes.
     * 
     * @param model The model of the gadget.
     * @param price The price of the gadget in pounds.
     * @param weight The weight of the gadget in grams.
     * @param size The size of the gadget in a specific format (e.g., "71mm x 137mm x 9mm").
     */
    public Gadget(String model, double price, int weight, String size) {
        this.model = model;     // Initialize the model attribute
        this.price = price;     // Initialize the price attribute
        this.weight = weight;   // Initialize the weight attribute
        this.size = size;       // Initialize the size attribute
    }
   
    /**
     * Retrieves the model of the gadget.
     * 
     * @return The model of the gadget.
     */
    public String getModel() {
        return model;
    }
   
    /**
     * Retrieves the price of the gadget.
     * 
     * @return The price of the gadget in pounds.
     */
    public double getPrice() {
        return price;
    }
   
    /**
     * Retrieves the weight of the gadget.
     * 
     * @return The weight of the gadget in grams.
     */
    public int getWeight() {
        return weight;
    }
   
    /**
     * Retrieves the size of the gadget.
     * 
     * @return The size of the gadget in a specific format.
     */
    public String getSize() {
        return size;
    }
   
    /**
     * Displays the details of the gadget.
     * 
     * @return A string containing the model, price, weight, and size of the gadget.
     */
    public String display() {
        return "Model: " + model + "\nPrice: £" + price + "\nWeight: " + weight + " grams\nSize: " + size;
    }
}