class LoopTest1
{
    public static void main(String[] args){
    
        StringBuilder strbul = new StringBuilder();

       //list of cars

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        for (int i = 0; i < cars.length; i++) {

            strbul.append(i +  ". " + cars[i] + "\n");

        } // end for loop
    
        String text = strbul.toString();
        System.out.println(text);


} // end main
} //end class