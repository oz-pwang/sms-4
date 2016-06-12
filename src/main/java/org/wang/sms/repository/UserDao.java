package org.wang.sms.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import org.wang.sms.model.User;

/**
 * Created by ozintel06 on 16/5/12.
 */
@Transactional
public interface UserDao extends CrudRepository<User, Long> {
    /**
     * This method will find an User instance in the database by its email.
     * Note that this method is not implemented and its working code will be
     * automagically generated from its signature by Spring Data JPA.
     */
    User findByEmail(String email);
}
