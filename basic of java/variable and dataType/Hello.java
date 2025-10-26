import java.util.*;

public class Hello {
    public static void main(String by[]) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("1123");
        // System.out.println("1123");
        // System.out.println("1123");
        // System.out.println("1123");
        // System.out.println("1123");
        // System.out.println("1123");
        // System.out.println("1123");
        // System.out.println("*****");
        // System.out.println("****");
        // System.out.println("***");
        // System.out.println("**");
        // System.out.println("*");
        // int a=10;
        // int b=6;
        // System.out.println("a");
        // System.out.println(a);
        // byte bt =8;
        // System.out.println(bt);
        // char ch='a';
        // System.out.println(ch);
        // boolean var=true;
        // int number=25;
        // //long
        // //double
        // short n=240;
        // int a=10;
        // int b=5;
        // int sum=a+b;
        // System.out.println(sum);

        // String input = sc.next();
        // System.out.println(input);
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // int sum=a+b;
        // System.out.println(sum);
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // int prod=a*b;
        // System.out.println(prod);
        // float r=sc.nextFloat();
        // float area=3.14f*r*r;
        // System.out.println(area);
        // long a=25;
        // int b=a;
        // System.out.println(b);
        //  float s=sc.nextInt();
        // float a=23.33f;
        // int b=(int)a;
        // System.out.println(a+" "+b);
        // char ch='@';
        // int number=ch;
        // System.out.println(number);

//         char a='a';
//         char b='x';
//         char c='c';
// byte bt=(byte)(a+b+c);
//         System.out.println(bt);
        // System.out.println((int)a);
        // System.out.println((int)b);
        // System.out.println(b-a);
        // int s=10;
        // float d=20.3f;
        // long t=30;
        // int ans=s+d+t;//lossy conversion
        // double ans=s+d+t;
        // System.out.println(ans);

        // byte b=5;
        // byte a=(byte)(b*2);
        // System.out.println(a);

// practice
// VARIABLES & DATA TYPES QUESTIONS
// Question1:In a program,input 3 numbers : A,B and C.You have to output the average of these 3 numbers.(Hint : Average of N numbers is sum of those numbers divided by N)
// int a=sc.nextInt();
// int b=sc.nextInt();
// int c=sc.nextInt();
// float avg=(a+b+c)/3;
// System.out.println(avg);
    

    // Question2:In a program,input the side of a square.You have to output the area of the square.(Hint : area of a square is (side x side)
    // float side=sc.nextFloat();
    // float areaSquare=side*side;
    // System.out.println(areaSquare);

// Question3:Enter cost of 3 items from the user(using float datatype)-a pencil,apenandan eraser. You have to output the total cost of the items back to the user as their bill.(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem
System.out.println("Enter the cost of pencil");
float pencil=sc.nextFloat();
System.out.println("Enter the cost of pen");
float pen=sc.nextFloat();
System.out.println("Enter the cost of eraser");
float eraser=sc.nextFloat();
float total=pen+pencil+eraser;
System.out.println("the total cost without gst ="+total);
float wGstTotal=(float)((total*0.18)+total);
System.out.println("the total cost with gst ="+wGstTotal);
}
}