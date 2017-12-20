package JZhOffer;

/**
 * Created by ${ywj} on 2017/11/9.
 */
public class Offer53 {
    public static void main(String[] args){
        Offer53 o53 = new Offer53();
        char[] str=new char[0];
        char[] pattern = new char[]{'.','*'};

        boolean flag = o53.match(str,pattern);
        System.out.print(flag);
    }
    public boolean match(char[] str, char[] pattern) {
        if (str == null || pattern == null)
            return false;
        return help(str, pattern, 0, 0);
    }

    private boolean help(char[] str, char[] pattern, int i, int j) {
        if (i == str.length  && j == pattern.length )
            return true;
        if (i != str.length  && j == pattern.length )
            return false;
        if (j + 1 < pattern.length && pattern[j + 1] == '*') {
            if ((i != str.length && pattern[j] == str[i]) || (pattern[j] == '.' && i != str.length)){
                return help(str, pattern, i, j + 2)
                        || help(str, pattern, i + 1, j)
                        || help(str, pattern, i + 1, j + 2);
            }
            else {
                //直接跳过*（*匹配到0个）
                return help(str,  pattern, i,j + 2);
            }
        }
        if ((i != str.length && pattern[j] == str[i]) || (pattern[j] == '.' && i != str.length))
            return help(str, pattern, i + 1, j + 1);
        return false;
    }
}
