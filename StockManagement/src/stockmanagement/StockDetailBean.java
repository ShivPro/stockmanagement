/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmanagement;

/**
 *
 * @author Acer
 */
public class StockDetailBean {
    String itemCode,itemName,company,qty,amount;
   String  getItemCode()
    {
        return itemCode;
    }
   
   void setItemCode(String itemCode)
   {
       this.itemCode=itemCode;
   }
   String getItemName()
   {
       return itemName;
   }
   
   void setItemName(String itemName)
   {
       this.itemName=itemName;
   }
    String  getComapany()
    {
        return company;
    }
    
    void setCompany(String company)
   {
       this.company=company;
   }
   String  getQuantity()
    {
        return qty;
    } 
   
   void setQuantity(String qty)
   {
       this.qty=qty;
   }
   String  getAmount()
    {
        return amount;
    } 
   void setAmount(String amount)
   {
       this.amount=amount;
   }
}
