package JZhOffer;

/**
 * Created by ${ywj} on 2017/10/28.
 */
public class Offer42_2 {
    public String LeftRotateString(String str, int n) {
        while (n > str.length()) {
            n = n % str.length();
        }

        String str_1;
        String str_2;
        if (n == str.length()) {
            return str;
        } else {
            str_1 = str.substring(0, n);
            str_2 = str.substring(n + 1);
        }
        return str_2 + str_1;
    }
}
