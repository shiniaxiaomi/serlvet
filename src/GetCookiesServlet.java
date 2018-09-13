import javax.servlet.Servlet;
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
 * @Title: 获得cookies
 * @Date: 2018/9/13 14:40
 */
public class GetCookiesServlet extends HttpServlet implements Servlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");//设置返回的是html格式的,并不是纯文本类型

        Cookie[] cookies=req.getCookies();

        PrintWriter writer = resp.getWriter();
        if(cookies!=null){
            for(int i=0;i<cookies.length;i++){
                writer.write(cookies[i].getName()+":"+cookies[i].getValue()+"<br/>");
            }
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
