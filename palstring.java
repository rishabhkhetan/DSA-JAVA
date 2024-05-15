public class palstring {

//    static void checkpal(String s){
//        int l = s.length();
//        String s1 = "";
//        for(int i=l-1; i>=0; i--){
//            s1 = s1 + s.charAt(i);
//        }
//        if(s1.equals(s))
//            System.out.println("true");
//        else
//            System.out.println("false");
//    }

    static boolean checkpal(String s){
        int start = 0;
        int end = s.length()-1;
        while(start<end){
            if(s.charAt(start) == s.charAt(end)){
                start++;
                end--;
            }
            else
                return false;
        }
        return true;
    }


    public static void main(String[] args){
        System.out.println(checkpal("madame"));
        System.out.println(checkpal("ollo"));
    }
}
