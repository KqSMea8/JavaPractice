package file;

import com.google.common.io.Resources;
import org.testng.annotations.Test;

import java.io.*;
import java.util.Random;

/**
 *
 * @author dz on 2018/9/7.
 */

public class ReadByLine {

    @Test
    public void flushFastNotThrowException() throws Exception {

        String path = Resources.getResource("data.txt").getPath();
        System.out.println("load data ...");
        File file = new File(path);
        BufferedReader reader = null;

            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                // 显示行号
                System.out.println("line " + line + ": " + tempString);
                String[] value = new String[1];
                value[0] = tempString;
                line++;

            }

        reader.close();
    }
    @Test
    public void writeFile() throws IOException {
        String path = Resources.getResource("data.txt").getPath();
        System.out.println(path);
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path, true)));
        for (int i = 1 ; i <= 100000;i++) {
            Random random = new Random();
            StringBuilder sb = new StringBuilder();

            for (int j=0;j< random.nextInt(4) + 2; j++){
                sb.append(","+(char) (random.nextInt(26) + 'a'));
            }
            sb.delete(0,1);
            out.write(sb + "\r\n");
        }
        out.close();
    }

    @Test
    public void clearFile(){
        String path = Resources.getResource("data.txt").getPath();
        File file =new File(path);
        try {
            if(!file.exists()) {
                file.createNewFile();
            }
            FileWriter fileWriter =new FileWriter(file);
            fileWriter.write("");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
