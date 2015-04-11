package com.cheryl.lab9_part3;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

 
/**
 *
 * @author cheryl
 */

public class Stock_Quotes extends javax.swing.JFrame {
    private final int maxQuotes = 15;
    private double averagePrice;
    private ArrayList<Double> quoteList;
    private final String[] arrStock  = {"INTC", "IBM", "AAPL", "SBUX","TGT"};
    private final int[] arrTime ={5000, 10000, 30000, 60000, 120000};                       
    private String currStock;
    private int delay,i;
    private Timer timer;
    private boolean timerInitialized;//determines if timer has been initialized
    private final Color myGray = new Color(102,102,102);
    
    /**
     * Creates new form Stock_Quotes
     */
    
    public Stock_Quotes() {
        this.quoteList = new ArrayList<>();
        averagePrice = 0;
        delay = 0;
        i=0;
        currStock = "INTC";
        timerInitialized = false;
        initComponents();
    }
    public void colorLabel(JLabel lbl, boolean up, boolean down){     
        if (up) {
            lbl.setForeground(Color.green);
        }else if (down) {
            lbl.setForeground(Color.red);
        }else{
            lbl.setForeground(Color.yellow);
        }
    }
    public void getYahooQuotes(){
        quoteList.add(URLreader.getQuotes(currStock));
        boolean greater = false, less = false;
        double num1 = round(quoteList.get(i),2);
        double num2 = round(averagePrice,2);
//        System.out.println("num1="+num1);
//        System.out.println("num2="+num2);
        if (round(quoteList.get(i),2) > round(averagePrice,2)){
            greater = true;
        }else if(round(quoteList.get(i),2)< round(averagePrice,2)){
            less = true;
        }
        if(quoteList.size() > maxQuotes){
            timer.stop();
        }else{
            switch (i){
                case 0:
                    lblQuote1.setText(String.valueOf(quoteList.get(i)));
                    colorLabel(lblQuote1, greater, less);
                    break;
                case 1:
                    lblQuote2.setText(String.valueOf(quoteList.get(i)));
                    colorLabel(lblQuote2, greater, less);
                    break;
                case 2:
                    lblQuote3.setText(String.valueOf(quoteList.get(i)));
                    colorLabel(lblQuote3, greater, less);
                    break;
                case 3:
                    lblQuote4.setText(String.valueOf(quoteList.get(i)));
                    colorLabel(lblQuote4, greater, less);
                    break;
                case 4:
                    lblQuote5.setText(String.valueOf(quoteList.get(i)));
                    colorLabel(lblQuote5, greater, less);
                    break;
                case 5:
                    lblQuote6.setText(String.valueOf(quoteList.get(i)));
                    colorLabel(lblQuote6, greater, less);
                    break;
                case 6:
                    lblQuote7.setText(String.valueOf(quoteList.get(i)));
                    colorLabel(lblQuote7, greater, less);
                    break;
                case 7:
                    lblQuote8.setText(String.valueOf(quoteList.get(i)));
                    colorLabel(lblQuote8, greater, less);
                    break;
                case 8:
                    lblQuote9.setText(String.valueOf(quoteList.get(i)));
                    colorLabel(lblQuote9, greater, less);
                    break;
                case 9:
                    lblQuote10.setText(String.valueOf(quoteList.get(i)));
                    colorLabel(lblQuote10, greater, less);
                    break;
                case 10:
                    lblQuote11.setText(String.valueOf(quoteList.get(i)));
                    colorLabel(lblQuote11, greater, less);
                    break;
                case 11:
                    lblQuote12.setText(String.valueOf(quoteList.get(i)));
                    colorLabel(lblQuote12, greater, less);
                    break;
                case 12:
                    lblQuote13.setText(String.valueOf(quoteList.get(i)));
                    colorLabel(lblQuote13, greater, less);
                    break;
                case 13:
                    lblQuote14.setText(String.valueOf(quoteList.get(i)));
                    colorLabel(lblQuote14, greater, less);
                    break;
                case 14:
                    lblQuote15.setText(String.valueOf(quoteList.get(i)));
                    colorLabel(lblQuote15, greater, less);
                    break;
                default:
                    break;
            }
        }
        i++;
        averagePrice = calcAverage();
        DecimalFormat sAvg = new DecimalFormat("#.##");
        lblAvgText.setText(sAvg.format(averagePrice));
    }
    public double calcAverage(){
        int len = quoteList.size();
        double sum = 0;
        for (int j=0;j<len;j++){
            sum = sum + quoteList.get(j);
        }
        return sum/len;
    }
    public static double round(double value, int places) {
        if (places < 0) {
            throw new IllegalArgumentException();
        }
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    private void clearQuotes(){
        i = 0;
        quoteList.removeAll(quoteList);
        averagePrice = 0;
        lblAvgText.setText(String.valueOf(averagePrice));
        for (Component l : jPanel1.getComponents()) {
            if (l instanceof JLabel) { 
                //((JLabel)l).setText("");
                ((JLabel)l).setForeground(myGray);
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        cmbStocks = new javax.swing.JComboBox();
        lblSelectStock = new javax.swing.JLabel();
        cmbTimeInterval = new javax.swing.JComboBox();
        lblSelectTime = new javax.swing.JLabel();
        lblAvgLbl = new javax.swing.JLabel();
        lblAvgText = new javax.swing.JLabel();
        btnGetQuotes = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblQuote1 = new javax.swing.JLabel();
        lblQuote2 = new javax.swing.JLabel();
        lblQuote3 = new javax.swing.JLabel();
        lblQuote4 = new javax.swing.JLabel();
        lblQuote6 = new javax.swing.JLabel();
        lblQuote7 = new javax.swing.JLabel();
        lblQuote8 = new javax.swing.JLabel();
        lblQuote13 = new javax.swing.JLabel();
        lblQuote5 = new javax.swing.JLabel();
        lblQuote9 = new javax.swing.JLabel();
        lblQuote10 = new javax.swing.JLabel();
        lblQuote14 = new javax.swing.JLabel();
        lblQuote15 = new javax.swing.JLabel();
        lblQuote12 = new javax.swing.JLabel();
        lblQuote11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setText("Cheryl's Stock Quotes for Lab 9 Part 3");

        cmbStocks.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "INTC", "IBM", "AAPL", "SBUX", "TGT" }));
        cmbStocks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStocksActionPerformed(evt);
            }
        });

        lblSelectStock.setText("Select Stock");

        cmbTimeInterval.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "5", "10", "30", "60", "120" }));
        cmbTimeInterval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTimeIntervalActionPerformed(evt);
            }
        });

        lblSelectTime.setText("Select Time Interval in Seconds");

        lblAvgLbl.setText("Average:");

        btnGetQuotes.setText("Get Quotes");
        btnGetQuotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetQuotesActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        lblQuote1.setForeground(new java.awt.Color(102, 102, 102));
        lblQuote1.setText("Quote 1");

        lblQuote2.setForeground(new java.awt.Color(102, 102, 102));
        lblQuote2.setText("Quote 2");

        lblQuote3.setForeground(new java.awt.Color(102, 102, 102));
        lblQuote3.setText("Quote 3");

        lblQuote4.setForeground(new java.awt.Color(102, 102, 102));
        lblQuote4.setText("Quote 4");

        lblQuote6.setForeground(new java.awt.Color(102, 102, 102));
        lblQuote6.setText("Quote 6");

        lblQuote7.setForeground(new java.awt.Color(102, 102, 102));
        lblQuote7.setText("Quote 7");

        lblQuote8.setForeground(new java.awt.Color(102, 102, 102));
        lblQuote8.setText("Quote 8");

        lblQuote13.setForeground(new java.awt.Color(102, 102, 102));
        lblQuote13.setText("Quote 13");

        lblQuote5.setForeground(new java.awt.Color(102, 102, 102));
        lblQuote5.setText("Quote 5");

        lblQuote9.setForeground(new java.awt.Color(102, 102, 102));
        lblQuote9.setText("Quote 9");

        lblQuote10.setForeground(new java.awt.Color(102, 102, 102));
        lblQuote10.setText("Quote 10");

        lblQuote14.setForeground(new java.awt.Color(102, 102, 102));
        lblQuote14.setText("Quote 14");

        lblQuote15.setForeground(new java.awt.Color(102, 102, 102));
        lblQuote15.setText("Quote 15");

        lblQuote12.setForeground(new java.awt.Color(102, 102, 102));
        lblQuote12.setText("Quote 12");

        lblQuote11.setForeground(new java.awt.Color(102, 102, 102));
        lblQuote11.setText("Quote 11");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblQuote5)
                    .addComponent(lblQuote4)
                    .addComponent(lblQuote3)
                    .addComponent(lblQuote2)
                    .addComponent(lblQuote1))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblQuote6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblQuote11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblQuote7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblQuote12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblQuote10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblQuote15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblQuote9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblQuote14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblQuote8)
                        .addGap(35, 35, 35)
                        .addComponent(lblQuote13)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuote1)
                    .addComponent(lblQuote6)
                    .addComponent(lblQuote11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuote2)
                    .addComponent(lblQuote7)
                    .addComponent(lblQuote12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuote3)
                    .addComponent(lblQuote8)
                    .addComponent(lblQuote13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuote4)
                    .addComponent(lblQuote9)
                    .addComponent(lblQuote14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuote5)
                    .addComponent(lblQuote10)
                    .addComponent(lblQuote15))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSelectStock)
                                    .addComponent(cmbStocks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSelectTime)
                                    .addComponent(cmbTimeInterval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblAvgLbl))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAvgText, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGetQuotes)
                        .addGap(14, 14, 14))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSelectStock)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbStocks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSelectTime)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbTimeInterval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(lblAvgLbl)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvgText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGetQuotes))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbStocksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStocksActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cmbStocksActionPerformed

    private void cmbTimeIntervalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTimeIntervalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTimeIntervalActionPerformed

    private void btnGetQuotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetQuotesActionPerformed
        // TODO add your handling code here:
        clearQuotes();
        if(timerInitialized && timer.isRunning()){
            timer.stop();
        }
        delay = arrTime[cmbTimeInterval.getSelectedIndex()];
        currStock = arrStock[cmbStocks.getSelectedIndex()];
        timer = new Timer(delay, new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              getYahooQuotes();
          }
       });
        timerInitialized = true;
        timer.start();
         
    }//GEN-LAST:event_btnGetQuotesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void showQuotes() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Stock_Quotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stock_Quotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stock_Quotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stock_Quotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stock_Quotes().setVisible(true);
                
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGetQuotes;
    private javax.swing.JComboBox cmbStocks;
    private javax.swing.JComboBox cmbTimeInterval;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAvgLbl;
    private javax.swing.JLabel lblAvgText;
    private javax.swing.JLabel lblQuote1;
    private javax.swing.JLabel lblQuote10;
    private javax.swing.JLabel lblQuote11;
    private javax.swing.JLabel lblQuote12;
    private javax.swing.JLabel lblQuote13;
    private javax.swing.JLabel lblQuote14;
    private javax.swing.JLabel lblQuote15;
    private javax.swing.JLabel lblQuote2;
    private javax.swing.JLabel lblQuote3;
    private javax.swing.JLabel lblQuote4;
    private javax.swing.JLabel lblQuote5;
    private javax.swing.JLabel lblQuote6;
    private javax.swing.JLabel lblQuote7;
    private javax.swing.JLabel lblQuote8;
    private javax.swing.JLabel lblQuote9;
    private javax.swing.JLabel lblSelectStock;
    private javax.swing.JLabel lblSelectTime;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
