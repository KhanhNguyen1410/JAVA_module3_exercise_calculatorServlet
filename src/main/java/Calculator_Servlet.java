import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Calculator_Servlet", urlPatterns = "/discount")
public class Calculator_Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("description");
        int price = Integer.parseInt(request.getParameter("price"));
        float discountPercent = Float.parseFloat(request.getParameter("discount percent"));
        double discountPrice = price * discountPercent *0.01;


        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Rate: " + description+ "</h1>");
        writer.println("<h1>USD: " + discountPercent+ "</h1>");
        writer.println("<h1>VND: " + discountPrice+ "</h1>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
