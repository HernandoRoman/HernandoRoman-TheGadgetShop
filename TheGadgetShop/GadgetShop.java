
// Import statements
// Import the necessary classes for Swing components
import javax.swing.*;
// Import the necessary classes for border management
import javax.swing.border.Border;
// Import the necessary classes for AWT components
import java.awt.*;
// Import the necessary classes for event handling
import java.awt.event.ActionEvent;
// Import the necessary classes for event handling
import java.awt.event.ActionListener;
// Import the necessary classes for collections
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Define a class named GadgetShop that implements the ActionListener interface
public class GadgetShop implements ActionListener {
    // Declare private member variables for the GadgetShop class
    private JFrame frame;
    private JTextField IdMobileTextField,
            IdMP3TExtField,
            modelTextField,
            weightTextField,
            priceTextField,
            sizeTextField,
            memoryTextField,
            downloadMusicTExtField,
            deleteMusicMP3TextField;
    private JTextField creditTextField,
            addCreditTextField,
            displayNumberTextField,
            phoneNumberTextField,
            durationTextField,
            hiden1Field,
            hiden2Field;
    private JButton addMobileButton,
            addMP3Button,
            makeACallButton,
            viewAllButton,
            clearButton,
            addCreditButton,
            downloadMusicButton,
            deleteMusicMP3Button,
            exitButton;

    private JTextArea textAreaShowData; // TextArea to show data
    private ArrayList<Gadget> gadgets = new ArrayList<>(); // ArrayList to store Gadget objects

    // Constructor for the GadgetShop class
    public GadgetShop() {
        createGUI(); // Call the createGUI() method to initialize the graphical user interface
    }

