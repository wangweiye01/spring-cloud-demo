package cc.wangweiye.zuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

/**
 * 请求开始前执行
 */
public class FilterPre extends ZuulFilter {

    private static final Logger logger = LoggerFactory.getLogger(FilterPre.class);

    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return FilterConstants.PRE_DECORATION_FILTER_ORDER - 1;
    }

    @Override
    public boolean shouldFilter() {
        String uri = RequestContext.getCurrentContext().getRequest().getServletPath();

        if (uri.contains("/consumer")) {
            // 不鉴权
            return false;
        }
        return true;
    }

    @Override
    public Object run() {
        String uri = RequestContext.getCurrentContext().getRequest().getServletPath();
        logger.info("请求地址" + uri);
        return uri;
    }
}
