import java.util.Scanner;

public class task3 {
  public static void main(String[] args) {

    calc();
    
  }



  
  public static void calc() {
    double res;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter first number:");
    double num1 = scanner.nextDouble();
    System.out.println("Enter second number:");
    double num2 = scanner.nextDouble();
    System.out.println("Enter an operation: +, -, *, /");
    String op2 = scanner.next();
    char op = op2.charAt(0);
    

    switch (op) {
      case "+": res = num1 + num2;
        break;
      case "-": res = num1 - num2;
        break;
      case "*": res = num1*num2;
        break;
      case "/": res = num1/num2;
        break;
      default: System.out.println("Incorrect operator!");
        return;
    } 

    System.out.println("Result: " + num1 + " " + op + " " + num2 + " " + "=" + " " + "res");
    scanner.close();
  }
}
