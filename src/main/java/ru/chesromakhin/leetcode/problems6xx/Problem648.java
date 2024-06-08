package ru.chesromakhin.leetcode.problems6xx;

import java.util.List;

/**
 * 648. Replace Words
 * In English, we have a concept called root, which can be followed by some other word to form another longer word - let's call this word derivative. For example, when the root "help" is followed by the word "ful", we can form a derivative "helpful".
 * Given a dictionary consisting of many roots and a sentence consisting of words separated by spaces, replace all the derivatives in the sentence with the root forming it. If a derivative can be replaced by more than one root, replace it with the root that has the shortest length.
 * Return the sentence after the replacement.
 */
public class Problem648 {

  public String replaceWords(List<String> dictionary, String sentence) {
    String[] words = sentence.split(" ");

    for (int i = 0; i < words.length; i++) {
      String word = words[i];
      String minRoot = word;

      for (String root : dictionary) {
        if (word.startsWith(root) && root.length() < minRoot.length()) {
          minRoot = root;
        }
      }

      words[i] = minRoot;
    }

    return String.join(" ", words);
  }

}
