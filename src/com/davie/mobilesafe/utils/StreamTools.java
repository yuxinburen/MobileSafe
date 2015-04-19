package com.davie.mobilesafe.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * User: davie
 * Date: 15-4-19
 */
public class StreamTools {

    /**
     *将流转换为String
     * @param in 输入流
     * @return
     * @throws IOException
     */
    public static String readFromStream(InputStream in) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte [] buffer = new byte[1024*8];
        int len = 0;
        while((len=in.read(buffer))!=-1){
            baos.write(buffer,0,len);
        }
        in.close();
        String result = baos.toString();
        baos.close();
        return result;
    }
}
