package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    private String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
       return board[value];
    }

    public String[] getColumn(Integer value) {
        String item = "";
        ArrayList<String> list = new ArrayList<>();
        for (String[] strings : board) {
            item = strings[value];
            list.add(item);
        }
        return list.toArray(new String[0]);
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        boolean flag = false;

        if ( board != null && board.length >= 0 )
        {
            if ( board[rowIndex] != null )
            {
                flag = true;
            }
        }
        return flag;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        for (int row=0; row < board[columnIndex].length; row++) {
            if(board[row][columnIndex] == null){
                return false;
            }
        }
        return true;
    }
    public String getWinner() {
        return null;
    }

    public String[][] getBoard() {
        return this.board;
    }
}
