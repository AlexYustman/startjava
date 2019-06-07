public class Game {
	public static void main(String[] args) {
		int computersNumber = 39;
		int usersNumber = 99;

		System.out.println("Угадайте целое число, загаданное компьютером в интервале от 0 до 100");
		while (usersNumber != computersNumber) {
			if (usersNumber > computersNumber) {
				System.out.println("Введённое вами число больше загаданного компьютером. Попробуйте ещё");
				usersNumber--;
			}
			if (usersNumber < computersNumber) {
				System.out.println("Введённое вами число меньше загаданного компьютером. Попробуйте ещё");
				usersNumber++;
			}
		}
		System.out.println("Вы угадали! Введённое вами " + usersNumber + " равно загаданному " + computersNumber);
	}
}