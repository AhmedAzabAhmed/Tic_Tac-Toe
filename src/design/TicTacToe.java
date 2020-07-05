/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design;

/**
 *
 * @author AyaFathy
 */
public class TicTacToe {
  
    String [][] matrix;
  
    /** Initialize your data structure here.
     * @param n */
    public TicTacToe(int n) {
        matrix = new String [n][n];
    }
  
    /** Player {player} makes a move at ({row}, {col}).
        @param row The row of the board.
        @param col The column of the board.
        @param player The player, can be either 1 or 2.
        @return The current winning condition, can be either:
                0: No one wins.
                1: Player 1 wins.
                2: Player 2 wins. */
    public String check(String player,int row, int col) {
        matrix[row][col]= player;
  
        //check row
        boolean win=true;
        for(int i=0; i<matrix.length; i++){
            if(matrix[row][i]!=player){
                win=false;
                break;
            }
        }
  
        if(win) return player;
  
        //check column
        win=true;
        for (String[] matrix1 : matrix) {
            if (matrix1[col] != player) {
                win=false;
                break;
            }
        }
  
        if(win) return player;
  
        //check back diagonal
        win=true;
        for(int i=0; i<matrix.length; i++){
            if(matrix[i][i]!=player){
                win=false;
                break;
            }
        }
  
        if(win) return player;
  
        //check forward diagonal
        win=true;
        for(int i=0; i<matrix.length; i++){
            if(matrix[i][matrix.length-i-1]!=player){
                win=false;
                break;
            }
        }
  
        if(win) return player;
  
        return "none";
    }

       public static void main(String[] args) {
      // Run GUI codes in the Event-Dispatching thread for thread safety
          new TicTacToe(3); // Let the constructor do the job
   }

}
