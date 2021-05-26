public class time {

    private int hour;
    private int minute;
    private int second;
    private String t;

    public time(int second) {
        this.second = second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setT(String t) {
        this.t = t;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public String getT() {
        return t;
    }

    public time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        t = this.hour + ":" + this.minute + ":" + this.second;
    }

    public String altSecond(int second, char op) {

        if (op == '+') {
            setSecond(this.second + second);
            do {
                if (getSecond() > 60) {
                    setSecond(getSecond() - 60);
                    setMinute(getMinute() + 1);
                }
                setT(getHour() + ":" + getMinute() + ":" + getSecond());
                return getT();
            } while (getSecond() >= 60);
        } else if (op == '-') {
            setSecond(this.second - second);
            do {
                if (getSecond() < 0) {
                    setSecond(60 + getSecond());
                    setMinute(getMinute() - 1);
                }
            } while (getSecond() <= 0);
            setT(getHour() + ":" + getMinute() + ":" + getSecond());
            return getT();
        } else
            return ("Operation not available");
    }

    public String addTime(time t2, time t3) {

        setHour(t2.hour + t3.hour);
        setMinute(t2.minute + t3.minute);
        setSecond(t2.second + t3.second);

        if (minute > 60) {
            do {
                setMinute(minute - 60);
                setHour(hour + 1);
            } while (getMinute() >= 60);
        }
        if (second > 60) {
            do {
                setSecond(second - 60);
                setMinute(minute + 1);
            } while (getSecond() >= 60);
        }
        setT(getHour() + ":" + getMinute() + ":" + getSecond());
        return getT();
    }

    public static boolean ctime(time ct, time t) {
        if (t.getHour() == ct.getHour() && t.getMinute() == t.getMinute() && t.getSecond() == ct.getSecond()) {
            return true;
        } else {
            return false;
        }

    }

    public boolean equals(time t) {
        if (this.hour == t.hour && this.minute == t.minute && this.second == t.second) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        time t1 = new time(8, 25, 40);
        time t2 = new time(8, 25, 20);
        time t3 = new time(8, 25, 20);
        time t4 = new time(8, 25, 25);
        System.out.println(t1.altSecond(40, '+'));
        System.out.println(t1.altSecond(100, '-'));
        System.out.println(t1.addTime(t2, t3));
        System.out.println(ctime(t2, t3));
        System.out.println(ctime(t2, t4));
        System.out.println(t2.equals(t3));
        System.out.println(t3.equals(t4));
    }
}