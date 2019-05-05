package com.atguigu.gmall.manager;

import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GmallManagerWebApplicationTests {


    @Test
    public void contextLoads() throws Exception {
        // 配置fastdfs全局变量，读取一个配置文件
        // fastdfs的tracker服务地址信息，和过期时间等其他配置
        String file = GmallManagerWebApplicationTests.class.getClassLoader().getResource("tracker.conf").getFile();
        ClientGlobal.init(file);

        // 获得一个tracker服务
        TrackerClient trackerClient = new TrackerClient();
        TrackerServer connection = trackerClient.getConnection();

        // 获得一个storage服务
        StorageClient storageClient = new StorageClient(connection, null);


        // 使用storage服务进行上传操作
        String[] paths = storageClient.upload_file("C:/Users/ASUS/Desktop/资料文件夹/图片资料/04.jpg", "png", null);

        //storageClient.upload_file(file.getBytes(),"png",null);

        // 解析路径
        for (String path : paths) {
            System.out.println(path);
        }
    }

}
