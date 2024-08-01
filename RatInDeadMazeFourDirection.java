package Backtracking;
public class RatInDeadMazeFourDirection {
    // private static void print(int sr, int sc, int er, int ec, String s,int[][]maze,boolean[][]isVisited) {
    //     if(sr>er||sc>ec) return ;
    //     if(sr==er && sc==ec) {
    //       System.out.println(s);
    //       return;
    //     }
    //     if(sr<0 || sc<0) return;
    //     if(maze[sr][sc]==0) return;
    //     if(isVisited[sr][sc] == true) return;
    //     //check
    //     isVisited[sr][sc] = true;
    //   //go right
    //   print(sr, sc+1, er, ec, s+"R",maze,isVisited);
    //    //go down
    //   print(sr+1, sc, er, ec, s+"D",maze,isVisited);
    //   //go left
    //   print(sr, sc-1, er, ec, s+"L",maze, isVisited);
    //   //go upward
    //   print(sr-1, sc, er, ec, s+"U",maze, isVisited);
    //   //backtracking
    //   isVisited[sr][sc] = false;
    //   }
        
    // public static void main(String[] args) {
    //     int rows = 4;
    //     int cols = 6;
    //     int maze[][] = {{1,0,1,1,1,1},
    //                     {1,1,1,1,0,1},
    //                     {0,1,1,1,1,1},
    //                     {0,0,1,0,1,1}};
    //     boolean[][]isVisited= new boolean[rows][cols];
    //    print(0,0,rows-1,cols-1,"",maze,isVisited);
      
    // }



    //OPTIMAL SOLUTION..........here the requirement of additionnal array is reduced 
    private static void print(int sr, int sc, int er, int ec, String s,int[][]maze) {
        if(sr>er||sc>ec) return ;
        if(sr==er && sc==ec) {
          System.out.println(s);
          return;
        }
        if(sr<0 || sc<0) return;
        if(maze[sr][sc]==0) return;
        if(maze[sr][sc] == -1) return;
        //check
        maze[sr][sc] = -1;
      //go right
      print(sr, sc+1, er, ec, s+"R",maze);
       //go down
      print(sr+1, sc, er, ec, s+"D",maze);
      //go left
      print(sr, sc-1, er, ec, s+"L",maze);
      //go upward
      print(sr-1, sc, er, ec, s+"U",maze);
      //backtracking
      maze[sr][sc] = 1;
      }
        
    public static void main(String[] args) {
        int rows = 4;
        int cols = 6;
        int maze[][] = {{1,0,1,1,1,1},
                        {1,1,1,1,0,1},
                        {0,1,1,1,1,1},
                        {0,0,1,0,1,1}};
       print(0,0,rows-1,cols-1,"",maze);
      
    }
}
