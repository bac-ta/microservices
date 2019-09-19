package demo.service.framework.logging;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Deprecated
public class GenRequestIdInterceptorAdapter extends HandlerInterceptorAdapter {

    //@SuppressWarnings("unused")
    //private static final Logger logger = LoggerFactory.getLogger(GenRequestIdInterceptorAdapter.class);
    //
    //private final Tracer tracer;
    //
    //public GenRequestIdInterceptorAdapter(Tracer tracer) {
    //    this.tracer = tracer;
    //}
    //
    //@Override public boolean preHandle(HttpServletRequest request,
    //        HttpServletResponse response,
    //        Object handler) {
    //
    //    Scope scope = tracer.scopeManager().active();
    //    if (scope == null) {
    //        return true;
    //    }
    //    TraceContext ctx = ((BraveSpan) scope.span()).unwrap().context();
    //
    //    MDC.put(LoggingHelpers.TRACE_ID_PREFIX, ctx.traceIdString());
    //    MDC.put(LoggingHelpers.SPAN_ID_PREFIX,  Spans.idToHex(ctx.spanId()));
    //
    //    return true;
    //}
    //
    //@Override public void postHandle(HttpServletRequest request,
    //        HttpServletResponse response,
    //        Object handler,
    //        ModelAndView modelAndView) {
    //
    //    MDC.clear();
    //}
}
