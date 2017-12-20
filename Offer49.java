package JZhOffer;

/**
 * Created by ${ywj} on 2017/11/7.
 */
public class Offer49 {
    public int StrToInt(String str) {
        if (str.equals("") || str.length() == 0)
            return 0;
        char[] a = str.toCharArray();
        int symbol = 0;
        if (a[0] == '-')
            symbol = 1;
        int sum = 0;
        for (int i = symbol; i < a.length; i++) {
            if (a[i] == '+')
                continue;
            if (a[i] > '9' || a[i] < '0')
                return 0;
            sum = sum * 10 + a[i] - '0';
        }
        System.out.println();
        return symbol == 0 ? sum : sum * (-1);
    }
}
