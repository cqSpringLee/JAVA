package com.lc.wl.study.lesson04;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlDemo01 {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("https:baidi.com 8080");
        System.out.println(url.getPort());
        System.out.println(url.getProtocol());
        System.out.println(url.getHost());
    }
}
