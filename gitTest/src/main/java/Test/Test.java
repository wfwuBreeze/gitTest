package Test;

import java.io.*;

public class Test {
    /**
     * @author wfwu
     */
    public static Test t1=new Test();{
        System.out.println("a");
    }
    static {
        System.out.println("b");
    }
    public static void main(String[] args) throws IOException {
        String path="C:/Program Files/work/w/test.txt";
        String word="aaa";
        File file1 = new File("C:");
        File file = new File(file1,"Program Files/work/w");
        String[] list = file.list();
        System.out.println(list);
        boolean mkdirs = file.mkdirs();
        System.out.println(mkdirs);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(path, true)));
        bufferedWriter.write(word);
        bufferedWriter.close();
        
    }
}