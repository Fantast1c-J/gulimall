package com.james.gulimall.product;


import com.aliyun.oss.OSSClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {

    @Autowired
    OSSClient ossClient;
    @Test
   public void contextLoads() throws FileNotFoundException {


        // 上传文件流。
        InputStream inputStream = new FileInputStream("C:\\Users\\23605\\Desktop\\根号.png");

        ossClient.putObject("hmleadnews-24900", "根号.png", inputStream);

        // 关闭OSSClient。
        ossClient.shutdown();

        System.out.println("上传成功...");
    }

}