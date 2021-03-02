package co.wordbe.book;

@BookAnnotation
public class Book {

    private static String priSta = "private static";

    private static final String priStaFin = "private static final";

    private String title = "title";

    public String pub = "public";

    protected String pro = "protected";

    public Book() {
    }

    public Book(String title, String pub, String pro) {
        this.title = title;
        this.pub = pub;
        this.pro = pro;
    }

    private void priVoi() {
        System.out.println("private void");
    }

    public void pubVoi() {
        System.out.println("public void");
    }

    public int pubInt() {
        return 10;
    }
}
