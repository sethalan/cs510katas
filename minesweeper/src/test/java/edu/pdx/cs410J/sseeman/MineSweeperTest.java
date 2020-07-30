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

  @test
  public void caninstantiateminesweeperdefault() {
    minesweeper game = new minesweeper(4, 4);
    character[][] map = game.getmap();
    assertthat(map[1][1], equalto('.'));
  }

  @test
  public void caninstantiateminesweeperdefault() {
    minesweeper game = new minesweeper(4, 4);
    character[][] map = game.getmap();
    assertthat(map[1][1], equalto('1'));
  }
}
