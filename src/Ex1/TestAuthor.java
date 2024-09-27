package Ex1;
public class TestAuthor {
    public static void main(String[] args) {
        Author a = new Author("Vinicius", "vini@gmail.com", 'm');
        System.out.println(a.toString());
        a.setEmail("vini@outlook.com");
        System.out.println(a.getName());
        System.out.println(a.getEmail());
        System.out.println(a.getGender());
    }
}
