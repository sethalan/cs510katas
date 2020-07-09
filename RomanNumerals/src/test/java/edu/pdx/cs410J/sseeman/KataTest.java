package edu.pdx.cs410J.sseeman;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class KataTest
{

  @Test
  public void romanNumeralFor1isI() {
    assertThat(Kata.romanNumeralFor(1), equalTo("I"));
  }


}
