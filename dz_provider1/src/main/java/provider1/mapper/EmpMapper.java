package provider1.mapper;

import model.Emp;

/**
 *   员工mapper代理对象
 */
public interface EmpMapper extends BaseMapper<Emp>{

    //查询所有的员工数据
   // @Select("select * from emp")
   // List<Emp> queryAllEmp() throws Exception;
}
