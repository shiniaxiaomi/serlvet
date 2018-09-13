import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Yingjie.Lu on 2018/9/13.
 */

/**
 * @Title: 设置cookie
 * @Date: 2018/9/13 14:31
 */
public class SetCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");//设置返回的是html格式的,并不是纯文本类型

        Cookie cookie=new Cookie("MyCookies","hello");
        cookie.setMaxAge(3600);

        resp.addCookie(cookie);

        resp.getWriter().write("cookie write success!<br/>");
        resp.getWriter().write("<a href='/GetCookiesServlet'>show cookies<a/>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }

}
