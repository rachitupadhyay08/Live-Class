package lec63;

public class Bitwise_Xor_of_All_Pairings {
    public static void main(String[] args) {
        int[] nums1 = {2,1,3};
        int[] nums2 = {10,2,5,0};

    }

    public static int All_Pairings(int[] nums1, int[] nums2){
        int n = nums1.length;
        int m = nums2.length;
         if(n%2==0 & m%2==0){
            return 0;
         }

        int xor1 = Bitwise_xor(nums1);
        int xor2 = Bitwise_xor(nums2);
        if(n%2 == 1 & m%2 ==1 ){
            return xor1 ^ xor2;
        }
        else if(n%2 == 1){
            return xor2;
        }
        else{
            return xor1;
        }
    }

    public static int Bitwise_xor(int[] arr){
        int xor =0;
        for(int v:arr){
            xor ^= v;
        }
        return xor;
    }
}
