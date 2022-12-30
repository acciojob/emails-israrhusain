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
                String uppercase="";
                String lowercase="";
                String digit ="";
                String special="";
                for(int i=0; i<newPassword.length()-1; i++){
                    if(Character.isUpperCase(newPassword.charAt(i))){
                        uppercase=uppercase+newPassword.charAt(i);
                    }
                    else if(Character.isLowerCase(newPassword.charAt(i))){
                        lowercase+=newPassword.charAt(i);
                    }
                    else if(Character.isDigit(newPassword.charAt(i))){
                        digit+=newPassword.charAt(i);
                    }
                    else{
                        special+=newPassword.charAt(i);
                    }
                }

    if(newPassword.length()>=8 && uppercase.length()>=1 && lowercase.length()>=1 && digit.length()>=1 && special.length()>=1){
                this.password=newPassword;
    }
    else{
        System.out.println("Wrong password");
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
}
