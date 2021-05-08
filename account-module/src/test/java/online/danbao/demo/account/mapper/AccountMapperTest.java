package online.danbao.demo.account.mapper;

import online.danbao.demo.common.model.entity.Account;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author: 蛋宝
 * @date: 2021/5/8 18:47
 * @description:
 */
@SpringBootTest
@ExtendWith(SpringExtension.class)
class AccountMapperTest {

    @Resource
    private AccountMapper accountMapper;

    @Test
    void selectAccount(){
        List<Account> accounts=accountMapper.selectList(null);
        accounts.forEach(System.out::println);
    }

    @Test
    void save(){
        Account account=Account.builder()
                .id(4)
                .username("ldd")
                .password("123123")
                .build();
        accountMapper.insert(account);
    }


}