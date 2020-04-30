public class Driver{
    
    public static void printAll(Date date_obj) {
        System.out.println(date_obj.getDay());
        System.out.println(date_obj.getMonth());
        System.out.println(date_obj.getYear());
        System.out.print("\n");
    }
    
    public static void main(String[] args) {
        Date d1 = new Date(22, 2, 2000);

        printAll(d1);

        d1.setDay(2);
        d1.setMonth(3);
        d1.setYear(1997);

        printAll(d1);

        System.out.println(d1.toString());
        
    }
}