/**
 * Implements a 2-D array of characters
 */

public class CharMatrix
{
  // Fields:
  private char[][] gameBoard;

  /**
   * Constructor: creates a grid with dimensions rows, cols,
   * and fills it with spaces
   */
  public CharMatrix(int rows, int cols)
  {
   gameBoard = new char [rows][cols];
   for (int r = 0; r < rows; r++)
   {
      for (int c = 0; c < cols; c++)
      {
         gameBoard[r][c]= ' ';
      }
   }
  }

  /**
   * Constructor: creates a grid with dimensions rows , cols ,
   * and fills it with the fill character
   */
  public CharMatrix(int rows, int cols, char fill)
  {
    gameBoard = new char [rows][cols];
   for (int r = 0; r < rows; r++)
   {
      for (int c = 0; c < cols; c++)
      {
         gameBoard[r][c]= fill;
      }
   }

  }

  /**
   * Returns the number of rows in grid
   */
  public int numRows()
  {
    return gameBoard.length;
  }

  /**
   * Returns the number of columns in grid
   */
  public int numCols()
  {
    return gameBoard[0].length;
  }

  /**
   * Returns the character at row, col location
   */
  public char charAt(int row, int col)
  {
    
  }

  /**
   * Sets the character at row, col location to ch
   */
  public void setCharAt(int row, int col, char ch)
  {
    ________________________________________________
    ...
  }

  /**
   * Returns true if the character at row, col is a SPACE,
   * false otherwise
   */
  public boolean isEmpty(int row, int col)
  {
    ________________________________________________
    ...
  }

  /**
   * Fills the given rectangle with the fill characters.
   * row0, col0 is the upper left corner and row1, col1 is the
   * lower right corner of the rectangle.
   */
  public void fillRect(int row0, int col0, int row1, int col1, char fill)
  {
    for (r = row0; r <= row1; r++)
    {
      for (int c = col0; c <= col1; c++)
      {
         gameBoard[r][c] = fill;
      }
    }
  }

  /**
   * Fills the given rectangle with the SPACE characters.
   * row0, col0 is the upper left corner and row1, col1 is the
   * lower right corner of the rectangle.
   */
  public void clearRect(int row0, int col0, int row1, int col1)
  {
    ________________________________________________
    ...
  }

  /**
   * Returns the count of all non-SPACE characters in row.
   */
  public int countInRow(int row)
  {
    ________________________________________________
    ...
  }

  /**
   * Returns the count of all non-SPACE characters in col.
   */
  public int countInCol(int col)
  {
    ________________________________________________
    ...
  }
}
