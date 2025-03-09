import java.awt.*;
import javax.swing.*;
import java.util.HashMap;

public class Main extends JFrame {
    private JTextField inputField;
    private JLabel resultLabel;
    private JComboBox<String> currencyDropdown;

    // Currency conversion rates
    private final HashMap<String, Double> conversionRates;

    public Main() {
        setTitle("Currency Converter");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 5, 5));

        // Initialize conversion rates
        conversionRates = new HashMap<>();
        conversionRates.put("USD", 160.00);
        conversionRates.put("EUR", 175.00);
        conversionRates.put("GBP", 200.00);

        // Input Field
        add(new JLabel("Enter Amount ($):"));
        inputField = new JTextField();
        add(inputField);

        // Currency Type Dropdown
        add(new JLabel("Select Currency:"));
        currencyDropdown = new JComboBox<>(new String[]{"USD", "EUR", "GBP"});
        add(currencyDropdown);

        // Convert Button
        JButton convertButton = new JButton("Convert");
        add(convertButton);

        // Result Label
        resultLabel = new JLabel("Result: ");
        add(resultLabel);

        // Action Listener for Button
        convertButton.addActionListener(e -> calculate());

        setVisible(true);
    }

    public void calculate() {
        try {
            String inputText = inputField.getText().trim();

            // Check if input is empty
            if (inputText.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter the amount!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Convert string input to double
            double amount = Double.parseDouble(inputText);
            String selectedCurrency = (String) currencyDropdown.getSelectedItem();
            double rate = conversionRates.get(selectedCurrency);

            // Perform conversion
            double result = amount * rate;

            // Update result label
            resultLabel.setText("Converted Amount: " + result + " " + selectedCurrency);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Enter a valid number!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);
    }
}
