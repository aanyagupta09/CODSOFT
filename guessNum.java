import java.util.*;
 
public class guessNum
{
    public static void main(String args[])
    {
    
        Scanner sc = new Scanner(System.in);
        int K = 5,i,guess;


        // to generate the numbers form 1 to 100
        int num=1+(int)(100* Math.random());
        System.out.println("A number is chosen between 1 to 100." + " Guess the number" + " within "+ K +" iteration");
 
        
        for(i=0;i<K;i++)
        {
            System.out.println("Guess the number:");
 
            // Take input for number to be guessed
            guess = sc.nextInt();

            if (num == guess)
            {
                System.out.println("Congratulations!"+ " You have guessed the number.");
                break;
            }
            else if (num > guess && i != K-1)
            {
                System.out.println("The number is greater than " + guess);
            }
            else if (num < guess && i != K - 1)
            {
                System.out.println("The number isr less than " + guess);
            }
        }
 
        if (i == K) 
        {
            System.out.println( "You have used"+ K +" trials.");
 
            System.out.println("The number was " + num);
        }
    }
}
