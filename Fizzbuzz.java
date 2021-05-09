import java.util.Scanner;

//import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

/**
 * Fizzbuzz
 */
public class Fizzbuzz {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number :");
        int num = scan.nextInt();
        String wordA = "Fizz";
        String wordB = "Buzz";
        boolean conditionA = ((num%5)==0);
        boolean conditionB = ((num%3)==0);
        if (conditionA && conditionB){
            System.out.println(wordA + wordB);

        } 

        else if (conditionA){
            System.out.println(wordA);

        } 
        else if (conditionB){
            System.out.println(wordB);

        } 
        else
            System.out.println(num);

            
        System.out.println();

    

        


            


    }
}