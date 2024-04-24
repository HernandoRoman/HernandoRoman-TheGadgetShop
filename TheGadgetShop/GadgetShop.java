import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GadgetShop implements ActionListener {
    private JFrame frame;
    private JTextField IdMobileTextField, IdMP3TExtField, modelTextField, weightTextField, priceTextField,
            sizeTextField, memoryTextField, downloadMusicTExtField, deleteMusicMP3TextField;
    private JTextField creditTextField, addCreditTextField, displayNumberTextField, phoneNumberTextField,
            durationTextField;
    private JButton addMobileButton, addMP3Button, makeACallButton, viewAllButton, clearButton, addCreditButton,
            downloadMusicButton, deleteMusicMP3Button, exitButton;

    private JTextArea textAreaShowData; // TextArea to show data

    private ArrayList<Gadget> gadgets = new ArrayList<>();

    public GadgetShop() {
        createGUI();
    }

    private void createGUI() {
        frame = new JFrame("The Gadget Shop");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Desactiva la opción de maximizar
        frame.setResizable(false);
        frame.setSize(2000, 800);

        JPanel contentPane = new JPanel(new BorderLayout());
        contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        contentPane.setBackground(Color.RED);
        frame.setContentPane(contentPane);

        // Header panel with welcome message
        JPanel headerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel headerLabel = new JLabel("Welcome to Gadget Shop!");
        headerLabel.setFont(new Font("Arial", Font.BOLD, 28));
        headerLabel.setForeground(Color.RED); // Set text color to white
        // headerPanel.setBackground(Color.RED);
        headerPanel.add(headerLabel);
        contentPane.add(headerPanel, BorderLayout.NORTH);

        // Input panel for mobile details
        JPanel inputPanel = new JPanel(new GridLayout(0, 2, 10, 10));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
        // inputPanel.setBackground(Color.BLUE);
        contentPane.add(inputPanel, BorderLayout.WEST);

        JLabel modelLabel = new JLabel("Model:");
        modelTextField = new JTextField();

        JLabel priceLabel = new JLabel("Price:");
        priceTextField = new JTextField(20);

        JLabel weightLabel = new JLabel("Weight:");
        weightTextField = new JTextField(20);

        JLabel sizeLabel = new JLabel("Size (12 mm x 55 mm x 5 mm):");
        sizeTextField = new JTextField(20);

        JLabel creditLabel = new JLabel("Credit:");
        creditTextField = new JTextField(20);

        JLabel memoryLabel = new JLabel("Memory:");
        memoryTextField = new JTextField(20);

        JLabel IdMobileLabel = new JLabel("Select Id Mobile To (Call or Add Credit):");
        IdMobileTextField = new JTextField(20);

        JLabel phoneNumberLabel = new JLabel("Phone Number:");
        phoneNumberTextField = new JTextField(20);

        JLabel durationLabel = new JLabel("Duration:");
        durationTextField = new JTextField(20);

        JLabel displayNumberLabel = new JLabel("Display Number:");
        displayNumberTextField = new JTextField(20);

        JLabel addCreditLabel = new JLabel("Add Credit:");
        addCreditTextField = new JTextField(20);

        JLabel IdMP3Label = new JLabel("Select Id MP3 To (Download or Delete) Music:");
        IdMP3TExtField = new JTextField(20);

        JLabel downLoadMusicLabel = new JLabel("Download Music:");
        downloadMusicTExtField = new JTextField(20);

        JLabel deleteMusicMP3Label = new JLabel("Delete Music:");
        deleteMusicMP3TextField = new JTextField(20);

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
        inputPanel.add(IdMobileLabel);
        inputPanel.add(IdMobileTextField);
        inputPanel.add(phoneNumberLabel);
        inputPanel.add(phoneNumberTextField);
        inputPanel.add(durationLabel);
        inputPanel.add(durationTextField);
        inputPanel.add(displayNumberLabel);
        inputPanel.add(displayNumberTextField);
        inputPanel.add(addCreditLabel);
        inputPanel.add(addCreditTextField);
        inputPanel.add(IdMP3Label);
        inputPanel.add(IdMP3TExtField);
        inputPanel.add(downLoadMusicLabel);
        inputPanel.add(downloadMusicTExtField);
        inputPanel.add(deleteMusicMP3Label);
        inputPanel.add(deleteMusicMP3TextField);

        // Button panel for other buttons
        JPanel buttonPanel = new JPanel(new GridLayout(0, 1, 0, 10));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
        // buttonPanel.setBackground(Color.RED);
        contentPane.add(buttonPanel, BorderLayout.CENTER);

        addMobileButton = new JButton("Add Mobile");
        addMobileButton.addActionListener(this);
        buttonPanel.add(addMobileButton);

        addMP3Button = new JButton("Add MP3");
        addMP3Button.addActionListener(this);
        buttonPanel.add(addMP3Button);

        viewAllButton = new JButton("Show All Gadgets");
        viewAllButton.addActionListener(this);
        buttonPanel.add(viewAllButton);

        makeACallButton = new JButton("Make a Call");
        makeACallButton.addActionListener(this);
        buttonPanel.add(makeACallButton);

        addCreditButton = new JButton("Add Credit");
        addCreditButton.addActionListener(this);
        buttonPanel.add(addCreditButton);

        downloadMusicButton = new JButton("Download Music");
        downloadMusicButton.addActionListener(this);
        buttonPanel.add(downloadMusicButton);

        deleteMusicMP3Button = new JButton("Delete Music");
        deleteMusicMP3Button.addActionListener(this);
        buttonPanel.add(deleteMusicMP3Button);

        clearButton = new JButton("Clear");
        clearButton.addActionListener(this);
        buttonPanel.add(clearButton);

        exitButton = new JButton("Exit");
        exitButton.addActionListener(this);
        buttonPanel.add(exitButton);

        
        // Create the panel to hold the text area
        JPanel textAreaPanel = new JPanel(new BorderLayout());
        textAreaPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
        contentPane.add(textAreaPanel, BorderLayout.PAGE_END);

        textAreaShowData = new JTextArea(20, 20);
        textAreaShowData.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textAreaShowData);
        textAreaPanel.add(scrollPane, BorderLayout.CENTER);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == addMobileButton) {
            addMobile();
        } else if (source == addMP3Button) {
            addMP3();
        } else if (source == makeACallButton) {
            makeACall();
        } else if (source == viewAllButton) {
            viewAll();
        } else if (source == clearButton) {
            clear();
        } else if (source == addCreditButton) {
            addCredit();
        } else if (source == downloadMusicButton) {
            downloadMusic();
        } else if (source == deleteMusicMP3Button) {
            deleteMusicMP3();
        } else if (source == exitButton) {
            exitButton();
        }

    }

    private void exitButton() {
        int choice = JOptionPane.showConfirmDialog(frame, "Are you sure you want to Exit?", "Exit Confirmation",
                JOptionPane.YES_NO_CANCEL_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(frame, "Thank You. Goodbye!");
            frame.dispose(); // Close the JFrame
        }
    }

    public void addMobile() {
        try {

            memoryTextField.setText("");
            String model = modelTextField.getText();
            double price = Double.parseDouble(priceTextField.getText());
            int weight = Integer.parseInt(weightTextField.getText());
            String size = sizeTextField.getText();
            int credit = Integer.parseInt(creditTextField.getText());
            Mobile newMobile = new Mobile(model, price, weight, size, credit);
            gadgets.add(newMobile);
            JOptionPane.showMessageDialog(frame, "A new mobile is saved");
            viewAll();
            clearOnlyFields();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Invalid input format. Please enter valid values.");
            clear();
        }
    }

    public void addMP3() {
        try {

            creditTextField.setText("");
            String model = modelTextField.getText();
            double memory = Double.parseDouble(memoryTextField.getText());
            double price = Double.parseDouble(priceTextField.getText());
            int weight = Integer.parseInt(weightTextField.getText());
            String size = sizeTextField.getText();
            MP3 newMP3 = new MP3(memory, model, price, weight, size);
            gadgets.add(newMP3);
            JOptionPane.showMessageDialog(frame, "A new MP3 is added");
            viewAll();
            clearOnlyFields();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Invalid input format. Please enter valid values.");
            clear();
        }
    }

    public void makeACall() {
        try {

            int idMobile = Integer.parseInt(IdMobileTextField.getText()) - 1;
            String phoneNumber = phoneNumberTextField.getText();
            int duration = Integer.parseInt(durationTextField.getText());
            displayNumberTextField.setText(phoneNumberTextField.getText());
            if (idMobile >= 0 && idMobile < gadgets.size()) {
                Gadget gadget = gadgets.get(idMobile);
                if (gadget instanceof Mobile) {
                    Mobile mobile = (Mobile) gadget;
                    var result = mobile.makeCall(phoneNumber, duration);
                    if (result != null) {
                        JOptionPane.showMessageDialog(frame, "Call Was Successfully!");
                        textAreaShowData.append("Mobile Id: " + (idMobile + 1) + " " + result + "\n");
                        System.out.println("Mobile Id: " + (idMobile + 1) + " " + result + "\n");
                        phoneNumberTextField.setText("");
                        IdMobileTextField.setText("");
                        durationTextField.setText("");
                        textAreaShowData.append("Update Calling Credit \n");
                        System.out.println("Update Calling Credit \n");
                        viewAll();
                    } else {
                        JOptionPane.showMessageDialog(frame, "Sorry!. Call not Was Successfully!");
                        clear();
                        textAreaShowData.append("your balance is insuficiet, please top up and try again" + "\n");
                        System.out.println("your balance is insuficiet, please top up and try again" + "\n");

                        return;
                    }

                } else {
                    JOptionPane.showMessageDialog(frame, "This is not a mobile");
                    clear();
                }
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid display number");
                clear();
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Invalid input format. Please enter valid values.");
            clear();
        }
    }

    public void addCredit() {
        try {
            String idMobileStr = IdMobileTextField.getText();
            int idMobile = Integer.parseInt(idMobileStr) - 1;

            if (idMobile >= 0 && idMobile < gadgets.size()) {
                Gadget gadget = gadgets.get(idMobile);
                if (gadget instanceof Mobile) {
                    Mobile mobile = (Mobile) gadget;
                    int amount = Integer.parseInt(addCreditTextField.getText());
                    if (amount < 0) {
                        JOptionPane.showMessageDialog(frame, "Please enter a Valid Amount!");
                        IdMobileTextField.setText("");
                        addCreditTextField.setText("");
                        return;
                    }
                    mobile.addCredit(amount);
                    JOptionPane.showMessageDialog(frame, "Credit added successfully!");
                    textAreaShowData
                            .append("Mobile Id: " + (idMobile + 1) + " - Credit added successfully £" + amount + "\n");
                    IdMobileTextField.setText("");
                    addCreditTextField.setText("");
                    textAreaShowData.append("\n");
                    viewAll();
                } else {
                    JOptionPane.showMessageDialog(frame, "This is not a mobile device.");
                    clear();
                }
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid mobile ID.");
                clear();
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Invalid input format. Please enter a valid number.");
            clear();
        }
    }

    public void downloadMusic() {
        try {
            String idMP3Str = IdMP3TExtField.getText();
            int idMP3 = Integer.parseInt(idMP3Str) - 1;

            if (idMP3 >= 0 && idMP3 < gadgets.size()) {
                Gadget gadget = gadgets.get(idMP3);
                if (gadget instanceof MP3) {
                    MP3 mp3 = (MP3) gadget;
                    String music = downloadMusicTExtField.getText();
                    if (Double.parseDouble(music) < 0) {
                        JOptionPane.showMessageDialog(frame, "Sorry!. Please enter a Valid MB!");
                        IdMP3TExtField.setText("");
                        downloadMusicTExtField.setText("");
                        return;
                    }
                    var result = mp3.downloadMusic(Double.parseDouble(music));
                    if (result != null) {
                        JOptionPane.showMessageDialog(frame, "Music downloaded successfully!");
                        textAreaShowData.append("MP3 Id: " + (idMP3 + 1) + " - " + result + " " + music + " MB\n");
                        System.out.println("MP3 Id: " + (idMP3 + 1) + " - " + result + " " + music + " MB\n");
                        IdMP3TExtField.setText("");
                        downloadMusicTExtField.setText("");
                        textAreaShowData.append("\n");
                        viewAll();
                    } else {
                        JOptionPane.showMessageDialog(frame, "Sorry!. Music downloaded not Was Successfully!");
                        IdMP3TExtField.setText("");
                        downloadMusicTExtField.setText("");
                        clear();
                        textAreaShowData.append(
                                "Error: The memory is less than the space needed, please add positive value" + "\n");
                        System.out.println(
                                "Error: The memory is less than the space needed, please add positive value " + "\n");
                        return;
                    }

                } else {
                    JOptionPane.showMessageDialog(frame, "This is not an MP3 device.");
                    clear();
                }
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid MP3 ID.");
                clear();
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Invalid input format. Please enter a valid number.");
            clear();
        }
    }

    public void deleteMusicMP3() {
        try {

            String idMP3Str = IdMP3TExtField.getText();
            int idMP3 = Integer.parseInt(idMP3Str) - 1;

            if (idMP3 >= 0 && idMP3 < gadgets.size()) {
                Gadget gadget = gadgets.get(idMP3);
                if (gadget instanceof MP3) {
                    MP3 mp3 = (MP3) gadget;
                    String music = deleteMusicMP3TextField.getText();
                    if (Integer.parseInt(music) < 0) {
                        JOptionPane.showMessageDialog(frame, "Sorry!. Please enter a Valid MB!");
                        IdMP3TExtField.setText("");
                        deleteMusicMP3TextField.setText("");
                        return;
                    }
                    var result = mp3.deleteMusic(Integer.parseInt(music));
                    if (result != null) {
                        JOptionPane.showMessageDialog(frame, result);
                        textAreaShowData.append("MP3 Id: " + (idMP3 + 1) + " - " + result + " " + music + " MB\n");
                        System.out.println("MP3 Id: " + (idMP3 + 1) + " - " + result + " " + music + " MB\n");
                        IdMP3TExtField.setText("");
                        deleteMusicMP3TextField.setText("");
                        textAreaShowData.append("\n");
                        viewAll();
                    } else {
                        JOptionPane.showMessageDialog(frame, "Sorry!. Music downloaded not Was Successfully!");
                        IdMP3TExtField.setText("");
                        deleteMusicMP3TextField.setText("");
                        clear();
                        textAreaShowData.append(
                                "Error: The memory is less than the space needed, please add positive value" + "\n");
                        System.out.println(
                                "Error: The memory is less than the space needed, please add positive value " + "\n");
                        return;
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "This is not an MP3 device.");
                    clear();
                }
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid MP3 ID.");
                clear();
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Invalid input format. Please enter a valid number.");
            clear();
        }
    }

    public void viewAll() {
        textAreaShowData.append("");
        // Appending a header for displaying all gadgets
        textAreaShowData.append("Display Gadgets:\n");
        System.out.println("Display Gadgets:\n");
        for (Gadget gadget : gadgets) {
            textAreaShowData.append("Id: " + (gadgets.indexOf(gadget) + 1) + "\n" + gadget.display() + "\n");
            textAreaShowData.append("\n");
            System.out.println("Id: " + (gadgets.indexOf(gadget) + 1) + "\n " + gadget.display() + "\n");
            gadget.display();

        }
        textAreaShowData.append("---------------------------------------------------------------\n");

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
        textAreaShowData.setText("");
        IdMobileTextField.setText("");
        deleteMusicMP3TextField.setText("");
        downloadMusicTExtField.setText("");
        IdMP3TExtField.setText("");
        addCreditTextField.setText("");

    }

    public void clearOnlyFields() {
        modelTextField.setText("");
        priceTextField.setText("");
        weightTextField.setText("");
        sizeTextField.setText("");
        creditTextField.setText("");
        memoryTextField.setText("");
        displayNumberTextField.setText("");
        phoneNumberTextField.setText("");
        durationTextField.setText("");
        IdMobileTextField.setText("");
        deleteMusicMP3TextField.setText("");
        downloadMusicTExtField.setText("");
        IdMP3TExtField.setText("");
        addCreditTextField.setText("");

    }

    public static void main(String[] args) {
        GadgetShop GadgetShop = new GadgetShop();
    }

}
