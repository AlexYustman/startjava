public class Cycle {	
    public static void main(String[] args) {
        for (int j = 0; j <= 20; j++) {
        	 System.out.print(j + " ");
        }
        
        int k = 6;
        while (k >= -6) {
        	System.out.println(k);
        	k -= 2;
        }

        int sum = 0;
        int i = 10;
        do {
            if (i % 2 == 1) {
                sum += i;
            }
            i++;
        } while (i <= 20);

        System.out.println("Сумма всех нечётных чисел в интервале от 10 до 20 равна: " + sum);
    }
}