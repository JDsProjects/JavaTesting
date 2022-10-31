import java.util.HashMap;
import java.util.Random;

public class HashmapExample {
    
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();

        //random book data

        map.put("The Hobbit", "J.R.R. Tolkien");
        map.put("The Lord of the Rings", "J.R.R. Tolkien");
        map.put("The Silmarillion", "J.R.R. Tolkien");
        map.put("The Chronicles of Narnia", "C.S. Lewis");

        //pick a random book from the hashmap
        
        //length of the hashmap

        Random random1 = new Random();

        int randomBook = random1.nextInt(map.size());

        //get the key of the random book

        String key = (String) map.keySet().toArray()[randomBook];

        String author = map.get(key);

        System.out.println("The author of " + key + " is " + author);

        //print the book and author



       
    }

}
