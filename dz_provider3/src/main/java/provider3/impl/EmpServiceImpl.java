package provider3.impl;

import com.alibaba.dubbo.config.annotation.Service;
import model.Emp;
import service.EmpService;

//放入dubbo
@Service(version = "1.0.0")
public class EmpServiceImpl extends BaseServiceImpl<Emp> implements EmpService {

  /*  @Autowired
    private EmpMapper empMapper;
    //全查询
    @Override
    public List<Emp> findAllemp() throws Exception {

        System.out.println("provider3");
        List<Emp> list = empMapper.queryAllEmp();
        return list;
    }*/
}
