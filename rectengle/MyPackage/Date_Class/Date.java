public class Date{
    private
        int day;
        int month;
        int year;

    public Date(int day, int month, int year){
            this.day = day;
            this.month = month;
            this.year = year;
        }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString(){
        String string_day = String.valueOf(this.day);
        String string_month = String.valueOf(this.month);
        String string_year = String.valueOf(this.year);

        if (this.day < 10) {
            string_day = "0" + string_day;
        }else if (this.month < 10) {
            string_month = "0" + string_month;
        }else if (this.year < 10) {
            string_year = "0" + string_year;
        }

        return "\"" + string_day + "/" + string_month + "/" + string_year + "\"";
    }
}