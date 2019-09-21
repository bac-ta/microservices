package demo.service.framework.web;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Collections;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.OAuth2Request;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class RequestHandlerInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        OAuth2Request req = new OAuth2Request(Maps.newHashMap(),
                "", Lists.newArrayList(), false, Sets.newHashSet(), Sets.newHashSet(),
                "", Sets.newHashSet(), Maps.newHashMap());

        Authentication token = new UsernamePasswordAuthenticationToken("user", "N/A", Collections.emptyList());
        OAuth2Authentication authentication = new OAuth2Authentication(req, token);

        SecurityContext context = SecurityContextHolder.getContext();
        context.setAuthentication(authentication);

        return true;
    }

}
