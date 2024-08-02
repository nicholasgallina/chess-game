public class Tile {

  //should make this an enum eventually
  String color;
  boolean isOccupied;
  IGamePiece occupiedBy;
  Position posn;

  Tile(Position posn, String color, boolean isOccupied, IGamePiece occupiedBy) {
    this.posn = posn;
    this.color = color;
    this.isOccupied = isOccupied;
    this.occupiedBy = occupiedBy;
  }

  Tile(String color, boolean isOccupied) {
    this.color = color;
    this.isOccupied = isOccupied;
  }

}
