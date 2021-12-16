import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // списочек продуктов
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            products.add(new Product((int) i + 1, "Product: " + i + 1, BigDecimal.valueOf(Math.random() * 1000)));
        }
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().printf("<html> <body>");
        for (int i = 0; i < products.size(); i++) {
            resp.getWriter().println("<h3>" + products.get(i) + "</h3>");
        }
    }
}
