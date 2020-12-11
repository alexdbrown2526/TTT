package com.mycompany.tictactoe;

import java.util.*;

public class App {
    public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
        char[][] board = 
        {
            {'1',  '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'}
        };
        
        boolean gameOver = false;

        System.out.println("Player 1 will be X and player 2 will be O");
           while(gameOver != true) { 
            System.out.println("Player 1 or 2?");
            
            int selectedPlayer = input.nextInt();
            printBoard(board);
            if (selectedPlayer == 1){
                System.out.println("Please select an open number");
                int userXmove = input.nextInt();
            
            switch(userXmove) {
                case 1: board[0][0] = 'x';
                break;
                case 2: board[0][1] = 'x';
                break;
                case 3: board[0][2] = 'x';
                break;
                case 4: board[1][0] = 'x';
                break;
                case 5: board[1][1] = 'x';
                break;
                case 6: board[1][2] = 'x';
                break;
                case 7: board[2][0] = 'x';
                break;
                case 8: board[2][1] = 'x';
                break;
                case 9: board[2][2] = 'x';
                break;
            }   
                printBoard(board);
                 if(isWinner(board)){
                     gameOver = true;
                 }

        }  else if (selectedPlayer == 2){
                System.out.println("Please select an open number");
                int userOmove = input.nextInt();

            switch(userOmove) {
                case 1: board[0][0] = 'o';
                break;
                case 2: board[0][1] = 'o';
                break;
                case 3: board[0][2] = 'o';
                break;
                case 4: board[1][0] = 'o';
                break;
                case 5: board[1][1] = 'o';
                break;
                case 6: board[1][2] = 'o';
                break;
                case 7: board[2][0] = 'o';
                break;
                case 8: board[2][1] = 'o';
                break;
                case 9: board[2][2] = 'o';
                break;
            }
            printBoard(board);
            if(isWinner(board)){
                gameOver = true;
            }    
        }  
    }          
}

      public static void printBoard(char[][] board) {
        for (char[] row: board) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
            System.out.println("---");
        }
      }
         
      public static boolean isWinner (char[][] board){
          boolean win = false;
          boolean horizontalWin = false;
          boolean verticalWin = false;
          boolean diagonalWin = false;
          
          
          if (board[0][0] == board[0][1] && board[0][2] == 'x' || board[0][0] == board[0][1] && board[0][2] == 'o') {
              System.out.println("Horizontal TTT");
              horizontalWin = true;
          } 
          
          else if (board[0][0] == board[1][1] && board[2][2] == 'x' || board[0][0] == board[1][1] && board[2][2] == 'o') {
              System.out.println("Diagonal TTT");
              diagonalWin = true;
          } 
          
          else if(board[0][1] == board[1][1] && board[2][1] == 'x' || board[0][1] == board[1][1] && board[2][1] == 'o') {
              System.out.println("Vertical TTT");
              verticalWin = true;
          }
          
          else if(board[2][0] == board[1][1] && board[0][2] == 'x'|| board[2][0] == board[1][1] && board[0][2] == 'o') {
              System.out.println("Diagonal TTT");
              diagonalWin = true;
          }
          
          else if(board[1][0] == board[1][1] && board[1][2] == 'x' || board[1][0] == board[1][1] && board[1][2] == 'o') {
                System.out.println("Horizontal TTT");
                horizontalWin = true;
          }
          
          else if(board[2][0] == board[2][1] && board[2][2] == 'x' || board[2][0] == board[2][1] && board[2][2] == 'o') {
              System.out.println("Horizontal TTT");
              horizontalWin = true;
          }
          
          else if(board[0][2] == board[1][2] && board[2][2] == 'x' || board[0][2] == board[1][2] && board[2][2] == 'o') {
              System.out.print("Vertical TTT");
              verticalWin = true;
          }
          
          else if(board[0][0] == board[1][0] && board[2][0] == 'x' || board[0][0] == board[1][0] && board[2][0] == 'o') {
               System.out.println("Vertical TTT");
               verticalWin = true;
          }
                if (horizontalWin == true || verticalWin == true || diagonalWin== true) {
                    win = true;
                }
                return win;
      }  
}         
      
 
 


