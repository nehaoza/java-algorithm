package com.javaalgorithm;

public class CountVowels {

  public static void main(String[] args) {
    int totalVowels = totalCountOfVowels("Neha");
    System.out.println("Total vowels  " + totalVowels);
  }

  public static int totalCountOfVowels(String input) {
    int count = 0;

    if (input == null || input.isEmpty()) {
      throw new IllegalArgumentException("Input can not be null or empty");
    }

    input = input.toLowerCase();
    for (int i = 0; i < input.length(); i++) {
      if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
        count++;
      }
    }
    return count;
  }
}