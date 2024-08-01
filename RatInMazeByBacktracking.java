package Backtracking;
public class RatInMazeByBacktracking {
  private static void print(int sr, int sc, int er, int ec, String s,boolean[][] isVisited) {
    if(sr<0 || sc<0) return;
    if(sr>er||sc>ec) return;
    if(isVisited[sr][sc]==true) return;//important statement
    if(sc==er && sr==ec) {
      System.out.println(s);
      return;
    }
    isVisited[sr][sc] = true;
  //go right
  print(sr, sc+1, er, ec, s+"R",isVisited);
   //go down
  print(sr+1, sc, er, ec, s+"D",isVisited);
  //go left
  print(sr, sc-1, er, ec, s+"L",isVisited);
  //go up
  print(sr-1, sc, er, ec, s+"U",isVisited);
  // the backtracking
  isVisited[sr][sc] = false;
  }
  public static void main(String[] args) {
      int rows = 3;
      int cols = 3;
      boolean[][] isVisited = new boolean[rows][cols];
     print(0,0,rows-1,cols-1,"",isVisited);
  }   
}
