package JZhOffer;

/**
 * Created by ${ywj} on 2017/11/14.
 */
public class Offer55 {
    int[] hashtable=new int[256];
    StringBuffer sb=new StringBuffer();
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        sb.append(ch);
        if(hashtable[ch]==0){
            hashtable[ch]=1;
        }
        hashtable[ch]+=1;
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        for(int i=0;i<sb.length();i++){
            if(hashtable[sb.charAt(i)]==1)
                return sb.charAt(i);
            else
                continue;
        }
        return '#';
    }
}
