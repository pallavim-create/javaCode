package may19;

import java.util.*;

public class CountOFEachWord {
    public static void main(String[] args) {
        String str = "Core nuts technologies located in Bangalore Core nuts technologies located in hyderabad Core nuts technologies in Hyderabad Core nuts technologies in Bangalore";

        String[] words = str.split("\\s+");
        Map<String, Integer> wordCount = new LinkedHashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        wordCount.forEach((word, count) -> {
            System.out.println(word + " - " + count);
        });
    }
}



