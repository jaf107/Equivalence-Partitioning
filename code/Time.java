package code;

public class Time {
    int second;
    int minute;
    int hour;

    public Time(int hour, int minute, int second) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    boolean validTime(){
        if(validSecond() && validMinute() && validHour())
            return true;
        return false;
    }

    private boolean validHour() {
        if(hour>0 && hour <24 )
            return true;
        return false;
    }

    private boolean validMinute() {
        if(minute >= 0 && minute < 60 )
            return true;
        return false;
    }

    private boolean validSecond() {
        if(second >= 0 && second < 60 )
            return true;
        return false;
    }

    public String getTimeString(){
        String time = "";
        if(validTime()){
            time = hour + ":" + minute + ":"+ second;
        }else {
            time = "Invalid time";
        }

        return time;
    }
}