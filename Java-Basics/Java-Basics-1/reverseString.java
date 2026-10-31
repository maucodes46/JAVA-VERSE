public class reverseString {
    public static void main(String[] args) {
        String str = "Hello World";
        
        // System.out.println("Original String: " + str);
        // for (int i = str.length()-1; i >=0; i--) {
        //     System.out.print(str.charAt(i));
        // }
rev_string(str,str.length()-1);
    }
    static void rev_string(String str, int i){
if(i<0){
    return;
}
System.out.print(str.charAt(i));
rev_string(str, i-1);
    }

    
}
