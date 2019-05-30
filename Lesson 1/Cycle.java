public class Cycle {	
    public static void main(String[] args) {
        for (int a = 0; a <= 20; a++) {
        	 System.out.print(a + " ");
        }
        
        int b = 6;
        while (b >= -6) {
        	System.out.println(b + " ");
        	b-=2;
        }

        int sum = 0;
        int i = 10;
        do {
            if (i % 2 == 1) {
                sum = sum + i;
            }
            i++;
        } while (i <= 20);

        System.out.println("11 + 13 + 15 + 17 + 19 = " + sum);
    }
}