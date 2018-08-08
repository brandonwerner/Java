import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class WebAdGenerator extends JFrame implements ActionListener {

	JPanel p = new JPanel();
	JButton b = new JButton("Draw");
	
	public static void main(String[] args) {
		WebAdGenerator app = new WebAdGenerator();
		app.setSize(400, 400);
		app.setDefaultCloseOperation(EXIT_ON_CLOSE);
		app.setTitle("WebAdGenerator");
		app.setVisible(true);
	}
	
	WebAdGenerator() {
		this.setLayout(new BorderLayout());
		b.addActionListener(this);
		add(p, BorderLayout.CENTER);
		add(b, BorderLayout.SOUTH);	
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Graphics g = p.getGraphics();
		Graphics2D paper = (Graphics2D) g;
		RenderingHints hints = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		paper.setRenderingHints(hints);
				
		g.drawRect(0, 0, 400, 400);

		g.setColor( new Color( 102, 204, 255, 255) );
		g.fillOval(48, 134, 100, 100);

		g.setColor( new Color( 0, 0, 0, 255) );
		g.drawLine(108, 231, 108, 382);

		g.setColor( new Color( 0, 153, 102, 255) );
		g.fillOval(169, 137, 100, 100);

		g.setColor( new Color( 0, 0, 0, 255) );
		g.drawLine(224, 372, 224, 237);

		g.setColor( new Color( 255, 51, 51, 255) );
		g.fillOval(5, 133, 100, 100);

		g.setColor( new Color( 0, 0, 0, 255) );
		g.drawLine(91, 375, 70, 231);

		g.setColor( new Color( 255, 255, 51, 255) );
		g.fillOval(97, 134, 100, 100);

		g.setColor( new Color( 0, 0, 0, 255) );
		g.drawLine(0, 5, 0, 0);
		g.drawLine(156, 344, 145, 231);

		g.setColor( new Color( 255, 0, 204, 255) );
		g.fillOval(269, 145, 100, 100);

		g.setColor( new Color( 0, 0, 0, 255) );
		g.drawLine(0, 5, 0, 0);

		g.setFont( new Font("Monospaced", 1, 22) );
		g.drawString("Birthday supplies for sale!", 6, 25);
		g.setFont( new Font("Monospaced", 1, 15) );
		g.drawString("We have the best birthday supplies", 5, 45);
		g.setFont( new Font("Monospaced", 1, 15) );
		g.drawString("Waco, Texas", 5, 55);
		g.setFont( new Font("Monospaced", 1, 15) );
		g.drawString("Phone: (254)123-4567", 5, 65);
		g.setFont( new Font("Monospaced", 1, 15) );
		g.drawString("Hours: 9-5 Monday-Friday", 5, 75);
		g.setFont( new Font("Monospaced", 1, 15) );
		g.drawString("$99 for a party", 6, 85);
		g.setFont( new Font("Monospaced", 1, 14) );
		g.drawString("Wide range of ballons", 6, 95);
		g.setFont( new Font("Monospaced", 1, 14) );
		g.drawString("Blue, Green, Yellow, Pink, Red", 6, 105);
		g.setFont( new Font("Monospaced", 1, 16) );
		g.drawString("We can customize for your party needs", 6, 115);
		g.setFont( new Font("Monospaced", 1, 16) );
		g.drawString("www.birthdaysupplies.com", 6, 125);
		g.drawString("", 6, 125);
		g.drawLine(285, 371, 290, 237);
	}
}