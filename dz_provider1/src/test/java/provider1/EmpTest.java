package provider1;

import model.Emp;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import service.EmpService;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class EmpTest {

    @Autowired
    private EmpService empService;

    private static final org.apache.log4j.Logger log = Logger.getLogger(EmpTest.class);

    //测试全查询
    @Test
    public void test(){
        try {
            List<Emp> allemp = empService.findAllT();
            for (Emp emp : allemp) {
                log.info(emp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
