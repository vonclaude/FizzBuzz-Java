import java.util.Scanner;

/**
 * Created by Colin on 7/20/2017.
 * I am adding an additional comment for the purposes of a pull request example.
 */
public class fizzbuzz {

    public static void main(String[] args){

        System.out.println("How long a sequence? This is also added for the purposes of a pull request: ");
        Scanner lengthScanner = new Scanner(System.in);
        int sequenceLength = lengthScanner.nextInt();

        for(int i = 1; i <= sequenceLength; i++){

            if(i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0){
                System.out.println("Fizz");
            } else if(i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}