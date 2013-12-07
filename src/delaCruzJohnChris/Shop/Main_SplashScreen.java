package delaCruzJohnChris.Shop;

import javax.swing.JLabel;
import javax.swing.JWindow;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
 

public class Main_SplashScreen extends JWindow
{
URL imageLoc = getClass().getResource("res/splash.png");
Image img=Toolkit.getDefaultToolkit().getImage(imageLoc);


 
public Main_SplashScreen()
	{
		try
		{		     
			setSize(500,700);
			setLocationRelativeTo(null);
			show();
			Thread.sleep(3000);
			dispose();
			LogIn lol = new LogIn();
			lol.setLocationRelativeTo(null);
			lol.show();
			}
			catch(Exception exception)
				{
				       javax.swing.JOptionPane.showMessageDialog((java.awt.Component)
				       null,"Error"+exception.getMessage(), "Error:",
				       javax.swing.JOptionPane.DEFAULT_OPTION);
				}
	}		 
		public void paint(Graphics g)
		{
		g.drawImage(img,0,0,this);
		}		 
		public static void main(String[]args)
		{
			
			Main_SplashScreen splash=new Main_SplashScreen();
		}
}
