package org.wang.sms.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.format.FormatterRegistry;

import org.springframework.http.converter.HttpMessageConverter;

import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;

import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;


/**
 * Created by ozintel06 on 16/5/16.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 14:44
 */

@Configuration @EnableWebMvc public class MvcConfig extends WebMvcConfigurerAdapter {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * @see  org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#addArgumentResolvers(java.util.List)
   */
  @Override public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
    super.addArgumentResolvers(argumentResolvers);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#addCorsMappings(org.springframework.web.servlet.config.annotation.CorsRegistry)
   */
  @Override public void addCorsMappings(CorsRegistry registry) {
    super.addCorsMappings(registry);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#addFormatters(org.springframework.format.FormatterRegistry)
   */
  @Override public void addFormatters(FormatterRegistry registry) {
    super.addFormatters(registry);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#addInterceptors(org.springframework.web.servlet.config.annotation.InterceptorRegistry)
   */
  @Override public void addInterceptors(InterceptorRegistry registry) {
    super.addInterceptors(registry);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  // 添加静态资源文件
  /**
   * @see  org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#addResourceHandlers(org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry)
   */
  @Override public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry.addResourceHandler("/resources/**").addResourceLocations("/resources");
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#addReturnValueHandlers(java.util.List)
   */
  @Override public void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> returnValueHandlers) {
    super.addReturnValueHandlers(returnValueHandlers);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  // 添加MVC模式配置(请求路径和其对应的页面)
  /**
   * @see  org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#addViewControllers(org.springframework.web.servlet.config.annotation.ViewControllerRegistry)
   */
  @Override public void addViewControllers(ViewControllerRegistry registry) {
// registry.addViewController("/*").setViewName("login");
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#configureAsyncSupport(org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer)
   */
  @Override public void configureAsyncSupport(AsyncSupportConfigurer configurer) {
    super.configureAsyncSupport(configurer);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#configureContentNegotiation(org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer)
   */
  @Override public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
    super.configureContentNegotiation(configurer);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#configureDefaultServletHandling(org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer)
   */
  @Override public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
    super.configureDefaultServletHandling(configurer);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#configureHandlerExceptionResolvers(java.util.List)
   */
  @Override public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> exceptionResolvers) {
    super.configureHandlerExceptionResolvers(exceptionResolvers);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#configureMessageConverters(java.util.List)
   */
  @Override public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
    super.configureMessageConverters(converters);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#configurePathMatch(org.springframework.web.servlet.config.annotation.PathMatchConfigurer)
   */
  @Override public void configurePathMatch(PathMatchConfigurer configurer) {
    super.configurePathMatch(configurer);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#configureViewResolvers(org.springframework.web.servlet.config.annotation.ViewResolverRegistry)
   */
  @Override public void configureViewResolvers(ViewResolverRegistry registry) {
    super.configureViewResolvers(registry);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#extendMessageConverters(java.util.List)
   */
  @Override public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
    super.extendMessageConverters(converters);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#getMessageCodesResolver()
   */
  @Override public MessageCodesResolver getMessageCodesResolver() {
    return super.getMessageCodesResolver();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#getValidator()
   */
  @Override public Validator getValidator() {
    return super.getValidator();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  // 配置跳转文件的前后缀
  /**
   * setupViewResolver.
   *
   * @return  UrlBasedViewResolver
   */
  @Bean public UrlBasedViewResolver setupViewResolver() {
    UrlBasedViewResolver resolver = new UrlBasedViewResolver();
    resolver.setPrefix("/WEB-INF/pages/");
    resolver.setSuffix(".jsp");
    resolver.setViewClass(JstlView.class);

    return resolver;
  }

} // end class MvcConfig
