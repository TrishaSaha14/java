package encapsulation;

public class EmpDriver {
    public static void main(String[] args) {
        EmployeeMan e = new EmployeeMan();
        e.personalDetails("trisha@gmail.com",2356);
        e.setName("Rahul",2356);
        System.out.println();
        e.personalDetails("trisha@gmail.com",2356);
        e.setCompany("Cognizant",2356);
        System.out.println();
        e.personalDetails("trisha@gmail.com",2356);
    }
}
