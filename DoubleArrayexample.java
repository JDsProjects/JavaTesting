import java.util.Random;

public class DoubleArrayexample {
    
    public static void main(String[] args) {
        String[][] books = {
            {"The Hobbit", "J.R.R. Tolkien"},
            {"The Lord of the Rings", "J.R.R. Tolkien"},
            {"The Silmarillion", "J.R.R. Tolkien"},
            {"The Chronicles of Narnia", "C.S. Lewis"}
        };
        
        Random random1 = new Random();
        
        int randomBook = random1.nextInt(books.length);
        
        String book = books[randomBook][0];
        String author = books[randomBook][1];
        
        System.out.println("The author of " + book + " is " + author);
    }
    

}
