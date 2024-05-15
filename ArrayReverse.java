public class ArrayReverse {
    public static int[] reverseArray(int[] arr, int s, int e){
        int temp = 0 ;
        while(s<e){
            temp  = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        return arr;
    }

    static void printArr(int[] arr){
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        //reversing an array
        int[] arr = {1,2,3,4,5,6};
        arr = reverseArray(arr,0,arr.length-1);
        printArr(arr);
    }
}