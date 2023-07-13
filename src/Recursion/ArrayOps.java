package Recursion;

public class ArrayOps {
    public static boolean CheckSorted(int[] arr, int idx  , int n){
        if(idx == n - 1){
            return true;
        }
        return (arr[idx] > arr[idx+1]) && CheckSorted(arr,idx+1 , n);
    }

    public static int LastOccr(int[] arr, int key , int n){
        if((n==-1)||(arr[n] == key)){
            return n;
        }
        return LastOccr(arr,key,n-1);
    }

    public static int FirstOccr(int[] arr, int key , int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return FirstOccr(arr,key,i+1);
    }

    public static void main(String[] args){
        int[] arr = {7,2,5,6,2,1};

        System.out.println(CheckSorted(arr,0, arr.length));
        System.out.println(LastOccr(arr,2, arr.length-1));
        System.out.println(FirstOccr(arr,2, 0));
    }
}
