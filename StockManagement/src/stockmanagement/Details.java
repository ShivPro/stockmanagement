/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmanagement;

import java.awt.GridLayout;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Stalwart
 */
public class Details extends javax.swing.JPanel {
String strCode,strItemName,strAmount,strComp,strQty;
JLabel lbCode,lbName,lbAmt,lbComp,lbQty,lbSelect;
ArrayList<JCheckBox> cbs;
    ArrayList<StockDetailBean> arrStockBean;
JCheckBox cb;
  ResultSet rs;
    public Details() {
        initComponents();
    }

    Details(ResultSet rs) throws SQLException {
        this();
        int count=0;
        try {
        this.rs=rs;
                GridLayout gl =new GridLayout();
          
               
          panelStocks.setLayout(gl);
          lbCode=new JLabel("Item Code");
          lbName=new JLabel("Item Name");
          lbComp=new JLabel("Company");
          lbQty=new JLabel("Quantity");
          lbAmt=new JLabel("Amount");
          lbSelect=new JLabel("Select");
          
          panelStocks.add(lbCode);
          panelStocks.add(lbName);
            panelStocks.add(lbComp);
            panelStocks.add(lbQty);
            panelStocks.add(lbAmt);
            panelStocks.add(lbSelect);
           cbs=new ArrayList<JCheckBox>();
           arrStockBean=new ArrayList<StockDetailBean>();
          while(rs.next())
        {
            
            strCode=rs.getString(2);
            strItemName=rs.getString(3);
            strComp=rs.getString(4);
            strQty=rs.getString(5);
            strAmount=rs.getString(6);
            StockDetailBean objBean=new StockDetailBean();
            objBean.setItemCode(strCode);
            objBean.setItemName(strItemName);
            objBean.setAmount(strAmount);
            objBean.setCompany(strComp);
            objBean.setQuantity(strQty);
                    
            lbCode=new JLabel(strCode);
            lbName=new JLabel(strItemName);
            lbComp=new JLabel(strComp);
            lbQty=new JLabel(strQty);
            lbAmt=new JLabel(strAmount);
            
            cb=new JCheckBox();
            cbs.add(cb);
            panelStocks.add(lbCode);
            panelStocks.add(lbName);
            panelStocks.add(lbComp);
            panelStocks.add(lbQty);
            panelStocks.add(lbAmt);
            panelStocks.add(cb);
            arrStockBean.add(objBean);
           count++;
            //   System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5)+" "+rs.getInt(6));
        }
          System.out.println(count);
          gl.setColumns(6);
          gl.setRows(count+1);
      } catch (SQLException ex) {
          Logger.getLogger(Details.class.getName()).log(Level.SEVERE, null, ex);
      }
         
  
    }
    

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btAddToBill = new javax.swing.JButton();
        btCreateInvoice = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        panelStocks = new javax.swing.JPanel();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("DETAILS");

        btAddToBill.setText("Add to bill >>");
        btAddToBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddToBillActionPerformed(evt);
            }
        });

        btCreateInvoice.setText("Create Invoice");
        btCreateInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCreateInvoiceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelStocksLayout = new javax.swing.GroupLayout(panelStocks);
        panelStocks.setLayout(panelStocksLayout);
        panelStocksLayout.setHorizontalGroup(
            panelStocksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 328, Short.MAX_VALUE)
        );
        panelStocksLayout.setVerticalGroup(
            panelStocksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(panelStocks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(panelStocks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btAddToBill)))
                .addGap(18, 18, 18)
                .addComponent(btCreateInvoice)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btAddToBill)
                        .addComponent(btCreateInvoice)))
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btAddToBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddToBillActionPerformed
     {
         ArrayList<StockDetailBean> arrSelectedObjs=new ArrayList<StockDetailBean>();
         for(int i=0;i<cbs.size();i++)
         {
             if(cbs.get(i).isSelected()){
                  arrSelectedObjs.add(arrStockBean.get(i));
             }
         }
      
       JFrame fr=new JFrame();
       fr.add(new Billing(arrSelectedObjs));
       fr.setSize(700,500);
       fr.setVisible(true);
          
        } 
        
        
        
        
            
    }//GEN-LAST:event_btAddToBillActionPerformed

    private void btCreateInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCreateInvoiceActionPerformed
        new InvoiceDetails().setVisible(true);
    }//GEN-LAST:event_btCreateInvoiceActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddToBill;
    private javax.swing.JButton btCreateInvoice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelStocks;
    // End of variables declaration//GEN-END:variables
}
