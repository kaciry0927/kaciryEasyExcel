package com.kaciry.own.service.Impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kaciry.own.dao.UserBaseMapper;
import com.kaciry.own.model.User;
import com.kaciry.own.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * @author Kaciry Smith
 * @create 2021-10-30 1:45 下午
 */

@Service
public class UserServiceImpl extends ServiceImpl<UserBaseMapper, User> implements UserService {
    

    @Override
    public boolean saveBatch(Collection<User> entityList, int batchSize) {
        return super.saveBatch(entityList, batchSize);
    }

    @Override
    public boolean saveOrUpdate(User entity) {
        return super.saveOrUpdate(entity);
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<User> entityList, int batchSize) {
        return super.saveOrUpdateBatch(entityList, batchSize);
    }

    @Override
    public boolean updateBatchById(Collection<User> entityList, int batchSize) {
        return super.updateBatchById(entityList, batchSize);
    }

    @Override
    public User getOne(Wrapper<User> queryWrapper, boolean throwEx) {
        return super.getOne(queryWrapper, throwEx);
    }

    @Override
    public boolean save(User entity) {
        return super.save(entity);
    }

    @Override
    public boolean removeById(Serializable id) {
        return super.removeById(id);
    }

    @Override
    public boolean updateById(User entity) {
        return super.updateById(entity);
    }

    @Override
    public User getById(Serializable id) {
        return super.getById(id);
    }

    @Override
    public long count(Wrapper<User> queryWrapper) {
        return super.count(queryWrapper);
    }

    @Override
    public List<User> list(Wrapper<User> queryWrapper) {
        return super.list(queryWrapper);
    }
}
