package com.javaalgorithm;

import org.junit.Assert;
import org.junit.Test;

public class CountVowelsAndConsonantsTestCases {
  @Test
  public void totalCountOfVowelsAndConsonantsWithValidValue(){
    Alphabets expectedCount = new Alphabets(2,2);
    Alphabets actualCount  = CountVowelsAndConsonantsUsingObject.countVowelsAndConsonants("neha");
    Assert.assertEquals(expectedCount,actualCount);
  }

  @Test(expected = IllegalArgumentException.class)
  public void totalVowelsAndConsonantsWithNullValue() {
    CountVowelsAndConsonantsUsingObject.countVowelsAndConsonants(null);
  }

  @Test(expected = IllegalArgumentException.class)
  public void totalVowelsAndConsonantsWithEmptyValue() {
    CountVowelsAndConsonantsUsingObject.countVowelsAndConsonants("");
  }
}