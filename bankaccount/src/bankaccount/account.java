/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

/**
 *
 * @author AMBASSADOR_CALY
 */
public class account {
    private String Number;
    private double Balance;
    private String CustomerName;
    private String customerEmail;
    private String customerPhoneNumber;
    public void deposit(double depositeAmount){
        Balance += depositeAmount;
        System.out.println("Deposite of "+depositeAmount+" made new balance is: "+this.Balance);
    }
    public void withdrawal(double withdrawalAmount){
       if (this.Balance-withdrawalAmount <=0){
           System.out.println("only"+this.Balance+"available. withdraw not processed");
       }
       else {
           this.Balance -=withdrawalAmount;
           System.out.println("withdrawal of"+withdrawalAmount+"processed"+"trmaining balance="+this.Balance);
       }
    }
    public String getNumber(){
        return Number;
    }
    public void setNumber(String Number){
        this.Number=Number;
    }
     public String getBalance(){
        return Number;
    }
    public void setBalance(double Balance){
        this.Balance=Balance;
    }
     public String getCustomerName(){
        return CustomerName;
    }
    public void setCustomerName(String CustomerName){
        this.CustomerName=CustomerName;
    }
    public String getustomerEmail(){
        return customerEmail;
    }
    public void setcustomerEmail(String customerEmail){
        this.customerEmail=customerEmail;
    }
     public String getcustomerPhoneNumber(){
        return customerPhoneNumber;
    }
    public void setcustomerPhoneNumber(String customerPhoneNumber){
        this.customerPhoneNumber=customerPhoneNumber;
    }
}
