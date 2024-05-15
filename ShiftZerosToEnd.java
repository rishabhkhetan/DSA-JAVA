class ShiftZerosToEnd{

    static void shiftzeros(int[] arr){
        int j =0, temp =0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i]!=0 && arr[j]==0){
                temp = arr[i];
                arr[i]= arr[j];
                arr[j] = temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }
        for(int k =0; k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }

    public static void main (String[] args){
        shiftzeros(new int[]{0,0,0,0,0,5,0,3,2,6,0,3,2,0,1,0,0,0,0});
    }
}