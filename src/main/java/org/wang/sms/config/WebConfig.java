package org.wang.sms.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


/**
 * Created by ozintel06 on 16/6/12.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 14:44
 */
public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * @see  org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer#getRootConfigClasses()
   */
  @Override protected Class<?>[] getRootConfigClasses() {
    return null;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer#getServletConfigClasses()
   */
  @Override protected Class<?>[] getServletConfigClasses() {
    return new Class[] { MvcConfig.class };
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.springframework.web.servlet.support.AbstractDispatcherServletInitializer#getServletMappings()
   */
  @Override protected String[] getServletMappings() {
    return new String[] { "/" };
  }
} // end class WebConfig
