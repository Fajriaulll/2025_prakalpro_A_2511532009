package pekan9_2511532009;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Kalkulator_2511532009 {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kalkulator_2511532009 window = new Kalkulator_2511532009();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Kalkulator_2511532009() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 260, 382);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField.setBounds(10, 10, 221, 69);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBackspace.setFont(new Font("Wingdings", Font.BOLD, 16));
		btnBackspace.setBounds(10, 82, 57, 51);
		frame.getContentPane().add(btnBackspace);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nomor=textField.getText()+btn7.getText();
				textField.setText(nomor);
			}
		});
		btn7.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btn7.setBounds(10, 133, 57, 51);
		frame.getContentPane().add(btn7);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nomor=textField.getText()+btn1.getText();
				textField.setText(nomor);
			}
		});
		btn1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btn1.setBounds(10, 234, 57, 51);
		frame.getContentPane().add(btn1);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nomor=textField.getText()+btn4.getText();
				textField.setText(nomor);
			}
		});
		btn4.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btn4.setBounds(10, 183, 57, 51);
		frame.getContentPane().add(btn4);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nomor=textField.getText()+btn0.getText();
				textField.setText(nomor);
			}
		});
		btn0.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btn0.setBounds(10, 284, 57, 51);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nomor=textField.getText()+btnDot.getText();
				textField.setText(nomor);
			}
		});
		btnDot.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnDot.setBounds(65, 284, 57, 51);
		frame.getContentPane().add(btnDot);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nomor=textField.getText()+btn2.getText();
				textField.setText(nomor);
			}
		});
		btn2.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btn2.setBounds(65, 234, 57, 51);
		frame.getContentPane().add(btn2);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nomor=textField.getText()+btn5.getText();
				textField.setText(nomor);
			}
		});
		btn5.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btn5.setBounds(65, 183, 57, 51);
		frame.getContentPane().add(btn5);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nomor=textField.getText()+btn8.getText();
				textField.setText(nomor);
			}
		});
		btn8.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btn8.setBounds(65, 133, 57, 51);
		frame.getContentPane().add(btn8);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnClear.setBounds(65, 82, 57, 51);
		frame.getContentPane().add(btnClear);
		
		JButton btnSama = new JButton("=");
		btnSama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if(operation=="+")
				{
					result=first+second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="-")
				{
					result=first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="x")
				{
					result=first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="/")
				{
					result=first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="%")
				{
					result=first%second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				
				
				
			}
		});
		btnSama.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		btnSama.setBounds(121, 284, 57, 51);
		frame.getContentPane().add(btnSama);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nomor=textField.getText()+btn3.getText();
				textField.setText(nomor);
			}
		});
		btn3.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btn3.setBounds(121, 234, 57, 51);
		frame.getContentPane().add(btn3);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nomor=textField.getText()+btn6.getText();
				textField.setText(nomor);
			}
		});
		btn6.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btn6.setBounds(121, 183, 57, 51);
		frame.getContentPane().add(btn6);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nomor=textField.getText()+btn9.getText();
				textField.setText(nomor);
			}
		});
		btn9.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btn9.setBounds(121, 133, 57, 51);
		frame.getContentPane().add(btn9);
		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nomor=textField.getText()+btn00.getText();
				textField.setText(nomor);
			}
		});
		btn00.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btn00.setBounds(121, 82, 57, 51);
		frame.getContentPane().add(btn00);
		
		JButton btnPersen = new JButton("%");
		btnPersen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnPersen.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		btnPersen.setBounds(177, 284, 57, 51);
		frame.getContentPane().add(btnPersen);
		
		JButton btnBagi_2511532009 = new JButton("/");
		btnBagi_2511532009.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnBagi_2511532009.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		btnBagi_2511532009.setBounds(177, 234, 57, 51);
		frame.getContentPane().add(btnBagi_2511532009);
		
		JButton btnKali_2511532009 = new JButton("x");
		btnKali_2511532009.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="x";
			}
		});
		btnKali_2511532009.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		btnKali_2511532009.setBounds(177, 183, 57, 51);
		frame.getContentPane().add(btnKali_2511532009);
		
		JButton btnKur_2511532009 = new JButton("-");
		btnKur_2511532009.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnKur_2511532009.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		btnKur_2511532009.setBounds(177, 133, 57, 51);
		frame.getContentPane().add(btnKur_2511532009);
		
		JButton btnPlus_2511532009 = new JButton("+");
		btnPlus_2511532009.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnPlus_2511532009.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		btnPlus_2511532009.setBounds(177, 82, 57, 51);
		frame.getContentPane().add(btnPlus_2511532009);
	}
}
