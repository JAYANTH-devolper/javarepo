import java.util.HashSet;

public class recursion4 {
    public static void subsequencestr(String str,int idx,String newString,HashSet<String>set){
        if(idx==str.length()){
          if(set.contains(newString)){
            return;
          }else{
            System.out.println(newString);
            set.add(newString);
            return;
          }
        }
        char currchar=str.charAt(idx);
        //to be
        subsequencestr(str, idx+1, newString+currchar,set);
        //or not to be
        subsequencestr(str, idx+1, newString,set);
    }
    public static void main(String[] args) {
        String str="aaa";
        HashSet<String> set=new HashSet<>();
        subsequencestr(str, 0, "",set);
    }
}
