package nyc.c4q.alizinha;

/**
 * Created by c4q-Allison on 3/5/15.
 */
import java.util.Scanner;

public class IfThen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What's your password?");

        int password = in.nextInt();

        if (password == 1234) {
            System.out.println("Logged in.");
    }

    }
}
