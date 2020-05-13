package consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import model.Emp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.EmpService;

import java.util.List;

@Controller
@RequestMapping("/demo")
public class ConsumerCon {

    @Reference(version = "1.0.0")
    private EmpService empService;

    @RequestMapping("/test")
    @ResponseBody
    public List test(){
        try {
            List<Emp> allemp = empService.findAllT();
            return allemp;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
