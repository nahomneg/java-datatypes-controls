package lesson2;

import java.util.Arrays;

public class Prog6 {
    public static String [] removeDups(String [] words){
        String [] uniqueWords ;
        int dupsCount = 0;
        for (int i = 0; i < words.length; i++){;
            for(int j=i+1; j < words.length; j++){

                if (words[i].equals(words[j])){;
                    dupsCount += 1;
                }
            }

        }
        uniqueWords = new String[words.length - dupsCount];
        int j = 0;
        int index = 0;
        for (int i = 0; i < words.length; i++){
            boolean notFound = true;
            while (j < uniqueWords.length) {

                if (words[i].equals(uniqueWords[j])){;
                    notFound = false;
                    break;
                }
                j += 1;




            }
            if (notFound && (index < uniqueWords.length)){
                uniqueWords[index] = words[i];
                index +=1;

            }

        }
        return uniqueWords;

    }
}
