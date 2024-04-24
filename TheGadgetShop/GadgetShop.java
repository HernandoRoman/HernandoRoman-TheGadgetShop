import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GadgetShop implements ActionListener {
    private JFrame frame;
    private JTextField modelTextField, weightTextField, priceTextField, sizeTextField, memoryTextField;
    private JTextField creditTextField, displayNumberTextField, phoneNumberTextField, durationTextField;
    private JButton addMobileButton, addMP3Button, makeACallButton, viewAllButton, clearButton;
     private JTextArea textAreaShowData; // TextArea to show data

    private ArrayList<Gadget> gadgets = new ArrayList<>();

    
    public GadgetShop()
    {
        createGUI();
    }

    private void createGUI() {
        frame = new JFrame("The Gadget Shop");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Desactiva la opción de maximizar
        frame.setResizable(false);
        frame.setSize(800, 600);

        JPanel contentPane = new JPanel(new BorderLayout());
        contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        frame.setContentPane(contentPane);

        JPanel inputPanel = new JPanel(new GridLayout(0, 2, 10, 10));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 10));
        contentPane.add(inputPanel, BorderLayout.WEST);

        JLabel modelLabel = new JLabel("Model:");
        modelTextField = new JTextField();

        JLabel priceLabel = new JLabel("Price:");
        priceTextField = new JTextField(20);

        JLabel weightLabel = new JLabel("Weight:");
        weightTextField = new JTextField(20);

        JLabel sizeLabel = new JLabel("Size:");
        sizeTextField = new JTextField(20);
        
        JLabel creditLabel = new JLabel("Credit:");
        creditTextField = new JTextField(20);
        
        JLabel memoryLabel = new JLabel("Memory:");
        memoryTextField = new JTextField(20);

        JLabel displayNumberLabel = new JLabel("Display Number:");
        displayNumberTextField = new JTextField(20);

        JLabel phoneNumberLabel = new JLabel("Phone Number:");
        phoneNumberTextField = new JTextField(20);

        JLabel durationLabel = new JLabel("Duration:");
        durationTextField = new JTextField(20);

        inputPanel.add(modelLabel);
        inputPanel.add(modelTextField);
        inputPanel.add(priceLabel);
        inputPanel.add(priceTextField);
        inputPanel.add(weightLabel);
        inputPanel.add(weightTextField);
        inputPanel.add(sizeLabel);
        inputPanel.add(sizeTextField);
        inputPanel.add(creditLabel);
        inputPanel.add(creditTextField);
        inputPanel.add(memoryLabel);
        inputPanel.add(memoryTextField);        
        inputPanel.add(displayNumberLabel);
        inputPanel.add(displayNumberTextField);
        inputPanel.add(phoneNumberLabel);
        inputPanel.add(phoneNumberTextField);
        inputPanel.add(durationLabel);
        inputPanel.add(durationTextField);

        JPanel buttonPanel = new JPanel(new GridLayout(0, 1, 0, 10));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));
        contentPane.add(buttonPanel, BorderLayout.CENTER);

        addMobileButton = new JButton("Add Mobile");
        addMobileButton.addActionListener(this);
        buttonPanel.add(addMobileButton);

        addMP3Button = new JButton("Add MP3");
        addMP3Button.addActionListener(this);
        buttonPanel.add(addMP3Button);

        makeACallButton = new JButton("Make a Call");
        makeACallButton.addActionListener(this);
        buttonPanel.add(makeACallButton);

        viewAllButton = new JButton("View All");
        viewAllButton.addActionListener(this);
        buttonPanel.add(viewAllButton);

        clearButton = new JButton("Clear");
        clearButton.addActionListener(this);
        buttonPanel.add(clearButton);
        
        // Create the panel to hold the text area
        JPanel textAreaPanel = new JPanel(new BorderLayout());
        textAreaPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
        contentPane.add(textAreaPanel, BorderLayout.SOUTH);

        textAreaShowData = new JTextArea(10, 40);
        textAreaShowData.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textAreaShowData);
        textAreaPanel.add(scrollPane, BorderLayout.CENTER);
        
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
         Object source = e.getSource();
    
    if (source == addMobileButton)
    {
        addMobile();
    } else if (source == addMP3Button) 
    {
        addMP3();
    } else if (source == makeACallButton)
    {
        makeACall();
    } else if (source == viewAllButton)
    {
        viewAll();
    } else if (source == clearButton) 
    {
        clear();
    }
    }
    
    public void addMobile() {
    try {
        String model = modelTextField.getText();
        double price = Double.parseDouble(priceTextField.getText());
        int weight = Integer.parseInt(weightTextField.getText());
        String size = sizeTextField.getText();
        int credit = Integer.parseInt(creditTextField.getText());

        Mobile newMobile = new Mobile(model, price, weight, size, credit);
        gadgets.add(newMobile);
        JOptionPane.showMessageDialog(frame, "A new mobile is saved");
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(frame, "Invalid input format. Please enter valid values.");
    }
}

public void addMP3() {
    try {
        String model = modelTextField.getText();
        double memory = Double.parseDouble(memoryTextField.getText());
        double price = Double.parseDouble(priceTextField.getText());
        int weight = Integer.parseInt(weightTextField.getText());
        String size = sizeTextField.getText();

        MP3 newMP3 = new MP3(memory, model, price, weight, size);
        gadgets.add(newMP3);
        JOptionPane.showMessageDialog(frame, "A new MP3 is added");
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(frame, "Invalid input format. Please enter valid values.");
    }
}

public void makeACall() {
    try {
        int displayNumber = Integer.parseInt(displayNumberTextField.getText());
        String phoneNumber = phoneNumberTextField.getText();
        int duration = Integer.parseInt(durationTextField.getText());

        if (displayNumber >= 0 && displayNumber < gadgets.size()) {
            Gadget gadget = gadgets.get(displayNumber);
            if (gadget instanceof Mobile) {
                Mobile mobile = (Mobile) gadget;
                mobile.makeCall(phoneNumber, duration);
            } else {
                JOptionPane.showMessageDialog(frame, "This is not a mobile");
            }
        } else {
            JOptionPane.showMessageDialog(frame, "Invalid display number");
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(frame, "Invalid input format. Please enter valid values.");
    }
}

public void viewAll()
 {
     // Appending a header for displaying all gadgets
        textAreaShowData.append("Display All Gadgets:\n");
        System.out.println("Display All Gadgets:\n");
    
    for (Gadget gadget : gadgets)
    {
        textAreaShowData.append("Id: " + (gadgets.indexOf(gadget) + 1) + "\n" +  gadget.display() + "\n");
        textAreaShowData.append("\n");
        System.out.println(("Id: " + gadgets.indexOf(gadget) + 1) + "\n " + gadget.display() +"\n");
        gadget.display();
    }
    textAreaShowData.append("");
        
        
}

public void clear() {
    modelTextField.setText("");
    priceTextField.setText("");
    weightTextField.setText("");
    sizeTextField.setText("");
    creditTextField.setText("");
    memoryTextField.setText("");
    displayNumberTextField.setText("");
    phoneNumberTextField.setText("");
    durationTextField.setText("");
    textAreaShowData.append("");
    textAreaShowData.append("");
}

public static void main(String[] args) 
    {
         GadgetShop GadgetShop = new GadgetShop();
    }


}