    // Method to create the graphical user interface
    private void createGUI() {
        // Create and customize the main frame for the Gadget Shop GUI
        // Create and customize the main frame for the Gadget Shop GUI
        frame = new JFrame("-----: Welcome - The Gadget Shop :-----"); // Set the title of the frame
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // Define the close operation
        frame.setResizable(false); // Set whether the frame is resizable
        frame.setSize(1300, 800); // Set the size of the frame

        // Create the content pane with a grid layout to organize components
        JPanel contentPane = new JPanel(new GridLayout(1, 3));
        contentPane.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Set border insets
        contentPane.setBackground(Color.red); // Set background color
        frame.setContentPane(contentPane); // Set the content pane of the frame

        // Create Panel 1 for entering data
        JPanel panel1 = new JPanel(new GridLayout(0, 1, 10, 10));
        panel1.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15)); // Set border insets
        panel1.setBorder(BorderFactory.createLineBorder(Color.black, 2)); // Set line border
        panel1.setBorder(BorderFactory.createTitledBorder("Enter Data.....")); // Set titled border
        panel1.setBackground(Color.orange); // Set background color

        // Create labels and text fields for various data inputs
        JLabel modelLabel = new JLabel("Model:");
        modelTextField = new JTextField();
        JLabel priceLabel = new JLabel("Price:");
        priceTextField = new JTextField();
        JLabel weightLabel = new JLabel("Weight:");
        weightTextField = new JTextField();
        JLabel sizeLabel = new JLabel("Size (12 mm x 55 mm x 5 mm):");
        sizeTextField = new JTextField();
        JLabel creditLabel = new JLabel("Credit:");
        creditTextField = new JTextField();
        JLabel memoryLabel = new JLabel("Memory:");
        memoryTextField = new JTextField();

        // Create buttons for adding mobile, MP3, showing all gadgets, clearing, and
        // exiting
        addMobileButton = new JButton("Add Mobile");
        addMobileButton.addActionListener(this);
        addMP3Button = new JButton("Add MP3");
        addMP3Button.addActionListener(this);
        viewAllButton = new JButton("Show All Gadgets");
        viewAllButton.addActionListener(this);
        clearButton = new JButton("Clear");
        clearButton.addActionListener(this);
        exitButton = new JButton("Exit");
        exitButton.addActionListener(this);

        // Add components to Panel 1
        panel1.add(modelLabel);
        panel1.add(modelTextField);
        panel1.add(priceLabel);
        panel1.add(priceTextField);
        panel1.add(weightLabel);
        panel1.add(weightTextField);
        panel1.add(sizeLabel);
        panel1.add(sizeTextField);
        panel1.add(creditLabel);
        panel1.add(creditTextField);
        panel1.add(memoryLabel);
        panel1.add(memoryTextField);
        panel1.add(addMobileButton);
        panel1.add(addMP3Button);
        panel1.add(viewAllButton);
        panel1.add(clearButton);
        panel1.add(exitButton);

        // Add Panel 1 to the content pane of the frame
        contentPane.add(panel1, BorderLayout.SOUTH);

        // Create Panel 4 for call and credit functionality
        JPanel panel4 = new JPanel(new GridLayout(0, 1, 10, 10));

        // Set borders and title for Panel 4
        panel4.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panel4.setBorder(BorderFactory.createLineBorder(Color.black));
        panel4.setBorder(BorderFactory.createTitledBorder("Call And Add Credit To The Mobile....."));
        panel4.setBackground(Color.orange);

        // Create labels and text fields for input data
        JLabel IdMobileLabel = new JLabel("Select Id Mobile To (Call or Add Credit):");
        IdMobileTextField = new JTextField();
        JLabel phoneNumberLabel = new JLabel("Phone Number:");
        phoneNumberTextField = new JTextField();
        JLabel durationLabel = new JLabel("Duration:");
        durationTextField = new JTextField();
        JLabel displayNumberLabel = new JLabel("Display Number:");
        displayNumberTextField = new JTextField();
        JLabel addCreditLabel = new JLabel("Add Credit:");
        addCreditTextField = new JTextField();

        // Create buttons for make a call, add credit, and hide functionality
        makeACallButton = new JButton("Make a Call");
        addCreditButton = new JButton("Add Credit");
        JButton hideButton11 = new JButton("hide1");
        hideButton11.setVisible(false);
        JButton hideButton21 = new JButton("hide2");
        hideButton21.setVisible(false);
        JButton hideButton31 = new JButton("hide3");
        hideButton31.setVisible(false);
        JButton hideButton41 = new JButton("hide4");
        hideButton41.setVisible(false);
        JButton hideButton51 = new JButton("hide5");
        hideButton51.setVisible(false);

        // Add action listeners for buttons
        makeACallButton.addActionListener(this);
        addCreditButton.addActionListener(this);

        // Add components to Panel 4
        panel4.add(IdMobileLabel);
        panel4.add(IdMobileTextField);
        panel4.add(phoneNumberLabel);
        panel4.add(phoneNumberTextField);
        panel4.add(durationLabel);
        panel4.add(durationTextField);
        panel4.add(displayNumberLabel);
        panel4.add(displayNumberTextField);
        panel4.add(addCreditLabel);
        panel4.add(addCreditTextField);
        panel4.add(makeACallButton);
        panel4.add(addCreditButton);
        panel4.add(hideButton11);
        panel4.add(hideButton21);
        panel4.add(hideButton31);
        panel4.add(hideButton41);
        panel4.add(hideButton51);

        // Add Panel 4 to the content pane
        contentPane.add(panel4, BorderLayout.SOUTH);

        // Create Panel 5 for music download and deletion functionality
        JPanel panel5 = new JPanel(new GridLayout(0, 1, 10, 10));

        // Set borders and title for Panel 5
        panel5.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panel5.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        panel5.setBorder(BorderFactory.createTitledBorder("Download And Delete Music From MP3....."));
        panel5.setBackground(Color.orange);

        // Create labels and text fields for input data
        JLabel hiden1 = new JLabel();
        hiden1.setVisible(false);
        hiden1Field = new JTextField();
        hiden1Field.setVisible(false);

        JLabel hiden2 = new JLabel();
        // ImageIcon icon = new ImageIcon("images/mp31.png");
        // hiden1.setPreferredSize(new Dimension(150, 100));
        // hiden2.setIcon(icon);
        hiden2.setVisible(false);
        hiden2Field = new JTextField();
        hiden2Field.setVisible(false);

        JLabel IdMP3Label = new JLabel("Select Id MP3 To (Download or Delete) Music:");
        IdMP3TExtField = new JTextField();
        JLabel downLoadMusicLabel = new JLabel("Download Music:");
        downloadMusicTExtField = new JTextField();
        JLabel deleteMusicMP3Label = new JLabel("Delete Music:");
        deleteMusicMP3TextField = new JTextField();

        // Create buttons for music download, deletion, and hide functionality
        downloadMusicButton = new JButton("Download Music");
        deleteMusicMP3Button = new JButton("Delete Music");
        JButton hideButton1 = new JButton();
        hideButton1.setPreferredSize(new Dimension(1000, 1000));
        hideButton1.setVisible(false);
        JButton hideButton2 = new JButton("hide2");
        hideButton2.setVisible(false);
        JButton hideButton3 = new JButton("hide3");
        hideButton3.setVisible(false);
        JButton hideButton4 = new JButton("hide4");
        hideButton4.setVisible(false);
        JButton hideButton5 = new JButton("hide5");
        hideButton5.setVisible(false);
        JButton hideButton6 = new JButton("hide6");
        hideButton6.setVisible(false);
        JButton hideButton7 = new JButton("hide7");
        hideButton7.setVisible(false);
        JButton hideButton8 = new JButton("hide8");
        hideButton8.setVisible(false);
        JButton hideButton9 = new JButton("hide9");
        hideButton9.setVisible(false);

        // Add action listeners for buttons
        downloadMusicButton.addActionListener(this);
        deleteMusicMP3Button.addActionListener(this);

        // Add components to Panel 5
        panel5.add(hiden1);
        panel5.add(hiden1Field);
        panel5.add(hiden2);
        panel5.add(hiden2Field);
        panel5.add(IdMP3Label);
        panel5.add(IdMP3TExtField);
        panel5.add(downLoadMusicLabel);
        panel5.add(downloadMusicTExtField);
        panel5.add(deleteMusicMP3Label);
        panel5.add(deleteMusicMP3TextField);
        panel5.add(downloadMusicButton);
        panel5.add(deleteMusicMP3Button);
        // panel5.add(hideButton1);
        // panel5.add(hideButton2);
        // panel5.add(hideButton3);
        // panel5.add(hideButton4);
        panel5.add(hideButton5);
        panel5.add(hideButton6);
        panel5.add(hideButton7);
        panel5.add(hideButton8);
        panel5.add(hideButton9);

        // Add Panel 5 to the content pane
        contentPane.add(panel5);

        // Create text area panel for displaying data
        JPanel textAreaPanel = new JPanel(new BorderLayout());
        textAreaPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        textAreaPanel.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        textAreaPanel.setBorder(BorderFactory.createTitledBorder("Show All List Data....."));
        textAreaPanel.setBackground(Color.orange);
        textAreaShowData = new JTextArea(20, 60);
        textAreaShowData.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textAreaShowData);

        // Set a larger dimension for the text area
        Dimension textAreaSize = new Dimension(800, 400);
        scrollPane.setPreferredSize(textAreaSize);
        textAreaPanel.add(scrollPane, BorderLayout.CENTER);

        // Add text area panel to the content pane
        contentPane.add(textAreaPanel, BorderLayout.SOUTH);

        // Set frame properties and make it visible
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    // Overrides the actionPerformed method from the ActionListener interface
    @Override
    public void actionPerformed(ActionEvent e) {
        // Get the source of the action event
        Object source = e.getSource();

        // Check if the source is the addMobileButton
        if (source == addMobileButton) {
            // If yes, call the addMobile method
            addMobile();
        }
        // Check if the source is the addMP3Button
        else if (source == addMP3Button) {
            // If yes, call the addMP3 method
            addMP3();
        }
        // Check if the source is the makeACallButton
        else if (source == makeACallButton) {
            // If yes, call the makeACall method
            makeACall();
        }
        // Check if the source is the viewAllButton
        else if (source == viewAllButton) {
            // If yes, call the viewAll method
            viewAll();
        }
        // Check if the source is the clearButton
        else if (source == clearButton) {
            // If yes, call the clear method
            clear();
        }
        // Check if the source is the addCreditButton
        else if (source == addCreditButton) {
            // If yes, call the addCredit method
            addCredit();
        }
        // Check if the source is the downloadMusicButton
        else if (source == downloadMusicButton) {
            // If yes, call the downloadMusic method
            downloadMusic();
        }
        // Check if the source is the deleteMusicMP3Button
        else if (source == deleteMusicMP3Button) {
            // If yes, call the deleteMusicMP3 method
            deleteMusicMP3();
        }
        // Check if the source is the exitButton
        else if (source == exitButton) {
            // If yes, call the exitButton method
            exitButton();
        }
    }

    // Method to handle the action when the exitButton is clicked
    private void exitButton() {
        // Show a confirmation dialog to ensure the user wants to exit
        int choice = JOptionPane.showConfirmDialog(frame, "Are you sure you want to Exit?", "Exit Confirmation",
                JOptionPane.YES_NO_CANCEL_OPTION);
        // Check if the user chooses yes to exit
        if (choice == JOptionPane.YES_OPTION) {
            // Show a message dialog to bid farewell
            JOptionPane.showMessageDialog(frame, "Thank You. Goodbye!");
            // Close the JFrame
            frame.dispose();
        }
    }

    // Method to add a new mobile gadget
    public void addMobile() {
        try {
            // Clear the memoryTextField
            memoryTextField.setText("");
            // Retrieve data from text fields
            String model = modelTextField.getText();
            double price = Double.parseDouble(priceTextField.getText());
            int weight = Integer.parseInt(weightTextField.getText());
            String size = sizeTextField.getText();
            int credit = Integer.parseInt(creditTextField.getText());
            // Create a new Mobile object with the retrieved data
            Mobile newMobile = new Mobile(model, price, weight, size, credit);
            // Add the new mobile to the gadgets list
            gadgets.add(newMobile);
            // Display all gadgets including the newly added mobile
            viewAll();
            // Show a message dialog to confirm the addition of the new mobile
            JOptionPane.showMessageDialog(frame, "A new mobile is saved");
            // Clear only the input fields
            clearOnlyFields();
        } catch (NumberFormatException ex) {
            // Show an error message if there is an invalid input format
            JOptionPane.showMessageDialog(frame, "Invalid input format. Please enter valid values.");
            // Clear all input fields
            clear();
        }
    }

    // Method to add a new MP3 gadget
    public void addMP3() {
        try {
            // Clear the creditTextField
            creditTextField.setText("");
            // Retrieve data from text fields
            String model = modelTextField.getText();
            double memory = Double.parseDouble(memoryTextField.getText());
            double price = Double.parseDouble(priceTextField.getText());
            int weight = Integer.parseInt(weightTextField.getText());
            String size = sizeTextField.getText();
            // Create a new MP3 object with the retrieved data
            MP3 newMP3 = new MP3(memory, model, price, weight, size);
            // Add the new MP3 to the gadgets list
            gadgets.add(newMP3);
            // Display all gadgets including the newly added MP3
            viewAll();
            // Show a message dialog to confirm the addition of the new MP3
            JOptionPane.showMessageDialog(frame, "A new MP3 is added");
            // Clear only the input fields
            clearOnlyFields();
        } catch (NumberFormatException ex) {
            // Show an error message if there is an invalid input format
            JOptionPane.showMessageDialog(frame, "Invalid input format. Please enter valid values.");
            // Clear all input fields
            clear();
        }
    }

    // Method to make a call using a mobile gadget
    public void makeACall() 
    {        
        try
         {
            // Retrieve data from text fields
            int idMobile = Integer.parseInt(IdMobileTextField.getText()) - 1;
            String phoneNumber = phoneNumberTextField.getText();
             // Expresión regular para validar solo números
            String regex = "[0-9]+";
            // Compile the regular expresion  like a pattern
            Pattern pattern = Pattern.compile(regex);
            // Create a object Matcher for input
            Matcher matcher = pattern.matcher(phoneNumber);
            // Verify if the input matches with the pattern
            if (!matcher.matches())
            {
                // If the call is unsuccessful due to insufficient balance
                JOptionPane.showMessageDialog(frame, "Sorry!. Entry contains only numbers and greater than equal to zero..!");
                clear();
                textAreaShowData.append("Sorry!. Entry contains only numbers and greater than equal to zero..!." + "\n");
                System.out.println("Sorry!. Entry contains only numbers and greater than equal to zero..!." + "\n");                                 
            } 
            else 
            {
                System.out.println("The input contains characters that are not numbers.");                
            }

            int duration = Integer.parseInt(durationTextField.getText());
            // Check if the entered ID is within the valid range
            if (idMobile >= 0 && idMobile < gadgets.size()) 
            {
                // Retrieve the gadget at the specified index
                Gadget gadget = gadgets.get(idMobile);
                // Check if the gadget is a Mobile instance
                if (gadget instanceof Mobile) {
                    Mobile mobile = (Mobile) gadget;
                    // Make a call using the Mobile object
                    var result = mobile.makeCall(phoneNumber, duration);
                    // If the call is successful
                    if (result != null) {
                        JOptionPane.showMessageDialog(frame, "Call Was Successfully!");
                        // Append the call details to the text area
                        textAreaShowData.append("Mobile Id: " + (idMobile + 1) + " " + result + "\n");
                        System.out.println("Mobile Id: " + (idMobile + 1) + " " + result + "\n");
                        // Update the display number field
                        displayNumberTextField.setText(phoneNumberTextField.getText());
                        phoneNumberTextField.setText("");
                        IdMobileTextField.setText("");
                        durationTextField.setText("");
                        textAreaShowData.append("Update Calling Credit \n");
                        System.out.println("Update Calling Credit \n");
                        // Refresh the displayed gadget list
                        viewAll();
                    } else {
                        // If the call is unsuccessful due to insufficient balance
                        JOptionPane.showMessageDialog(frame, "Sorry!. Call not Was Successfully!");
                        clear();
                        textAreaShowData.append("your balance is insuficiet, please top up and try again" + "\n");
                        System.out.println("your balance is insuficiet, please top up and try again" + "\n");
                        return;
                    }
                } else {
                    // If the specified gadget is not a Mobile
                    JOptionPane.showMessageDialog(frame, "This is not a mobile");
                    clear();
                }
            } else {
                // If the entered ID is invalid
                JOptionPane.showMessageDialog(frame, "Invalid ID number");
                clear();
            }
        } catch (NumberFormatException ex) {
            // If there is an invalid input format
            JOptionPane.showMessageDialog(frame, "Invalid input format. Please enter valid values.");
            clear();
        }

    }

    // Method to add credit to a mobile gadget
    public void addCredit() {
        try {
            // Retrieve the ID of the mobile gadget
            String idMobileStr = IdMobileTextField.getText();
            int idMobile = Integer.parseInt(idMobileStr) - 1;

            // Check if the entered ID is within the valid range
            if (idMobile >= 0 && idMobile < gadgets.size()) {
                // Retrieve the gadget at the specified index
                Gadget gadget = gadgets.get(idMobile);
                // Check if the gadget is a Mobile instance
                if (gadget instanceof Mobile) {
                    Mobile mobile = (Mobile) gadget;
                    // Retrieve the amount of credit to add
                    int amount = Integer.parseInt(addCreditTextField.getText());
                    // Check if the amount is valid
                    if (amount < 0) {
                        JOptionPane.showMessageDialog(frame, "Please enter a Valid Amount!");
                        IdMobileTextField.setText("");
                        addCreditTextField.setText("");
                        return;
                    }
                    // Add credit to the mobile gadget
                    mobile.addCredit(amount);
                    JOptionPane.showMessageDialog(frame, "Credit added successfully!");
                    // Append the transaction details to the text area
                    textAreaShowData
                            .append("Mobile Id: " + (idMobile + 1) + " - Credit added successfully £" + amount + "\n");
                    IdMobileTextField.setText("");
                    addCreditTextField.setText("");
                    textAreaShowData.append("\n");
                    // Refresh the displayed gadget list
                    viewAll();
                } else {
                    // If the specified gadget is not a Mobile
                    JOptionPane.showMessageDialog(frame, "This is not a mobile device.");
                    clear();
                }
            } else {
                // If the entered ID is invalid
                JOptionPane.showMessageDialog(frame, "Invalid mobile ID.");
                clear();
            }
        } catch (NumberFormatException ex) {
            // If there is an invalid input format
            JOptionPane.showMessageDialog(frame, "Invalid input format. Please enter a valid number.");
            clear();
        }
    }

    // Method to download music to an MP3 gadget
    public void downloadMusic() {
        try {
            // Retrieve the ID of the MP3 gadget
            String idMP3Str = IdMP3TExtField.getText();
            int idMP3 = Integer.parseInt(idMP3Str) - 1;

            // Check if the entered ID is within the valid range
            if (idMP3 >= 0 && idMP3 < gadgets.size()) {
                // Retrieve the gadget at the specified index
                Gadget gadget = gadgets.get(idMP3);
                // Check if the gadget is an MP3 instance
                if (gadget instanceof MP3) {
                    MP3 mp3 = (MP3) gadget;
                    // Retrieve the size of the music to download
                    String music = downloadMusicTExtField.getText();
                    // Check if the size is valid
                    if (Double.parseDouble(music) < 0) {
                        JOptionPane.showMessageDialog(frame, "Sorry!. Please enter a Valid MB!");
                        IdMP3TExtField.setText("");
                        downloadMusicTExtField.setText("");
                        return;
                    }
                    // Attempt to download the music
                    var result = mp3.downloadMusic(Double.parseDouble(music));
                    if (result != null) {
                        // If download is successful
                        JOptionPane.showMessageDialog(frame, "Music downloaded successfully!");
                        // Append the transaction details to the text area
                        textAreaShowData.append("MP3 Id: " + (idMP3 + 1) + " - " + result + " " + music + " MB\n");
                        System.out.println("MP3 Id: " + (idMP3 + 1) + " - " + result + " " + music + " MB\n");
                        IdMP3TExtField.setText("");
                        downloadMusicTExtField.setText("");
                        textAreaShowData.append("\n");
                        // Refresh the displayed gadget list
                        viewAll();
                    } else {
                        // If download is unsuccessful
                        JOptionPane.showMessageDialog(frame, "Sorry!. Music download was not successful!");
                        IdMP3TExtField.setText("");
                        downloadMusicTExtField.setText("");
                        clear();
                        // Inform the user of the error
                        textAreaShowData.append(
                                "Error: The memory is less than the space needed, please add a positive value" + "\n");
                        System.out.println(
                                "Error: The memory is less than the space needed, please add a positive value " + "\n");
                        return;
                    }

                } else {
                    // If the specified gadget is not an MP3
                    JOptionPane.showMessageDialog(frame, "This is not an MP3 device.");
                    clear();
                }
            } else {
                // If the entered ID is invalid
                JOptionPane.showMessageDialog(frame, "Invalid MP3 ID.");
                clear();
            }
        } catch (NumberFormatException ex) {
            // If there is an invalid input format
            JOptionPane.showMessageDialog(frame, "Invalid input format. Please enter a valid number.");
            clear();
        }
    }

    // Method to delete music from an MP3 gadget
    public void deleteMusicMP3() {
        try {
            // Retrieve the ID of the MP3 gadget
            String idMP3Str = IdMP3TExtField.getText();
            int idMP3 = Integer.parseInt(idMP3Str) - 1;

            // Check if the entered ID is within the valid range
            if (idMP3 >= 0 && idMP3 < gadgets.size()) {
                // Retrieve the gadget at the specified index
                Gadget gadget = gadgets.get(idMP3);
                // Check if the gadget is an MP3 instance
                if (gadget instanceof MP3) {
                    MP3 mp3 = (MP3) gadget;
                    // Retrieve the size of the music to delete
                    String music = deleteMusicMP3TextField.getText();
                    // Check if the size is valid
                    if (Integer.parseInt(music) < 0) {
                        // Notify the user if the entered size is invalid
                        JOptionPane.showMessageDialog(frame, "Sorry!. Please enter a Valid MB!");
                        IdMP3TExtField.setText("");
                        deleteMusicMP3TextField.setText("");
                        return;
                    }
                    // Attempt to delete the music
                    var result = mp3.deleteMusic(Integer.parseInt(music));
                    if (result != null) {
                        // If deletion is successful
                        JOptionPane.showMessageDialog(frame, result);
                        // Append the transaction details to the text area
                        textAreaShowData.append("MP3 Id: " + (idMP3 + 1) + " - " + result + " " + music + " MB\n");
                        System.out.println("MP3 Id: " + (idMP3 + 1) + " - " + result + " " + music + " MB\n");
                        IdMP3TExtField.setText("");
                        deleteMusicMP3TextField.setText("");
                        textAreaShowData.append("\n");
                        // Refresh the displayed gadget list
                        viewAll();
                    } else {
                        // If deletion is unsuccessful
                        JOptionPane.showMessageDialog(frame, "Sorry!. Music downloaded not Was Successfully!");
                        IdMP3TExtField.setText("");
                        deleteMusicMP3TextField.setText("");
                        clear();
                        // Inform the user of the error
                        textAreaShowData.append(
                                "Error: The memory is less than the space needed, please add positive value" + "\n");
                        System.out.println(
                                "Error: The memory is less than the space needed, please add positive value " + "\n");
                        return;
                    }
                } else {
                    // If the specified gadget is not an MP3
                    JOptionPane.showMessageDialog(frame, "This is not an MP3 device.");
                    clear();
                }
            } else {
                // If the entered ID is invalid
                JOptionPane.showMessageDialog(frame, "Invalid MP3 ID.");
                clear();
            }
        } catch (NumberFormatException ex) {
            // If there is an invalid input format
            JOptionPane.showMessageDialog(frame, "Invalid input format. Please enter a valid number.");
            clear();
        }
    }

    // Method to display all gadgets
    public void viewAll() {
        // Check if the gadget list is empty
        if (gadgets.isEmpty()) {
            // If the list is empty, notify the user
            JOptionPane.showMessageDialog(frame, "No Data to Display! (Empty List).");
            textAreaShowData.append("No Data to Display! (Empty List\n");
            System.out.println("No Data to Display! (Empty List\n");
            return;
        }
        // Append an empty line
        textAreaShowData.append("");
        // Append a header for displaying all gadgets
        textAreaShowData.append("Display Gadgets:\n");
        System.out.println("Display Gadgets:\n");
        // Iterate through each gadget in the list
        for (Gadget gadget : gadgets) {
            // Append the ID and display information of each gadget
            textAreaShowData.append("Id: " + (gadgets.indexOf(gadget) + 1) + "\n" + gadget.display() + "\n");
            textAreaShowData.append("\n");
            System.out.println("Id: " + (gadgets.indexOf(gadget) + 1) + "\n " + gadget.display() + "\n");
            // Call the display method of the gadget
            gadget.display();
        }
        // Append a separator line after displaying all gadgets
        textAreaShowData.append("---------------------------------------------------------------\n");
    }

    // Method to clear all input fields and text areas
    public void clear() {
        // Clearing input fields
        modelTextField.setText("");
        priceTextField.setText("");
        weightTextField.setText("");
        sizeTextField.setText("");
        creditTextField.setText("");
        memoryTextField.setText("");
        displayNumberTextField.setText("");
        phoneNumberTextField.setText("");
        durationTextField.setText("");
        // Clearing text area
        textAreaShowData.append(""); // Appending an empty string
        textAreaShowData.setText(""); // Clearing the text area
        // Clearing additional fields
        IdMobileTextField.setText("");
        deleteMusicMP3TextField.setText("");
        downloadMusicTExtField.setText("");
        IdMP3TExtField.setText("");
        addCreditTextField.setText("");
    }

    // Method to clear only the input fields, leaving the text area and other fields
    // intact
    public void clearOnlyFields() {
        // Clearing input fields
        modelTextField.setText("");
        priceTextField.setText("");
        weightTextField.setText("");
        sizeTextField.setText("");
        creditTextField.setText("");
        memoryTextField.setText("");
        displayNumberTextField.setText("");
        phoneNumberTextField.setText("");
        durationTextField.setText("");
        // Clearing additional fields
        IdMobileTextField.setText("");
        deleteMusicMP3TextField.setText("");
        downloadMusicTExtField.setText("");
        IdMP3TExtField.setText("");
        addCreditTextField.setText("");
    }

    // Main method to start the GadgetShop application
    public static void main(String[] args) {
        // Create an instance of the GadgetShop class to initialize the application
        GadgetShop gadgetShop = new GadgetShop();
    }

}
