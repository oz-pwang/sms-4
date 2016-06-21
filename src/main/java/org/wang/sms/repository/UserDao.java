package org.wang.sms.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.wang.sms.model.User;

import java.util.List;

/**
 * Created by ozintel06 on 16/6/21.
 */
public interface UserDao extends CrudRepository<User,Integer> {

    User findByNameAndPassWord(String username, String password);

    @Query("from User as s where s.clazz.id = clazzId")
    List<User> findStudentByClazzId(Integer clazzId);
}
