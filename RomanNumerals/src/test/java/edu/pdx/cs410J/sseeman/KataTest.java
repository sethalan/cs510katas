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

  @Test
  public void romanNumeralFor5isV() {
    assertThat(Kata.romanNumeralFor(5), equalTo("V"));
  }

  @Test
  public void romanNumeralFor10isX() {
    assertThat(Kata.romanNumeralFor(10), equalTo("X"));
  }

  @Test
  public void romanNumeralFor50isL() {
    assertThat(Kata.romanNumeralFor(50), equalTo("L"));
  }
  @Test
  public void romanNumeralFor100isC() {
    assertThat(Kata.romanNumeralFor(100), equalTo("C"));
  }
  @Test
  public void romanNumeralFor500isD() {
    assertThat(Kata.romanNumeralFor(500), equalTo("D"));
  }
  @Test
  public void romanNumeralFor1000isM() {
    assertThat(Kata.romanNumeralFor(1000), equalTo("M"));
  }




}
