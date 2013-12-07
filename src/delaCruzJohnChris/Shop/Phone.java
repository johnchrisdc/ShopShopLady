package delaCruzJohnChris.Shop;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Phone extends JFrame implements ActionListener{
	JPanel titleBar_con = new JPanel((LayoutManager) new FlowLayout(FlowLayout.LEFT));
	JPanel content_con = new JPanel();
	JPanel item_con = new JPanel();
	
	JButton moneyButton = new JButton();
	
	URL imageLoc = getClass().getResource("res/shop_icon.png");
	JLabel shop_icon = new JLabel();
	
	JLabel phone = new JLabel("NOKIA 3310");
	
	JLabel title = new JLabel("Shop Shop Lady | Phones");
	Font font=new Font("Segoe UI",Font.PLAIN,20);
	Color titleBarBackground = new Color(255,150,150);
	Color darkPink = new Color(255,120,120);
	Color test = new Color(255,250,250);
	
	JPanel item1 = new JPanel();
	JPanel item2 = new JPanel();
	JPanel item3 = new JPanel();
	JPanel item4 = new JPanel();
	JPanel item5 = new JPanel();
	JPanel item6 = new JPanel();
	
	JPanel item1_cheat = new JPanel();
	JPanel item2_cheat = new JPanel();
	JPanel item3_cheat = new JPanel();
	JPanel item5_cheat = new JPanel();
	JPanel item6_cheat = new JPanel();
	JPanel item7_cheat = new JPanel();
	JPanel item8_cheat = new JPanel();
	JPanel item9_cheat = new JPanel();
	JPanel item0_cheat = new JPanel();
	
	JLabel item1_lbl = new JLabel("Item1");
	JLabel item2_lbl = new JLabel("NOKIA 3210");
	JLabel item3_lbl = new JLabel("404 NOT FOUND");
	JLabel item4_lbl = new JLabel("404 NOT FOUND");
	
	int stocks = 10;
	
	JLabel stock = new JLabel("Items left - " + stocks);
	
	JButton item1_btn = new JButton("BUY $100.00");
	JButton item2_btn = new JButton("NOT AVAILABLE");
	JButton item3_btn = new JButton();
	JButton item4_btn = new JButton();
	
	Phone(){
		moneyButton.setVisible(false);
		
		//setFont(font);
		phone.setFont(font);
		phone.setForeground(Color.white);
		
		item2_lbl.setFont(font);
		item2_lbl.setForeground(Color.white);
		
		setSize(500,700);
		add(titleBar_con);
		titleBar_con.setSize(500, 45);
		titleBar_con.setBackground(titleBarBackground);
		shop_icon.setIcon(new ImageIcon(imageLoc)); 
			titleBar_con.add(shop_icon);
			titleBar_con.add(title);
			titleBar_con.add(moneyButton);
				title.setForeground(Color.white);
				title.setFont(font);
	add(content_con);
		content_con.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		content_con.setBackground(Color.white);
		content_con.setLayout(new GridLayout ( 4, 2,5,5));
		content_con.add(item1);
			item1.setBackground(Color.white);
		content_con.add(item2);
			item2.setBackground(Color.white);
			
			
		content_con.add(item3);
			item3.setBackground(titleBarBackground);
			item3.setLayout(new GridLayout ( 3, 1,0,0));
				item3.add(item3_cheat);
					item3_cheat.setBackground(darkPink);
					item3_cheat.add(phone);
				item3.add(item1_cheat);
				item3.add(item2_cheat);
				item1_cheat.setBackground(titleBarBackground);
				item2_cheat.setBackground(titleBarBackground);
					item1_cheat.add(stock);
				item2_cheat.add(item1_btn);
				LogIn logged = new LogIn();
				boolean isLog = logged.logged;
				
				if (isLog==true){
					moneyButton.setVisible(true);
					moneyButton.setText("CASH - $10000.00");
				}
				
		content_con.add(item4);
			
		item4.setBackground(darkPink);
		item4.setLayout(new GridLayout ( 3, 1,0,0));
			item4.add(item5_cheat);
				item5_cheat.setBackground(darkPink);
				item5_cheat.add(item2_lbl);
			item4.add(item6_cheat);
			item4.add(item7_cheat);
			item6_cheat.setBackground(titleBarBackground);
			item7_cheat.setBackground(titleBarBackground);
			item7_cheat.add(item2_btn);
			
			
		content_con.add(item5);
			item5.add(item3_lbl);
			item5.setBackground(titleBarBackground);
			
			
		content_con.add(item6);
			item6.add(item4_lbl);	
			item6.setBackground(titleBarBackground);
			
			item1_btn.addActionListener(this);
			moneyButton.addActionListener(this);
			
			
			shop_icon.addMouseListener(new MouseAdapter()  
			{  
			    public void mouseClicked(MouseEvent e)  
			    {  
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
		Phone phone = new Phone();

		
		phone.setTitle("Phones");
		phone.setVisible(true);
		phone.show();
		phone.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		phone.setLocationRelativeTo(null);

	}

	public void actionPerformed(ActionEvent jc) {
		Object src = new Object();
	    src = jc.getSource();
	    
	    LogIn logged = new LogIn();
	    Register regData = new Register();
	    
	    double[] urMoney = new double[10];
	    
	    boolean isLog = logged.logged;
	    int mindex = regData.userNum;
	    String urName = regData.accountss[mindex];
	    	    
	    urMoney[mindex] = regData.money[mindex];
	    
	    if (src.equals(item1_btn)){
	   	if (isLog==true){
	    		stocks--;
	    		System.out.print(stocks);
	    		stock.setText("Items left - " + stocks);
	    		urMoney[mindex]=urMoney[mindex]-100;
	    		moneyButton.setText("CASH $"+urMoney[mindex]);
	  	}
	   	
	   	else{
	   		int dialogButton = JOptionPane.OK_OPTION;
	   		JOptionPane.showMessageDialog(null,"Please Login","You're not logged in",dialogButton);
	   		if(dialogButton == JOptionPane.YES_OPTION){
	        	LogIn logz = new LogIn();
	        	logz.setVisible(true);
	        	logz.setLocationRelativeTo(null);
	        	logz.setResizable(false);
	        	dispose();
	        	logz.show();
	        	System.out.print("logIm");
	   		}
	   		
	   	}
	   	
	   	if (stocks<=0){
	   		stock.setText("OUT OF STOCK");
	   		item1_btn.setText("NOT AVAILABLE");
	   	}
	   	
	    }
	    else if (src.equals(moneyButton)){
	    	int dialogButton = JOptionPane.OK_OPTION;
	    	JOptionPane.showMessageDialog(null,"Username: " + urName + "\n"+"Money: " + urMoney[mindex],"Account",dialogButton);
	    }
	    
	}

}
