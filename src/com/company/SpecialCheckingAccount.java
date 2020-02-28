package com.company;

public class SpecialCheckingAccount extends CheckingAccount{
    private double minBalance;
    private double interestRate;

    public SpecialCheckingAccount(int idNumber, double startBal, double cc, double minBal, double iRate){
        super(idNumber, startBal, cc);
        minBalance = minBal;
        interestRate = iRate;
    }

    public void clearCheck(double amount) {
        if (currentBalance()>=minBalance){
            decreaseBalance(amount);
        }
        else{
            super.clearCheck(amount);
        }
    }

    

}
