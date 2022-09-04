package com.javatechie.s3.Entity;

import lombok.Data;


@Data

public class Customer {

     int CustomerId;


     String CustomerName;


     String CustomerMail;


     long AccountNo;


     long AccountBalance;
}

//     @Override
//     public String toString() {
//          return "Customer{" +
//                  "CustomerId=" + CustomerId +
//                  ", CustomerName='" + CustomerName + '\'' +
//                  ", CustomerMail='" + CustomerMail + '\'' +
//                  ", AccountNo=" + AccountNo +
//                  ", AccountBalance=" + AccountBalance +
//                  '}';
//     }
//
//     public int getCustomerId() {
//          return CustomerId;
//     }
//
//     public void setCustomerId(int customerId) {
//          CustomerId = customerId;
//     }
//
//     public String getCustomerName() {
//          return CustomerName;
//     }
//
//     public void setCustomerName(String customerName) {
//          CustomerName = customerName;
//     }
//
//     public String getCustomerMail() {
//          return CustomerMail;
//     }
//
//     public void setCustomerMail(String customerMail) {
//          CustomerMail = customerMail;
//     }
//
//     public long getAccountNo() {
//          return AccountNo;
//     }
//
//     public void setAccountNo(long accountNo) {
//          AccountNo = accountNo;
//     }
//
//     public long getAccountBalance() {
//          return AccountBalance;
//     }
//
//     public void setAccountBalance(long accountBalance) {
//          AccountBalance = accountBalance;
//     }
//}
