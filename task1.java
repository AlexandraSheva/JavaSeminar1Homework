/**
 * task1 Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */
public class task1 {

  public static void main(String[] args) {
    task1();
    // task0 ();
    
  }

  static void task0() {
    int n = 10;
    int sum = 0;
    for (int i = 0; i<=n; i++) {
      sum+=i;
    }
    System.out.println(sum);
  }

  static void task1() {
    int n = 3;
    int prod = 1;
    for (int i = 1; i<=n; i++) {
      prod*=i;
    }
    System.out.println(prod);

  }
}