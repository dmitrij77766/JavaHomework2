// 1. Создать метод, который проверяет, является ли строка палиндромом.
// Палиндром - шалаш
// public class Main {  

//     public static void main(String[] args) {
//         String [] arrStr = {"шалаш","qwq","qwqe"};
//         for (String s: arrStr)
//             if (isPolindrom(s))
//                 System.out.printf("%s - полиндром \n", s);
//     }

//     private static boolean isPolindrom(String targetStr){
//         if (targetStr.length() == 1)
//             return true;
//         for (int i = 0; i < targetStr.length()/2; i++) {
//             if (targetStr.toLowerCase().charAt(i) != targetStr.toLowerCase().charAt(targetStr.length() - 1 - i))
//                 return false;
//         }
//         return true;
//     }
 

// }



// 2. С помощью Java создать файл file.txt, и записать в него слово TEST 100 раз.

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) {
		Path path = Paths.get("\\Users\\dmitr\\OneDrive\\Desktop\\GeekBrains\\Практическое  задание\\Java\\Lesson 2\\file.txt");
		try {
			String str = "TEST".repeat(100);
			byte[] bs = str.getBytes();
			Path writtenFilePath = Files.write(path, bs);
			System.out.println("Written content in file:\n"+ new String(Files.readAllBytes(writtenFilePath)));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}