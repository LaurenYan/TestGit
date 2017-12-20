package JZhOffer;

/**
 * Created by ${ywj} on 2017/10/17.
 */
public class Offer38 {
    public int GetNumberOfK(int[] array, int k) {
        int start = 0;
        int res = 0;
        if (array == null || array.length == 0) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == k) {
                start = i;
                break;
            }
        }
        for (int i = start; i < array.length; i++) {
            if (array[i] != k) {
                res = i - start;
                break;
            } else if (i == array.length - 1 && k == array[array.length - 1]) {
                res = i - start + 1;
                break;
            }
        }
        return res;
    }
}
