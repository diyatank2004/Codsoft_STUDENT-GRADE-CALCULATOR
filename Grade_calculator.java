package Task2;

import java.util.Scanner;

public class Grade_calculator
{
    /**
     * @param args
     */
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int sub,m,i,j,sum=0;
        float percentage;
        char grade;
        System.out.println("|----------Student Grade Calculator----------|");
        System.out.println("");
        System.out.println("***************************************************************");
        System.out.println("Enter the number of Subjects :");
        sub=sc.nextInt();
        System.out.println("No. of Subjects entered are :"+sub);
        System.out.println("***************************************************************");
        System.out.println("");
        for(i=1;i<=sub;i++)
        {
            System.out.println("Enter the marks of "+i+" subject out of 100 :");
            m=sc.nextInt();
            System.out.println("######################################################");
            System.out.println("");
            sum=sum+m;
        }
        System.out.println("Total marks obtained "+sum+" out of "+(sub*100));
        percentage=sum/sub;
        System.out.println("");
        System.out.println("Your Average Percentage is "+percentage+"%");
        System.out.println("");
        if(percentage>90)
        System.out.println("You passed exam with 'A+' grade");
        else if(percentage<90 && percentage>80)
        System.out.println("You passed exam with 'A' grade");
        else if(percentage<80 && percentage>60)
        System.out.println("You passed exam with 'B' grade");
        else if(percentage<60 && percentage>50)
        System.out.println("You passed exam with 'C' grade");
        else if(percentage<40 && percentage>=35)
        System.out.println("You passed exam with 'D' grade");
        else if(percentage<35)
        System.out.println("Fail!!");
        sc.close();
    }
}
