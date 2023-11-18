public class C2 {
    int hours;
    int minutes;

    C2(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public int minutes() {
        int hMins = hours > 0 ? hours * 60 : 0;
        return hMins + minutes;
    }

    @Override
    public String toString() {
        String hh = hours < 10 ? "0"+hours : "" + hours;
        String mm = minutes < 10 ? "0"+minutes : "" + minutes;
        return hh+":"+mm;
    }

    public static void main(String[] args) {
        C2 o = new C2(10, 10);
        System.out.println(o.minutes());
        System.out.println(o.toString());
    }
}
