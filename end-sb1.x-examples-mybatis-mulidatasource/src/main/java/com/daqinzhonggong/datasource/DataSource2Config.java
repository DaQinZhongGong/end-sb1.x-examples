package com.daqinzhonggong.datasource;

import javax.sql.DataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
@MapperScan(basePackages = "com.daqinzhonggong.mapper.test2", sqlSessionTemplateRef = "test2SqlSessionTemplate")
public class DataSource2Config {

  @Bean(name = "test2DataSource")
  @ConfigurationProperties(prefix = "spring.datasource.test2")
  public DataSource testDataSource() {
    return DataSourceBuilder.create().build();
  }

  @Bean(name = "test2SqlSessionFactory")
  public SqlSessionFactory testSqlSessionFactory(
      @Qualifier("test2DataSource") DataSource dataSource) throws Exception {
    SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
    bean.setDataSource(dataSource);
    bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(
        "classpath:mybatis/mapper/test2/*.xml"));
    return bean.getObject();
  }

  @Bean(name = "test2TransactionManager")
  public DataSourceTransactionManager testTransactionManager(
      @Qualifier("test2DataSource") DataSource dataSource) {
    return new DataSourceTransactionManager(dataSource);
  }

  @Bean(name = "test2SqlSessionTemplate")
  public SqlSessionTemplate testSqlSessionTemplate(
      @Qualifier("test2SqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
    return new SqlSessionTemplate(sqlSessionFactory);
  }

}
