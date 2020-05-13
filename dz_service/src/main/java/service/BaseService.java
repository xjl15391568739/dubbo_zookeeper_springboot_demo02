package service;

import java.util.List;

/**
 * 公共业务层接口
 * @param <T>
 */
public interface BaseService<T> {

    //全查询
    List<T> findAllT()throws Exception;
}
