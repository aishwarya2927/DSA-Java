import java.util.Arrays;


//We are printing the matrix for each path, through which you can
//reach up to the destination.
public class printPathMatrix {


//    Backtracking
//    The problem is , You have given a 2D array i.e. a matrix of size m*n
//    and the rat is at (0,0) and he wants to go to the end of the matrix
//    i.e., (m-1,n-1)
//    It can move in any direction L, R, U, D
//    you have to return total number of possible paths through which he can reach to the
//    destination

    public static void printAllPath(String p,int[][] maze, int row, int col,int path[][],int step ){
//       base condition
        if(row == maze.length-1 && col == maze[0].length-1){

           path[row][col] = step;    //  the last index
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }

            System.out.println(p);   //path
            System.out.println();
            return ;
        }
//        if there is wall/obstacle in a perticular index
        if(maze[row][col] == 0){
            return;
        }
//    We are considering this block in my path
        maze[row][col] = 0;
        path[row][col] = step;

        if(row < maze.length-1){
            printAllPath(p + 'D',maze, row+1,col, path,step+1);

        }
        if(col < maze[0].length-1){
            printAllPath(p+'R',maze,row,col+1,path,step+1);
        }
        if(row > 0){
            printAllPath(p+'U',maze,row-1,col,path,step+1);
        }
        if(col > 0){
            printAllPath(p+'L',maze,row,col-1,path,step+1);
        }

//      This line is where the function will be over
//         so before this function gets removed, also the changes that were made
//        by that function should be removed
//        and this is the backtracking

        maze[row][col] = 1;
        path[row][col] = 0;
    }
    public static void main(String[] args) {
        int[][] board = {
                {1,1,1},
                {1,1,1},
                {1,1,1},
        };
        int path[][] = new int[board.length][board[0].length];
        printAllPath("",board,0,0,path,1);
    }
}
