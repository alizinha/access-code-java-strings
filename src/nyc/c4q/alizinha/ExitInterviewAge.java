package nyc.c4q.alizinha;

/**
 * Created by c4q-Allison on 3/5/15.
 */
import java.util.*;

public class ExitInterviewAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int currentAge;
        int ageInFiveYears;


    System.out.print("How old are you? ");
      currentAge = input.nextInt();
        ageInFiveYears = currentAge + 5;
     System.out.println("You are " + currentAge + " years old. In five years you will be " + ageInFiveYears + " years old.");
    }
}