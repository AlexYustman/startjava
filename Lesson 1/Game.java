public class Game {
	public static void main(String[] args) {
		int computerNumber = 39;
		int userNumber = 99;

		System.out.println("Угадайте целое число, загаданное компьютером в интервале от 0 до 100");
		while (userNumber != computerNumber) {
			if (userNumber > computerNumber) {
				System.out.println("Введённое вами число больше загаданного компьютером. Попробуйте ещё");
				userNumber--;
			}
			else if (userNumber < computerNumber) {
				System.out.println("Введённое вами число меньше загаданного компьютером. Попробуйте ещё");
				userNumber++;
			}
		}
		System.out.println("Вы угадали! Введённое вами " + userNumber + " равно загаданному " + computerNumber);
	}
}