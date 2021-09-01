public class uc_6 {
    public static final int level_1=1;
    public static final int level_2=2;
    public static void main(String[] args) {
        int per_hour_wage=20;
        int per_day_hr=8;

        double total=0;
        int i=0,total_hr=0;
        while(i<100 && total_hr<=20) {
            double check = Math.floor((Math.random() * 10)) % 3;
            switch ((int) check) {
                case level_1 -> {
                    total += (per_hour_wage * per_day_hr);
                    total_hr += per_day_hr;
                }
                case level_2 -> {
                    total += per_hour_wage * per_day_hr / 2;
                    total_hr += per_day_hr / 2;
                }
                default -> total +=0;
            }
            i++;
        }
        System.out.println("Total Wage :" + total);
    }
}
