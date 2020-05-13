package provider1.impl;

import org.springframework.beans.factory.annotation.Autowired;
import provider1.mapper.BaseMapper;
import service.BaseService;

import java.util.List;

/**
 * 公共业务层接口实现类
 * @param <T>
 */
public class BaseServiceImpl<T> implements BaseService<T> {

    @Autowired
    private BaseMapper<T> baseMapper;

    @Override
    public List<T> findAllT() throws Exception {
        return baseMapper.queryAllT();
    }
}
