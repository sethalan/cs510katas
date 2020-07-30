package edu.pdx.cs410J.sseeman;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class MineSweeper {

  private Character[][] map;

  public MineSweeper (int n, int m) {
    map = new Character[n][m];
    for (int i=0; i < n; i++) {
      for (int j=0; j < n; j++) {
        map[i][j] = '.';
      }
    }
  }
  public Character[][] getMap() {
    return map;
  }

  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
    System.exit(1);
  }
}