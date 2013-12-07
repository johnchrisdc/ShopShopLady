package delaCruzJohnChris.Shop;

import java.awt.BorderLayout;
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
import javax.swing.JPanel;

public class Shop extends JFrame implements ActionListener{
	JPanel titleBar_con = new JPanel((LayoutManager) new FlowLayout(FlowLayout.LEFT));
	JPanel content_con = new JPanel();
	JPanel item_con = new JPanel();
	
	JLabel logOut = new JLabel("                                           Log out");
	
	URL imageLoc = getClass().getResource("res/shop_icon.png");
	JLabel shop_icon = new JLabel();
	
	JLabel phone = new JLabel("PHONES");
	
	JLabel title = new JLabel("Shop Shop Lady");
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
	JPanel item7 = new JPanel();
	JPanel item8 = new JPanel();
	JPanel item9 = new JPanel();
	
	JPanel item1_cheat = new JPanel();
	JPanel item2_cheat = new JPanel();
	JPanel item3_cheat = new JPanel();
	JPanel item4_cheat = new JPanel();
	
	
	JLabel item1_lbl = new JLabel("Item1");
	JLabel item2_lbl = new JLabel("PC");
	JLabel item3_lbl = new JLabel("Item3");
	JLabel item4_lbl = new JLabel("Item4");
	
	JButton item1_btn = new JButton("VIEW");
	JButton item2_btn = new JButton("NOT AVAILABLE");
	JButton item3_btn = new JButton();
	JButton item4_btn = new JButton();
	
	
	Shop(){
		//setFont(font);
		
		LogIn logged = new LogIn();
		boolean isLog = logged.logged;
		
		if (isLog==false){
			logOut.setVisible(false);
		}
		
		
		
		phone.setFont(font);
		phone.setForeground(Color.white);
		logOut.setFont(font);
		logOut.setForeground(Color.white);
		item2_lbl.setFont(font);
		item2_lbl.setForeground(Color.white);
		
		setSize(500,700);
		add(titleBar_con);
			titleBar_con.setSize(500, 45);
			titleBar_con.setBackground(titleBarBackground);
			shop_icon.setIcon(new ImageIcon(imageLoc)); 
				titleBar_con.add(shop_icon);
				titleBar_con.add(title);
				titleBar_con.add(logOut);
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
					item2_cheat.add(item1_btn);
					
					
			content_con.add(item4);
				item4.setBackground(titleBarBackground);
				item4.setLayout(new GridLayout ( 3, 1,0,0));
					item4.add(item4_cheat);
						item4_cheat.setBackground(darkPink);						
						item4_cheat.add(item2_lbl);
					item4.add(item4_cheat);
					item4.add(item7);
					item4_cheat.setBackground(titleBarBackground);
					item7.setBackground(titleBarBackground);
					item7.add(item2_btn);
				
			content_con.add(item5);

			item1_btn.addActionListener(this);
				
			content_con.add(item6);


			logOut.addMouseListener(new MouseAdapter()  
			{  
			    public void mouseClicked(MouseEvent e)  
			    {  
			    	
		        	LogIn logz = new LogIn();
		        	logz.setVisible(true);
		        	logz.setLocationRelativeTo(null);
		        	logz.setResizable(false);
		        	dispose();
		        	logz.show();
		        	System.out.print("logIm");
			    }  
			}); 
			
			
	}	
	
	public static void main(String[] args){
		Shop shopShop = new Shop();
		shopShop.setVisible(true);
		shopShop.show();
		shopShop.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		shopShop.setLocationRelativeTo(null);

	}

	public void actionPerformed(ActionEvent kk) {
		Object src = new Object();
	    src = kk.getSource();
	    if (src.equals(item1_btn)){
	    	Phone shop = new Phone();
	    	shop.setVisible(true);
	    	shop.setLocationRelativeTo(null);
	    	shop.setResizable(false);
	    	dispose();
	    	shop.show();
	    }
	}
}
