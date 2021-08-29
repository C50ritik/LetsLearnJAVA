public class Main {
    public static void main(String[] args) {
        double level=1;
        double check=Math.floor((Math.random()*10))%2;
        if(check==level){
            System.out.println("Employee Is Present");
        }
        else {
            System.out.println("Employee Is Not Present");
        }
    }
}