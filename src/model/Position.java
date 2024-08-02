public class Position {

  char column;
  int row;

  Position(char column, int row) {

    column = Character.toLowerCase(column);

    if (column < 'a' || column > 'h') {
      throw new IllegalArgumentException("Please enter a valid column.");
    }

    if (row < 1 || row > 8) {
      throw new IllegalArgumentException("Please enter a valid row.");
    }
  }
}
