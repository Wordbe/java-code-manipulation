package co.wordbe;

import co.wordbe.book.Book;
import co.wordbe.book.WhiteBook;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class App
{
    public static void main( String[] args ) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<?> bookClass = Class.forName("co.wordbe.book.Book");
        Constructor<?> constructor = bookClass.getConstructor(String.class);
        Book book = (Book) constructor.newInstance("제목");
        System.out.println(book);

        Field pubSta = bookClass.getDeclaredField("pubSta");
        System.out.println(pubSta.get(null));
        pubSta.set(null, "set public static");
        System.out.println(pubSta.get(null));

        Field title = bookClass.getDeclaredField("title");
        title.setAccessible(true);
        System.out.println(title.get(book));
        title.set(book, "제목 바꿈");
        System.out.println(title.get(book));

        Method priVoi = bookClass.getDeclaredMethod("priVoi");
        priVoi.setAccessible(true);
        priVoi.invoke(book);

        Method pubInt = bookClass.getDeclaredMethod("pubInt", int.class, int.class);
        int invoke = (int) pubInt.invoke(book, 100, 200);
        System.out.println(invoke);
    }
}
