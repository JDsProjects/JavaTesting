class ArrayExample2 {
    
    public static void main(String[] args) {
        
        
        //have two arrays both with data connected to the other

        String [] customers = {"John", "Mary", "Bob", "Sue", "Joe"};
        String [] customerEmails = {"john@notreal", "mary@notreal", "bob@notreal", "sue@notreal", "joe@notreal"};
       
        for (int i = 0; i < customers.length; i++) {
            System.out.println(customers[i] + " " + customerEmails[i]);
        }
       
    }

}
