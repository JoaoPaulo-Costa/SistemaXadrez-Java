package boardgame;

public class Piece {

    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        //position = null; //java por padrão já faz isso
    }

    protected Board getBoard() {
        return board;
    }

}
