package JZhOffer;

import java.util.Arrays;

/**
 * Created by ${ywj} on 2017/10/30.
 */
public class Offer44 {
    public boolean isContinuous(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return false;
        }
        int numberOfZero = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                numberOfZero++;
            }
        }
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                continue;
            }
            if (i != 0 && numbers[i] != 0 && numbers[i] == numbers[i - 1]) {
                return false;
            }
        }

        int indexNotZero = 0;
        while (indexNotZero < numbers.length) {
            if (numbers[indexNotZero] != 0) {
                break;
            }
            indexNotZero++;
        }
        int count = 0;
        while (indexNotZero < numbers.length - 1) {
            count += (numbers[indexNotZero + 1] - numbers[indexNotZero] - 1);
            indexNotZero++;
        }
        if (count > numberOfZero) {
            return false;
        } else {

            return true;
        }
    }
}
