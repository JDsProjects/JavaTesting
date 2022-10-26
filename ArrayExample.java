public class ArrayExample {
    
    public static void main(String[] args) {

        
        int[] myArray = new int[10];
        
        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 3;
        myArray[3] = 4;
        myArray[4] = 5;
        myArray[5] = 6;
        myArray[6] = 7;
        myArray[7] = 8;
        myArray[8] = 9;
        myArray[9] = 10;
        
        //for loop example
        for (int i = 0; i < myArray.length; i++) {
            
            System.out.println(myArray[i]);
            
        } // end for loop
        
        //for each loop example
        for (int i : myArray) {
            
            System.out.println(i);
            
        } // end for each loop
        
        //while loop example
        int i = 0;
        
        while (i < myArray.length) {
            
            System.out.println(myArray[i]);
            i++;
            
        } // end while loop
        
        //do while loop example
        int j = 0;
        
        do {
            
            System.out.println(myArray[j]);
            j++;
            
        } while (j < myArray.length);
        
    } // end main
    
} // end class