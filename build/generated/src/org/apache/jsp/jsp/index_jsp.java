package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/jsp/footer1.jsp");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"signup.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"online.css\">\n");
      out.write("         <link href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\" stylesheet\">\n");
      out.write("      <link rel=\" stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap.css\">\n");
      out.write("        <script src=\"jquery.js\"></script>\n");
      out.write("        <script src=\"popper.js\"></script>\n");
      out.write("        <script src=\"bootstrap.js\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>home page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("             <nav class=\"navbar navbar-expand-sm navbar-light s2 fixed-top\">\n");
      out.write("     <a style=\"color: #7f8c8d;padding-left: 5%;\" class=\"navbar-brand\" href=\"\"><b>HungerSaver</b></a>\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarTogglerDemo01\" aria-controls=\"navbarTogglerDemo01\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("  </button>\n");
      out.write("   <div class=\"collapse navbar-collapse\" id=\"navbarTogglerDemo01\">\n");
      out.write("        <ul  class=\"navbar-nav ml-auto\">\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a style=\"color:#7f8c8d;\" class=\"nav-link\" href=\"/html and css/signin.html\"><b>Sign In</b></a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a style=\"color:#7f8c8d;\" class=\"nav-link\" href=\"/html and css/signup.html\"><b>Create an account</b></a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("      \n");
      out.write("    </nav>\n");
      out.write("        \n");
      out.write("        <div id=\"d\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("            <ul class=\"carousel-indicators\">\n");
      out.write("                <li data-target=\"#d\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                <li data-target=\"#d\" data-slide-to=\"1\"></li>\n");
      out.write("                <li data-target=\"#d\" data-slide-to=\"2\"></li>\n");
      out.write("                <li data-target=\"#d\" data-slide-to=\"3\"></li>\n");
      out.write("                <li data-target=\"#d\" data-slide-to=\"4\"></li>\n");
      out.write("                <li data-target=\"#d\" data-slide-to=\"5\"></li>\n");
      out.write("                <li data-target=\"#d\" data-slide-to=\"6\"></li>\n");
      out.write("                <li data-target=\"#d\" data-slide-to=\"7\"></li>\n");
      out.write("                 \n");
      out.write("                </ul>\n");
      out.write("                    <div class=\"carousel-inner\">\n");
      out.write("    <div class=\"carousel-item active\">\n");
      out.write("                    <img src=\"/images/re3.jpg\" alt=\"first\" >\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img src=\"/images/indian.jpg\" alt=\"second\" width=\"1920\" height=\"481\" >\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img src=\"/images/pizza.jpg\" alt=\"third\" width=\"1920\" height=\"481\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img src=\"/images/re4.jpg \"alt=\"fourth\" >\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img src=\"/images/re5.jpg\" alt=\"5\" >\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img src=\"/images/re6.jpg\" alt=\"6\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img src=\"/images/re7.jpg\" alt=\"7\" >\n");
      out.write("                </div>\n");
      out.write("               \n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img src=\"/images/re9.jpg\" alt=\"9\">\n");
      out.write("                </div>\n");
      out.write("               </div>\n");
      out.write("           <a class=\"carousel-control-prev\" href=\"#d\" data-slide=\"prev\">\n");
      out.write("    <span class=\"carousel-control-prev-icon\"></span>\n");
      out.write("  </a>\n");
      out.write("  <a class=\"carousel-control-next\" href=\"#d\" data-slide=\"next\">\n");
      out.write("    <span class=\"carousel-control-next-icon\"></span>\n");
      out.write("  </a>\n");
      out.write("            </div>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\" class=\"fonts-loaded\">\n");
      out.write("    <head>\n");
      out.write("         <link rel=\"stylesheet\" href=\"online.css\">\n");
      out.write("    \n");
      out.write("            <link href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\" stylesheet\">\n");
      out.write("      \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>About Us</title>\n");
      out.write("    <meta name=\"description\" content=\"Interested in Joining Swiggy | Swiggy Careers | Swiggy Jobs | Swiggy Openings\" />\n");
      out.write("    <meta name=\"keywords\" content=\"swiggy, fun,challenging,inclusive,machine learning,AI,young,unicorn,culture,people\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"a.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"b.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <footer style=\"background-color:#2d3436;\" class=\"full-footer\">\n");
      out.write("            <div class=\"container top-footer\">\n");
      out.write("                <div class=\"row s2\">\n");
      out.write("                    <div class=\"col-md-3 \">\n");
      out.write("                        <h4 style=\"color:white;\">The Company</h4>\n");
      out.write("                        <a style=\"color:white;\" href=\"/html and css/about.html\" target=\"_blank\">About us</a><br>\n");
      out.write("\n");
      out.write("                        <a style=\"color:white;\" href=\"\">Blog</a><br>\n");
      out.write("                        <iframe style=\"width: 60%;height: 60%;border:0;\" src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d234700.85820778905!2d77.26580536426654!3d23.199347693033406!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x397c428f8fd68fbd%3A0x2155716d572d4f8!2sBhopal%2C%20Madhya%20Pradesh!5e0!3m2!1sen!2sin!4v1578633074905!5m2!1sen!2sin\" width=\"600\" height=\"450\" frameborder=\"0\"  allowfullscreen=\"\"></iframe>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3 \">\n");
      out.write("                        <h4 style=\"color:white;\">Contact</h4>\n");
      out.write("                        <a style=\"color:white;\" href=\"/html and css/help.html\" target=\"_blank\">Help & Support</a><br>\n");
      out.write("                        <a style=\"color:white;\" href=\"\">Read FAQs</a><br>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3 s2\">\n");
      out.write("                        <h4 style=\"color:white;\">Legal</h4>\n");
      out.write("                        <a style=\"color:white;\" href=\"/html and css/T and C.html\" target=\"_blank\">Terms & Conditions</a><br>\n");
      out.write("                        <a style=\"color:white;\" href=\"/html and css/C and R.html\" target=\"_blank\">Refund & cancellation</a><br>\n");
      out.write("                        <!-- <a href=\"\">Help & Support</a><br>-->\n");
      out.write("                        <a  style=\"color:white;\" href=\"/html and css/privacy.html\" target=\"_blank\">Privacy Policy</a><br>\n");
      out.write("                        <a style=\"color:white;\" href=\"/html and css/cookie.html\" target=\"_blank\">Cookies Policy</a><br>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3 s2\">\n");
      out.write("                        <h4 style=\"color:white;\">Follow On</h4><br>\n");
      out.write("                            <a style=\"color:white;\" href=\"\"><i class=\"fa fa-2x fa-facebook-square\"></i></a>\n");
      out.write("                            <a style=\"color:white;\" href=\"\"><i class=\"fa fa-2x fa-youtube-square\"></i></a>\n");
      out.write("                            <a style=\"color:white;\" href=\"\"><i class=\"fa fa-2x fa-twitter-square\"></i></a>\n");
      out.write("                            <a style=\"color:white;\" href=\"\"><i class=\"fa fa-2x fa-instagram\"></i></a>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write(" \n");
      out.write("        <div style=\"background-color:#2d3436;color:white;\" class=\"footer-copyright text-center py-3\"><img src=\"\"><b> Delivering at your doorstep&nbsp&nbsp&nbsp&nbsp© 2020 Copyright:</b>\n");
      out.write("          \n");
      out.write("            <a href=\"#\" class=\"o-scroll-up static\" title=\"back to top\">\n");
      out.write("  <span class=\"o-scroll-up-text\">^</span>\n");
      out.write("  <span class=\"o-scroll-up-icon\" aria-hidden=\"true\"></span>\n");
      out.write("</a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("           </footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("</body>\n");
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
