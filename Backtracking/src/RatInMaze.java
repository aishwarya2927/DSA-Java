public class RatInMaze {
    public static int pathCount(int row, int col){
        if(row==1 || col == 1){
            return 1;
        }
      int p1 = pathCount(row-1,col);
        int p2 = pathCount(row, col-1);

        return p1+p2;
    }

    public static void printnPath(String p, int row, int col){
        if(row == 1 && col ==1){
            System.out.println(p);
            return ;
        }
        if(row > 1){
         printnPath(p + 'D', row-1,col);
        }
        if(col > 1){
          printnPath(p+'R',row,col-1);
        }
    }

    public static void printnPathDiagonal(String k, int row, int col){
        if(row == 1 && col == 1){
            System.out.println(k);
            return ;
        }
        if(row>1 && col>1){
            printnPathDiagonal(k+'D',row-1,col-1);
        }
        if(row > 1){
            printnPathDiagonal(k + 'V', row-1,col);
        }

        if(col > 1){
            printnPathDiagonal(k+'H',row,col-1);
        }
    }

    public static void printnPathObstacle(String p,int[][] maze, int row, int col){
        if(row == maze.length-1 && col ==maze[0].length-1){
            System.out.println(p);
            return ;
        }
        if(maze[row][col] == 0){
            return;
        }
        if(row < maze.length-1){
            printnPathObstacle(p + 'D',maze, row+1,col);
        }
        if(col < maze[0].length-1){
            printnPathObstacle(p+'R',maze,row,col+1);
        }
    }
    public static void main(String[] args) {
      int paths =  pathCount(3,3);
        System.out.println();
        System.out.println("No of paths:");
        System.out.println(paths);
        System.out.println();
        System.out.println("Path directions");
        printnPath("",3,3);
        System.out.println();
        System.out.println("Path direction including diagonal");
        printnPathDiagonal("",3,3);
        System.out.println();
        System.out.println("Path with Obstacles");

        int[][] board = {
                {1,1,1},
                {1,0,1},
                {1,1,1},

        };
        printnPathObstacle("",board,0,0);
     }
}
