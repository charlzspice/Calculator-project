package calculator;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Calculator {

	private JFrame frmMyCalculator;
	private JTextField textField;
double first, second ,result;
String operation,answer;
ImageIcon image=new ImageIcon();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmMyCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmMyCalculator = new JFrame();
		frmMyCalculator.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\HP\\Downloads\\Screenshot 2022-12-12 155423.jpg"));
		frmMyCalculator.setTitle("My Calc");
		frmMyCalculator.setBounds(100, 100, 245, 364);
		frmMyCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMyCalculator.getContentPane().setLayout(null);
		frmMyCalculator.setResizable(false);
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 21, 210, 40);
		frmMyCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton BTNCLEAR = new JButton("C");
		BTNCLEAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		BTNCLEAR.setBounds(10, 72, 45, 40);
		frmMyCalculator.getContentPane().add(BTNCLEAR);
		
		JButton PERCENT = new JButton("%");
		PERCENT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first= Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		PERCENT.setBounds(65, 72, 45, 40);
		frmMyCalculator.getContentPane().add(PERCENT);
		
		JButton BACK = new JButton("\uF0E7");
		BACK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String back=null;
				if(textField.getText().length()>0) {
					StringBuilder st=new StringBuilder(textField.getText());
					st.deleteCharAt(textField.getText().length()-1);
					back=st.toString();
					textField.setText(back);
				}
			}
		});
		BACK.setBounds(120, 72, 50, 40);
		frmMyCalculator.getContentPane().add(BACK);
		
		JButton DIVISION = new JButton("/");
		DIVISION.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first= Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		DIVISION.setHorizontalAlignment(SwingConstants.RIGHT);
		DIVISION.setBounds(175, 72, 45, 40);
		frmMyCalculator.getContentPane().add(DIVISION);
		
		JButton BTN7 = new JButton("7");
		BTN7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String number=textField.getText()+BTN7.getText();
			textField.setText(number);
			}
		});
		BTN7.setBounds(8, 125, 45, 40);
		frmMyCalculator.getContentPane().add(BTN7);
		
		JButton BTN8 = new JButton("8");
		BTN8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+BTN8.getText();
				textField.setText(number);
			}
		});
		BTN8.setBounds(63, 125, 45, 40);
		frmMyCalculator.getContentPane().add(BTN8);
		
		JButton BTN9 = new JButton("9");
		BTN9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+BTN9.getText();
				textField.setText(number);
			}
		});
		BTN9.setBounds(118, 125, 45, 40);
		frmMyCalculator.getContentPane().add(BTN9);
		
		JButton MULTIPLY = new JButton("*");
		MULTIPLY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first= Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		MULTIPLY.setBounds(173, 125, 45, 40);
		frmMyCalculator.getContentPane().add(MULTIPLY);
		
		JButton BTN4 = new JButton("4");
		BTN4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+BTN4.getText();
				textField.setText(number);
			}
		});
		BTN4.setBounds(8, 176, 45, 40);
		frmMyCalculator.getContentPane().add(BTN4);
		
		JButton BTN5 = new JButton("5");
		BTN5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+BTN5.getText();
				textField.setText(number);
			}
		});
		BTN5.setBounds(63, 176, 45, 40);
		frmMyCalculator.getContentPane().add(BTN5);
		
		JButton BTN6 = new JButton("6");
		BTN6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+BTN6.getText();
				textField.setText(number);
			}
		});
		BTN6.setBounds(118, 176, 45, 40);
		frmMyCalculator.getContentPane().add(BTN6);
		
		JButton MINUS = new JButton("-");
		MINUS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first= Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		MINUS.setBounds(173, 176, 45, 40);
		frmMyCalculator.getContentPane().add(MINUS);
		
		JButton BTN1 = new JButton("1");
		BTN1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+BTN1.getText();
				textField.setText(number);
			}
		});
		BTN1.setBounds(10, 227, 45, 40);
		frmMyCalculator.getContentPane().add(BTN1);
		
		JButton BTN2 = new JButton("2");
		BTN2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+BTN2.getText();
				textField.setText(number);
			}
		});
		BTN2.setBounds(65, 227, 45, 40);
		frmMyCalculator.getContentPane().add(BTN2);
		
		JButton BTN3 = new JButton("3");
		BTN3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+BTN3.getText();
				textField.setText(number);
			}
		});
		BTN3.setBounds(120, 227, 45, 40);
		frmMyCalculator.getContentPane().add(BTN3);
		
		JButton PLUS = new JButton("+");
		PLUS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first= Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		PLUS.setBounds(175, 227, 45, 40);
		frmMyCalculator.getContentPane().add(PLUS);
		
		JButton BTN00 = new JButton("00");
		BTN00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+BTN00.getText();
				textField.setText(number);
			}
		});
		BTN00.setBounds(10, 278, 50, 40);
		frmMyCalculator.getContentPane().add(BTN00);
		
		JButton BTN0 = new JButton("0");
		BTN0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+BTN0.getText();
				textField.setText(number);
			}
		});
		BTN0.setBounds(65, 278, 45, 40);
		frmMyCalculator.getContentPane().add(BTN0);
		
		JButton BTNDOT = new JButton(".");
		BTNDOT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+BTNDOT.getText();
				textField.setText(number);
			}
		});
		BTNDOT.setFont(new Font("Tahoma", Font.BOLD, 14));
		BTNDOT.setBounds(120, 278, 45, 40);
		frmMyCalculator.getContentPane().add(BTNDOT);
		
		JButton EQUALS = new JButton("=");
		EQUALS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second= Double.parseDouble(textField.getText());
				if(operation=="*") {
					result=first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}else
					if(operation=="+") {
						result=first+second;
						answer=String.format("%.2f", result);
						textField.setText(answer);
					}else
						if(operation=="-") {
							result=first-second;
							answer=String.format("%.2f", result);
							textField.setText(answer);
						}else
				if(operation=="/") {
					result=first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}else
					if(operation=="%") {
						result=first%second;
						answer=String.format("%.2f", result);
						textField.setText(answer);
					}
				
			}
		});
		EQUALS.setBounds(175, 278, 45, 40);
		frmMyCalculator.getContentPane().add(EQUALS);
	
	}
}
