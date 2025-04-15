public class recursion3 {
    public static void subsequencestr(String str,int idx,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currchar=str.charAt(idx);
        //to be
        subsequencestr(str, idx+1, newString+currchar);
        //or not to be
        subsequencestr(str, idx+1, newString);
    }
    public static void main(String[] args) {
        
        String str="abc";
        subsequencestr(str, 0, "");
    }
}
