package exercise3;
import java.util.Scanner;
public class NumberCounter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int count1=0;
        double count2=0;
        int sum=0;
        int number=input.nextInt();

        while (number!=0){
            if (number>0){
                count1++;
            }
            else {
                count2++;
            }
            sum=sum+number;
            number= input.nextInt();
        }
        System.out.println("Positive numbers: "+count1);
        System.out.println("Negative numbers: "+count2);
        System.out.println("Sum: "+sum);
        double average=sum/(count1+count2);
        System.out.println("Average: "+average);
    }
}
