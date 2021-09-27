package com.javaalgorithm;

import java.util.Objects;

public class Alphabets {
  private int vowels;
  private int consonants;

  public Alphabets(int vowels, int consonants) {
    this.vowels = vowels;
    this.consonants = consonants;
  }

  public int getVowels() {
    return vowels;
  }

  public int getConsonants() {
    return consonants;
  }

  public void setVowels(int vowels) {
    this.vowels = vowels;
  }

  public void setCosonants(int cosonants) {
    this.consonants = cosonants;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Alphabets alphabets = (Alphabets) o;
    return vowels == alphabets.vowels &&
        consonants == alphabets.consonants;
  }

  @Override
  public int hashCode() {
    return Objects.hash(vowels, consonants);
  }

  @Override
  public String toString() {
    return "Alphabets{" +
        "vowels=" + vowels +
        ", consonants=" + consonants +
        '}';
  }
}