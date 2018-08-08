
import java.awt.Font;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ChangeListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.event.ChangeEvent;
import java.util.Objects;
import javax.swing.BorderFactory;



/**This application allows you to customize the application we created in Application 1.
 * This allows me to move it vertically and horizontally.
 * This also allows me to customize the price
 * I really liked creating this application and I really learned a lot from this experience
 * 
 * @author Brandon
 *
 */

@SuppressWarnings("serial")
public class WebAdGenerator2 extends JFrame implements ActionListener, ChangeListener{

JPanel a = new JPanel();
JPanel bp = new JPanel();
JFrame f = new JFrame ();
JFrame jf = new JFrame ();
JScrollPane jsp = new JScrollPane(txt);
JTextField tf = new JTextField();
Random r = new Random();
/**This section displays the button
 * 
 */
JButton b = new JButton("Draw");
JButton ob = new JButton ("History");
JTextArea txt = new JTextArea();
JScrollPane jsp = new JScrollPane(txt);
JTextField tf = new JTextField();
Random r = new Random();

/**
 * This section puts the text into decimal format
 * 
 */
DecimalFormat df = new DecimalFormat(".##");

/**This section initializes the font choice
 * 
 */

Font heading = new Font("Monoscape", Font.PLAIN, 30);
Font slogan = new Font("Monoscape", Font.PLAIN, 10);
Font normalfont = new Font("Monoscape", Font.PLAIN, 7);
Font small = new Font("Monoscape", Font.PLAIN, 5);
int changeY = 0;
int changeX = 0;
JSlider xSlider = new JSlider(0,400,0);
JSlider ySlider = new JSlider(0,400,0);


/**This is where the Jcombo Box is located
 * 
 */
@SuppressWarnings("rawtypes")
JComboBox jcb = new JComboBox();
JOptionPane jp = new JOptionPane();

String[] sunColor = {"Pink", "Purple", "Green", "Orange"};

public static void main(String[] args){
WebAdGenerator2 app = new WebAdGenerator2();
app.setSize(915, 608);
app.setDefaultCloseOperation(EXIT_ON_CLOSE);
app.setTitle("Birthday Parties");
app.setVisible(true);
}


@SuppressWarnings("unchecked")
WebAdGenerator2(){
	add(a);
	a.setSize(900,700);
	add(bp, BorderLayout.SOUTH);
	bp.add(b);
	bp.add(xSlider);
	bp.add(ob);
	bp.add(jcb);
	bp.add(ySlider);
	
	b.addActionListener(this);
	ob.addActionListener(this);
	
	ySlider.addChangeListener(this);
	ySlider.setPaintTicks(true);
	ySlider.setMajorTickSpacing(15);
	ySlider.setBorder(BorderFactory.createTitledBorder("Y Axis"));
	
	xSlider.addChangeListener(this);
	xSlider.setPaintTicks(true);
	xSlider.setMajorTickSpacing(15);
	xSlider.setBorder(BorderFactory.createTitledBorder("X Axis"));
	
	
	
	jf.setSize(400,400);
	jf.setTitle("Purchase History");
	jf.setLocation(900,400);
	jf.add(jsp, BorderLayout.SOUTH);

	g.setColor(Color.RED);
	g.fillRoundRect(changeX + 460, changeY +260, 90, 160, 35, 42);
	g.setColor(Color.BLACK);
	g.fillRect(changeX + 460, changeY + 225, 20, 20);
	
	/**This section allows the user to select the color and displays the color as the result
	 * 
	 */
	
	Object selected = jcb.getSelectedItem();
	{
		if (Objects.equals(selected, "Red")) {
			g.setColor(Color.WHITE);
			g.fillArc(changeX +460, changeY +250, 30, 30, 0, 350);
			g.drawLine(changeX+460,changeY + 250, changeX +530,
					changeY+300);
			g.drawRect(465, 272, 42, 45);
		}
		if (Objects.equals(selected, "Purple")){
			g.setColor(Color.PINK);
			g.fillArc(changeX+460, changeY+250, 30, 30, 0, 350);
			g.drawLine(changeX+460, changeY+250, changeX+520,
					changeY+300);
			g.drawRect(460, 270, 40, 41);
		}
		if(Objects.equals(selected, "Gray")){
			g.setColor(Color.GRAY);
			g.fillArc(changeX+460, changeY+250, 30, 30, 0, 350);
			g.drawLine(changeX+460, changeY+251, changeX+520,
					changeY+310);
			g.drawRect(470, 270, 40, 41);
		}
		
		if (Objects.equals(selected, "Black")){
			g.setColor(Color.BLACK);
			g.fillArc(changeX+460, changeY+250, 30, 30, 0, 350);
		}
	}

