package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManup {

    public static int[] Reverse(int lst[]){
        for (int i=0,j=lst.length-1;i<j;i++,j--){
            int temp = lst[i];
            lst[i] = lst[j];
            lst[j]=temp;
        }return lst;
    }

    public static void Pairs(int lst[]){
        int len = lst.length;
        for(int i = 0;i<len;i++){
            int cur = lst[i];
            for (int j=i+1 ;j<len;j++){
                System.out.println("("+cur+","+lst[j]+")");
            }
        }
    }

    public static void SubArr(int lst[]){
        int len = lst.length;
        for(int i=0;i<len;i++){
            for(int j=len;j>i;j--){
                for(int k = i ; k<j ; k++){
                    System.out.print(lst[k]+" ");
                }System.out.println();
            }
        }
    }

    public static int MaxSumArr(int lst[]){ //big O n^3
        int len = lst.length;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<len;i++){
            for(int j=len;j>i;j--){
                int Sum = 0;
                for(int k = i ; k<j ; k++){
                    Sum+=lst[k];
                }if(Sum>max){
                    max =Sum;
                }
            }
        }
        return max;
    }

    public static int MaxSumArrO2(int lst[]){ // prefix method big O n^2
        int n=lst.length, com[]= new int[n];

        com[0]=lst[0];
        for (int i=1; i<lst.length ; i++ ){
            com[i] = com[i-1]+lst[i];
        }
        int max = com[0];
        for (int mn,i = 1; i<n; i++ ){
            for(int j = i ;j<n;j++){
                mn = com[j]-com[i-1];
              if(mn > max){
                  max = mn;
              }
            }
        }return max;

    }
    public static int MaxSumArrKadan(int lst[]){ // kadan's big O n
        int sum=0,max=Integer.MIN_VALUE;

        for (int i =0;i<lst.length;i++){
            if (sum<0){
                sum=0;
            }sum+=lst[i];
            max = max>sum?max:sum;
        }
        return max;
    }

    public static int LinearSearch(int c,int lst[]){
        for (int i = 0 ; i<=lst.length-1 ; i++){
            if (lst[i]==c){
                return i;
            }
        }return -1;
    }
    public static int BinarySearch(int n,int lst[]){
        int low = 0;
        int high = lst.length;
        int mid = (low+high)/2;

        while (low<high){
            if (lst[mid]==n){
                return mid;
            } else if (lst[mid]>n) {
                high = mid-1;
            }else {
                low = mid+1;
            }mid=(low+high)/2;
        }return -1;
    }
    public static int Largest(int nums[]){
        int largest = Integer.MIN_VALUE;
        for (int i=0 ; i<nums.length;i++){
            if(nums[i]>largest){
                largest=nums[i];
            }
        }
        return largest;
    }
    public static void main(String[] args){
        int Ids[] = {-10,-12,-2,53,-6,-8,-34};
//        Scanner sc= new Scanner(System.in);
//        int ck = sc.nextInt();
//
//        System.out.println(LinearSearch(ck,Ids));
//        System.out.println(BinarySearch(ck,Ids));
//        System.out.println(Largest(Ids));
//        System.out.println(Arrays.toString(Reverse(Ids)));
//        Pairs(Ids);
//        SubArr(Ids);
//        System.out.println(MaxSumArr(Ids));
//        System.out.println(MaxSumArrO2(Ids));
//        System.out.println(MaxSumArrKadan(Ids));
        SubArr(Ids);
        System.out.println(MaxSumArrO2(Ids));
    }
    }

