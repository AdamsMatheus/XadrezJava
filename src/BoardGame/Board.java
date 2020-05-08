package BoardGame;

public class Board {
    private int rows;
    private int columns;
    private Piece [][] pieces;

    public Board (int rows, int columns){
        if(rows < 1 || columns < 1){
           throw new BoardException("Error ao criar o tabuleiro");
        }

        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }
    public Piece piece (int row, int columns){

        return pieces[row][columns];
    }
    public Piece piece (Position position){
        if(!PositionExists(rows,columns)){
            throw new BoardException("Position not");
        }
        return pieces[position.getRow()][position.getColuns()];
    }
    public void PlacePiece(Piece piece, Position position)
    {

        pieces[position.getRow()][position.getColuns()] = piece;
        piece.pos = position;
    }
    private boolean PositionExists(int row, int column){
        return row >= 0 && row < row && column >= 0 && column < columns;
    }
    public boolean PositionExists(Position position){
        return PositionExists(position.getRow(), position.getColuns());
    }
    public boolean thereIsAPiece(Position position){

       return piece(position) != null;
    }


}
