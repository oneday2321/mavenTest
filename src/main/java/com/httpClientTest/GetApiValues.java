package com.httpClientTest;

import com.jayway.jsonpath.JsonPath;
import org.apache.http.Header;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class GetApiValues {
    public static void main(String[] args) throws IOException {
//        方式一：响应结果中提取数据，然后存放至全局文档中
//        方式二：响应headers提取数据，然后存放至全局文档中
//        方式三：将全局变量，当作请求参数，去请求接口
//        方式四：将全局变量，当作请求headers，然后去请求接口
        /*
         * @Param 发送请求，数据提取，存放变量
         * @Return
         */
//        发送请求
        CloseableHttpClient aDefault = HttpClients.createDefault();
        HttpPost post = new HttpPost("");
        StringEntity Entity = new StringEntity("{\"username\":\"cs004\",\"password\":\"123456\"}");
        post.addHeader("Content-Type", "application/json;charset=UTF-8");
        post.setEntity(Entity);
        CloseableHttpResponse httpResponse = aDefault.execute(post);
//        方式一：
//      解析响应报文
        String s = EntityUtils.toString(httpResponse.getEntity(), "utf-8");
        System.out.println(s);
//        将响应结果转换json，并提取需要的字段
        List<String> read = JsonPath.read(s, "@..accesstoken");
        String s1 = read.get(0);
        System.out.println(read.get(0));

//        方式二：
//        Header[] allHeaders = httpResponse.getAllHeaders();  //获取全部的headers
        Header firstHeader = httpResponse.getFirstHeader("Content-Type");
//        将提取到的内容，传输至全局变量中或者全局yaml文件中
        Yaml yaml = new Yaml();
        File file = new File("E:\\CodeJava\\mavenTest\\src\\main\\java\\com\\httpClientTest\\yamlTest.yml");
        FileInputStream inputStream = new FileInputStream(file);
        Map<String, Map<String, String>> map = yaml.loadAs(inputStream, Map.class);
        map.get("XNY_201_8087").put("Header", firstHeader.toString());
        map.get("XNY_201_8087").put("accesstoken", s1);
        FileWriter fileWriter = new FileWriter(file);
        yaml.dump(map, fileWriter);
        inputStream.close();
        fileWriter.close();
        System.out.println("====================");

//        方式四：
        HttpPost httpPost = new HttpPost("");
        FileInputStream inputStream1 = new FileInputStream(file);
        Map<String, Map<String, String>> map1 = yaml.loadAs(inputStream1, Map.class);
        String s2 = map1.get("XNY_201_8087").get("accesstoken");
        String s4 = map1.get("XNY_201_8087").get("Header").split(":")[1];
        httpPost.addHeader("Authorization", "Bearer " + s2);
        httpPost.addHeader("Content-Type", s4);
        CloseableHttpResponse httpResponse1 = aDefault.execute(httpPost);
        String s3 = EntityUtils.toString(httpResponse1.getEntity(), "utf-8");
        System.out.println(s3);
    }
}
