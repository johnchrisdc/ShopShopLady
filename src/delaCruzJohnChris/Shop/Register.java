package delaCruzJohnChris.Shop;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class Register extends JFrame implements ActionListener{
	
	static String[] accountss = new String[10];
	static String[] passwordData = new String[10];
	static String[] nameData = new String[10];
	static String[] cardNoData = new String[10];
	static double[] money = new double[10];

	static int userNum = 0;
	
	JButton register = new JButton("Register");
	JButton logIn = new JButton("Login");
	
	JPanel top = new JPanel();
	JPanel bottom = new JPanel();
	JPanel middle = new JPanel();
	
	JLabel name = new JLabel("Name");
	JLabel username = new JLabel("Username");
	JLabel password = new JLabel("Password");
	JLabel address = new JLabel("Address");
	JLabel creditCard = new JLabel("Paypal Account");
	//JLabel cardTypeLbl = new JLabel("Card Type");
	
	JTextField nameField = new JTextField();
	JPasswordField passwordField = new JPasswordField();
	JTextField usernameField = new JTextField();
	JTextField addressField = new JTextField();
	JTextField cardField = new JTextField();
	
	//JComboBox cardType = new JComboBox();
	
	URL imageLoc = getClass().getResource("res/register_logo.png");
	JLabel logo = new JLabel();
	
	Font font=new Font("Segoe UI",Font.PLAIN,15);
	 
	
	Register(){
		name.setFont(font);
		nameField.setFont(font);
		
		password.setFont(font);
		passwordField.setFont(font);
		
		username.setFont(font);
		usernameField.setFont(font);
		
		address.setFont(font);
		addressField.setFont(font);
		
	//	cardType.setFont(font);
		
		creditCard.setFont(font);
		cardField.setFont(font);
		
		logo.setIcon(new ImageIcon(imageLoc)); 
		
		top.setBackground(Color.white);
		top.add(logo);
		
		bottom.setBackground(Color.white);
		
		middle.setBorder(BorderFactory.createEmptyBorder(10,100,10,100));
		middle.setLayout(new GridLayout ( 7, 2,0,0));		
		middle.setBackground(Color.white);
		
		middle.add(name);
		middle.add(nameField);
		middle.add(username);
		middle.add(usernameField);
		middle.add(password);
		middle.add(passwordField);
		middle.add(address);
		middle.add(addressField);
		middle.add(creditCard);
		middle.add(cardField);
	//	middle.add(cardType);
		middle.add(register);
		middle.add(logIn);
		
	//	cardType.addItem("Visa");
		//cardType.addItem("Mastercard");
		
		setSize(500,700);
		setLayout(new GridLayout ( 3, 1,0,0));
		add(top);
		add(middle);
		add(bottom);
		
		register.addActionListener(this);
		logIn.addActionListener(this);

	}
	
	
	public static void main(String[] args){
		
		Register register = new Register();
		register.setVisible(true);
		register.setTitle("Register");
		register.setLocationRelativeTo(null);
		register.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent jk) {
		Object src = new Object();
	    src = jk.getSource();
	    String test;
	    if (src.equals(register)){
	    	registration();
	    	System.out.println("New User: " + accountss[userNum]);

	    }
	    else if (src.equals(logIn)){
	    	
        	LogIn logz = new LogIn();
        	logz.setVisible(true);
        	logz.setLocationRelativeTo(null);
        	logz.setResizable(false);
        	dispose();
        	logz.show();
        	//System.out.print("logIm");
	    }
	}
	
	
	public void registration(){
		userNum++;
		String test;
    	test = usernameField.getText();
    	accountss[userNum]= test;
    	test = passwordField.getText();
    	passwordData[userNum] = test;
    	money[userNum] = 10000.00;
	}
	
}
