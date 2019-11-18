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
        //make a list
        ArrayList<String> list = new ArrayList<>();
        //add items from columns to list and check its evaluation
        for (String[] strings : board) {
            item = strings[value];
            list.add(item);
        }
        return list.toArray(new String[0]);
    }

    public Boolean isRowHomogeneous(Integer rowIndex) {
        for (int row=0; row < board[rowIndex].length; row++) {
            if(board[row][rowIndex] == null){
                return false;
            }
        }
        return true;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        for (int col=0; col < board[columnIndex].length; col++) {
            if(board[col][columnIndex] == null){
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
