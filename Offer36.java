package JZhOffer;

import com.sun.scenario.effect.InvertMask;

/**
 * Created by ${ywj} on 2017/10/16.
 */
public class Offer36 {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 5, 6, 4};
        int c = InversePairs(arr);
        System.out.print(c);
    }

    public static int InversePairs(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int len = array.length;
        int[] copy = new int[len];
        for (int i = 0; i < len; i++) {
            copy[i] = array[i];
        }
        int count = InversePairsHelp(array, copy, 0, len - 1);
        return count;

    }

    private static int InversePairsHelp(int[] array, int[] copy, int start, int end) {
        if (start == end) {
            return 0;
        }
        int len = (end + start) / 2;
        int leftNum = InversePairsHelp(array, copy, start, len) % 1000000007;
        int rightNum = InversePairsHelp(array, copy, len + 1, end) % 1000000007;

        int i = len;
        int j = end;
        int indexCopy = end;
        int count = 0;
        while (i >= start && j > len ) {
            if (array[i] > array[j]) {
                copy[indexCopy--] = array[i--];
                count += j - len;
                if (count >= 1000000007)//数值过大求余
                {
                    count %= 1000000007;
                }
            } else {
                copy[indexCopy--] = array[j--];
            }
        }
        for (; i >= start; i--) {
            copy[indexCopy--] = array[i];
        }
        for (; j >len; j--) {
            copy[indexCopy--] = array[j];
        }
        for (int s = start; s <= end; s++) {
            array[s] = copy[s];
        }
        return (leftNum + rightNum + count) % 1000000007;
    }
}
