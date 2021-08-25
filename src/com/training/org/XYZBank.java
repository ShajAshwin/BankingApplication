package com.training.org;

public class XYZBank {
    private String bankName;
    private String bankAdress;
    private int noOfEmployees;

    public XYZBank() {
        System.out.println("Default Constructor" );
        bankName = "";
        bankAdress = "";
        noOfEmployees = 0;

    }

    public XYZBank(String bankName, String bankAdress, int noOfEmployees) {
        this.bankName = bankName;
        this.bankAdress = bankAdress;
        this.noOfEmployees = noOfEmployees;
    }

    @Override
    public String toString() {
        return "XYZBank{" +
                "bankName='" + bankName + '\'' +
                ", bankAdress='" + bankAdress + '\'' +
                ", noOfEmployees=" + noOfEmployees +
                '}';
    }
}
