package online.danbao.demo.account;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: 蛋宝
 * @date: 2021/5/8 18:34
 * @description:
 */
@SpringBootApplication
@MapperScan(basePackages = {"online.danbao.demo.account.mapper"})
public class AccountApplication {
    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class,args);
    }
}