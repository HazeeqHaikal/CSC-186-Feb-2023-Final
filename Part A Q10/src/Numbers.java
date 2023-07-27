public class Numbers {
    public static double addition(double n1,
            double n2) {
        return n1 + n2;
    }

    public void multiplication(double n1, double n2) {
        System.out.println(n1 * n2);
    }

    public static void main(String[] args) {
        System.out.println(addition(12, 8)); // output: 20.0
        // System.out.println(multiplication(5, 10)); // Error
        Numbers num = new Numbers();
        // System.out.println(num.multiplication(3, 6)); // Error

        num.multiplication(15, 9); // output: 135.0
    }
}