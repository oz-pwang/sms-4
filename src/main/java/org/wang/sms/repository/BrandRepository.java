package org.wang.sms.repository;

import org.springframework.data.repository.CrudRepository;
import org.wang.sms.model.Brand;
import org.wang.sms.model.Merchant;

/**
 * Created by ozintel06 on 16/7/27.
 */
public interface BrandRepository extends CrudRepository<Brand, Long> {
}
