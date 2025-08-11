package lab31_07;

public class Numbers {

   public static void Number(int num) {
        if (num <= 100) {
            System.out.println(num);
            Number(num + 1); // Recursive call with increment
        }
    }
    public static void main(String[] args) {
        Number(1);  // method call
    }
}
