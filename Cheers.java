//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code
            String name = args[0].toUpperCase();
            int times = Integer.parseInt(args[1]);

            String anChars = "AEFHILMNORSX";

            for (int i = 0; i < name.length(); i++) {
             
                char currentChar = name.charAt(i);
                String print;

                if (anChars.indexOf(currentChar) != -1) {
                print = "an";
                } else {
                print = "a ";
                }
        
            System.out.println("Give me " + print + " " + name.charAt(i) + ": " + name.charAt(i) + "!");
            }
                System.out.println("What does that spell?");
         
            for (int i = 0; i < times; i++) {
                        System.out.println(name + "!!!");
                }
        }
}
