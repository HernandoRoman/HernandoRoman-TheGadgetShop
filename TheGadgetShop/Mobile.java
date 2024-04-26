/**
 * Represents a mobile gadget extending the Gadget class with additional calling credit functionality.
 */
public class Mobile extends Gadget {

    // Instance variables
    private int callCredit = 0; // Holds the remaining calling credit in minutes
    
    /**
     * Constructs a Mobile object with the specified attributes.
     * 
     * @param model The model of the mobile gadget.
     * @param price The price of the mobile gadget in pounds.
     * @param weight The weight of the mobile gadget in grams.
     * @param size The size of the mobile gadget in a specific format.
     * @param callCredit The initial calling credit of the mobile gadget in minutes.
     */
    public Mobile(String model, double price, int weight, String size, int callCredit) {
        super(model, price, weight, size); // Calls the constructor of the superclass (Gadget)
        this.callCredit = callCredit; // Initializes the calling credit attribute
    }
    
    /**
     * Retrieves the remaining calling credit of the mobile gadget.
     * 
     * @return The remaining calling credit in minutes.
     */
    public int getCredit() {
        return callCredit;
    }
    
    /**
     * Adds calling credit to the mobile gadget.
     * 
     * @param credit The amount of calling credit to add.
     */
    public void addCredit(int credit) {
        if (credit > 0) {
            this.callCredit += credit; // Adds the provided credit to the existing calling credit
            System.out.println("Credit added successfully!");
        } else {
            System.out.println("Invalid input: please enter a positive amount");
        }
    }
    
    /**
     * Makes a call from the mobile gadget.
     * 
     * @param phoneNumber The phone number to call.
     * @param duration The duration of the call in minutes.
     * @return A message indicating the call details if successful, otherwise null.
     */
    public String makeCall(String phoneNumber, int duration) {
        if (duration > 0 && callCredit >= duration) {
            callCredit -= duration; // Reduces the calling credit by the duration of the call
            return "Make a call to " + phoneNumber + " for " + duration + " minute\n";
        } else {
            return null; // Returns null if there is insufficient calling credit
        }
    }
    
    /**
     * Displays the details of the mobile gadget, including calling credit information.
     * 
     * @return A string containing the model, price, weight, size, and remaining calling credit of the mobile gadget.
     */
    @Override
    public String display() {
        // Calls the display method of the superclass (Gadget) to retrieve basic gadget information
        // Concatenates information about the remaining calling credit to the returned string
        return super.display() + "\nCalling Credit: " + callCredit + " minutes.";
    }
}
