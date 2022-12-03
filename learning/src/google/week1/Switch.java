package google.week1;

public class Switch {

    /* Java switch can use the following data types:
    *
    *  byte, short, char, int, String, or enum's
    *
    * */
    public enum WeekDays {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
    }


    public static void main(String[] args) {
        System.out.print(dayIs(WeekDays.THURSDAY));

    }

    static WeekDays dayIs(WeekDays day) {
        WeekDays aDay = null;
        switch(day) {
            case MONDAY: aDay = day;
                    break;
            case TUESDAY: aDay = day;
                    break;
            case WEDNESDAY: aDay = day;
                    break;
            case THURSDAY:
            case FRIDAY:
                    System.out.print("multiple cases!\n");
                    aDay = day;
                    break;
            default:
                    break;
        }
        return aDay;
    }
}
