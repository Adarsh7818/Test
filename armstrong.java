import java.util.*;
public class armstrong{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int number=sc.nextInt();
        sc.close();
        if(isArmstrongNumber(number)){
            System.out.println(number+" is a armstrong number");
        }else{
            System.out.println(number+" is not a armstrong number");

        }

    }
    public static boolean isArmstrongNumber(int number){
        int orignalNumber, remainder,result=0,n=0;
        orignalNumber=number;
        for (;orignalNumber != 0; orignalNumber /= 10, ++n);

        orignalNumber = number;
        for(;orignalNumber!=0;orignalNumber/=10){
            remainder=orignalNumber % 10;
            result+=Math.pow(remainder,n);
        }
        return result==number;
    }
    
}