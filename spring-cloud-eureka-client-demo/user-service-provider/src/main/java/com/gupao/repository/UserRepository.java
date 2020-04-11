package com.gupao.repository;

import com.gupao.domain.User;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class UserRepository {

    private ConcurrentMap<Long, User> repository = new ConcurrentHashMap();

    private static final  AtomicLong idGenerator = new AtomicLong(0);


    //结合方法里面不能返回空，集合返回原子的 只读的
    public Collection<User> findAll(){
        return repository.values();
    }

    public boolean save(User user) {
        Long id = idGenerator.incrementAndGet();
        user.setId(id);
        //存在就不存  防止重复提交
        return repository.putIfAbsent(id,user) ==null;
    }
}
