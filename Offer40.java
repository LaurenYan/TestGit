package JZhOffer;

/**
 * Created by ${ywj} on 2017/10/19.
 */
public class Offer40 {
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        if(array.length==2){
            num1[0]=array[0];
            num2[0]=array[1];
        }
        int resExclusiveOR = 0;
        for (int i = 0; i < array.length; i++) {
            resExclusiveOR ^= array[i];
        }
        int index = help(resExclusiveOR);
        for(int i=0;i<array.length;i++){
            if(IsBit1(array[i],index)){
                num1[0]^=array[i];
            }
        }
        for(int i=0;i<array.length;i++){
            if(IsBit1(array[i],index)){
                num2[0]^=array[i];
            }
        }
    }

    public int help(int num) {
        int i = 1;
        int count = 0;
        while ((num & i) == 0) {
            i = i << 1;
            ++count;
        }
        return count;
    }

    boolean IsBit1(int num, int index) {
        num = num >> index;

        return (num & 1) == 0 ? false : true;
    }

}
