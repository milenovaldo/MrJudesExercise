public class Time{
    private
        int hour;
        int minute;
        int second;

    public
        Time(int hour, int minute, int second){
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }

        int getHour(){
            return this.hour;
        }

        int getMinute(){
            return this.minute;
        }

        int getSecond(){
            return this.second;
        }

        void setHour(int hour){
            this.hour = hour;
        }

        void setMinute(int minute){
            this.minute = minute;
        }

        void setSecond(int second){
            this.second = second;
        }

        void setTime(int hour, int minute, int second){
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }

    @Override
    public String toString(){
        String string_hour = String.valueOf(this.hour);
        String string_minute = String.valueOf(this.minute);
        String string_second = String.valueOf(this.second);

        if(this.hour < 10){
            string_hour = "0" + this.hour;
        }else if (this.minute < 10) {
            string_minute = "0" + this.minute;
        }else if (this.second < 10) {
            string_second = "0" + this.second;
        }

        return "\"" + string_hour + ":" + string_minute + ":" + string_second + "\"";
    }

}