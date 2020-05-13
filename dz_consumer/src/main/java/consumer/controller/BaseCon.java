package consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.BaseService;

import java.util.List;

/**
 * 公共控制器
 * @param <T>
 */
public class BaseCon<T> {


    @Reference(version = "1.0.0")
    private BaseService<T> baseService;

    //全查询
    @RequestMapping("/loadAll")
    @ResponseBody
    public List<T> loadAllT(){
        try {
            List<T> allT = baseService.findAllT();
            return allT;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
