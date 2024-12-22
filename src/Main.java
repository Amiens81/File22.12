import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		File file = new File("D://testfilehw.txt");
		while(true){
			try {
				FileWriter writer = new FileWriter(file, true);
				System.out.println("Введите данные для записи в файл или '0' для выхода из программы");
				String str = scanner.nextLine();
				if(str.equals("0")){
					System.out.println("Файл успешно записан. Работа программы завершена.");
					break;
				}
				if(str.isEmpty()){
					System.out.println("Введена пустая строка. Напишите что-нибудь!");
					continue;
				}
				writer.write(str +  "\n");
				System.out.println("Данные записаны. Введите, что-нибудь ещё: ");
				writer.close();
			} catch (IOException e) {
				System.out.println("При записи в файл произошла ошибка : " + e.getMessage());
				e.printStackTrace();
			}
		}
		scanner.close();
	}
}