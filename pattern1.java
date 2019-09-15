/**
 * Created by Dell on 09-09-2019.
 */
import java.util.Scanner;
public class pattern1 {

    public static void main(String args[])
    {
        int i,j,n;
        System.out.println("enter number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(i=0;i<n;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }


    }
}

