package com;
import java.util.ArrayList;

public class ValidateEmail {
	
  public static void main(String[] args) {
        
        ArrayList<String> emailID = new ArrayList<String>();
        
        emailID.add("java@abc.com");
        emailID.add("java_Prog@abc.com");
        emailID.add("email_verify@abc.com");
        emailID.add("verify.123@abc.com");
        emailID.add("verify_java@abc.com");
        emailID.add("verify.email@abc.com");
        emailID.add("email123@abc.com");
        
   
        String searchEmailID = "email_verify@abc.com";
        
                for(int i=0; i<emailID.size(); i++) {
                    
                    System.out.println(emailID.get(i));
                    
                    if(searchEmailID==emailID.get(i)) {
                        
                        System.out.println("\n");
                        
                        System.out.println("email ID" + " "+ searchEmailID +" "+ "found");
                        
                        break;
                        
                    }

}
}
}
