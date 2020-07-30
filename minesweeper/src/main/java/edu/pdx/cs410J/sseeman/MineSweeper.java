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

    for (int i=q; i < n; i++) {
      for (int j=0; j < n; j++) {
        map[i][j] = '.';
      }
    }

    map[0][0] = '*';
  }
  public Character[][] getMap() {
    return map;
  }

  public Counter(int n, int m)
  {

    for (int i=0; i < n; i++) {
      for (int j=0; j < n; j++) {

        int counter =0;
        if(map[i-1][j]=="*")
          ++Counter;
          if(map[i-1][j-1]=="*")
            ++Counter;
          if(map[i-1][j+1]=="*")
            ++Counter;
          if(map[i+1][j-1]=="*")
            ++Counter;
          if(map[i+1][j]=="*")
          ++Counter;
          if(map[i+1][j+1]=="*")
          ++Counter;
          if(map[i][j+1]=="*")
          ++Counter;
          if(map[i][j-1]=="*")
            ++Counter;
          map[i][j]= counter;


      }
    }


  }

  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
    System.exit(1);
  }
}