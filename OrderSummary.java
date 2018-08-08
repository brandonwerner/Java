
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;




	/**
	 * OrderSummary.java
	 * 
	 * This app creates a report showing random stock numbers and random prices to
	 * go along with the random stock numbers
	 * 
	 * This app also shows the order total, average price, lowest price, and the 
	 * highest price, and that is why I decided to call the program 
	 * Order Summary 
	 * 
	 */
	public class OrderSummary extends JFrame implements ActionListener{
		JPanel p = new JPanel();
		JFrame j = new JFrame();
		JButton b = new JButton("Load Repot");
		/**This is where I can customized the font used, in this case I used Monospaced font
		 */
		Font f = new Font("Monospaced", Font.PLAIN, 12);
		JTextArea jTextArea = new JTextArea();
		
		public static void main(String[] args){
			OrderSummary app = new OrderSummary();
			app.setSize(350,450);
			app.setDefaultCloseOperation(EXIT_ON_CLOSE);
			app.setTitle("Order Summary");
			app.setVisible(true);
		}
		OrderSummary(){
			
			this.setLayout(new BorderLayout());
			b.addActionListener(this);
			add(p, BorderLayout.CENTER);
			add(b, BorderLayout.SOUTH);
		}
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			p.add(jTextArea);
			
			jTextArea.append("Stock Number \t\t\t   Product Cost\n");
			jTextArea.append("-------------------------------------------------------------------------------------\n");
			
			Random r = new Random();
			double OrderPriceTotal = 0;
			int num = r.nextInt(15-1) +1;
			double LowestPrice = 100000;
			double HighestPrice =0;
			
			
			/**This area generates the random number of stock items to show
			 */
			for (int i=0; i < num; i++){
				Random x = new Random();
				int RandonStock = r.nextInt(500-200)+200;
				Random y = new Random();
				double RandomPrice = 10.46+(212.11-10.46)*r.nextDouble();
				if(RandomPrice > HighestPrice){
					HighestPrice = RandomPrice;
				}
				if(RandomPrice < LowestPrice){
					LowestPrice=RandomPrice;
				}
				
				String s = String.format("%.2f",RandomPrice);
				OrderPriceTotal += RandomPrice;
				
				
				/**This area creates the output that shows the Stock Number and Price
				 */
				jTextArea.append(i+1 + ". Stock Number " + RandonStock + "\t\t  $" + s + '\n');
				
			}
			/** This area formats the output of the program
			 */
			
			/**This is the portion of the application where the strings are formated before they are outputed
			 * to the user.
			 */
		jTextArea.append("------------------------------------------------------------------------------------\n");
		String order = String.format("%.2f",OrderPriceTotal);
		String average = String.format("%.2f", OrderPriceTotal/num);
		String low = String.format("%.2f", LowestPrice);
		String high = String.format("%.2f", HighestPrice);
		
		/**This is where the output for the bottom portion of the application is located, which shows Order total,
		 * Average Price, Lowest Price, Highest Price. This portion shows all of the spacing of the application that is
		 * needed to make it visually appealing.
		 */
		jTextArea.append("\n\n"); 
		jTextArea.append("Order Total Price: $" + order + '\n');
		jTextArea.append("Average Order Price Total: $" + average + '\n');
		jTextArea.append("Lowest Order Price: $" + low + '\n');
		jTextArea.append("Highest Order Price: $" +high + "\n\n\n");
		}
			
	}












