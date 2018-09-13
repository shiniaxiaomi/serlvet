/**
 * Created by Yingjie.Lu on 2018/9/13.
 */

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Title: 测试servlet的生命周期
 *
 * 测试结果:
 *          当浏览器第一次发送请求的时候,容器会构造一个请求对应的Servlet,那么会首先调用servlet的构造方法
 *          然后在调用servlet的init()方法
 *          然后在调用servlet的doGet()或者是doPost()方法
 *          当浏览器再次发送请求的时候,容器会直接调用servlet的doGet()或者是doPost()方法,不会再去重新构造一个新的servlet(即单例)
 *          最后当停止web容器(如tomcat)时,会销毁掉所有的servlet
 * @Date: 2018/9/13 13:21
 */
public class TestLifeCycleServlet extends HttpServlet{

    public TestLifeCycleServlet() {
        System.out.println("构造");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet");
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
       System.out.println("init");
    }
}
