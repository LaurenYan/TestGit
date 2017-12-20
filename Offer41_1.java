package JZhOffer;

import java.util.ArrayList;

/**
 * Created by ${ywj} on 2017/10/26.
 */
public class Offer41_1 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList res  = new ArrayList();
        int start =0;
        int end = array.length-1;

        while (start<end){
            if(array[start]+array[end]>sum){
                end--;
            }
            else if(array[start]+array[end]<sum){
                start++;
            }
            else{
                break;
            }
        }

        if(array[start]+array[end]==sum){
            res.add(start);
            res.add(end);
        }

        return res;
    }
}
