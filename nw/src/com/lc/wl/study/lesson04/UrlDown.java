//package com.lc.network;
package com.lc.wl.study.lesson04;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlDown {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://localhost:8080/lc/lc.txt");
        HttpURLConnection urlConnection =(HttpURLConnection)url.openConnection();
        InputStream inputStream = urlConnection.getInputStream();
        FileOutputStream fos = new FileOutputStream("lc.txt");
        byte[] buffer = new byte[1024];
        int len;
        while ((len=inputStream.read(buffer))!=-1){
            fos.write(buffer,0,len);
        }

        fos.close();
        inputStream.close();
        urlConnection.disconnect();
    }
}
