import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.text.*;
import javax.swing.JCheckBox;

public class CalculateTwoNumber extends JFrame {

	private JPanel contentPane;
	private JTextField tfNum1;
	private JTextField tfNum2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculateTwoNumber frame = new CalculateTwoNumber();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculateTwoNumber() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 382);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumber1 = new JLabel("Enter Number 1");
		lblNumber1.setBounds(53, 32, 90, 21);
		lblNumber1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblNumber1);
		
		JLabel lblNewLabel = new JLabel("Enter Number 2");
		lblNewLabel.setBounds(53, 70, 90, 14);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblNewLabel);
		
		tfNum1 = new JTextField();
		tfNum1.setBounds(178, 33, 105, 20);
		contentPane.add(tfNum1);
		tfNum1.setColumns(10);
		
		tfNum2 = new JTextField();
		tfNum2.setBounds(178, 68, 105, 20);
		tfNum2.setColumns(10);
		contentPane.add(tfNum2);
		JLabel operator = new JLabel("Operator");
		operator.setFont(new Font("Tahoma", Font.PLAIN, 13));
		operator.setBounds(89, 108, 54, 14);
		contentPane.add(operator);
		
		final JComboBox chOperator = new JComboBox();
		chOperator.setBounds(178, 105, 54, 22);
		contentPane.add(chOperator);
		chOperator.addItem("+");
		chOperator.addItem("-");
		chOperator.addItem("*");
		chOperator.addItem("/");
		
		final JLabel lblResult = new JLabel("Result");
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblResult.setBounds(270, 253, 115, 14);
		contentPane.add(lblResult);
		JLabel showDigit = new JLabel("How to show Digit");
		showDigit.setBounds(28, 142, 115, 14);
		contentPane.add(showDigit);
		
		final JRadioButton oneDigit = new JRadioButton("1 Digit");
		oneDigit.setBounds(174, 138, 109, 23);
		contentPane.add(oneDigit);
		
		final JRadioButton twoDigit = new JRadioButton("2 Digit");
		twoDigit.setBounds(174, 164, 109, 23);
		contentPane.add(twoDigit);
		
		ButtonGroup group = new ButtonGroup();
		group.add(oneDigit);
		group.add(twoDigit);
		
		final JCheckBox chkDialogbox = new JCheckBox("Show Result at DialogBox");
		chkDialogbox.setBounds(174, 199, 154, 23);
		contentPane.add(chkDialogbox);
		
		final JButton okButton = new JButton("OK");
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1, num2, sum=0;
				String operator;
				//JButton
				if(e.getSource()==okButton) {
					num1 = Double.parseDouble(tfNum1.getText());
					num2 = Double.parseDouble(tfNum2.getText());
					//JComboBox
					operator = (String)chOperator.getSelectedItem();
					if(operator.equals("+")) {
						sum = num1+num2;
					}
					if(operator.equals("-")) {
						sum = num1-num2;
					}
					if(operator.equals("*")) {
						sum = num1*num2;
					}
					if(operator.equals("/")) {
						sum = num1/num2;
					}
					//JRadioButton
					DecimalFormat frmNumber = null;
					if(oneDigit.isSelected()) {
						frmNumber = new DecimalFormat("#,###.0");
					}
					else if(twoDigit.isSelected()) {
						frmNumber = new DecimalFormat("#,###.00");
					}
					lblResult.setText(frmNumber.format(sum));
					//JCheckBox
					if(chkDialogbox.isSelected()) {
						JOptionPane.showMessageDialog(null,"Result is : " + (frmNumber.format(sum)));
					}
				}
			}
		});
		okButton.setBounds(64, 298, 89, 23);
		contentPane.add(okButton);
		
		JButton exitButton = new JButton("EXIT");
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		exitButton.setBounds(189, 298, 89, 23);
		contentPane.add(exitButton);
		
		JLabel showOption = new JLabel("Option to show");
		showOption.setBounds(53, 203, 90, 14);
		contentPane.add(showOption);
		
	}
}
