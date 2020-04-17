/*
define the variables
think in array style
sorting array elements using bubble sort algorithm
it should ask for 10
create a prompt

Identify words that starts from vowel
build in that way it will call only vowel starting words
pick only those words which start from vowel

#vowel concept
#create a list which will shows the original order
#create a list which will shows the alphabetical order
#Reversed list

*/





import java.util.Scanner;
import java.util.Arrays;
public class FinalProject {
    public static void main(String[]args){


         String fruits[]= new String[10]; //it is asking 10 fruits

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();
        sc.nextLine();

//String fruits[]= {"kiwi", "pineapple","apple","banana","orange", "grapes", "watermelon", "cherry", "strawberry", "melon"};

       System.out.println("Enter the 10 fruits ");

        fruits[0] = "kiwi"; //putting values in position
        fruits[1] = "pineapple";
        fruits[2] = "apple";
        fruits[3] = "banana";
        fruits[4] = "orange";
        fruits[5] = "grapes";
        fruits[6] = "watermelon";
        fruits[7] = "cherry";
        fruits[8] = "strawberry";
        fruits[9] = "melon";

        System.out.println("Original order: " +Arrays.toString(fruits));

       




    }
}
