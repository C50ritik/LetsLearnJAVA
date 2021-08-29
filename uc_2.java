public class Main {
    public static void main(String[] args) {
        int per_hour_wage=20;
        int full_day_hr=8;
        double level=1;
        double check=Math.floor((Math.random()*10))%2;
        if(check==level){
            double total=per_hour_wage*full_day_hr*check;
            System.out.println(total);
        }
        else {
            double total=per_hour_wage*full_day_hr*check;
            System.out.println(total);
        }
    }
}
