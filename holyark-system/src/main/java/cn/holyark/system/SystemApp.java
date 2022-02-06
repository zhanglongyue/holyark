package cn.holyark.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ZhangLongYue
 * @since 2022/2/6 15:13
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SystemApp {
    public static void main(String[] args) {
        SpringApplication.run(SystemApp.class, args);
    }
}
