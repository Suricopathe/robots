import java.util.Random;

public class Map {
    int width;
    int height;

    int[][] board;

    public Map(int width, int height) {
        this.width = width;
        this.height = height;

        this.board = new int [height][width];
    }

    public String printMap() {
        StringBuilder sb = new StringBuilder("");
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                sb.append("[" + this.board[y][x] + "] ");
            }
            sb.append('\n');
        }
        return sb.toString();
    }

    public void fillBoard(int maxOre) {
        Random random = new Random();
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                this.board[y][x] = random.nextInt(maxOre + 1);
            }
        }
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

    public int[][] getBoard() {
        return board;
    }

    public void setBoard(int[][] board) {
        this.board = board;
    }
}
