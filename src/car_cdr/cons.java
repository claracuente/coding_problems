package car_cdr;
public class cons {
    public static int car(int[] pair){
        return pair[0];
    }
    public static int cdr(int[] pair){
        return pair[1];
    }
    public static void main (String args[]){
        System.out.println(car(cons(1,2)));
        System.out.println(cdr(cons(1,2)));
    }
    private static int[] cons(int a, int b) {
        return new int[]{a,b};
    }
}