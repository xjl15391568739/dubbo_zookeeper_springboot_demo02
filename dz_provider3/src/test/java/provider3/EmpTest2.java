package provider3;

import model.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import service.EmpService;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class EmpTest2 {

    @Autowired
    private EmpService empService;

    //测试全查询
    @Test
    public void test(){
        try {
            List<Emp> allemp = empService.findAllT();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
