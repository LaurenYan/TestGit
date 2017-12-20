package JZhOffer;

import java.util.ArrayList;

/**
 * Created by ${ywj} on 2017/10/31.
 */
public class Offer45 {
    public static void main(String[] args){
        Offer45 o45 = new Offer45();
        int res = o45.LastRemaining_Solution(5,3);
        System.out.print(res);
    }
    public int LastRemaining_Solution(int n, int m) {
        if (m == 0 || n == 0) {
            return -1;
        }
        ArrayList<Integer> data = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            data.add(i);
        }
        int i = -1;
        while (data.size() > 1) {
            i = (i + m) % data.size();
            data.remove(i);
            i--;
        }
        return data.get(0);
    }
}
