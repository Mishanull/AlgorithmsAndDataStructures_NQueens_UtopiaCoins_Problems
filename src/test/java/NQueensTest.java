import org.example.NQueens;
import org.junit.Assert;
import org.junit.Test;

public class NQueensTest {
    @Test
    public void assertWhenZero(){
        boolean[][] board= new boolean[0][0];
        Assert.assertFalse(NQueens.solve(board,0));
    }
    @Test
    public void assertBoundaryMinusOne(){
        boolean[][] board= new boolean[2][2];
        boolean[][] temp={{false, false},
                          {false, false},
                          };
        Assert.assertFalse(NQueens.solve(board,0));
        NQueens.printBooleanMatrix(board);
        Assert.assertEquals(temp,board);
    }
    @Test
    public void assertWhenThree(){
        boolean[][] board= new boolean[3][3];
        Assert.assertFalse(NQueens.solve(board,0));
    }
    @Test
    public void assertBoundaryPlusOne(){
        boolean[][] board= new boolean[4][4];
        boolean[][] temp={{false, false, true, false},
                          {true, false, false, false},
                          {false, false, false, true},
                          {false, true, false, false}};
        Assert.assertTrue(NQueens.solve(board,0));
        NQueens.printBooleanMatrix(board);
        Assert.assertEquals(temp,board);
    }
    @Test
    public void assertWhenGreaterThanThree(){
        boolean[][] board=new boolean[6][6];
        boolean[][] temp={{false, false, false, true, false, false },
                          {true, false, false, false, false, false},
                          {false, false, false, false, true, false},
                          {false, true, false, false, false, false},
                          {false, false, false, false, false, true},
                          {false, false, true, false, false, false}};
        Assert.assertTrue(NQueens.solve(board, 0));
        NQueens.printBooleanMatrix(board);
        Assert.assertEquals(temp,board);
    }
    @Test
    public void assertWhenVeryLarge(){
        boolean[][] board=new boolean[28][28];

        Assert.assertTrue(NQueens.solve(board, 0));
        NQueens.printBooleanMatrix(board);

    }

}
