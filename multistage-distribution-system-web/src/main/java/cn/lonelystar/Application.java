package cn.lonelystar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tk.mybatis.spring.annotation.MapperScan;

//springboot中自带的整合了quartz(石英钟)作业调度框架
//@EnableScheduling // 开启时间表调度
@EnableSwagger2
@EnableAsync // 开启异步线程
@MapperScan("cn.lonelystar.mapper")
@SpringBootApplication
@ComponentScan(basePackages = { "cn.lonelystar" })
public class Application {
	public static void main(String[] args) {
		try {
			SpringApplication.run(Application.class, args);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
