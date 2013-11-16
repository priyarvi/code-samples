package com.examples;

public class TicTacToe {

    // this member variable is a 2D array of chars, this is the playing field
    private char[][] grid = {{'.','.','.'},
                            {'.','.','.'},
                            {'.','.','.'}};

    public static void main(String[] args) {
        // creates the object "myGame" which is of class "tictactoe"
    	TicTacToe myGame = new TicTacToe();

        // it would be trivial to prompt the user for input, but
        //   to save time we will simply simulate a game...
        if(myGame.play('X',0,0) != '.') return;
        if(myGame.play('O',1,1) != '.') return;
        if(myGame.play('X',2,0) != '.') return;
        if(myGame.play('O',1,2) != '.') return;
        if(myGame.play('X',1,0) != '.') return;

        // should not get here.
    }

    // this method executes one play
    public char play(char mark, int x, int y) {
        grid[x][y] = mark;
        print();
        // grid has changed, so we need to check to see if the game should end
        char winner = checkWin();
        if(winner != '.') {
            System.out.println(grid[x][y]+" has won!");
        }
        return(winner);
    }

    // this method checks for a winning condition
    private char checkWin() {
        // check all rows
        for(int x=0; x<3; x++) {
            if( (grid[x][1]==grid[x][0]) && (grid[x][1]==grid[x][2]) ) {
                return(grid[x][1]);
            }
        }

        // check all columns
        for(int y=0; y<3; y++) {
            if( (grid[1][y]==grid[0][y]) && (grid[1][y]==grid[2][y]) ) {
                return(grid[1][y]);
            }
        }

        // check both diagonals
        if( (grid[1][1]==grid[0][0]) && (grid[1][1]==grid[2][2]) ||
            (grid[1][1]==grid[0][2]) && (grid[1][1]==grid[2][0]) ) {
            return(grid[1][1]);
        }

        // if there's no winner, just return the marker of an empty space
        return('.');
    }

    // this method prints out the board
    public void print() {
        for(int x=0; x<3; x++) {
            for(int y=0; y<3; y++) {
                System.out.print(grid[x][y]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}