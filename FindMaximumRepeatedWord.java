package com.mac.rag;

import java.util.*;

public class FindMaximumRepeatedWord {

    public static void main(String args[]) {
        HashSet<String> excludedWords = new HashSet<String>();
        excludedWords.add("is");
        System.out.print(findMaxWords(excludedWords, "This is Ragesh's car.This is Toyota's car. This is a white car"));
    }


    public static List<String> findMaxWords(Set<String> excludedWords, String inputString) {
        //split the array based on the require regex. here space, single quotes and full stop are used for splitting the string.
        List<String> splitStringList = Arrays.asList(inputString.split("[ \\'\\.]"));
        Map<String, Integer> wordCount = new HashMap<>(splitStringList.size());

        //create an hasmap with strings and their corresponding occurrences.
        for (String word : splitStringList) {
            String s = String.valueOf(word.charAt(0));
            if (!excludedWords.contains(word)) {
                wordCount.put(word, wordCount.get(word) == null ? 1 : wordCount.get(word) + 1);
            }
        }

        //create a list of all the entries in the map.
        List countEntries = new ArrayList<Map.Entry<String, Integer>>();
        countEntries.addAll(wordCount.entrySet());
        //sort the entry lists using the custom comparator class defined below.
        Collections.sort(countEntries, new sortEntries());
        List<String> maxOccursStringsList = new ArrayList<>();

        //find the maximum value
        int maxValue = (int) ((Map.Entry) countEntries.get(0)).getValue();
        //create a list of strings whose count matches with the maximum occurrence
        for (Object entry :
                countEntries) {
            if (((Map.Entry) entry).getValue().equals(maxValue)) {
                maxOccursStringsList.add(((Map.Entry) entry).getKey().toString());
            } else {
                return maxOccursStringsList;
            }
        }
        return maxOccursStringsList;
    }
}

//custom comparator to sort by entry values in descending order.
class sortEntries implements Comparator<Map.Entry<String, Integer>> {

    @Override
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        return o2.getValue().compareTo(o1.getValue());
    }
}
