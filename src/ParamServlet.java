import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by 陆英杰
 * 2018/9/12 23:45
 */

/**
 * @Title: 获取页面中传过来的参数:  req.getParameter("param1")
 * @Date: 2018/9/13 13:21
 */
public class ParamServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");//设置返回的是html格式的,并不是纯文本类型

        PrintWriter writer = resp.getWriter();
        writer.write(req.getParameter("param1")+"<br/>");
        writer.write(req.getParameter("param2")+"<br/>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost");
        this.doGet(req, resp);
    }
}
