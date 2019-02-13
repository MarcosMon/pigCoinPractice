package org.lasencinas.MarcosMonjonMas;

import java.security.PublicKey;

public class Transaction {
    private String hash;
    private String prev_hash;
    private PublicKey pKey_sender;
    private PublicKey pKey_recipient;
    private double pigcoins;
    private String message;
    private byte[] signature;

    public Transaction() {

    }

    public Transaction(String hash,String prev_hash, PublicKey pKey_sender, PublicKey pKey_recipient,double pigcoins, String message  ) {
	
	this.hash = hash;
	this.prev_hash = prev_hash;
	this.pKey_sender = pKey_sender;
	this.pKey_recipient = pKey_recipient;
	this.pigcoins = pigcoins;
	this.message = message;
    }
    
    public String getHash() {
	return this.hash;
    }
    public String getPrev_hash() {
	return this.prev_hash;
    }
    public PublicKey getPKey_sender() {
	return this.pKey_sender;
    }
    public PublicKey getPKey_recipient() {
	return this.pKey_recipient;
    }
    public double getPigCoins() {
	return this.pigcoins;
    }
    public String getMessage() {
	return this.message;
    }
    public String toString() {
	return "hash = " + getHash() + "\n" +
		"prev_hash = " + getPrev_hash() + "\n" +
		"pKey_sender = " + getPKey_sender().hashCode() +"\n" +
		"pKey_recipient = " + getPKey_recipient().hashCode() + "\n" + 
		"pigcoins = " + getPigCoins() + "\n" + 
		"message = " + getMessage();

		
    }
}
