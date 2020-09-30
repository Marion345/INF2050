public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            switch (i) {
                case (i % 15 == 0):
                    System.out.println("FIZZBUZZ");
                    break;
                case (i % 3 == 0):
                    System.out.println("FIZZ");
                    break;
                case (i % 5 == 0):
                    System.out.println("FIZZ");
                    break;
                default:
                    System.out.println(i);
                    break;
            }
        }
    }
}