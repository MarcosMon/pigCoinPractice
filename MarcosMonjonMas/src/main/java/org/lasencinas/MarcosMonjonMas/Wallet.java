package org.lasencinas.MarcosMonjonMas;

import java.security.PrivateKey;
import java.security.PublicKey;

public class Wallet {
    private PrivateKey sKey;
    private PublicKey pKey;
    private double  total_input;
    private double total_output;
    private double balance;
    private int inputTransactions;
    private int outputTransactions;
    

    public Wallet() {

    }

    public void setSK(PrivateKey privateKey) {
	this.sKey = privateKey;
    }

    public PrivateKey getSK() {
	return this.sKey;
    }

    public void setAddress(PublicKey publicKey) {
	this.pKey = publicKey;
    }

    public PublicKey getAddress() {
	return this.pKey;
    }
    public double getTotalInput() {
	return this.total_input;
    }
    public double getTotalOutput() {
	return this.total_output;
    }
    public double getBalance() {
	return this.total_input + this.total_output;
    }

    public void generateKeyPair() {
	
	setAddress(GenSig.generateKeyPair().getPublic());
    }
    
    @Override
    public String toString() {
	return "\n" + "Wallet = " + getAddress().hashCode() + "\n" + 
                "Total input = " + getTotalInput() + "\n" +
                "Total output = " + getTotalOutput() + "\n" +
                "Balance = " + getBalance() + "\n";
                      
    }

}
