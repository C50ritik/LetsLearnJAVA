public class Main {
    public static void main(String[] args) {
        int per_hour_wage=20;
        int full_day_hr=8;
        double level_1=1;
        double level_2=2;
        double check=Math.floor((Math.random()*10))%3;
        if(check==level_1){
            double total=per_hour_wage*full_day_hr*check;
            System.out.println("Full Day :"+total);
        }
        else if(check==level_2){
            double total=per_hour_wage*full_day_hr*check/4;
            System.out.println("Part Time :"+total);
        }
        else {
            double total=per_hour_wage*full_day_hr*check;
            System.out.println("Not Present :"+total);
        }
    }
}
