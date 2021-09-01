public class uc_7 {
    public static final int level_1=1;
    public static final int level_2=2;
    public static int per_hour_wage=20;
    public static int per_day_hr=8;
    
    public static void compute(){
        double total_wage=0;
        int emp_hr;
        int i=0,total_hr=0;
        while(i<20 && total_hr<=100) {
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
        System.out.println("Total Wage :" + total_wage);
    }
    public static void main(String[] args) {
        compute();
    }
}
