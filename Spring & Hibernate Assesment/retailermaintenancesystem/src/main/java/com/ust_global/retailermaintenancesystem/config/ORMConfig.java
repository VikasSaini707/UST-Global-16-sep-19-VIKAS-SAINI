package com.ust_global.retailermaintenancesystem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class ORMConfig {

	@Bean
	public LocalEntityManagerFactoryBean getBean()
	{
		LocalEntityManagerFactoryBean bean = 
				new LocalEntityManagerFactoryBean();
		
		bean.setPersistenceUnitName("retailer-unit");
		return bean;
	}
}
