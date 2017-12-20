package JZhOffer;

/**
 * Created by ${ywj} on 2017/11/9.
 */
public class Offer52 {
    public int[] multiply(int[] A) {
        int length = A.length;
        int[] B = new int[length];
        for (int i = 0; i < length; i++) {
            B[i] = 1;
            for (int j = 0; j < length; j++) {
                if (j == i)
                    continue;
                B[i] *= A[j];
            }
        }
        return B;
    }
}
