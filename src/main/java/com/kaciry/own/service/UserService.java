package com.kaciry.own.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.kaciry.own.model.User;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

/**
 * @author Kaciry Smith
 * @create 2021-10-30 1:44 下午
 */
public interface UserService extends IService<User> {


    public boolean saveBatch(Collection<User> entityList, int batchSize);


    public boolean saveOrUpdateBatch(Collection<User> entityList, int batchSize);


    public boolean updateBatchById(Collection<User> entityList, int batchSize);


    public boolean saveOrUpdate(User entity);


    public User getOne(Wrapper<User> queryWrapper, boolean throwEx);


    public Map<String, Object> getMap(Wrapper<User> queryWrapper);

    public <V> V getObj(Wrapper<User> queryWrapper, Function<? super Object, V> mapper);


    public BaseMapper<User> getBaseMapper();


    public Class<User> getEntityClass();
}
