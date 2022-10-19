package com.httpClientTest;


import org.apache.http.Header;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.Arrays;

public class getClientTest {
    public static void main(String[] args) throws IOException {
//        建立一个请求客户端
        CloseableHttpClient aDefault = HttpClients.createDefault();
//        编辑请求中的报文
        HttpGet httpGet = new HttpGet("http://www.baidu.com");
//        通过客户端发起请求
        CloseableHttpResponse resp = aDefault.execute(httpGet);
//        获取响应报文（返回头、返回体）
        System.out.println(resp);
//        将响应报文解析成文字
        String s = EntityUtils.toString(resp.getEntity(), "UTF-8");
        System.out.println(s);
//        获取响应头的状态码
        int statusCode = resp.getStatusLine().getStatusCode();
        System.out.println(statusCode);
//        获取响应头的响应headers
        Header[] allHeaders = resp.getAllHeaders();
        System.out.println(Arrays.deepToString(allHeaders));

//        获取响应headers中de内容
        Header firstHeader = resp.getFirstHeader("Content-Type");
        System.out.println(firstHeader);

        Header lastHeader = resp.getLastHeader("Date");
        System.out.println(lastHeader);

        Header[] servers = resp.getHeaders("Server");
        System.out.println(Arrays.deepToString(servers));
    }
}
