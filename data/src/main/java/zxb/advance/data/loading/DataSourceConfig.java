package zxb.advance.data.loading;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
@MapperScan(sqlSessionFactoryRef = "zxbSqlSessionFactory",basePackages = "zxb.advance.data.mappers")
public class DataSourceConfig {
/*  private String url;*/

    @Bean("mysqlDataSource")
    @Primary
    public DataSource createDataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl("jdbc:mysql://10.168.99.192/topic?useSSL=false");
        dataSource.setUsername("db_user");
        dataSource.setPassword("2wsx3edcZSE");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return  dataSource;
    }

/*把对应数据源假如事物*/

    @Bean("zxbTranscationManager")
    @Primary
    public DataSourceTransactionManager zxbTranscationManager(){
        return new DataSourceTransactionManager(createDataSource());
    }

    @Bean("zxbSqlSessionFactory")
    @Primary
    public SqlSessionFactory masterSqlSessionFactory(@Qualifier("mysqlDataSource") DataSource masterDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(masterDataSource);
        sessionFactory.setTypeAliasesPackage("zxb.advance.model.dao");//实体路径
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources("classpath:/mappers/**"));
        return sessionFactory.getObject();

/*ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        try {
            sessionFactory.setConfigLocation(resolver.getResource(""));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }*/

    }

}
