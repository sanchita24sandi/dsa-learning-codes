import java.util.HashMap;
import java.util.Set;
public class MajorityElement {
    public static void main(String[] args) {
        int arr[]={1,3,2,5,1,3,5,1};
HashMap<Integer,Integer> map=new HashMap<>();
// Itrate array
for (int i = 0; i < arr.length; i++) {
    // if(map.containsKey(arr[i])){
    //     map.put(arr[i],map.get(arr[i])+1);
    // }else{
    //     map.put(arr[i],1);
    // }
    map.put(arr[i],map.getOrDefault(arr[i],0)+1);
}
// Set<Integer> keySet=map.keySet();
// for(Integer key:keySet){
// if(map.get(key)>arr.length/3){
//     System.out.println(key);
// }
// }
// Set<Integer> keySet=map.keySet();
// for(Integer key:keySet){
// if(map.get(key)>arr.length/3){
//     System.out.println(key);
// }
for(Integer key:map.keySet()){
if(map.get(key)>arr.length/3){
    System.out.println(key);
}

}



    }

}
