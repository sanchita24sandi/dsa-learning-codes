import java.util.*;
public class ReverseANumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int ans=0;
        while(n>0){
int  ld=n%10;//find last digit
ans=ans*10+ld;
n=n/10;//short the number
        }
        System.out.println(ans);
    }
}
