package code;

public class Calender {
    private int day;
    private String month;
    private int monthNo;
    private int year;

    public Calender(int day, String month, int year) {
        this.day = day;
        this.month = month.toLowerCase();
        this.year = year;
        validDate();
    }

    boolean validDate(){
        if(validDay() && validMonth() && validYear()) {
//            System.out.println(validDay());
//            System.out.println(validMonth());
//            System.out.println(validYear());
            return true;
        }
        return false;
    }

    private boolean validYear() {
        if(this.year > 1980 && year < 2022){
            return true;
        }
        return false;
    }

    private boolean validMonth() {
        if(month.toLowerCase() == "jan" || month.toLowerCase() == "january"
            || month.toLowerCase() == "feb" || month.toLowerCase() == "february"
            || month.toLowerCase() == "mar" || month.toLowerCase() == "march"
            || month.toLowerCase() == "apr" || month.toLowerCase() == "april"
            || month.toLowerCase() == "may"
            || month.toLowerCase() == "jun" || month.toLowerCase() == "june"
            || month.toLowerCase() == "jul" || month.toLowerCase() == "july"
            || month.toLowerCase() == "aug" || month.toLowerCase() == "august"
            || month.toLowerCase() == "sep" || month.toLowerCase() == "september"
            || month.toLowerCase() == "oct" || month.toLowerCase() == "october"
            || month.toLowerCase() == "nov" || month.toLowerCase() == "november"
            || month.toLowerCase() == "dec" || month.toLowerCase() == "december"
        )
            return true;
        return false;
    }

    private boolean validDay() {
//        System.out.println(toString());
        if(day>=1) {
            if(month.toLowerCase() == "feb" || month.toLowerCase() == "february"){
                if(day == 29 && isLeapYear())
                    return true;
                if(day <= 28)
                    return true;
            }
            if(month.toLowerCase() == "apr" || month.toLowerCase() == "april"
                    || month.toLowerCase() == "jun" || month.toLowerCase() == "june"
                    || month.toLowerCase() == "sep" || month.toLowerCase() == "september"
                    || month.toLowerCase() == "nov" || month.toLowerCase() == "november"
            ){
                if(day <= 30)
                    return true;
            }
            if (month.toLowerCase() == "jan" || month.toLowerCase() == "january"
                    || month.toLowerCase() == "mar" || month.toLowerCase() == "march"
                    || month.toLowerCase() == "may"
                    || month.toLowerCase() == "jul" || month.toLowerCase() == "july"
                    || month.toLowerCase() == "aug" || month.toLowerCase() == "august"
                    || month.toLowerCase() == "oct" || month.toLowerCase() == "october"
                    || month.toLowerCase() == "dec" || month.toLowerCase() == "december"
            ) {
                if (day <= 31){
                    return true;
                }
            }

        }
        return false;
    }

    public String getDateString(){
        String date = "";
        if(validDate()){
            date = day +"-"+ month + "-"+ year;
        }else{
            date = "Invalid Date";
        }
        return date;
    }
    private boolean isLeapYear() {
        int yr = year;
        return  (yr % 400 == 0 || (yr % 100 != 0 && yr % 4 == 0));
    }

    @Override
    public String toString() {
        return "Calender{" +
                "day=" + day +
                ", month='" + month + '\'' +
                ", monthNo=" + monthNo +
                ", year=" + year +
                '}';
    }
}
