package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import pkg.*;

public final class Restaurant_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  String email="";
    try{
    session = request.getSession();
   
    if(session.getAttribute("session_user")==null || session.getAttribute("session_user")=="" || session.getAttribute("session_user").equals(" ")){
        response.sendRedirect("signin.jsp");
    }
    else{
        email = session.getAttribute("session_user").toString();
    }}
    catch(Exception e){
            System.out.println(e);
            }

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Hunger Saver</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"online.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap.css\">\n");
      out.write("        <style>\n");
      out.write("           \n");
      out.write("                  .head{\n");
      out.write("    box-shadow: 0 15px 40px -20px rgba(40,44,63,.15);\n");
      out.write("    position: fixed;\n");
      out.write("    top: 0;\n");
      out.write("    left: 0;\n");
      out.write("    right: 0;\n");
      out.write("    height: 80px;\n");
      out.write("    background: #fff;\n");
      out.write("    z-index: 1000;\n");
      out.write("    transform: translateZ(0);\n");
      out.write("    transition: transform .3s ease;\n");
      out.write("    padding: 0 20px;\n");
      out.write("}\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      <div class=\"_3arMG\">\n");
      out.write("              \n");
      out.write("              <header class=\"head\">\n");
      out.write("             <a style=\"color: #7f8c8d;padding-left:6%;font-size: 200%;\"class=\"navbar-brand\" href=\"\">HungerSaver</a>\n");
      out.write("        </header>\n");
      out.write("      <table  align=\"center\" style=\"width:1200px;margin-top:100px;\">\n");
      out.write("          \n");
      out.write("             <tr>\n");
      out.write("           ");

               int i=0;
        MyConnection x=new MyConnection();
        Connection c=x.getConnection();
    
        PreparedStatement pst=c.prepareStatement("select * from restaurant");
     
        ResultSet rs=pst.executeQuery();
        while(rs.next()){   i++; 
      out.write("\n");
      out.write("         \n");
      out.write("        <td>\n");
      out.write("                       <div class=\"container\">\n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"card-deck\">\n");
      out.write("     <div class=\"card\">\n");
      out.write("         <a href=\"\"><img style=\"padding:2%;\"class=\"card-img-top\" src=\"");
      out.print(rs.getString("rimg"));
      out.write("\" alt=\"Card image cap\">\n");
      out.write("         </a>   <div class=\"card-body\">\n");
      out.write("       <h5><b>");
      out.print(rs.getString("rname"));
      out.write("</b></h5>\n");
      out.write("       <p class=\"card-text\">");
      out.print(rs.getString("rtag"));
      out.write("</p>\n");
      out.write("    <p class=\"card-text\">");
      out.print(rs.getString("radd"));
      out.write("</p>\n");
      out.write("    <div style=\"padding-bottom: 10%;\">\n");
      out.write("    <span Style=\"color: orange;\"class=\"fa fa-star\"></span>\n");
      out.write("<span  Style=\"color: orange;\"class=\"fa fa-star \"></span>\n");
      out.write("<span  Style=\"color: orange;\"class=\"fa fa-star \"></span>\n");
      out.write("<span  Style=\"color: orange;\"class=\"fa fa-star\"></span>\n");
      out.write("<span class=\"fa fa-star\"></span>\n");
      out.write("    </div>\n");
      out.write("    <div style=\"padding-right: 8%;\">\n");
      out.write("         ");
 session.setAttribute("email",email); 
      out.write("\n");
      out.write("        <a href=\"food.jsp?rid=");
      out.print(rs.getString("rid"));
      out.write("\"class=\"btn btn-success\">Order Now</a>\n");
      out.write("  </div>\n");
      out.write("         </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("                       </div>\n");
      out.write("                    </td>\n");
      out.write("                ");
  if(i%4==0)
          {
          out.println("</tr><tr>");
          }            }
        
        
        
        

      out.write("  </tr>  </table>\n");
      out.write("      </div>\n");
      out.write("           <footer class=\"full-footer\">\n");
      out.write("            <div class=\"container top-footer\">\n");
      out.write("                <div class=\"row s2\">\n");
      out.write("                    <div class=\"col-md-3 s3\">\n");
      out.write("                        <h4>The Company</h4>\n");
      out.write("                        <a href=\"\">About us</a><br>\n");
      out.write("\n");
      out.write("                        <a href=\"\">Blog</a><br>\n");
      out.write("                        <iframe style=\"width: 60%;height: 60%;\"src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d234700.85820778905!2d77.26580536426654!3d23.199347693033406!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x397c428f8fd68fbd%3A0x2155716d572d4f8!2sBhopal%2C%20Madhya%20Pradesh!5e0!3m2!1sen!2sin!4v1578633074905!5m2!1sen!2sin\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0;\" allowfullscreen=\"\"></iframe>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3 s2 s3\">\n");
      out.write("                        <h4>Contact</h4>\n");
      out.write("                        <a href=\"\">Help & Support</a><br>\n");
      out.write("                        <a href=\"\">Read FAQs</a><br>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3 s2\">\n");
      out.write("                        <h4>Legal</b></h4>\n");
      out.write("                        <a href=\"\">Terms & Conditions</a><br>\n");
      out.write("                        <a href=\"\">Refund & cancellation</a><br>\n");
      out.write("                        <!-- <a href=\"\">Help & Support</a><br>-->\n");
      out.write("                        <a href=\"\">Privacy Policy</a><br>\n");
      out.write("                        <a href=\"\">Cookies Policy</a><br>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3 s2\">\n");
      out.write("                     <h4>Follow On</h><br>\n");
      out.write("                            <a href=\"\"><i class=\"fa fa-facebook-square\"></i></a>\n");
      out.write("                            <a href=\"\"><i class=\"fa fa-twitter-square\"></i></a>\n");
      out.write("                            <a href=\"\"><i class=\"fa fa-instagram\"></i></a>\n");
      out.write("                            <a href=\"\"><i class=\"fa fa-youtube-square\"></i></a>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        <div style=\"background-color:#dfe6e9;color:#2d3436;\"class=\"footer-copyright text-center py-3\"><b> Delivering at your doorstep&nbsp&nbsp&nbsp&nbsp© 2020 Copyright:</b>\n");
      out.write("            <a href=\"\">Manitian</a>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("   \n");
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
