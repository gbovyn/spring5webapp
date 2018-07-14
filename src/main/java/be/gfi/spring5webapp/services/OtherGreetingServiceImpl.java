package be.gfi.spring5webapp.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
@Profile({"test", "default"})
@Slf4j
public class OtherGreetingServiceImpl implements GreetingService, BeanPostProcessor, InitializingBean, DisposableBean,
        BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    @Override
    public void greet() {
        log.info("Hello from {}!", getClass().getSimpleName());
    }

    @PostConstruct
    public void postConstruct() {
        log.info("postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        log.info("preDestroy");
    }

    @Override
    public Object postProcessBeforeInitialization(final Object bean, final String beanName) throws BeansException {
        log.debug("postProcessBeforeInitialization for {}", beanName);

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(final Object bean, final String beanName) throws BeansException {
        log.debug("postProcessAfterInitialization for {}", beanName);

        return bean;
    }

    @Override
    public void setBeanFactory(final BeanFactory beanFactory) throws BeansException {
        log.info("setBeanFactory");
    }

    @Override
    public void setBeanName(final String name) {
        log.info("setBeanName: {}", name);
    }

    @Override
    public void destroy() throws Exception {
        log.info("destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("afterPropertiesSet");
    }

    @Override
    public void setApplicationContext(final ApplicationContext applicationContext) throws BeansException {
        log.info("setApplicationContext");
    }
}
