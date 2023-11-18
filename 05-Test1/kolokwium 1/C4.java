public class C4 {
    int hour, minute;

    C4(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public void add() {
        minute++;
        if (minute > 59) {
            minute = 0;
            hour++;
        }
        if (hour > 23) {
            hour = 0;
        }
    }

    public static void main(String[] args) {
        C4 c = new C4(23, 58);
        c.add();
        System.out.println(c.getHour());
        System.out.println(c.getMinute());
        c.add();
        c.add();
        System.out.println(c.getHour());
        System.out.println(c.getMinute());

    }
}
