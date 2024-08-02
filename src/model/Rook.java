public class Rook implements IGamePiece{

  Position posn;
  String color;
  boolean captured;

  Rook(Position posn, String color, boolean captured) {
    this.posn = posn;
    this.color = color;
    this.captured = false;
  }


  @Override
  public void move(int num0) {

  }

  @Override
  public void canMove() {

  }
}
