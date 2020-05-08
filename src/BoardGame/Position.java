package BoardGame;

public class Position {

    private int row;
    private int coluns;

    public Position(int row, int coluns) {
        this.row = row;
        this.coluns = coluns;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColuns() {
        return coluns;
    }

    public void setColuns(int coluns) {
        this.coluns = coluns;
    }

    @Override
    public String toString() {
        return "Position{" +
                "row=" + row +
                ", coluns=" + coluns +
                '}';
    }
}
