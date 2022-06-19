package lesson2;

public class Prog8 {
    static int min(int [] arrayOfInts){
        int min = arrayOfInts[0];
        for (int num : arrayOfInts){
            if (num < min)
                min = num;
        }
        return min;
    }
}
