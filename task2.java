public class task2 {
  public static void main(String[] args) {
    task2();
  }

 
  static void task2() {
    /*Вывести все простые числа от 1 до 1000 */
    int n = 1000;
    boolean flag = true;

    for (int i = 2; i<n; i++) {
      for(int j = 2; j<i; j++) {
        if (i%j == 0) {
          flag = false;
          break;
        }
      }

      if (flag) System.out.println(i);
      else flag = true;
    }
  }
}
