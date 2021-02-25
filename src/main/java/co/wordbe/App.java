package co.wordbe;

import co.wordbe.book.Book;
import co.wordbe.book.WhiteBook;

import java.util.Arrays;

public class App
{
    public static void main( String[] args ) {
        // 타입을 통한 클래스 인스턴스 가져오기
        Class<Book> bookClass =  Book.class;
        Arrays.stream(Book.class.getMethods()).forEach(m -> {
            int modifiers = m.getModifiers();
        });
    }
}
