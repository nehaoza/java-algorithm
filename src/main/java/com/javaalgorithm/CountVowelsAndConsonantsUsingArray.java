package com.javaalgorithm;

public class CountVowelsAndConsonantsUsingArray {

  public static void main(String args[]) {
    CountVowelsAndConsonantsUsingArray.countVowelAndConsonant("neha");
  }

  public static int[] countVowelAndConsonant(String input) {

    int[] count = new int[2];

    count[0] = 0;
    count[1] = 0;

    if (input == null || input.isEmpty()) {
      throw new IllegalArgumentException("Please provide valid input");
    }

    for (int i = 0; i < input.length(); i++) {
      if (input.charAt(i) == 'a' || input.charAt(i) == 'A' || input.charAt(i) == 'e' || input.charAt(i) == 'E' || input.charAt(i) == 'i' || input.charAt(i) == 'I' || input.charAt(i) == 'o' || input.charAt(i) == 'O' || input.charAt(i) == 'u' || input.charAt(i) == 'U') {
        count[0]++;

      } else {
        count[1]++;
      }
    }
    System.out.println("Total number of vowels " + count[0]);
    System.out.println("Total number of consonant " + count[1]);

    return count;
  }
}