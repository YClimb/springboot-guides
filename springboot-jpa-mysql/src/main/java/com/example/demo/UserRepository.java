package com.example.demo;

import org.springframework.data.repository.CrudRepository;

/**
 * This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
 * 此类将被自动注入到一个名为userRepository的Bean中
 *
 * CRUD refers Create, Read, Update, Delete
 * CRUD指新增，查询，更新，删除
 *
 * @author yclimb
 * @date 2018/2/26
 */
public interface UserRepository extends CrudRepository<User, Long> {
    // 继承时范型<>中的对象及ID必填，否则类型出错
}
