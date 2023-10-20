import java.util.*;

public class gradeCalc
{
   
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);

        //Enter marks for 5 subjects

        System.out.println("Enter marks of 5 subjects");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();


        //Sum of all marks is calculated
        int sum = a + b + c + d + e ;
        

        //Average of marks is calculated
        double avg = sum / 5;



        //According to average score grade is calculated

        if(avg <= 90)
        {
            System.out.println("Total marks of a student are "+ sum);
            System.out.println("The average of students marks are "+ avg);
            System.out.println("The student receives grade A");
        }

        else if(avg < 90 && avg >= 80)
        {
            System.out.println("Total marks of a student are "+ sum);
            System.out.println("The average of students marks are "+ avg);
            System.out.println("The student receives grade B");
        }

        else if(avg < 80 && avg >= 70 )
        {
            System.out.println("Total marks of a student are "+ sum);
            System.out.println("The average of students marks are "+ avg);
            System.out.println("The student receives grade C"); 
        }

        else if(avg < 70 &&avg >= 60)
        {
            System.out.println("Total marks of a student are "+ sum);
            System.out.println("The average of students marks are "+ avg);
            System.out.println("The student receives grade D"); 
        }
        
        else
        {
            System.out.println("Total marks of a student are "+ sum);
            System.out.println("The average of students marks are "+ avg);
            System.out.println("The student receives grade F");  
        }
    }
}

