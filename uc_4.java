import java.awt.*;
public class main {
    static final int level_1=1;
    static final int level_2=2;
    public static void main(String[] args) {
        int per_hour_wage=20;
        int full_day_hr=8;

        double total;
        double check=Math.floor((Math.random()*10))%3;
        switch((int)check){
            case level_1:
            total=per_hour_wage*full_day_hr*check;
            System.out.println("Full Day :"+total);
            break;
            case level_2:
            total=per_hour_wage*full_day_hr*check/4;
            System.out.println("Part Time :"+total);
            break;
            default:
            total=per_hour_wage*full_day_hr*check;
            System.out.println("Not Present :"+total);
        }
    }
}
