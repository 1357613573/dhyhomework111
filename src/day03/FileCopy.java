package day03;

import java.io.*;

public class FileCopy {

    public static void main(String[] args) {
        byte[] read = new byte[1024];
        try {
            FileInputStream fis = new FileInputStream("F:\\dhyhomework\\a.txt");//保存的文件目录

            File f = new File("F:\\dhyhomework\\b.txt");//复制到的地址
            FileOutputStream fos = new FileOutputStream(f);

            if (!f.exists()) {//若f不存在就创建
                f.mkdir();
            }
            int d = fis.read(read,0,read.length);
            while (d != -1) {
                fos.write(read, 0, d);
            }
            fos.flush();
        }catch(Exception e){
            System.out.println("异常");
        }

    }
}
