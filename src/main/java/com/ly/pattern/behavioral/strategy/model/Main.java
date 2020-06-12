package com.ly.pattern.behavioral.strategy.model;

/**
 * 策略模式(Strategy)
 * 使用场景：提供算法类的选择，满足需求的变换
 * JAVA中的场景：
 * java.util.Comparator#compare
 * javax.servlet.http.HttpServlet#service(HttpServletRequest, HttpServletResponse)
 * javax.servlet.Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
 * java.util.concurrent.ThreadPoolExecutor#setRejectedExecutionHandler(RejectedExecutionHandler)(线程池拒绝策略)
 * 开源实现场景：
 * slf4j中的LoggerFactory.getLogger(Class)，根据类引入情况，来决策使用哪种日志框架（log4j,logback）
 * springboot中的自动装配，根据类引入情况，来决策是否需要自动装配
 * spring IOC容器中bean加载，有懒加载和立即加载策略
 * Tomcat中有BIO、NIO、AIO三种配置策略来处理请求的策略
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new ConcreteStrategyA());
        context.handle();

        context.setStrategy(new ConcreteStrategyB());
        context.handle();
    }
}
