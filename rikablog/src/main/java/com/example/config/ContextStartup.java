package com.example.config;

import com.example.service.MPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;

@Component
public class ContextStartup implements ApplicationRunner, ServletContextAware {
    private ServletContext servletContext;
    @Autowired
    MPostService postService;

    @Override
    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        servletContext.setAttribute("base", servletContext.getContextPath());
        //初始化首页的周评论排行榜
        postService.initWeekRank();
    }
}
