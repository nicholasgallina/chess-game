public class Pawn implements IGamePiece{

  Position posn;
  String color;
  boolean captured;



  Pawn(Position posn, String color, boolean captured) {
    this.posn = posn;
    this.color = color;
    this.captured = false;
  }

  public void move(int numO) {
    return;
  }

  public void canMove() {
    return;
  }


}
