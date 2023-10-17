package com.rohit.springgateway.configurations;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.result.method.annotation.RequestMappingHandlerMapping;

@Configuration
public class RequestMappingHandlerMappingBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof RequestMappingHandlerMapping) {
			((RequestMappingHandlerMapping) bean).setOrder(2);
		}
		return bean;
	}

}
