package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import pkg.*;

public final class food_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\" class=\"no-js\">\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap1.css\">\n");
      out.write("        <style>\n");
      out.write("           \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("html,\n");
      out.write("html a {\n");
      out.write("  -webkit-font-smoothing: antialiased;\n");
      out.write("  text-shadow: 1px 1px 1px rgba(0, 0, 0, 0.004);\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("  background-color: #fff;\n");
      out.write("  color: #666;\n");
      out.write("  font-family: 'Open Sans', sans-serif;\n");
      out.write("  font-size: 92.5%;\n");
      out.write("  margin: 0 auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a {\n");
      out.write("  border: 0 none;\n");
      out.write("  outline: 0;\n");
      out.write("  text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("strong {\n");
      out.write("  font-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write("p {\n");
      out.write("  margin: 0.75rem 0 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h1 {\n");
      out.write("  font-size: 0.75rem;\n");
      out.write("  font-weight: normal;\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input,\n");
      out.write("button {\n");
      out.write("  border: 0 none;\n");
      out.write("  outline: 0 none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button {\n");
      out.write("  background-color: #666;\n");
      out.write("  color: #fff;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button:hover,\n");
      out.write("button:focus {\n");
      out.write("  background-color: #555;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".basket-module,\n");
      out.write(".basket-labels,\n");
      out.write(".basket-product {\n");
      out.write("  width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input,\n");
      out.write("button,\n");
      out.write(".basket,\n");
      out.write(".basket-module,\n");
      out.write(".basket-labels,\n");
      out.write(".item,\n");
      out.write(".price,\n");
      out.write(".quantity,\n");
      out.write(".basket-product,\n");
      out.write(".product-image\n");
      out.write(".product-details {\n");
      out.write("  float: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".price:before{\n");
      out.write("  content: 'Rs.';\n");
      out.write("}\n");
      out.write("\n");
      out.write(".hide {\n");
      out.write("  display: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("main {\n");
      out.write("  clear: both;\n");
      out.write("  font-size: 0.75rem;\n");
      out.write("  margin: 0 auto;\n");
      out.write("  overflow: hidden;\n");
      out.write("  padding: 1rem 0;\n");
      out.write("  width: 960px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".basket{\n");
      out.write("  padding: 0 1rem;\n");
      out.write("  -webkit-box-sizing: border-box;\n");
      out.write("  -moz-box-sizing: border-box;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".basket {\n");
      out.write("  width: 70%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".basket-module {\n");
      out.write("  color: #282c3f;\n");
      out.write("}\n");
      out.write("\n");
      out.write("label {\n");
      out.write("  display: block;\n");
      out.write("  margin-bottom: 0.3125rem;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".basket-labels {\n");
      out.write("  border-top: 1px solid #282c3f;\n");
      out.write("  border-bottom: 1px solid #282c3f;\n");
      out.write("  margin-top: 1.625rem;\n");
      out.write("  font-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write("ul {\n");
      out.write("  list-style: none;\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li {\n");
      out.write("  color: #282c3f;\n");
      out.write("  display: inline-block;\n");
      out.write("  padding: 0.625rem 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li.price:before{\n");
      out.write("  content: '';\n");
      out.write("}\n");
      out.write("\n");
      out.write(".item {\n");
      out.write("  width: 55%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".price,\n");
      out.write(".quantity{\n");
      out.write("  width: 15%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".item-heading {\n");
      out.write("  padding-left: 4.375rem;\n");
      out.write("  -webkit-box-sizing: border-box;\n");
      out.write("  -moz-box-sizing: border-box;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".basket-product {\n");
      out.write("  border-bottom: 1px solid #282c3f;\n");
      out.write("  padding: 1rem 0;\n");
      out.write("  position: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".product-details {\n");
      out.write("  width: 65%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".product-details {\n");
      out.write("  padding: 0 2.5rem;\n");
      out.write("  -webkit-box-sizing: border-box;\n");
      out.write("  -moz-box-sizing: border-box;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".quantity-field {\n");
      out.write("  background-color: #282c3f;\n");
      out.write("  border: 1px solid #282c3f;\n");
      out.write("  border-radius: 4px;\n");
      out.write("  font-size: 0.8rem;\n");
      out.write("  padding: 2px;\n");
      out.write("  width: 3.75rem;\n");
      out.write("  color: #fff;\n");
      out.write("}\n");
      out.write(".cart-field {\n");
      out.write("  background-color: #282c3f;\n");
      out.write("  border: 1px solid #282c3f;\n");
      out.write("  border-radius: 4px;\n");
      out.write("  font-size: 0.8rem;\n");
      out.write("  padding: 2px;\n");
      out.write("  width: 6.75rem;\n");
      out.write("  color: #fff;\n");
      out.write("  font-weight: bold;\n");
      out.write("  \n");
      out.write("}\n");
      out.write("\n");
      out.write("@media screen and (max-width: 640px) {\n");
      out.write("  .basket,\n");
      out.write("  .item{\n");
      out.write("    width: 100%;\n");
      out.write("  }\n");
      out.write("  .basket-labels {\n");
      out.write("    display: none;\n");
      out.write("  }\n");
      out.write("  .item {\n");
      out.write("    margin-bottom: 1rem;\n");
      out.write("  }\n");
      out.write("  .product-details {\n");
      out.write("    width: 60%;\n");
      out.write("  }\n");
      out.write("  .price{\n");
      out.write("    width: 33%;\n");
      out.write("  }\n");
      out.write("  .quantity {\n");
      out.write("    text-align: center;\n");
      out.write("    width: 34%;\n");
      out.write("  }\n");
      out.write("  .quantity-field {\n");
      out.write("    float: none;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media screen and (max-width: 960px) {\n");
      out.write("  main {\n");
      out.write("    width: 100%;\n");
      out.write("  }\n");
      out.write("  .product-details {\n");
      out.write("    padding: 0 1rem;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("  \t\n");
      out.write("\t<title>Hunger Saver</title>\n");
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("         \n");
      out.write("         \n");
      out.write("        <div class=\"_3arMG\"> \n");
      out.write("            <header>\n");
      out.write("             <a style=\"color: #7f8c8d;padding-left:6%;font-size: 200%;\"class=\"navbar-brand\" href=\"index.jsp\">HungerSaver</a>\n");
      out.write("        </header>\n");
      out.write("        ");
  
         String rid=request.getParameter("rid");
        MyConnection x=new MyConnection();
        Connection c=x.getConnection();
        
        PreparedStatement pst=c.prepareStatement("select * from restaurant where rid=?");
        pst.setString(1,rid);
        ResultSet rs=pst.executeQuery();
        if(rs.next()){
      out.write("\n");
      out.write("        <div class=\"_1637z\">\n");
      out.write("            <div class=\"_8MlDE\">\n");
      out.write("                <div class=\"_3TBoD\">\n");
      out.write("                    <div class=\"_3mJdF\">\n");
      out.write("                        <div class=\"H5I6J\">\n");
      out.write("                            <img class=\"_2tuBw _3sCWI\" width=\"254\" height=\"165\" alt src=\"");
      out.print(rs.getString("rimg"));
      out.write("\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"_2Fixt\">\n");
      out.write("                        <div class=\"_1WDSQ\">\n");
      out.write("                            <div class=\"U-jcg\">\n");
      out.write("                                <div class=\"OEfxz\">\n");
      out.write("                                    <h1 title=\"Hbt Bakery\" class=\"_3aqeL\">");
      out.print(rs.getString("rname"));
      out.write("</h1>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"_1BpLF\">\n");
      out.write("                                <div class=\"_3Plw0 JMACF\">");
      out.print(rs.getString("rtag"));
      out.write("</div>\n");
      out.write("                                <div class=\"Gf2NS _2Y6HW\">");
      out.print(rs.getString("radd"));
      out.write("</div>\n");
      out.write("                                <br>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("      ");
  }  
      out.write("\n");
      out.write("          <div class=\"basket\">\n");
      out.write("      <div class=\"basket-labels\">\n");
      out.write("        <ul>\n");
      out.write("          <li class=\"item item-heading\">Item</li>\n");
      out.write("          <li class=\"price\">Price</li>\n");
      out.write("          <li class=\"quantity\">Quantity</li>\n");
      out.write("          \n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("           ");

               int i=1;
        MyConnection y=new MyConnection();
        Connection d=y.getConnection();
        
        PreparedStatement pst1=d.prepareStatement("select * from food where rid=?");
        pst1.setString(1,rid);
        ResultSet rs1=pst1.executeQuery();
         
        while(rs1.next()){    
      out.write("\n");
      out.write("          \n");
      out.write("                        \n");
      out.write("                          \n");
      out.write("                                    <form action=\"cart.jsp\">    \n");
      out.write("                                        ");
 session.setAttribute("email",email); 
      out.write("\n");
      out.write("                            <div class=\"basket-product\">\n");
      out.write("        <div class=\"item\">\n");
      out.write("             <div class=\"product-details\">\n");
      out.write("              <h1 name=\"fname\" style=\"font-size:150%;color:#282c3f;font-weight: bold;\">");
      out.print(rs1.getString("fname"));
      out.write("</h1>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"product-image\">\n");
      out.write("              <img src=\"");
      out.print(rs1.getString("fimg"));
      out.write("\" alt=\"Placholder Image 2\" class=\"product-frame\" height=\"160\" width=\"244\">\n");
      out.write("          </div>\n");
      out.write("         \n");
      out.write("        </div>\n");
      out.write("              <div class=\"price\" style=\"color:#282c3f;font-weight: bold;\">");
      out.print(rs1.getInt("price"));
      out.write("</div>\n");
      out.write("        <div class=\"quantity\">\n");
      out.write("            <input type=\"number\" value=\"0\" min=\"0\" class=\"quantity-field\" name=\"qty\">\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("        <input type=\"hidden\" value=\"");
      out.print(rs1.getString("fid"));
      out.write("\" name=\"fid\">\n");
      out.write("        <input type=\"submit\" value=\"ADD TO CART\" class=\"cart-field\">\n");
      out.write("        <input type=\"hidden\" value=\"");
      out.print(rs1.getString("rid"));
      out.write("\" name=\"rid\">\n");
      out.write("        <input type=\"hidden\" value=\"");
      out.print(0);
      out.write("\" name=\"msg\">\n");
      out.write("      </div>\n");
      out.write("                                    </form>                            \n");
      out.write("                                   \n");
      out.write("                         \n");
      out.write("           \n");
      out.write("                              ");
  }
        
        
        
        
                              
      out.write("\n");
      out.write("                            \n");
      out.write("       \n");
      out.write("</div>\n");
      out.write("                \n");
      out.write("  <div class=\"_5ZwHn\" style=\"margin-left:1000px;position:fixed;margin-top:90px; \">\n");
      out.write("            <div class=\"_13V5d\">\n");
      out.write("                <div class=\"\">\n");
      out.write("                    <img src=\"images\\cart.png\" width=\"100%\">\n");
      out.write("                    <div class=\"_1Qxa0\">Good food is always cooking! Go ahead, order some yummy items from the menu.</div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("    </div>\n");
      out.write("        <div style=\"background-color:#282c3f;color:#fff;\"class=\"footer-copyright text-center py-3\"><img src=\"\"></img><b> Delivering at your doorstep&nbsp&nbsp&nbsp&nbsp© 2020 Copyright:</b>\n");
      out.write("            <a href=\"\">Manitian</a>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
