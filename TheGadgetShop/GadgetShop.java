import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GadgetShop implements ActionListener {
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
    private ArrayList<Gadget> gadgets = new ArrayList<>();

    public GadgetShop() {
        createGUI();
    }

    private void createGUI() {
        frame = new JFrame("-----: Welcome - The Gadget Shop :-----");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(1300, 800);

        JPanel contentPane = new JPanel(new GridLayout(1, 3));
        contentPane.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        contentPane.setBackground(Color.red);
        frame.setContentPane(contentPane);

        // Panel 1
        JPanel panel1 = new JPanel(new GridLayout(0, 1, 10, 10));
        panel1.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panel1.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        panel1.setBorder(BorderFactory.createTitledBorder("Enter Data....."));
        panel1.setBackground(Color.orange);

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

        contentPane.add(panel1, BorderLayout.SOUTH);

        // Panel 4
        JPanel panel4 = new JPanel(new GridLayout(0, 1, 10, 10));
        panel4.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panel4.setBorder(BorderFactory.createLineBorder(Color.black));
        panel4.setBorder(BorderFactory.createTitledBorder("Call And Add Credit To The Mobilea....."));
        panel4.setBackground(Color.orange);

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

        makeACallButton.addActionListener(this);
        addCreditButton.addActionListener(this);

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

        contentPane.add(panel4, BorderLayout.SOUTH);

        // Panel 5
        JPanel panel5 = new JPanel(new GridLayout(0, 1, 10, 10));
        panel5.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));        
        panel5.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        panel5.setBorder(BorderFactory.createTitledBorder("Download And Delete Music From MP3....."));
        panel5.setBackground(Color.orange);

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

        downloadMusicButton.addActionListener(this);
        deleteMusicMP3Button.addActionListener(this);

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

        contentPane.add(panel5);

        // Text Area Panel
        JPanel textAreaPanel = new JPanel(new BorderLayout());
        textAreaPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));    
        textAreaPanel.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        textAreaPanel.setBorder(BorderFactory.createTitledBorder("Show All List Data....."));
        textAreaShowData = new JTextArea(20, 60);
        textAreaShowData.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textAreaShowData);
        // Establecer una dimensión más grande para el textArea
        Dimension textAreaSize = new Dimension(800, 400); // Cambia los valores según tus necesidades
        scrollPane.setPreferredSize(textAreaSize);
        textAreaPanel.add(scrollPane, BorderLayout.CENTER);
        contentPane.add(textAreaPanel, BorderLayout.SOUTH);

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
            viewAll();
            JOptionPane.showMessageDialog(frame, "A new mobile is saved");
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
            viewAll();
            JOptionPane.showMessageDialog(frame, "A new MP3 is added");
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
            if (idMobile >= 0 && idMobile < gadgets.size()) {
                Gadget gadget = gadgets.get(idMobile);
                if (gadget instanceof Mobile) {
                    Mobile mobile = (Mobile) gadget;
                    var result = mobile.makeCall(phoneNumber, duration);
                    if (result != null) {
                        JOptionPane.showMessageDialog(frame, "Call Was Successfully!");
                        textAreaShowData.append("Mobile Id: " + (idMobile + 1) + " " + result + "\n");
                        System.out.println("Mobile Id: " + (idMobile + 1) + " " + result + "\n");
                        displayNumberTextField.setText(phoneNumberTextField.getText());
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
                JOptionPane.showMessageDialog(frame, "Invalid ID number");
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
        if (gadgets.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "No Data to Display! (Empty List).");
            textAreaShowData.append("No Data to Display! (Empty List\n");
            System.out.println("No Data to Display! (Empty List\n");
            return;
        }
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
