public class main {
    public static final int level_1=1;
    public static final int level_2=2;
    public static void main(String[] args) {
        int per_hour_wage=20;
        int full_day_hr=8;

        double total=0;
        for(int i=0;i<20;i++) {
            double check = Math.floor((Math.random() * 10)) % 3;
            switch ((int) check) {
                case level_1 -> total += (per_hour_wage * full_day_hr * check);
                case level_2 -> total += per_hour_wage * full_day_hr * check / 4;
                default -> total += per_hour_wage * full_day_hr * check;
            }
        }
        System.out.println("Total Wage :" + total);
    }
}
