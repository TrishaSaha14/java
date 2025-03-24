package encapsulation;

import java.util.Scanner;

public class EmployeeMan {



        private String email="trisha@gmail.com";
        private int password = 2356;
        private String name = "Trisha Saha";
        private long emp_id = 1202100;
        private String company = "Capgemini";
        private String department = "Developer";


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

//        public String getName() {
//            return name;
//        }

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

        public void setEmp_id(int emp_id,int password) {
            if(this.password == password){
                this.emp_id=emp_id;
            }
            else{
                System.out.println("Incorrect password");
            }
        }

//    public String getGender() {
//        return gender;
//    }

        public void setCompany(String company,int password) {
            if(this.password == password){
                this.company=company;
            }
            else{
                System.out.println("Incorrect password");
            }
        }

//    public String getBranch() {
//        return branch;
//    }

        public void setDepartment(String department, int password) {
            if(this.password == password){
                this.department=department;
            }
            else{
                System.out.println("Incorrect password");
            }
        }

        public void personalDetails(String email,int password){
            if(this.email==email && this.password==password){
                System.out.println("Email: "+email+"  "+"\nName: "+name+"\nEmployee id: "+emp_id+"\nCompany: "+company+"\nDepartment: "+department+"\npassword: "+password);
            }
            else {
                System.out.println("Incorrect credentials");
            }
        }
    }


