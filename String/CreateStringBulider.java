public class CreateStringBulider {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("");
        for (char ch = 'a'; ch<='z'; ch++) {
            sb.append(ch);//abcd....z
            //TC=O(26)
            //in string O(n2)
        }
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
