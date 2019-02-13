
package com.kmagwenzi.polytechnic.repositories;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class Encryptor {
    public static String encrypt(String str){
        String encpass = null;
        try{
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(str.getBytes("UTF-8"));
            byte[] digest = md.digest();
            BigInteger bigInt = new BigInteger(1, digest);
            encpass = bigInt.toString(16);
            return encpass;            
        } catch(NoSuchAlgorithmException | UnsupportedEncodingException ex){
            
        }
        return encpass;
    }
    
}
