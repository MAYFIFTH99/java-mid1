package immutable.test;

public class ImmutableMydate {
    private int year;
    private int month;
    private int day;

    public ImmutableMydate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public ImmutableMydate setYear(int year) {
        ImmutableMydate m3 = new ImmutableMydate(year, this.month, this.day);
        return m3;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Mydate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
