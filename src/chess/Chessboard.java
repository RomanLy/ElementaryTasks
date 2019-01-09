package chess;

public class Chessboard {
    private int width;
    private int height;
    private char[][] array;
    private char firstElement = ' ';
    private char secondElement = '*';

    public Chessboard(int width, int height) {
        this.width = width;
        this.height = height;
        array = new char[height][width];
        fill();
    }

    public void fill() {
        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                if (i % 2 == 0){
                    array[i][j] = (j % 2 == 0) ? secondElement : firstElement;
                } else {
                    array[i][j] = (j % 2 == 0) ? firstElement : secondElement;
                }
            }
        }
    }

    public void print(){
        for (int i = 0; i < height; i++){
            System.out.println();
            for (int j = 0; j < width; j++){
                System.out.print(array[i][j]);
            }
        }
    }
}
