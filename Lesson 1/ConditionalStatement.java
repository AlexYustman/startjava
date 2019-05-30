public class ConditionalStatement {
	public static void main(String[] args) {
		int i = 32;
		if (i > 20) {
			System.out.println("Вам больше 20 лет. Точнее, вам " + i + " года");
		}
		
		boolean male = true;
		if (male) {
			System.out.println("Вы - мужчина и это " + male);
		} else if (!male) {
			System.out.println("Вы - женщина");
		}
		
		double height = 1.65;
		if (height < 1.80) {
			System.out.println("У вас средний рост, равный " + height + "м");
		} else {
			System.out.println("У вас высокий рост");
		}

		char firstLetter = 'A';
		if (firstLetter == 'M') {
			System.out.println("Ваше имя Mлексей");
		} else if (firstLetter == 'I') {
			System.out.println("Ваше имя Iлексей");
		} else {
			System.out.println("Ваше имя Алексей");
		}
	}
}