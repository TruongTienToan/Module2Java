package S16_IO_TextFile.CopyFileText;

import java.util.List;

public class TestReadWrite {
    public static int countCharactor(List<String> list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            count += list.get(i).length();
        }
        return count;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<String> list = readAndWriteFile.readFile("E:\\CODEGYM\\Module2Java\\src\\main\\java\\S16_IO_TextFile\\CopyFileText\\string.txt");
        list.add(String.valueOf(countCharactor(list)));
        readAndWriteFile.writeFile("E:\\CODEGYM\\Module2Java\\src\\main\\java\\S16_IO_TextFile\\CopyFileText\\result.txt", list);
    }
}
