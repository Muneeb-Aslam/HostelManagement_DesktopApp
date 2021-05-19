public class date {
    int day;
    int month;
    int year;

    public date(int day, int month, int year) {
        this.year = year;
        this.day = checkDay(day);
        this.month = checkMonth(month);

    }

    public int checkMonth(int month) {
        if (month <= 12 && month >= 1)
            return month;
        else {
            System.out.println("In-Valid month");
            return 0;
        }

    }

    public int checkDay(int day) {
        if (day <= 31 && day >= 1)
            return day;
        else {
            System.out.println("In-Valid day");
            return 0;
        }

    }

    public String toString() {
        return day + "/" + month + "/" + year;

    }
}
