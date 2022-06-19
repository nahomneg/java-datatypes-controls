package lesson2;

import java.util.Arrays;

public class Prog4 {
    public static void main(String [] args){
        String data= Data.records;

        String [] rows = data.split(":");
        String [] prodIds = new String[rows.length];

        for (int i=0;i<rows.length;i++){
            prodIds[i] = rows[i].split(",")[0];
        }
        System.out.println(Arrays.toString(prodIds));
    }
}
