package org.wang.sms.config;

import java.util.Properties;

import javax.annotation.Resource;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import javax.sql.DataSource;

import org.hibernate.dialect.MySQL5Dialect;

import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import org.springframework.core.env.Environment;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import org.springframework.orm.jpa.JpaDialect;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.orm.jpa.vendor.OpenJpaVendorAdapter;

import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;


/**
 * Created by ozintel06 on 16/5/16.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  05/17/2016 18:44
 */
@Configuration

// @EnableJpaRepositories("org.wang.sms.repository")
// @EnableTransactionManagement(proxyTargetClass = true)
@PropertySource("classpath:application.properties")
public class DbConfig {
  //~ Static fields/initializers ---------------------------------------------------------------------------------------

  private static final String DATABASE_DRIVER   = "spring.datasource.driver-class-name";
  private static final String DATABASE_URL      = "spring.datasource.url";
  private static final String DATABASE_USERNAME = "spring.datasource.username";
  private static final String DATABASE_PASSWORD = "spring.datasource.password";

  private static final String HIBERNATE_DIALECT              = "spring.jpa.properties.hibernate.dialect";
  private static final String ENTITYMANAGER_PACKAGES_TO_SCAN = "entitymanager.packages.to.scan";

  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Resource private Environment env;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  // 数据源

  /**
   * dataSource.
   *
   * @return  DataSource
   */
  @Bean public DataSource dataSource() {
    DriverManagerDataSource dataSource = new DriverManagerDataSource();

    dataSource.setDriverClassName(env.getProperty(DATABASE_DRIVER));
    dataSource.setUrl(env.getRequiredProperty(DATABASE_URL));
    dataSource.setUsername(env.getRequiredProperty(DATABASE_USERNAME));
    dataSource.setPassword(env.getRequiredProperty(DATABASE_PASSWORD));

    return dataSource;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * entityManager.
   *
   * @param   entityManagerFactory  EntityManagerFactory
   *
   * @return  EntityManager
   */
  @Bean
  @Qualifier(value = "entityManager")
  public EntityManager entityManager(EntityManagerFactory entityManagerFactory) {
    return entityManagerFactory.createEntityManager();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * entityManagerFactory.
   *
   * @return  LocalContainerEntityManagerFactoryBean
   */
  @Bean(name = "entityManagerFactory")
  public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
    LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();

    factory.setJpaVendorAdapter(hibernateJpaVendorAdapter());
    factory.setDataSource(dataSource());
    factory.setPackagesToScan(env.getRequiredProperty(ENTITYMANAGER_PACKAGES_TO_SCAN));

// Properties的方式配置JPA数据源
// Properties jpaProperties = new Properties();
// jpaProperties.put("hibernate.dialect", HIBERNATE_DIALECT);
// jpaProperties.put("hibernate.hbm2ddl.auto", false);
// jpaProperties.put("hibernate.show_sql", true);
// jpaProperties.put("hibernate.format_sql", true);
// jpaProperties.put("hibernate.connection.url", env.getProperty(DATABASE_URL));
// jpaProperties.put("hibernate.connection.driver_class", env.getProperty(DATABASE_DRIVER));
// jpaProperties.put("hibernate.connection.username", env.getProperty(DATABASE_USERNAME));
// jpaProperties.put("hibernate.connection.password", env.getProperty(DATABASE_PASSWORD));
// jpaProperties.put("hibernate.connection.provider_class", "com.zaxxer.hikari.hibernate.HikariConnectionProvider");
// jpaProperties.put("hibernate.hikari.dataSourceClassName", this.databaseDriverClassName);
// jpaProperties.put("hibernate.hikari.dataSource.url", this.databaseUrl);
// jpaProperties.put("hibernate.hikari.dataSource.user", this.databaseUsername);
// jpaProperties.put("hibernate.hikari.dataSource.password", this.databasePassword);
// jpaProperties.put("hibernate.hikari.dataSource.cachePrepStmts", "true");
// jpaProperties.put("hibernate.hikari.dataSource.prepStmtCacheSize", "250");
// jpaProperties.put("hibernate.hikari.dataSource.prepStmtCacheSqlLimit", "2048");
// jpaProperties.put("hibernate.hikari.dataSource.useServerPrepStmts", "true");

    return factory;
  } // end method entityManagerFactory

  //~ ------------------------------------------------------------------------------------------------------------------


  /**
   * hibernateJpaVendorAdapter.
   *
   * @return  HibernateJpaVendorAdapter
   */
  @Bean public HibernateJpaVendorAdapter hibernateJpaVendorAdapter() {
    HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();

    vendorAdapter.setGenerateDdl(Boolean.TRUE);
    vendorAdapter.setShowSql(Boolean.TRUE);
    vendorAdapter.setDatabasePlatform(env.getRequiredProperty(HIBERNATE_DIALECT));

    return vendorAdapter;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * transactionManager.
   *
   * @param   factory  EntityManagerFactory
   *
   * @return  PlatformTransactionManager
   */
  @Bean public PlatformTransactionManager transactionManager(EntityManagerFactory factory) {
    return new JpaTransactionManager(factory);
  }
} // end class DbConfig
