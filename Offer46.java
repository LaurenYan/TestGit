package JZhOffer;

/**
 * Created by ${ywj} on 2017/11/1.
 */
public class Offer46 {
    public static void main(String[] args){
        Offer46 o46 = new Offer46();
        int res = o46.Sum_Solution(3);
        System.out.print(res);
    }
    public int Sum_Solution(int n) {
        int sum = n;
        boolean flag = (sum>0)&&((sum+=Sum_Solution(--n))>0);
        return sum;
    }
}
