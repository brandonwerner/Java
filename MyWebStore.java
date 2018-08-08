import java.awt.Dimension;
import java.text.DecimalFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import PizzeriaPOS7.ReceiptPanel;

public class MyWebStore extends javax.swing.JFrame {

	/** In this section, the Variables are declared */
    private javax.swing.JLabel Total_Label;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    
	private double TotalValue;
    
    /**
     * Creates new form MyWebStore
     */
    public MyWebStore() {
        TotalValue=0.0;
        initComponents();
    }

    /**
     * The creator of this is Brandon Werner
     * This application  displays a Graphical User Interface which displays a randomly generated price for an item
     * along with a randomly generated discount rate, and then multiplies the randomly generated price times the tax
     * rate of 7.25% to generate the Total.
     * 
     * The user also has five buttons to select from. The first button, Add WebAd, causes the program to display
     * another item on the Graphical User Interface. The second button, Remove WebAd, removes the selected WebAd from
     * list. The next button, Show Status, shows the status of the selected WebAd. The button after, View Selected Ad,
     * displays the selected WebAd. Finally, the last button, Print Selected Ad, prints the selected Ad using the
     * built in printer command of the operating system.
     * 
     * 
     * 
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Total_Label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        /** In this section, the WebAd button is declared */
        jButton1.setText("Add WebAd");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        /** In this section, the View Selected Ad button is declared */
        jButton2.setText("View Selected Ad");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        /** In this section, the Remove Selected Ad button is declared */
        jButton3.setText("Remove Selected Ad");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        /** In this section, the Print Selected Ad button is declared */
        jButton4.setText("Print Selected Ad");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        /** In this section, the background color and Font size and style are declared */
        Total_Label.setBackground(new java.awt.Color(0, 0, 0));
        Total_Label.setFont(new java.awt.Font("Tahoma", 0, 36));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Total_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Total_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton4))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            /** In this section, Strings of WebAd Price, Discount, Tax and Total are declared */
            new String [] {
                "WebAd Price", "Discount", "Tax", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        pack();
    }
    /** In this section, the jButton Action is Performed */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        WebAd obj=new WebAd();
        TotalValue=TotalValue+obj.getTotal();
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.addRow(new Object[]{"$"+obj.getWebAdPrice(), obj.getDiscount()+"%", obj.getTax()+"%","$"+obj.getTotal()});
        
        
        DecimalFormat df = new DecimalFormat("####0.00");
        TotalValue=Double.parseDouble(df.format(TotalValue));
        Total_Label.setText("$ "+TotalValue);
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        int row=jTable.getSelectedRow();
        if(row==-1)
        {
            JOptionPane.showMessageDialog(null,"No Row Selected");
        }
        else
        model.removeRow(row);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        int row=jTable.getSelectedRow();
        if(row==-1)
        {
            JOptionPane.showMessageDialog(null,"No Row Selected");
        }
        else
        JOptionPane.showMessageDialog(null,"Web Add Number "+(row+1)+" has price of "+model.getValueAt(row, 0)
                                            +"with Discount of "+model.getValueAt(row, 1)
                                            +"\nand Standard Tax Rate "+model.getValueAt(row, 2)
                                            +" \nwith Total Price Calculated as \n\t\t"+model.getValueAt(row, 3));
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
         DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        int row=jTable.getSelectedRow();
        if(row==-1)
        {
            JOptionPane.showMessageDialog(null,"No Row Selected");
        }
        else
        JOptionPane.showMessageDialog(null,"                  |Slip Printed|\nSr#  AdPrice  Discount  Tax  TotalPrice\n"
                    +(row+1)+"-    "+model.getValueAt(row, 0)
                    +"     "+model.getValueAt(row, 1)
                    +"         "+model.getValueAt(row, 2)
                    +"    "+model.getValueAt(row, 3));

    	
    }
    
    public static void main(String args[]) {
        /** This section sets the look and feel */
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MyWebStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyWebStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyWebStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyWebStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

        /** This code creates and displays the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MyWebStore().setVisible(true);
            }
        });
    }
    
}