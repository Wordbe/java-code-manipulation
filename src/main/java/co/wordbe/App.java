package co.wordbe;

import co.wordbe.book.Book;
import co.wordbe.book.WhiteBook;

import java.util.Arrays;

public class App
{
    public static void main( String[] args ) {
        Arrays.stream(WhiteBook.class.getAnnotations()).forEach(System.out::println);
    }
}
