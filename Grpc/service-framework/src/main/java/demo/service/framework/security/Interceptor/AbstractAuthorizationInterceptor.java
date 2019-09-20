package demo.service.framework.security.Interceptor;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public abstract class AbstractAuthorizationInterceptor extends HandlerInterceptorAdapter {

    // Variables
    // ------------------------------------------------------------------------

    // Constructor
    // ------------------------------------------------------------------------

    // Override Methods
    // ------------------------------------------------------------------------
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
            Object handler) {

        HandlerMethod hm = (HandlerMethod) handler;
        Method method = hm.getMethod();
        Annotation annotation = AnnotationUtils.findAnnotation(method, Annotation.class);
        return true;

//        response.setStatus(HttpServletResponse.SC_FORBIDDEN);
//        return false;
    }

}
