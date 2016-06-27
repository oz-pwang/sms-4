package org.wang.sms.repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import org.wang.sms.model.Teaching;


/**
 * Created by ozintel06 on 16/6/22.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/22/2016 15:48
 */
@Repository public interface TeachingDao extends CrudRepository<Teaching, Long> { }
