import com.linzhilong.config.SpringConfig;
import com.linzhilong.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//设置类运行器
@RunWith(SpringJUnit4ClassRunner.class)
//设置spring环境对应的配置类
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;
    @Test
    public void testFindById(){
        System.out.println(accountService.findById(1));

    }

    @Test
    public void testFindAll(){
        System.out.println(accountService.findAll());
    }
}
