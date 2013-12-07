package delaCruzJohnChris.Shop;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class LogIn extends JFrame implements ActionListener{
	
	static boolean logged = false;
	
	JPanel spacer1 = new JPanel();
	JPanel spacer2 = new JPanel();
	JPanel spacer3 = new JPanel();
	JPanel spacer4 = new JPanel();
	JPanel spacer5 = new JPanel();
	
	JButton logIn_btn = new JButton("Login");
	
	JTextField userName = new JTextField(20);
	JPasswordField passWord = new JPasswordField(20);
	
	JPanel userNameCon = new JPanel();
	JPanel passWordCon = new JPanel();
	
	JLabel user = new JLabel("Username");
	JLabel pass = new JLabel("Password");
	JLabel Register = new JLabel("     Register");
	JLabel Login_Later = new JLabel("Login later     ");
	
	URL imageLoc = getClass().getResource("res/logIn_logo.png");
	JLabel logo = new JLabel();
	
	Font font=new Font("Segoe UI",Font.PLAIN,15);
	
LogIn(){
	user.setFont(font);
	pass.setFont(font);
	Register.setFont(font);
	Login_Later.setFont(font);
	logIn_btn.setFont(font);
	userName.setFont(font);
	passWord.setFont(font);
	
	setTitle("LOL");
	setSize(500,700);
	setLayout(new GridLayout ( 3, 1,0,0));
	add(spacer1);
		spacer1.setBackground(Color.white);
			spacer1.add(logo);
			logo.setIcon(new ImageIcon(imageLoc)); 
	add(spacer2);
		spacer2.setBackground(Color.white);
		spacer2.setLayout(new GridLayout ( 5, 1,0,0));
		spacer2.add(userNameCon);
			userNameCon.setBackground(Color.white);
			userNameCon.add(user);
			userNameCon.add(userName);
		spacer2.add(passWordCon);
			passWordCon.setBackground(Color.white);	
			passWordCon.add(pass);
			passWordCon.add(passWord);
		spacer2.add(spacer3);
			spacer3.setBackground(Color.white);
			spacer3.add(logIn_btn);
	add(spacer5);
		spacer5.setBackground(Color.white);
		spacer5.add(Login_Later);
		spacer5.add(Register);
		
		logIn_btn.addActionListener(this);
		
		Register.addMouseListener(new MouseAdapter()  
		{  
		    public void mouseClicked(MouseEvent e)  
		    {  
		    	Register.setForeground(Color.pink);
		    	
		    	Register reg = new Register();
		    	reg.setVisible(true);
		    	reg.setLocationRelativeTo(null);
		    	reg.setResizable(false);
		    	dispose();
		    	reg.show();
		    }  
		}); 
		
		Login_Later.addMouseListener(new MouseAdapter()  
		{  
		    public void mouseClicked(MouseEvent e)  
		    {  
		    	Register.setForeground(Color.pink);
		    	
		    	Shop shop = new Shop();
		    	shop.setVisible(true);
		    	shop.setLocationRelativeTo(null);
		    	shop.setResizable(false);
		    	dispose();
		    	shop.show();
		    }  
		}); 
	
}

public static void main(String[] args){
	Register regData = new Register();
	LogIn log = new LogIn();
	log.setVisible(true);
	log.setTitle("Shop Shop Lady");
	log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	log.setLocationRelativeTo(null);
	log.setResizable(false);
	
}

public void actionPerformed(ActionEvent jc) {
	Register regData = new Register();	
	int index = regData.userNum;
	
	String accounts[] = new String[10];
	String passData[] = new String[10];
	
	accounts[index] = regData.accountss[index];	
	passData[index] = regData.passwordData[index];
	
	Object src = new Object();
    src = jc.getSource();
    if (src.equals(logIn_btn)){
    	System.out.print("logIn " +accounts[index]);
    	

    	int x =0;
    	for (x=0; x<index; x++){
    		if (userName.getText().equals(accounts[index])){
    			if (passWord.getText().equals(passData[index])){
    				System.out.print("logIm");
    				
    				logged = true;
    				
            		Shop shop = new Shop();
                	shop.setVisible(true);
                	shop.setLocationRelativeTo(null);
                	shop.setResizable(false);
                	dispose();
                	shop.show();
    			}
        			
        		
    			else{
    				int dialogButton = JOptionPane.OK_OPTION;
    		   		JOptionPane.showMessageDialog(null,"Invalid username/password","Error", dialogButton);
    			}
    	}

    		index++;
    	
    	}
    	

    }
	
}
	
}
