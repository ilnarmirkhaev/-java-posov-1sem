public class Drawing {
    // NON-STATIC
    // private fields
    private char[][] d;
    private int w;  //width
    private int h;  //height
    private char c;

    // public constructors
    public Drawing(int w, int h, char c) {
        this.w = w;
        this.h = h;
        this.c = c;
        this.d = new char[w][h];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++)
                this.d[j][i] = c;
        }
    }

    // public methods
    public void print() {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++)
                System.out.print(d[j][i]);
            System.out.println();
        }
    }

    public void setPoint(int x, int y, char c) {
        if (x >= 0 && x < w && y >= 0 && y < h)
           d[x][y] = c;
        else
            System.out.println("Введите корректные координаты.");
    }

    public void drawVerticalLine(int column, int row1, int row2, char c) {
        if (column >= 0 && column < w && row1 >= 0 && row1 < h && row2 >= 0 && row2 < h) {
            int a = Math.min(row1, row2);
            int b = Math.max(row1, row2);
            for (int i = a; i <= b; i++)
                d[column][i] = c;
        }
        else
            System.out.println("Введите корректные координаты.");
    }

    public void drawHorizontalLine(int row, int column1, int column2, char c) {
        if (row >= 0 && row < h && column1 >= 0 && column1 < w && column2 >= 0 && column2 < w) {
            int a = Math.min(column1, column2);
            int b = Math.max(column1, column2);
            for (int i = a; i <= b; i++)
                d[i][row] = c;
        }
        else
            System.out.println("Введите корректные координаты.");
    }

    public void drawRectangle(int column1, int row1, int column2, int row2, char c) {
        drawHorizontalLine(row1, column1, column2, c);
        drawHorizontalLine(row2, column1, column2, c);
        drawVerticalLine(column1, row1, row2, c);
        drawVerticalLine(column2, row1, row2, c);
    }
}
