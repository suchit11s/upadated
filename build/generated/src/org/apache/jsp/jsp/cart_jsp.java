package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import pkg.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");

    session = request.getSession();
    String email="";
    if(session.getAttribute("session_user")==null || session.getAttribute("session_user")=="" || session.getAttribute("session_user").equals(" ")){
        response.sendRedirect("signin.jsp");
    }
    else{
        email = session.getAttribute("session_user").toString();
    }

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Hunger Saver</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap.css\">\n");
      out.write("        <style>\n");
      out.write("            .head{\n");
      out.write("    box-shadow: 0 15px 40px -20px rgba(40,44,63,.15);\n");
      out.write("  \n");
      out.write("}\n");
      out.write(".sp{\n");
      out.write("    font-weight: 700;\n");
      out.write("    font-size: 20px;\n");
      out.write("    color: #3d4152;\n");
      out.write("}\n");
      out.write(".head .nav{\n");
      out.write("    position:absolute;\n");
      out.write("    top:30px;\n");
      out.write("    left:150px;\n");
      out.write("    font-weight:600;\n");
      out.write("    font-size: 14px;\n");
      out.write("}\n");
      out.write("html a {\n");
      out.write("  -webkit-font-smoothing: antialiased;\n");
      out.write("  text-shadow: 1px 1px 1px rgba(0, 0, 0, 0.004);\n");
      out.write("}\n");
      out.write("a {\n");
      out.write("  border: 0 none;\n");
      out.write("  outline: 0;\n");
      out.write("  text-decoration: none;\n");
      out.write("}\n");
      out.write(".price:before{\n");
      out.write("  content: 'Rs.';\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("   \n");
      out.write("             \n");
      out.write("               <header class=\"head\">\n");
      out.write("                <a style=\"color: #7f8c8d;padding-left:6%;padding-top: 0.5%;font-size: 300%\" class=\"navbar-brand\" href=\"index.jsp\"><b>H</b></a>\n");
      out.write("            <div class=\"nav\">\n");
      out.write("                <span class=\"sp\">Cart</span>\n");
      out.write("            </div>\n");
      out.write("            </header>\n");
      out.write("              <div class=\"_3arMG\">\n");
      out.write("          \n");
      out.write("        <table border=1 align=center style=\"width:800px;border-radius:8px;\">\n");
      out.write("            \n");
      out.write("        ");

        int msg=Integer.parseInt(request.getParameter("msg"));
        if(msg==0)
        {
        int qty=0;
        qty=Integer.parseInt(request.getParameter("qty"));
        String fid=null;
        String rid=null;
        fid=request.getParameter("fid");
        rid=request.getParameter("rid");
       
          MyConnection x=new MyConnection();
        Connection c=x.getConnection();
    
        PreparedStatement pst=c.prepareStatement("insert into orders(date,qty,fid,rid,email) values(sysdate(),?,?,?,?)");
        pst.setInt(1, qty);
        pst.setString(2,fid);
        pst.setString(3,rid);
        pst.setString(4,email);
        int r=pst.executeUpdate();
        }
         float t=0;
             MyConnection y=new MyConnection();
        Connection c1=y.getConnection();
            PreparedStatement pst1=c1.prepareStatement("select * from food,orders where food.fid=orders.fid"); 
            //pst+1.setString(1,custid);
            ResultSet rs=pst1.executeQuery();
            while(rs.next())
            {
            
          
      out.write("  \n");
      out.write("            <tr>\n");
      out.write("                <td style=\"font-weight:700\">");
      out.print(rs.getString("fname"));
      out.write("   </td>\n");
      out.write("                <td width=\"100\" style=\"font-weight:700;text-align: center;\" class=\"price\">");
      out.print(rs.getInt("price"));
      out.write("   </td>\n");
      out.write("              <td width=\"100\" style=\"font-weight:700;text-align: center;\">");
      out.print(rs.getInt("qty"));
      out.write("   </td>\n");
      out.write("              ");

              t=t+(rs.getInt("price")* rs.getInt("qty"));
              
      out.write("\n");
      out.write("              <td width=\"100\"><img src=\"");
      out.print(rs.getString("fimg"));
      out.write("\" width=\"244\" height=\"160\"></td>\n");
      out.write("              ");
 session.setAttribute("email",email); 
      out.write("\n");
      out.write("              <td width=\"100\" style=\"text-align: center;\"><a href=\"delcart.jsp?fid=");
      out.print(rs.getString("fid"));
      out.write("&rid=");
      out.print(rs.getString("rid"));
      out.write("\">Delete</a></td>\n");
      out.write("            </tr>\n");
      out.write("          ");
  }
        

      out.write("\n");
      out.write("<tr>\n");
      out.write("    <td colspan=\"5\" style=\"font-weight:700\">Total ");
      out.print(t);
      out.write("</td>\n");
      out.write("    <td colspan=\"2\"><a href=\"food.jsp?rid=");
      out.print(request.getParameter("rid"));
      out.write("\">Continue</a> \n");
      out.write("            <a href=\"\">Checkout</a>\n");
      out.write("        </td>\n");
      out.write("</tr>\n");
      out.write("        </table>\n");
      out.write("            <div style=\"background-color:#282c3f;color:#fff;\"class=\"footer-copyright text-center py-3\"><img src=\"\"></img><b> Delivering at your doorstep&nbsp&nbsp&nbsp&nbsp© 2020 Copyright:</b>\n");
      out.write("            <a href=\"\">Manitian</a>\n");
      out.write("        </div>\n");
      out.write("            </div>\n");
      out.write("         \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
