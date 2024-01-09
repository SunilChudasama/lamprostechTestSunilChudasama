import java.util.*;

public class coinChange {

    public static void main(String[] args) {
        int[] denomination = {1,5,10};
        int target = 27;

        int count= 0;

        for(int i=denomination.length-1; i>=0; i--){
            int x = denomination[i];
            while (target>=x) {
                target = target-x;
                count = count +1;
            }
        }

        System.out.println("requered coin is " +count);
    }
        
}