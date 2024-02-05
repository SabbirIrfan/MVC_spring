//package springmvc;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.ViewResolver;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.thymeleaf.spring5.SpringTemplateEngine;
//import org.thymeleaf.spring5.view.ThymeleafViewResolver;
//import org.thymeleaf.templatemode.TemplateMode;
//import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
//
//@Configuration
//@EnableWebMvc
//public class ThymeleafConfig implements WebMvcConfigurer {
//
//    @Bean
//    public ViewResolver viewResolver(SpringTemplateEngine templateEngine) {
//        ThymeleafViewResolver resolver = new ThymeleafViewResolver();
//        resolver.setTemplateEngine(templateEngine);
//        return resolver;
//    }
//
//    @Bean
//    public SpringTemplateEngine templateEngine(ClassLoaderTemplateResolver templateResolver) {
//        SpringTemplateEngine engine = new SpringTemplateEngine();
//        engine.setTemplateResolver(templateResolver);
//        return engine;
//    }
//
//    @Bean
//    public ClassLoaderTemplateResolver templateResolver() {
//        ClassLoaderTemplateResolver resolver = new ClassLoaderTemplateResolver();
//        resolver.setPrefix("templates/"); // Set the directory where your Thymeleaf templates are located
//        resolver.setSuffix(".html");
//        resolver.setTemplateMode(TemplateMode.HTML);
//        resolver.setCharacterEncoding("UTF-8");
//        resolver.setOrder(1);
//        resolver.setCacheable(false); // Disable caching for development
//        return resolver;
//    }
//}
