package my.erp.org.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootConfiguration
public class ImgFilter implements WebMvcConfigurer {
 
	@Value("${img.url}")
	private String path;
    //拦截器省略
 
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/img/**").addResourceLocations("file:" + "H:/images/");
        registry.addResourceHandler("/img/**").addResourceLocations("file:" + path);
    }
}