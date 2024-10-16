import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) throws Exception {
        List<String> book = Files.readAllLines(
                Paths.get(
                        "C:\\Users\\ogar_m\\Downloads\\ParserBook-master (1)\\ParserBook-master\\src\\main\\resources\\data\\Война и мир, том 1.txt"));
        String fullText = String.valueOf(book);
        //"(((I){1,3})\n+)|((IV)+\n+)|((V)+\n+)|((VI)+\n+)|((VII)+\n+)|((VIII)+\n+)|((IX)+\n+)|((IX)+\n+)"
        String[] allChapters = fullText.split("new chapter");
        System.out.print("Введите слово, а мы выведем в консоль кол-во его повторений в данной книге: ");
        String inputWord = new Scanner(System.in).nextLine();
        for (String currentChapter : allChapters) {
            System.out.println(findTermFrequency(currentChapter, inputWord));
        }

    }

    private static String findTermFrequency(String chapter, String inputWord) throws Exception {
        List<String> chapterList = List.of(chapter);
        int countAttempts = 0;
        int countWords = 0;
        double termFrequency = 0;

        for (String line : chapterList) {
            String[] elements = line.split("(\s+)|(\\n+)|(,)|(\\.)");
            for (String element : elements) {
                if (element.compareToIgnoreCase(inputWord) == 0) {
                    countAttempts++;
                }
                if (element.matches("[а-яА-Я]+")) {
                    String word = element;
                    countWords++;
                }
            }
        }

        termFrequency = (double) countAttempts / (double) countWords;

        String response = "Кол-во повторений слова " + inputWord + " равно " + countAttempts +
                "\nКол-во слов в книге равно " + countWords +
                "\nЧастота потребления слова " + inputWord + " в книге равна " + termFrequency;
        return response;
    }
}
