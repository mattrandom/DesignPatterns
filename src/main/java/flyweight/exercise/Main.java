package flyweight.exercise;

public class Main {
    public static void main(String[] args) {
        ChessPiece blackPawn = new BlackPawn("Black Pawn", "7", "a");
        ChessPiece whitePawn = new WhitePawn("White Pawn", "2", "a");
        ChessPiece blackQueen = new BlackQueen("Black Queen");
        ChessPiece whiteQueen = new WhiteQueen("White Queen");

        // exactly same color object is used
        System.out.println(blackPawn.getColor() == blackQueen.getColor()); // true
        System.out.println(whitePawn.getColor() == whiteQueen.getColor()); // true
    }
}
