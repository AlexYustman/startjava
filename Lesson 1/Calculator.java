public class Calculator {	
    public static void main(String[] args) {
    	int a = 25;
    	int b = 12;
    	char mathOperation = '*';

    	System.out.println("Введите два целых положительных числа и знак операции (+, -, *, /, ^, %)");
    	if (mathOperation == '+') {
    		System.out.println("Вы ввели " + a + "+" + b + ", где ответ равен " + (a + b));
    	} else if (mathOperation == '-') {
    		System.out.println("Вы ввели " + a + "-" + b + ", где ответ равен " + (a - b));
    	} else if (mathOperation == '*') {
    		System.out.println("Вы ввели " + a + "*" + b + ", где ответ равен " + (a * b));
    	} else if (mathOperation == '/') {
    		System.out.println("Вы ввели " + a + "/" + b + ", где ответ равен " + (a / b));
    	} else if (mathOperation == '^') {
    		if (b == 0) {
    			System.out.println("Вы ввели " + a + "^" + b + ", где ответ равен " + 1);
    		}
    		for (int i = 1; i <= b; i++) {
    			a *= a; 
    			System.out.println("Вы ввели " + a + "^" + b + ", где ответ равен " + a);
    		}
    	} else if (mathOperation == '%') {
    		System.out.println("Остаток от деления " + a + " на " + b + " равен " + (a % b));
    	}
    }
} 