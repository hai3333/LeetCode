package 数组;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class test9 {
    public boolean isValidSudoku(char[][] board) {
        Map map = new HashMap();
        boolean result;
        for (int k = 0; k < 9; k += 3) {
         map.clear();
            for (int i = k; i < k + 3; i++) {
                for (int j = k; j < k + 3; j++) {

                    if (!".".equals(board[i][j])) {
                        if (map.putIfAbsent(board[i][j], "sb")!=null) {
                           // map.put(board[i][j], "sb");
                            continue;
                        } else {
                            return false;
                        }
                    }

                }

            }

        }
        return true;

    }


    @Test
    public void t() {
        char[][] b = new char[9][9];


    }
}
