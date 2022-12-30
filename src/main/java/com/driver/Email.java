package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        if(this.password.equals(oldPassword)){
                if(isValid(newPassword)){
                    this.password=newPassword;
                }
                else{
                    System.out.println("invalid password");
                }
            }
         else{
               System.out.println("old password mismatches with newpassword");
       }
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
    }
    public boolean isValid(String newPassword){
        boolean capitalletter=false;
        boolean smallletter=false;
        boolean digit=false;
        boolean specialletter=false;
        if(newPassword.length()<8){
            return false;
        }
        for(int i=0; i<newPassword.length(); i++){
              char ch=newPassword.charAt(i);
              if(ch>='A' && ch<='Z'){
                 capitalletter=true;
              }
             else if(ch>='a' && ch<='z'){
                smallletter=true;
              }
            else if(ch>='0'  && ch<='9'){
                 digit=true;
              }
              else{
                specialletter=true;
              }
        }
        if(capitalletter && smallletter && digit && specialletter){
            return true;
        }
        return false;
    }
}
