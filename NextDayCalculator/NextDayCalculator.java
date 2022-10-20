package Lesson09.NextDayCalculator;
import java.util.Date;

public class NextDayCalculator {
    public static Date getNextDay(Date toDay){
        if(isNgayCuoiNam(toDay)){
            return new Date(toDay.getYear() + 1,1,1);
        } else if(isNgayCuoiThang(toDay)){
            return new Date(toDay.getYear(),toDay.getMonth()+1,1);
        } else {
            return new Date(toDay.getYear(), toDay.getMonth(), toDay.getDate()+1);
        }
    }
    public static boolean isNgayCuoiNam(Date toDay){
        if(toDay.getDay() == 31 && toDay.getMonth() == 12){
            return true;
        }
        return false;
    }
    public static boolean isNgayCuoiThang(Date toDay){
        int month = toDay.getMonth();
        int date = toDay.getDate();
        if (month == 4||month == 6||month == 9||month == 11){
            if (date == 30) return true;
        }
        if (month == 1||month == 3||month == 5||month == 7||month == 8||month == 10||month == 12){
            if (date == 31) return true;
        }
        if(month == 2){
            if (isNamNhuan(toDay)) {
                if(date == 29){
                    return true;
                }
            } else if (date == 28) {
                return true;
            }
        }
        return false;
    }
    public static boolean isNamNhuan(Date toDay){
        if(toDay.getYear()%400 == 0 || (toDay.getYear()%4 == 0 && toDay.getYear()%100 != 0)){
            return true;
        }
        return false;
    }

}
