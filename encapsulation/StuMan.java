package encapsulation;

import java.util.Scanner;

public class StuMan {
    private String email="trisha@gmail.com";
    private int password = 2356;
    private String name = "Trisha Saha";
    private int age = 21;
    private String gender = "Female";
    private String branch = "CST";

//    public void getEmail(int password) {
//        if(this.password == password){
//            System.out.println(email);
//        }
//    }

    public void setEmail(String email,int password) {
        if(this.password == password){
            this.email=email;
        }
        else {
            System.out.println("Incorrect password");
        }
    }

//    public int getPassword() {
//        return password;
//    }

    public void setPassword(int password) {
        if(this.password == password){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter new Password: ");
            int newPassword = sc.nextInt();
            System.out.println("Enter Confirm Password: ");
            int confirmPassword = sc.nextInt();
            if(newPassword==confirmPassword){
                this.password=confirmPassword;
                System.out.println("Password updated");
            }
            else{
                System.out.println("New password and confirm password don't match");
            }
        }
        else{
            System.out.println("Incorrect password");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name,int password) {
        if(this.password == password){
            this.name=name;
        }
        else{
            System.out.println("Incorrect password");
        }
    }

//    public int getAge() {
//        return age;
//    }

    public void setAge(int age,int password) {
        if(this.password == password){
            this.age=age;
        }
        else{
            System.out.println("Incorrect password");
        }
    }

//    public String getGender() {
//        return gender;
//    }

    public void setGender(String gender,int password) {
        if(this.password == password){
           this.gender=gender;
        }
        else{
            System.out.println("Incorrect password");
        }
    }

//    public String getBranch() {
//        return branch;
//    }

    public void setBranch(String branch, int password) {
        if(this.password == password){
            this.branch=branch;
        }
        else{
            System.out.println("Incorrect password");
        }
    }

    public void personalDetails(String email,int password){
        if(this.email==email && this.password==password){
            System.out.println("email: "+email+"  "+"\nname: "+name+"\nage: "+age+"\ngender: "+gender+"\nbranch: "+branch+"\npassword: "+password);
        }
        else {
            System.out.println("Incorrect credentials");
        }
    }
}
