package Arrays;

public class AssignmentArr {

    public  static boolean IsIn(int lst[],int n){
        for (int j : lst) {
            if (j == n) {
                return true;
            }
        }
        return false;
    }

    public static int Check_Rota(int nums[],int target){
        if(IsIn(nums,target)){
            return 1;
        }else{
            return -1;
        }
    }

    public static boolean Check_Rep(int arr[]){
        int n = arr.length;
        for(int i=0 ;i<n;i++){
            for(int j=i+1 ; j<n ; j++){
                if(arr[j]==arr[i]){
                    return true;
                }
            }
        }return false;
    }

    public static void main(String[] args){
        int arr[]={1,2,3,4};
        System.out.println(Check_Rep(arr));
    }
}
