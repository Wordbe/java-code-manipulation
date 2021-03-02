package co.wordbe.book;

public class Book {

    private static String priSta = "private static";

    private static final String priStaFin = "private static final";

    private String title = "title";

    public static String pubSta = "public static";

    public String pub = "public";

    protected String pro = "protected";

    public Book() {
    }

    public Book(String title) {
        this.title = title;
    }

    private void priVoi() {
        System.out.println("private void");
    }

    public void pubVoi() {
        System.out.println("public void");
    }

    public int pubInt(int left, int right) {
        return left + right;
    }
}
