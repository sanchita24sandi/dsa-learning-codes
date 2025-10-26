public class CheckStringPalindrome {
    public static boolean isPalindrome(String str, int n){
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i)!=str.charAt(n-i-1)){
                // not a plaindrome
                return false;
            }
            
        }
        return true;
    }
    public static void main(String[] args) {
        String str="racecar";
        int n=str.length();

        System.out.println(isPalindrome(str,n));
    }
}
