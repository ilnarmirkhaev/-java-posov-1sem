public class ExperimentsWithDrawing {
    public static void main(String[] args) {
        Drawing d1 = new Drawing(8, 8, '_');
        d1.print();
        System.out.println("---------------");
        d1.setPoint(4, 2, '*');
        d1.print();
        System.out.println("---------------");
        d1.drawVerticalLine(6, 1, 3, '#');
        d1.print();
        System.out.println("---------------");
        d1.drawHorizontalLine(1, 3, 6, '@');
        d1.print();
        System.out.println("---------------");
        d1.drawRectangle(1, 4, 5, 6, '$', true);
        d1.print();
        System.out.println("---------------");
        d1.drawRectangle(0, 2, 4, 7, '?', false);
        d1.print();
        System.out.println("---------------");

        Drawing d2 = new Drawing(21, 21, '.');
        d2.drawCircle(10, 10, 9.5, '*');
        d2.print();
        System.out.println("---------------");
        d2.drawCircle(6, 7, 2.5, ' ');
        d2.drawCircle(14, 7, 2.5, ' ');
        d2.drawCircle(6, 7, 0, '#');
        d2.drawCircle(14, 7, 0, '#');
        d2.print();
        System.out.println("---------------");
        d2.draw(5, 5, d1);
        d2.print();
        System.out.println("---------------");
        d2.draw(15, 15, d1);
        d2.print();

        System.out.println("---------------");
        Drawing house = new Drawing(40, 40, '.');
        house.print();
    }
}
