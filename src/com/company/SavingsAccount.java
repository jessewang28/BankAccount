package com.company;

public class SavingsAccount extends Account{
    private double a;
    public SavingsAccount(int id, double startBal, double AnnualIRate)
    {
        super(id, startBal);
        a = AnnualIRate;
    }

    public void withdraw(double withdraw){
        double currBalance = currentBalance();
        if (withdraw<=currBalance){
            decreaseBalance(withdraw);
        }
    }

    public double monthlyInterest(){
        double annual = a*currentBalance();
        return annual/12;
    }

}
