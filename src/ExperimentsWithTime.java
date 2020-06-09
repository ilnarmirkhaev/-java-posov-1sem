public class ExperimentsWithTime {
    public static void main(String[] args) {
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {
                Time t = new Time(i, j);
                System.out.println(t.show());

                System.out.println(t.isMorning());
                System.out.println(t.isDay());
                System.out.println(t.isEvening());
                System.out.println(t.isNight());

                System.out.println(t.sayHello());
                System.out.println("--------------------");
            }
        }

        Time t1 = new Time(11, 12);
        System.out.println(t1.show());

        System.out.println(t1.isMorning());
        System.out.println(t1.isDay());
        System.out.println(t1.isEvening());
        System.out.println(t1.isNight());

        t1.add(123);
        System.out.println(t1.show());
        System.out.println(t1.isMorning());
        System.out.println(t1.isDay());
        System.out.println(t1.isEvening());
        System.out.println(t1.isNight());

        System.out.println("--------------------");

        Time t2 = new Time(22, 58);
        System.out.println(t2.show());

        System.out.println(t2.isMorning());
        System.out.println(t2.isDay());
        System.out.println(t2.isEvening());
        System.out.println(t2.isNight());

        t2.add(3);
        System.out.println(t2.show());
        t2.add(74);
        System.out.println(t2.show());
        System.out.println(t2.isMorning());
        System.out.println(t2.isDay());
        System.out.println(t2.isEvening());
        System.out.println(t2.isNight());

        System.out.println("--------------------");

        Time t3 = new Time(37, 22);
        System.out.println(t3.show());

        System.out.println(t3.isMorning());
        System.out.println(t3.isDay());
        System.out.println(t3.isEvening());
        System.out.println(t3.isNight());
        System.out.println(t3.sayHello());

        t3.add(0); // add в данном случае "чинит" неправильный формат времени
        System.out.println(t3.show());
        System.out.println(t3.isMorning());
        System.out.println(t3.isDay());
        System.out.println(t3.isEvening());
        System.out.println(t3.isNight());
        System.out.println(t3.sayHello());
    }
}
