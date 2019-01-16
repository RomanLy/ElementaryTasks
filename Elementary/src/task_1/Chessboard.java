package task_1;

public class Chessboard {
    private int width;
    private int height;
    private char[][] array;
    private Cell cell = new Cell();

    public Chessboard(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void fill() {
        array = new char[height][width];
        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                if (i % 2 == 0){
                    array[i][j] = (j % 2 == 0) ? cell.getSecondElement() : cell.getFirstElement();
                } else {
                    array[i][j] = (j % 2 == 0) ? cell.getFirstElement() : cell.getSecondElement();
                }
            }
        }
    }

    public void print(){
        fill();
        for (int i = 0; i < height; i++){
            if (!(i == 0)){
                System.out.println();
            }
            for (int j = 0; j < width; j++){
                System.out.print(array[i][j]);
            }
        }
    }
}
