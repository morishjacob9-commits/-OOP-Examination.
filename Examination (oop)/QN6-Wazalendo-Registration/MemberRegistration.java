import javax.swing.*;

public class MemberRegistration {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Wazalendo SACCO Member Registration");

        JLabel lblMemberID = new JLabel("Member ID:");
        JLabel lblFullName = new JLabel("Full Name:");
        JLabel lblNIN = new JLabel("National ID (NIN):");
        JLabel lblPhone = new JLabel("Phone Number:");
        JLabel lblDeposit = new JLabel("Initial Deposit (UGX):");

        JTextField txtMemberID = new JTextField();
        JTextField txtFullName = new JTextField();
        JTextField txtNIN = new JTextField();
        JTextField txtPhone = new JTextField();
        JTextField txtDeposit = new JTextField();

        JButton btnRegister = new JButton("Register");
        JButton btnClear = new JButton("Clear");
        JButton btnExit = new JButton("Exit");

        frame.setLayout(null);

        lblMemberID.setBounds(20, 20, 150, 25);
        txtMemberID.setBounds(180, 20, 180, 25);

        lblFullName.setBounds(20, 60, 150, 25);
        txtFullName.setBounds(180, 60, 180, 25);

        lblNIN.setBounds(20, 100, 150, 25);
        txtNIN.setBounds(180, 100, 180, 25);

        lblPhone.setBounds(20, 140, 150, 25);
        txtPhone.setBounds(180, 140, 180, 25);

        lblDeposit.setBounds(20, 180, 150, 25);
        txtDeposit.setBounds(180, 180, 180, 25);

        btnRegister.setBounds(30, 230, 100, 30);
        btnClear.setBounds(145, 230, 100, 30);
        btnExit.setBounds(260, 230, 100, 30);

        frame.add(lblMemberID);
        frame.add(txtMemberID);

        frame.add(lblFullName);
        frame.add(txtFullName);

        frame.add(lblNIN);
        frame.add(txtNIN);

        frame.add(lblPhone);
        frame.add(txtPhone);

        frame.add(lblDeposit);
        frame.add(txtDeposit);

        frame.add(btnRegister);
        frame.add(btnClear);
        frame.add(btnExit);

        frame.setSize(420, 330);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}