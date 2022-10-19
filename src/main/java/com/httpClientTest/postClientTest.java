package com.httpClientTest;

import org.apache.http.Header;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.Arrays;

public class postClientTest {
    public static void main(String[] args) throws IOException {
//        创建请求客户端
        CloseableHttpClient aDefault = HttpClients.createDefault();
//        编辑请求报文
        HttpPost httpPost = new HttpPost("");
//        编辑请求体
        StringEntity stringEntity = new StringEntity("{\"username\":\"cs004\",\"password\":\"123456\"}");
//        添加请求headers
        httpPost.addHeader("Content-Type", "application/json;charset=UTF-8");
//        设置请求报文的请求体，进行联动
        httpPost.setEntity(stringEntity);
//        通过客户端发起请求
        CloseableHttpResponse execute = aDefault.execute(httpPost);
//        将响应报文解析
        String s = EntityUtils.toString(execute.getEntity(), "utf-8");
        System.out.println(s);
//        获取响应状态值
        int statusCode = execute.getStatusLine().getStatusCode();
        System.out.println(statusCode);
//        获取响应header
        Header[] allHeaders = execute.getAllHeaders();
        System.out.println(Arrays.deepToString(allHeaders));
    }
}
