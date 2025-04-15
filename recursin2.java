//remove th duplicate in a string by using the recursion//
public class recursin2 {
    public static boolean map[]=new boolean[26];//lower asscii value to compare  a string we are using it ,it represent the "a"to "z"//

    public static void removeduplicate(String str,int idx, String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currchar=str.charAt(idx);
        //"b"-"a"=1;that if will skip becoz  its exists in our map or else it will store in the else part of code//
        if(map[currchar-'a']){
            removeduplicate(str, idx+1, newString);
            //else part of code is there to store which string is not there in the map[a to z ,comparesion ]//
        }else{
            newString+=currchar;
            map[currchar-'a']=true;
            removeduplicate(str, idx+1, newString);
        }
    }
    public static void main(String[] args) {
        String str="abccdazz";
        removeduplicate(str, 0, "");
    }
}
