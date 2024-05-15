public class secondlargestno {

    public static void secLarges(int[] arr){
        int lar = Integer.MIN_VALUE, seclar = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>lar){
                seclar = lar;
                lar = arr[i];
            }
            else if(arr[i]>seclar && arr[i]!=lar){
                seclar = arr[i];
            }
        }
        System.out.println("Second Largest No.is : "+seclar);
    }

    public static void main(String[] args){
        int[] myarr = {55,66,11,66,8};
        secondlargestno obj = new secondlargestno();
        obj.secLarges(myarr);
    }
}
