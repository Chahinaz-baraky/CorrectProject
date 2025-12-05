import app1.CorrectCalculatorExercice;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
  //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
  // to see how IntelliJ IDEA suggests fixing it.
    System.out.println("Hello and welcome!");

    CorrectCalculatorExercice c = new CorrectCalculatorExercice();
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the value of the first integer:");
    int num1 = Integer.parseInt(input.nextLine().trim());

    System.out.println("Enter the value of the second integer:");
    int num2 = Integer.parseInt(input.nextLine().trim());

    System.out.println("Enter the value of the third integer:");
    int num3 = Integer.parseInt(input.nextLine().trim());

    int result = c.add(num1, num2, num3);
    int result1 = c.rest(num1, num2);
    int result2 = c.rest2(num1,num2 ,num3);

    System.out.println("Addition of three integers: " + result);
    System.out.println("Substraction of the first two integers: " + result1);
    System.out.println("Substraction of the first two integers from the third integer: " + result2);


    input.close();

}

