public class StringManipulation{

   /* 
    *
     concatenating two strings : Example ==> ( abcd + efgh => aebfcgdh ) using recursion
    *
    */
    public String stringConcatenate(String str1, String str2){
        String res = "";
        int i = 0;
        res = stringConcatenatePrivate(str1, str2, res, i);
        return res;
    }

    /* 
      recursion for concatenating strings for the method stringConcatenate
    */
    private String stringConcatenatePrivate(String str1, String str2, String res, int i){
        // base case for the recursion
        if(i >= str2.length() && i >= str1.length()) return res;
        else if(i >= str2.length()) res += Character.toString(str1.charAt(i));
        else if(i >= str1.length()) res += Character.toString(str2.charAt(i));
        else res += Character.toString(str1.charAt(i)) + Character.toString(str2.charAt(i));
        i++;
        res = stringConcatenatePrivate(str1, str2, res, i);
        return res;
    }
    public static void main(String[] args){
        StringManipulation x = new StringManipulation();
        String str = x.stringConcatenate("13579", "2468");
        System.out.println(str);
    }
}