package Ex3;

public class TestStaff {
    public static void main(String[] args) {
        Staff s = new Staff("Sergio", "Brasil", "Escola1", 6000);
        System.out.println(s.toString());
        s.setAddress("Santos");
        s.setPay(7000);
        s.setSchool("Escola2");
        System.out.println(s.toString());
    }
}