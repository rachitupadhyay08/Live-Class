package lec63;

public class Find_xor_sum_of_all_pairs_bitwise_AND {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {6,5};
        int xor1 = Bitwise_xor(arr1);
        int xor2 = Bitwise_xor(arr2);
        System.out.println(xor1 & xor2);
    }
    public static int Bitwise_xor(int[] arr){
        int xor=0;
        for(int v: arr){
            xor ^= v;
        }
        return xor;
    }
}
