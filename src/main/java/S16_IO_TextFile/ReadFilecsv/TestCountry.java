package S16_IO_TextFile.ReadFilecsv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TestCountry {
    public static List<Country> readFile(String filePath) {
        List<Country> list = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] arr = line.split(",");

                list.add(new Country(Integer.parseInt(arr[0]), arr[1], arr[2]));
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.err.println("File không tồn tại hoặc nội dung có lỗi!");;
        }
        return list;
    }

    public static void writeFile(String filepath, List<Country> list) {
        try {
            FileWriter writer = new FileWriter(filepath);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (int i = 0; i < list.size(); i++) {
                bufferedWriter.write("\n" + list.get(i).toString());
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<Country> list = readFile("E:\\CODEGYM\\Module2Java\\src\\main\\java\\S16_IO_TextFile\\ReadFilecsv\\countries.txt");
        writeFile("E:\\CODEGYM\\Module2Java\\src\\main\\java\\S16_IO_TextFile\\ReadFilecsv\\result.txt", list);
    }
}
