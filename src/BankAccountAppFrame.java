import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankAccountAppFrame extends JFrame {
    private JTextField balanceAmount;
    private JLabel balanceLabel;
    private JPanel panel1;
    private JPanel panel2;
    private JButton deposit;
    private JButton withdraw;
    private JButton exit;
    private double balance;

    public BankAccountAppFrame() {
        setTitle("Bank Balance App");
        setSize(400, 300);

        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(3, 3, 5, 5));
        panel2 = new JPanel();

        balanceLabel = new JLabel("Balance: $0.00");
        balanceAmount = new JTextField(10);
        deposit = new JButton("Deposit");
        withdraw = new JButton("Withdraw");
        exit = new JButton("Exit");

        panel1.add(new JLabel("Enter amount: "));
        panel1.add(balanceAmount);
        panel2.add(deposit);
        panel2.add(withdraw);
        panel2.add(exit);

        add(balanceLabel, BorderLayout.NORTH);
        add(panel1, BorderLayout.CENTER);
        add(panel2, BorderLayout.SOUTH);

        deposit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateBalance(true);
            }
        });

        withdraw.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateBalance(false);
            }
        });

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(rootPane,"Final Balance: $" + String.format("%.2f", balance));
                System.exit(0);
            }
        });

    }

    private void updateBalance(boolean charge) {
        double amount = Double.parseDouble(balanceAmount.getText());
        if(charge) {
            balance += amount;
        }
        else {
            balance -= amount;
        }
        balanceLabel.setText("Current Balance: $" + String.format("%.2f,", balance));
        balanceAmount.setText("");
    }

    public static void main(String[] args) {
        BankAccountAppFrame myFrame = new BankAccountAppFrame();
        myFrame.pack();
        myFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }


}



