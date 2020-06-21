package net.manage.employee.config;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
@EnableJpaRepositories(basePackages = {"net.manage.controller"})
public class JpaConfig {
     
    @Bean
    public LocalEntityManagerFactoryBean entityManagerFactory()
    {
        LocalEntityManagerFactoryBean factoryBean=new LocalEntityManagerFactoryBean();
        
        factoryBean.setPersistenceUnitName("EmployeeDB");
        return factoryBean;
    }
    
    @Bean
    public JpaTransactionManager transactionManager(EntityManagerFactory emf)
    {
        JpaTransactionManager transManager=new JpaTransactionManager();
        transManager.setEntityManagerFactory(emf);
        return transManager;
    }

}
