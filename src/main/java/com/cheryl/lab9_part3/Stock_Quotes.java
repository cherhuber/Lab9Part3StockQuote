package com.cheryl.lab9_part3;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;

 
/**
 *
 * @author cheryl
 */
public class Stock_Quotes extends javax.swing.JFrame {
    private double averagePrice;
    ArrayList<Double> quoteList;
    private final String[] arrStock  = {"INTC", "IBM", "AAPL", "SBUX","TGT"};
    private final int[] arrTime ={5000, 10000, 30000, 60000, 120000};                       
    String currStock;
    int delay, i;
    
    /**
     * Creates new form Stock_Quotes
     */
    
    public Stock_Quotes() {
        this.quoteList = new ArrayList<>();
        averagePrice = 0;
        delay = 0;
        i=0;
        currStock = "INTC";
        initComponents();
    }
public void getYahooQuotes(){
    quoteList.add(URLreader.getQuotes(currStock));
    
}
public double calcAverage(){
    int len = quoteList.size();
    double sum = 0;
    for (int j=0;j<len;j++){
        sum = sum + quoteList.get(j);
    }
    return sum/len;
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
        lblQuote1 = new javax.swing.JLabel();
        lblQuote2 = new javax.swing.JLabel();
        lblQuote3 = new javax.swing.JLabel();
        lblQuote4 = new javax.swing.JLabel();
        lblQuote5 = new javax.swing.JLabel();
        lblQuote6 = new javax.swing.JLabel();
        lblQuote7 = new javax.swing.JLabel();
        lblQuote8 = new javax.swing.JLabel();
        lblQuote9 = new javax.swing.JLabel();
        lblQuote10 = new javax.swing.JLabel();
        lblQuote11 = new javax.swing.JLabel();
        lblQuote12 = new javax.swing.JLabel();
        lblQuote13 = new javax.swing.JLabel();
        lblQuote14 = new javax.swing.JLabel();
        lblQuote15 = new javax.swing.JLabel();
        lblAvgLbl = new javax.swing.JLabel();
        lblAvgText = new javax.swing.JLabel();
        btnGetQuotes = new javax.swing.JButton();

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

        lblQuote1.setText("Quote 1");

        lblQuote2.setText("Quote 2");

        lblQuote3.setText("Quote 3");

        lblQuote4.setText("Quote 4");

        lblQuote5.setText("Quote 5");

        lblQuote6.setText("Quote 6");

        lblQuote7.setText("Quote 7");

        lblQuote8.setText("Quote 8");

        lblQuote9.setText("Quote 9");

        lblQuote10.setText("Quote 10");

        lblQuote11.setText("Quote 11");

        lblQuote12.setText("Quote 12");

        lblQuote13.setText("Quote 13");

        lblQuote14.setText("Quote 14");

        lblQuote15.setText("Quote 15");

        lblAvgLbl.setText("Average:");

        lblAvgText.setText("Avg");

        btnGetQuotes.setText("Get Quotes");
        btnGetQuotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetQuotesActionPerformed(evt);
            }
        });

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
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblQuote2)
                                    .addComponent(lblQuote1)
                                    .addComponent(lblQuote3)
                                    .addComponent(lblQuote4)
                                    .addComponent(lblQuote5)
                                    .addComponent(lblAvgLbl))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblQuote10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblQuote15))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblQuote9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblQuote14))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblQuote6)
                                        .addGap(41, 41, 41)
                                        .addComponent(lblQuote11))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblQuote7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblQuote12))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblQuote8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblQuote13)))))
                        .addContainerGap(65, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAvgText, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGetQuotes)
                        .addGap(14, 14, 14))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuote1)
                    .addComponent(lblQuote6)
                    .addComponent(lblQuote11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuote12)
                    .addComponent(lblQuote2)
                    .addComponent(lblQuote7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuote3)
                    .addComponent(lblQuote8)
                    .addComponent(lblQuote13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuote9)
                    .addComponent(lblQuote4)
                    .addComponent(lblQuote14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuote10)
                    .addComponent(lblQuote5)
                    .addComponent(lblQuote15))
                .addGap(18, 18, 18)
                .addComponent(lblAvgLbl)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvgText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGetQuotes))
                .addGap(0, 42, Short.MAX_VALUE))
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
        delay = arrTime[cmbTimeInterval.getSelectedIndex()];
        currStock = arrStock[cmbStocks.getSelectedIndex()];
      ActionListener taskPerformer = new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
          //...Perform a task...
      }
      };
         new javax.swing.Timer(delay, taskPerformer).start();
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
