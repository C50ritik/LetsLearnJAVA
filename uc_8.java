public class UC_8 {
    public static final int level_1=1;
    public static final int level_2=2;

    public static void company(String name,int per_hour_wage,int working_days_pm,int working_hr_pm){
        int per_day_hr=8;
        double total_wage=0;
        int emp_hr;
        int i=0,total_hr=0;
        while(i<working_days_pm && total_hr<=working_hr_pm) {
            double check = Math.floor((Math.random() * 10)) % 3;
            emp_hr = switch ((int) check) {
                case level_1 -> per_day_hr;
                case level_2 -> per_day_hr / 2;
                default -> 0;
            };
            i++;
            total_hr += emp_hr;
            total_wage += per_hour_wage * emp_hr;
        }
        System.out.println("Total Wage of Employee Of "+ name +" is " +total_wage);
    }
    public static void main(String[] args) {
        company("MorningStar",20,20,100);
        company("Jio",15,20,100);
    }
}
