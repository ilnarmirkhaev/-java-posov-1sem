public class ExperimentsWithDrawing {
    public static void main(String[] args) {
        Drawing d = new Drawing(7, 4, '.');
        d.print();
        System.out.println("----------");
        d.setPoint(4, 2, '*');
        d.print();
        System.out.println("----------");
        d.drawVerticalLine(6, 1, 3, '#');
        d.print();
        System.out.println("----------");
        d.drawHorizontalLine(1, 3, 6, '@');
        d.print();
        System.out.println("----------");
        d.drawRectangle(0, 1, 2, 3, '$');
        d.print();
    }
}
