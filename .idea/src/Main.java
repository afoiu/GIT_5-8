public class Main {
    public static void sum (int...a){
        int sum=0;
        for (int i : a ) {
            sum+=i;
            System.out.println("Sum= " + sum);
        }
    }
    public static void main(String[] args) {
        System.out.println("Cnanges on Branch 2");
        sum(5,7,3);
    }
}
