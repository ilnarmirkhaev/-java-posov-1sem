public class Time {
    int hour;
    int minute;

    Time(int hour, int minute) {
        System.out.println("Время установлено.");
        this.hour = hour;
        this.minute = minute;
        if (hour > 23 || hour < 0 || minute > 59 || minute < 0)
            System.out.println("Введен неправильный формат времени.");
    }

    String show() {
        String hOut = "%d";
        String mOut = "%d";
        if (hour < 10)
            hOut = "0%d";
        if (minute < 10)
            mOut = "0%d";
        String result = "Сейчас " + hOut + ":" + mOut;
        return String.format(result, hour, minute);
    }

    boolean isMorning() {
        if (hour >= 6 && hour < 12)
            return true;
        return false;
    }

    boolean isDay() {
        if (hour >= 12 && hour < 18)
            return true;
        return false;
    }

    boolean isEvening() {
        if (hour >= 18 && hour < 24)
            return true;
        return false;
    }

    boolean isNight() {
        if (hour >= 0 && hour < 6)
            return true;
        return false;
    }

    String sayHello() {
        if (isDay())
            return "Добрый день!";
        else if (isMorning())
            return "Доброе утро!";
        else if (isEvening())
            return "Добрый вечер!";
        else if (isNight())
            return "Доброй ночи!";
        return "Доброе время суток!"; // надо всё-таки быть вежливым
    }

    void add(int additionalMinutes) {
        hour = (hour * 60 + minute + additionalMinutes) / 60 % 24;
        minute = (minute + additionalMinutes) % 60;
        System.out.println("Время изменено.");
    }
}
