import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;


public class DataUtil {

//метод який відповідає за зчитування рядків з файла у ліст
    public static List<String> getLinesFromFile(File file) {

        List<String> lines = Collections.emptyList(); //створюємо ліст
        try {
            lines = Files.readAllLines(Paths.get(String.valueOf(file)), StandardCharsets.UTF_8); //зчитуємо дані в ліст
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lines;//повертаємо ліст
    }

//у даному методі записуємо дані з ліста в файл
     public static File  generateNewFileByList(List<String> list){

        File file = new File("newFile.txt");
        if (!file.exists()) {//якщо немає файла з такою назвою,то створюємо новий файл
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

          FileWriter writer = null;
          try {
              writer = new FileWriter(file);

              for(String str: sortListByLength(list)) {
                  writer.write(str + System.lineSeparator());//записуємо дані у файл
              }
          } catch (IOException e) {
              e.printStackTrace();
          }finally {
              try {
                  writer.close();
              } catch (IOException e) {
                  e.printStackTrace();
              }
          }


       return file;
    }


    //метод відповідає за сортування даних по довжині
    public static List<String> sortListByLength(List<String>list){

        return list.stream().sorted((o1, o2) -> {
            if (o1.length()>o2.length()){
                return 1;
            }else if (o1.length()<o2.length()){
                return -1;
            }else return 0;
        }).collect(Collectors.toList());
    }



    public static void main(String[] args) {

        List<String> res = getLinesFromFile(new File("oldFile.txt"));

        generateNewFileByList(res);

    }

}



