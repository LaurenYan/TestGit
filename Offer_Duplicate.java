package JZhOffer;

import java.util.HashSet;

/**
 * Created by ${ywj} on 2017/11/7.
 */
public class Offer_Duplicate {
    public static void main(String[] args) {
        Offer_Duplicate od = new Offer_Duplicate();
        int num[] = {2, 1, 3, 1, 4};
        int[] dup = new int[1];
        od.duplicate(num, 5, dup);
    }

    public boolean duplicate(int numbers[], int length, int[] duplication) {
        boolean flag = false;
        if (numbers.length == 0 || numbers == null) {
            duplication[0] = -1;
            return false;

        }
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < length; i++) {
            if (!hs.add(numbers[i])) {
                duplication[0] = numbers[i];
                return true;
            }
        }
        return flag;
    }
}
