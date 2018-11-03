/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmanagement;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
 import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.print.*;
import javax.print.SimpleDoc;
import javax.swing.text.Document;

/**
 *
 * @author Stalwart
 */
public class Billing extends javax.swing.JPanel {

     StringBuilder sb=new StringBuilder();
    String strCode,strItemName,strAmount,strComp,strQty;
    JLabel lbCode,lbName,lbAmt,lbComp,lbQty,lbQtyRequired;
    JComboBox cb2;
    ArrayList<JComboBox> arrCombo;
     HashMap<JComboBox,String> hm;
    public Billing() {
        initComponents();
    }

    Billing(ArrayList<StockDetailBean> arrSelectedObjs) {
   this();
 
   GridLayout gl =new GridLayout(arrSelectedObjs.size()+1,6);
   panelStocks.setLayout(gl);
         
          lbCode=new JLabel("Item Code");
          lbName=new JLabel("Item Name");
          lbComp=new JLabel("Company");
          lbQty=new JLabel("Quantity");
          lbAmt=new JLabel("Amount");
          lbQtyRequired=new JLabel("Quantity Required");
         sb.append("Item Code    "+"ItemName    "+"Company    "+"Quantity   "+"Amount   ");
          panelStocks.add(lbCode);
          panelStocks.add(lbName);
          panelStocks.add(lbComp);
          panelStocks.add(lbQty);
          panelStocks.add(lbAmt);   
          panelStocks.add(lbQtyRequired);
                    hm=new HashMap<JComboBox, String>();

   for(int i=0;i<arrSelectedObjs.size();i++)
   {
       StockDetailBean objBean=arrSelectedObjs.get(i);
       sb.append("    "+objBean.getItemCode()+"   "+objBean.getItemName()+"   "+objBean.getComapany()+"   "+objBean.getAmount()+" \n \n");
       panelStocks.add(new JLabel(objBean.getItemCode()));
       panelStocks.add(new JLabel(objBean.getItemName()));
       panelStocks.add(new JLabel(objBean.getComapany()));
       panelStocks.add(new JLabel(objBean.getQuantity()));
       panelStocks.add(new JLabel(objBean.getAmount()));
       cb2=new JComboBox();
       for(int k=1;k<=Integer.parseInt(objBean.getQuantity());k++){
           cb2.addItem(k);
       }
       hm.put(cb2, objBean.getAmount());
       panelStocks.add(cb2);
   }
    }

     
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btGenerateBill = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        panelStocks = new javax.swing.JPanel();
        btCalculate = new javax.swing.JButton();
        tfCalc = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BILL");

        btGenerateBill.setText("Generate Bill");
        btGenerateBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGenerateBillActionPerformed(evt);
            }
        });

        btCancel.setText("Cancel");
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelStocksLayout = new javax.swing.GroupLayout(panelStocks);
        panelStocks.setLayout(panelStocksLayout);
        panelStocksLayout.setHorizontalGroup(
            panelStocksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        panelStocksLayout.setVerticalGroup(
            panelStocksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        btCalculate.setText("Calculate");
        btCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalculateActionPerformed(evt);
            }
        });

        tfCalc.setText("Calculate");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelStocks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfCalc)
                    .addComponent(btCalculate))
                .addGap(118, 118, 118))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addComponent(panelStocks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btCalculate)
                .addGap(18, 18, 18)
                .addComponent(tfCalc)
                .addGap(57, 57, 57))
        );

        jButton1.setText("CheckOfStock");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(31, 31, 31)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btGenerateBill)
                        .addGap(74, 74, 74)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(btCancel)
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btGenerateBill)
                    .addComponent(btCancel)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(340, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
         
    }//GEN-LAST:event_btCancelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         JFrame fr=new JFrame();
            fr.add( new CheckOfStock());
            fr.setSize(400,400);
            fr.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalculateActionPerformed
       
            Iterator it=hm.entrySet().iterator();
           int calc = 0; 
           int count=0;
            while(it.hasNext())
            {
           Map.Entry<JComboBox,String> me=   (Map.Entry<JComboBox,String>) it.next();
           JComboBox b=me.getKey();
          String amount= me.getValue();
           calc+=(b.getSelectedIndex()+1)*Integer.parseInt(amount); 
           count++;
           
            }
            System.out.println("total "+calc);
              System.out.println("Count "+count);  
            tfCalc.setText(calc+"");
    }//GEN-LAST:event_btCalculateActionPerformed

    private void btGenerateBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGenerateBillActionPerformed
      
       
       sb.append("Total "+tfCalc.getText());
new GenPDF(sb);
   PrinterJob job = PrinterJob.getPrinterJob();
         job.setPrintable(new HelloWorldPrinter(sb));
         boolean ok = job.printDialog();
         if (ok) {
             try {
                 
                  job.print();
             } catch (PrinterException ex) {
              /* The job did not successfully complete */
             }
         }


        
  
    }//GEN-LAST:event_btGenerateBillActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCalculate;
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btGenerateBill;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelStocks;
    private javax.swing.JLabel tfCalc;
    // End of variables declaration//GEN-END:variables
}
