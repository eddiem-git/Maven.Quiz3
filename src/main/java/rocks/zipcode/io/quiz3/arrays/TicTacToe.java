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
        for (int i = 0; i < board.length; i++) {
            item = board[i][value];
            list.add(item);
        }
        return list.toArray(new String[0]);
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        return null;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        return null;
    }

    public String getWinner() {
        return null;
    }

    public String[][] getBoard() {
        return null;
    }
}
