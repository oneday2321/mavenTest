package com.test2;

import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.util.*;

public class YamlTest {
    public static void main(String[] args) throws IOException {
        String filePath = "E:\\CodeJava\\mavenTest\\src\\main\\java\\com\\httpClientTest\\yamlTest.yml";
        writerYaml(filePath, "select", "*()*");
        HashMap<String, HashMap<String, String>> stringHashMapHashMap = readYaml(filePath);
        System.out.println(stringHashMapHashMap.get("XNY_201_8087").get("select"));
    }

    public static void writerYaml(String filePath, String putKey, String putValue) {
        try {
            Yaml yaml = new Yaml();
            File file = new File(filePath);
            FileInputStream fileInputStream = new FileInputStream(file);
            HashMap<String, HashMap<String, String>> proper = yaml.loadAs(fileInputStream, HashMap.class);
            proper.get("XNY_201_8087").put(putKey, putValue);
            FileWriter fileWriter = new FileWriter(file);
            yaml.dump(proper, fileWriter);
            fileInputStream.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static HashMap<String, HashMap<String, String>> readYaml(String filePath) {
        try {
            Yaml yaml = new Yaml();
            File file = new File(filePath);
            FileInputStream fileInputStream = new FileInputStream(file);
            HashMap<String, HashMap<String, String>> proper = yaml.loadAs(fileInputStream, HashMap.class);
            fileInputStream.close();
            return proper;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
