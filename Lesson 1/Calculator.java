public class Calculator {	
    public static void main(String[] args) {
    	int a = 25;
    	int b = 12;
    	int sum = a + b;
    	int difference = a - b;
    	int product = a * b;
    	double quotient = a / b;
    	long exponentiation = 1; /* возведение в степень*/

    	System.out.println("Введите два целых положительных числа и знак операции (+, -, *, /, ^, %)");
    	if (sum == a + b) {
    		System.out.println("Вы ввели " + a + "+" + b + ", где ответ равен " + (a + b));
    	} 
    	if (difference == a - b) {
    		System.out.println("Вы ввели " + a + "-" + b + ", где ответ равен " + (a - b));
    	} 
    	if (product == a * b) {
    		System.out.println("Вы ввели " + a + "*" + b + ", где ответ равен " + (a * b));
    	}
    	if (quotient == a / b) {
    		System.out.println("Вы ввели " + a + "/" + b + ", где ответ равен " + (a / b));
    	}
    	for (int i = 1; i <= b; i++) {
    		exponentiation *= a;
    	} 
    	System.out.println("Вы ввели " + a + "^" + b + ", где ответ равен " + exponentiation);
    	System.out.println("Остаток от деления " + a + " на " + b + " равен " + (a % b));

    }
} 