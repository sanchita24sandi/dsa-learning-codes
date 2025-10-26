import java.util.*;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int counter=0;
        // while(counter<100){
        // System.out.println("hlw world");
        // counter++;

        // }
        // int a=1;
        // while(a<=10){
        // System.out.println(a);
        // a++;
        // }

        // int n=sc.nextInt();
        // int i=1;
        // int sum=0;
        // while(i<=n){
        // sum+=i;
        // i++;
        // }
        // System.out.println(sum);

        // for(int i=0;i<=5;i++){
        // System.out.println(i);
        // }

        // for(int i=1;i<=4;i++){
        // System.out.println("****");
        // }
        // int line=1;
        // while(line<=4){
        // System.out.println("****");
        // line++;
        // }

        // int n=100022;
        // while(n>0){
        // int lastDigit=n%10;
        // System.out.print(lastDigit+" ");
        // n/=10;
        // }

        // int n=10988;
        // int rev=0;
        // while(n>0){
        // int lastDigit=n%10;
        // rev=(rev*10)+lastDigit;
        // n=n/10;
        // }
        // System.out.println(rev);
        int n = sc.nextInt();
        if(n==20){
            System.out.println("n is prime");
        }else{

            boolean isPrime = true;
    
            for (int i = 2; i <= Math.sqrt(n); i++) {// n is multiple of i(i not equal to 1 or n)
                if (n % i == 0) {
                    isPrime = false;
    
                }
            }
            if(isPrime==true){
                System.out.println("n is prime");
            }
            else{
                System.out.println("n is not prime");
            }
        }
    }
}
