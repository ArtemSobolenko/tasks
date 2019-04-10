package tasks.task1.entity;

public class ChessDesk {

    private int width;
    private int height;
    private String chessDesk;

    public ChessDesk(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public String getChessDesk() {
        return chessDesk;
    }

    public void setChessDesk(String chessDesk) {
        this.chessDesk = chessDesk;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}
