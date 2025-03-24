package encapsulation;

public class StuDriver {
    public static void main(String[] args) {
        StuMan s = new StuMan();
//        s.personalDetails("trisha@gmail.com",2356);
        s.setPassword(2356);
//        s.personalDetails("trisha@gmail.com",4455);
        s.setAge(22,2356);
//        s.personalDetails("trisha@gmail.com",4455);
        s.setBranch("CSE",8956);
        s.setName("Tua Saha",8956);


        s.personalDetails("trisha@gmail.com",8956);

    }
}
