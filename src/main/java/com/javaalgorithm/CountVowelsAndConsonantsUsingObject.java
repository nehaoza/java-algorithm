package com.javaalgorithm;

public class CountVowelsAndConsonantsUsingObject {

  public static void main(String[] args) {
    Alphabets alphabets = countVowelsAndConsonants("Neha");
    System.out.println("vowels: "+ alphabets.getVowels());
    System.out.println("consonants: "+ alphabets.getConsonants());
  }

  public static Alphabets countVowelsAndConsonants(String input) {
    input = input.toLowerCase();
    int vowels = 0;
    int consonant = 0;

    if (input == null || input.isEmpty()) {
      throw new IllegalArgumentException("Input can not be null or empty");
    }

    for (int i = 0; i < input.length(); i++) {
      if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
        vowels++;
      }
      else {
        consonant++;
      }
    }
    return new Alphabets(vowels,consonant);
  }
}