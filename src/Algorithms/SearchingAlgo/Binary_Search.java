package Algorithms.SearchingAlgo;

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        int target = 7;
        orderAgnosticSearch(arr,target);
    }

    private static void orderAgnosticSearch(int[] arr, int target) {
        int start =0;
        int end = arr.length-1;
        boolean isAsc = arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target) System.out.println(mid);
            if(isAsc){
                if(target>arr[mid]) start = mid+1;
                else end = mid-1;
            }else{
                if(target>arr[mid]) end = mid-1;
                else start = mid+1;
            }
        }
        System.out.println(-1);
    }
}
