package web.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { AppConfig.class }; // Ваш класс конфигурации с данными
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { WebConfig.class }; // Ваш класс конфигурации MVC
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" }; // Указываем, что все запросы обрабатываются этим сервлетом
    }
}