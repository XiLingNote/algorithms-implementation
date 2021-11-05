package com.jared.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/**
 *  遍历文件夹下面的数据复制到同一个目录下并且改名字
 *
 * @Author shouxu
 * @Date 2021/10/18 13:54
 */
public class FileIoUtilCopyAndRename {

    public static void main(String[] args) throws Exception {
        String path = "C:\\Users\\enmonster\\Desktop\\rokcetMQ\\存储音视频";		//要遍历的路径
        File file = new File(path);		//获取其file对象
        FileIoUtilCopyAndRename.getDirectory(file);
    }
    static int index = 1;
    /**
     * 递归遍历文件查找文件几
     * @param file
     * @throws Exception
     */
    private static void getDirectory(File file) throws Exception {
        File flist[] = file.listFiles();
        if (flist == null || flist.length == 0) {
            return;
        }
        for (File f : flist) {
            if (f.isDirectory()) {
                //这里将列出所有的文件夹
                // System.out.println("Dir==>" + f.getAbsolutePath());
                getDirectory(f);
            } else {
                //这里将列出所有的文件

                System.out.println("file==>" + f.getAbsolutePath());
                if(f.getName().equals("audio.m4s")){
                    File newFile = new File("C:\\Users\\enmonster\\Desktop\\rokcetMQ\\存储音频合集\\" + index +".mp3");
                    copyFileUsingFileChannels(f,newFile);
                    index++;
                }
            }
        }
    }


    /**
     * 文件复制工具类
     * @param source
     * @param dest
     * @throws IOException
     */
    private static void copyFileUsingFileChannels(File source, File dest) throws IOException {
        FileChannel inputChannel = null;
        FileChannel outputChannel = null;
        try {
            inputChannel = new FileInputStream(source).getChannel();
            outputChannel = new FileOutputStream(dest).getChannel();
            outputChannel.transferFrom(inputChannel, 0, inputChannel.size());
        } finally {
            inputChannel.close();
            outputChannel.close();
        }
    }
}
