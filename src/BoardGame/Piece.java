package BoardGame;

public class Piece {
    protected Position pos;
    protected Board board;

    public Piece(Board board) {
        this.board = board;
        pos = null;
    }

    protected Board getBoard() {
        return board;
    }
}
