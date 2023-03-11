package ricky.com.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author xdg
 * @Date 2023/3/10 1:12
 */
public class DictionaryGenerator {

    public static void main(String[] args) {

        // 输入生日信息
        String year = "1999";
        String month = "10";
        String day = "04";

        // 确定字典文件存放路径及口令位数
        String path = "C:/Users/user/Desktop/dictionary.txt";
        int length = 6;

        // 生成字典
        generateDictionary(year, month, day, path, length);

        System.out.println("Dictionary generated successfully!");
    }

    private static void generateDictionary(String year, String month, String day, String path, int length) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path));

            // 生成不同组合方式的生日口令
            String[] patterns = {year + month + day, year + day + month, month + year + day, month + day + year, day + year + month, day + month + year};

            for (String pattern : patterns) {
                for (int i = 0; i <= 999; i++) {
                    String password = String.format("%0" + length + "d", i);  // 将数字转为指定位数的字符串
                    writer.write(pattern + password);  // 将生日和口令组合写入字典文件
                    writer.newLine();  // 换行
                }
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}