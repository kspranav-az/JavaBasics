package Arrays;

public class TrappingRainWater {
    public static void main(String[] args){
        int bars[] = {4,2,0,6,3,2,5},lmax[]=new int[bars.length],rmax[]=new int[bars.length],width=1;
        for(int i = 0 ,lm=Integer.MIN_VALUE;i<bars.length;i++){
            if (lm<bars[i]){
                lm = bars[i];
            }lmax[i]=lm;
        }for(int i = bars.length-1 ,rm=Integer.MIN_VALUE;i>=0;i--){
            if (rm<bars[i]){
                rm = bars[i];
            }rmax[i]=rm;
        }
        int sum =0;
        for(int i =0 ,s ; i<bars.length;i++){
            s=lmax[i]>rmax[i]?(rmax[i]-bars[i])*width:(lmax[i]-bars[i])*width;
            if(s>0){
                sum+=s;
            }
        }System.out.println(sum);
    }
}
