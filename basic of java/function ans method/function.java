import java.util.Scanner;

public class function {
    // function defination
    public static void printHelloWorld() {
        System.out.println("hello world");
    }

    // sum calculate
    public static int calculateSum(int num1, int num2) {// parameters or formal parameters

        int sum = num1 + num2;
        return sum;
    }

    // multiplication function
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    // factorial function
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    // binomial coefficient
    public static int bincoeff(int n, int r) {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial((n - r));
        int bincof = n_fact / (r_fact * nmr_fact);

        return bincof;
    }

    // function overloading

    // func to calc sum of 2 numbers

    // public static int sum(int a,int b){
    // return a+b;
    // }

    // func to calc sum of 3 numbers

    // public static int sum(int a,int b ,int c){
    // return a+b+c;
    // }

    // public static int sum(int a,int b){
    // return a+b;
    // }
    // public static float sum(float a,float b){
    // return a+b;
    // }

    // check prime or not
    // public static boolean isprime(int n){
    // // corner case
    // if(n==2){
    // return true;
    // }
    // for(int i=2;i<=n-1;i++){
    // if(n%i==0){
    // return false;
    // }
    // }
    // return true;
    // }

    // optimized approach for check isPrime
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // prime no. print in range
    public static void primeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            boolean prime = isPrime(i);
            if (prime == true) {
                System.out.println("prime no. = " + i);
            }
        }
    }


    // binary to decimal
public static void binToDec(int binNum){
    int myNum=binNum;
    int pow=0;
    int decNum=0;
    while(binNum>0){
        int lastDigit=binNum%10;
        decNum=decNum+(lastDigit*(int)(Math.pow(2,pow)));
        pow++;
        binNum=binNum/10;

    }
    System.out.println("decimal of "+myNum+" = "+ decNum);
}


// convert binary to decimal
public static void decToBin(int n){
    int myNum=n;
    int pow=0;
    int binNum=0;
    while (n>0) {
        int rem=n%2;
        binNum=binNum+(rem*(int)Math.pow(10,pow));
        pow++;
        n=n/2;

    }
    System.out.println("binary from of "+myNum+" = "+binNum);
}
    public static void main(String[] args) {
        // function calling
        // printHelloWorld();

        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum=calculateSum(a,b);
        // System.out.println("sum is : " + sum);
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // int product=multiply(a, b);
        // System.out.println(product);
        // System.out.print("Enter the number to find the factorial = ");
        // int n = sc.nextInt();
        // int fact = factorial(n);
        // System.out.println(fact);

        // int n=sc.nextInt();
        // int r=sc.nextInt();
        // int binomialCoeff=bincoeff(n, r);
        // System.out.println(binomialCoeff);

        // System.out.println(sum(3,4,5));
        // System.out.println(sum(3,5));
        // System.out.println(sum(3.5f,5.3f));

        // int n = sc.nextInt();
        // System.out.println(isPrime(n));
        // primeInRange(n);
        // binToDec(1111);
        // decToBin(15);

        // int s=45;
        // System.out.println(s);
        
        {
            int s=23;
            System.out.println(s);
        }
// System.out.println(s);
    }

}
