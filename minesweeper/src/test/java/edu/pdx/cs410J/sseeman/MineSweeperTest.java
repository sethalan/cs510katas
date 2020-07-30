package edu.pdx.cs410J.sseeman;

import org.junit.Test;

import java.io.CharConversionException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;

public class MineSweeperTest
{

  @Test
  public void canInstantiateMineSweeperClass() {
   MineSweeper game = new MineSweeper(4, 4);
  }

  @Test
  public void canInstantiateMineSweeperDefault() {
    MineSweeper game = new MineSweeper(4, 4);
    Character[][] map = game.getMap();
    assertThat(map[1][1], equalTo('.'));
  }
}
