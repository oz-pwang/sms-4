package org.wang.sms.repository;

import org.springframework.data.repository.CrudRepository;
import org.wang.sms.model.Merchant;
import org.wang.sms.model.Order;

/**
 * Created by ozintel06 on 16/7/27.
 */
public interface OrderRepository extends CrudRepository<Order, Long> {
}
