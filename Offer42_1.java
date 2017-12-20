package JZhOffer;

import static java.lang.String.valueOf;

/**
 * Created by ${ywj} on 2017/10/27.
 */
public class Offer42_1 {
    public static void main(String[] args) {
        Offer42_1 offer42_1 = new Offer42_1();
        System.out.print(offer42_1.ReverseSentence("I am a student."));
        System.out.print(offer42_1.ReverseSentence("I am a student.").length());

    }

    public String ReverseSentence(String str) {
        str = help(str, 0, str.length() - 1);
        String res = "";
        int start = 0;
        int end = 0;
        char[] chars = str.toCharArray();
        while (end != str.length()) {
            while (chars[end] != ' ' && end!=str.length()-1) {
                end++;
            }
            String word;
            if(end==str.length()-1){
                word = str.substring(start);
            }
            else{
                word = str.substring(start, end);
            }

            if (word != null && res.length() != 0) {
                res += " ";
            }
            res += help(word, 0, word.length() - 1);
            start = end + 1;
            end++;
        }
        return res;
    }

    private String help(String str, int i, int j) {
        if (str == null || str.length() == 0) {
            return str;
        }
        StringBuffer sb = new StringBuffer();
        while (j >= i) {
            sb.append(str.charAt(j));
            j--;
        }
        return sb.toString();
    }

}
