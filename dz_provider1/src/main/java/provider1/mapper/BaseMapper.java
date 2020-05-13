package provider1.mapper;

import java.util.List;

public interface BaseMapper<T> {


    //查询所有的员工数据

    List<T> queryAllT() throws Exception;
}
