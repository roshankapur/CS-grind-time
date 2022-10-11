import java.io.*;
import java.util.*;

public class test0 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); in.nextLine();
        HashMap<Integer, ArrayList<Integer>> queryTable = new HashMap<Integer,ArrayList<Integer>>();

        for(int i = 0; i < n; i++){
            int d = in.nextInt();
            ArrayList<Integer> ithArr = new ArrayList<>();
            for(int j = 0; j < d; j++){
                ithArr.add(in.nextInt());
            }
            queryTable.put(i,ithArr);in.nextLine();
        }


    }
}
