package lec63;

public class Neighbouring_Bitwise_Xor{
    public static void main(String[] args){
        int[] derived = {1,1,0};
    }     
    public static boolean DoesExist(int[] derived){
        int xor = 0;
        for(int v:derived){
            xor ^= v;
        }
        return xor==0;
    }
}
