import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        // int age=22;
        // if (age>18) {
        // System.out.println("vote,drive");
        // }
        // if(age>13&& age<18){
        // System.out.println("teenager");
        // }
        // else{
        // System.out.println("not adult");
        // }

        // print the larger of 2
        // int a=1;int b=3;
        // if(a>b){
        // System.out.println("a is laergest "+a);
        // }
        // else{
        // System.out.println("b is laergest "+b);
        // }

        // Print if a number is Odd or Even
        // int a=4;
        // if(a%2==0){
        // System.out.println("a is even");
        // }
        // else{
        // System.out.println("a is odd");
        // }

        // int age=22;
        // if(age>=18){
        // System.out.println("adult");

        // }else if(age>13&& age <18){
        // System.out.println("teengarer")
        // }

        Scanner sc = new Scanner(System.in);
        // int income = sc.nextInt();
        // int tax;
        // if (income > 500000) {
        //     tax = 0;
        // } else if (income >= 500000 && income < 1000000) {
        //     tax = (int) (income * 0.2);
        // } else {
        //     tax = (int) (income * 0.3);
        // }
        // System.out.println("your tax is : " + tax);




        // print the largest of 3
//         int a=1,b=3,c=6;
//         if((a>=b)&&(a>=c)){
//             System.out.println(a);
//         }else if(b>=c){
//             System.out.println(b);
//         }
//         else{
//             System.out.println(c);
//         }
        

//         boolean bol =(5>4)?true:false;System.out.println(bol);
//         int marks=33;
//         String status=(marks>33)?"pass":"fail";
//         System.out.println(status);
// int number=2;
//         switch(number){
//             case 1:System.out.println("samosa");
//             break;
//             case 2:System.out.println("mango");
//             break;
//             case 3:System.out.println("lichi");
//             break;
//            default:System.out.println("we wake up");
//         }

// calculator
// int a=sc.nextInt();
// int b=sc.nextInt();
// char oeprator=sc.next().charAt(0);
// switch (oeprator) {
//     case  '+':System.out.println(a+b);
        
//         break;
//     case '-':System.out.println(a-b);
        
//         break;
//     case  '*':System.out.println(a*b);
        
//         break;
//     case '/':System.out.println(a/b);
        
//         break;
//     case '%':System.out.println(a%b);
        
//         break;

//     default:System.out.println("wrong operator");
//         break;
// }



// Question1:Write a Java program to get anumber from the user and print whether it is positive or negative
// int a=sc.nextInt();
// if(a>0){
//     System.out.println("number is +ve");
// }else if(a==0){
//     System.out.println("number is zero");
// }else{
//     System.out.println("number is -ve");
// }



// double temp=103.5;
// if(temp>100){
//     System.out.println("you have fever");
// }
// else{
//     System.out.println("you don't feaver");
// }


// int day=sc.nextInt();
// switch (day) {
//     case 1:
//     System.out.println("sunday");
        
//         break;
//     case 2:
//     System.out.println("monday");
        
//         break;
//     case 3:
//     System.out.println("tuesday");
        
//         break;
//     case 4:
//     System.out.println("wednesday");
        
//         break;
//     case 5:
//     System.out.println("thusday");
        
//         break;
//     case 6:
//     System.out.println("friday");
        
//         break;
//     case 7:
//     System.out.println("saturday");
        
//         break;

//     default:System.out.println("you enter wrong number");
//         break;
// }
int year=sc.nextInt();
boolean x=(year%4)==0;
boolean y=(year%100)==0;
boolean z=((year%400)==0)&&((year%100)==0);
if(x&&(y||z)){
    System.out.println(year+"leap year");
}
else{
    System.out.println(year+" not leap year");
}
    }

}
