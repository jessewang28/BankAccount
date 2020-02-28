package com.company;

public class SpecialCheckingAccount extends CheckingAccount{
    private double minBalance;
    private double interestRate;

    public SpecialCheckingAccount(int idNumber, double startBal, double cc, double iRate, double minBal){
        super(idNumber, startBal, cc);
        minBalance = minBal;
        interestRate = iRate;
    }

    public void clearCheck(double amount) {
        if (currentBalance()>minBalance){
            decreaseBalance(amount);
        }
        else{
            super.clearCheck(amount);
        }
    }

    public double monthlyInterest(){
        if(currentBalance() > minBalance){
            double monthly = currentBalance()*interestRate/12;
            return monthly;
        }
        else {
            return super.monthlyInterest();
        }
    }
}

