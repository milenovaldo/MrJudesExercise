public class Driver{

    public static void printAll(Time time_obj) {
        System.out.println(time_obj.getHour());
        System.out.println(time_obj.getMinute());
        System.out.println(time_obj.getSecond());
        System.out.print("\n");
    }

    public static void main(String[] args) {

        Time the_time = new Time(5, 23, 2);

        printAll(the_time);

        the_time.setHour(12);
        the_time.setMinute(50);
        the_time.setSecond(32);

        printAll(the_time);

        the_time.setTime(15, 23, 2);

        printAll(the_time);

        System.out.println(the_time.toString());

        

    }
}