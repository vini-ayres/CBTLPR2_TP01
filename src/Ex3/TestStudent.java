package Ex3;

public class TestStudent {
    public static void main(String[] args) {
        Student s = new Student("Vinicius", "Brasil", "Ingles", 2024, 50);
        System.out.println(s.toString());
        s.setAddress("Santos");
        s.setFee(100);
        s.setProgram("Java");
        s.setYear(2025);
        System.out.println(s.toString());
    }
}
