package com.javaalgorithm;

import org.junit.Assert;
import org.junit.Test;

public class CountVowelsTestCases {
  @Test
  public void countTotalVowelsWithValidValue() {
    int totalVowels = CountVowels.totalCountOfVowels("Neha");
    Assert.assertEquals(2, totalVowels);
  }

  @Test(expected = IllegalArgumentException.class)
  public void findTotalVowelsWithNullValue() {
    CountVowels.totalCountOfVowels(null);
  }

  @Test(expected = IllegalArgumentException.class)
  public void findTotalVowelsWithEmptyValue() {
    CountVowels.totalCountOfVowels("");
  }
}