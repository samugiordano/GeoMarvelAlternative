/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: WildFly 2.2.0.Final - 1.4.0.Final
 * Generated at: 2016-11-25 10:33:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ejb.entities.Posicao;
import java.util.List;

public final class mapa_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("ejb.entities.Posicao");
    _jspx_imports_classes.add("java.util.List");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JBWEB004248: JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      response.addHeader("X-Powered-By", "JSP/2.3");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    List<Posicao> posicoes = (List<Posicao>) request.getAttribute("posicoes");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTf-8\">\r\n");
      out.write("        <title>Mapa</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/ol.css\" type=\"text/css\">\r\n");
      out.write("        <script src=\"js/jquery-1.11.3.min.js\"></script>\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"js/ol.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            $(function () {\r\n");
      out.write("                meuMapa = new ol.Map({\r\n");
      out.write("                    target: 'MeuMapa',\r\n");
      out.write("                    renderer: 'canvas',\r\n");
      out.write("                    view: new ol.View({\r\n");
      out.write("                        projection: 'EPSG:900913',\r\n");
      out.write("                        center: [0, 0],\r\n");
      out.write("                        zoom: 2\r\n");
      out.write("                    })\r\n");
      out.write("                });\r\n");
      out.write("                var openStreetMapLayer = new ol.layer.Tile({\r\n");
      out.write("                    source: new ol.source.OSM()\r\n");
      out.write("                });\r\n");
      out.write("                meuMapa.addLayer(openStreetMapLayer);\r\n");
      out.write("\r\n");
      out.write("            ");
 for (Posicao posicao : posicoes) {
      out.write("\r\n");
      out.write("                var iconFeature = new ol.Feature({\r\n");
      out.write("                    geometry: new ol.geom.Point([");
      out.print(posicao.getLon());
      out.write(',');
      out.write(' ');
      out.print(posicao.getLat());
      out.write("]),\r\n");
      out.write("                    name: '");
      out.print(posicao.getLogin());
      out.write("'\r\n");
      out.write("                });\r\n");
      out.write("                var iconStyle = new ol.style.Style({\r\n");
      out.write("                    image: new ol.style.Icon(({\r\n");
      out.write("                        anchor: [0.5, 46],\r\n");
      out.write("                        anchorXUnits: 'fraction',\r\n");
      out.write("                        anchorYUnits: 'pixels',\r\n");
      out.write("                        opacity: 0.75,\r\n");
      out.write("                        src: 'dados/r2d2.png'\r\n");
      out.write("                    }))\r\n");
      out.write("                });\r\n");
      out.write("                iconFeature.setStyle(iconStyle);\r\n");
      out.write("                var vectorSource = new ol.source.Vector({\r\n");
      out.write("                    features: [iconFeature]\r\n");
      out.write("                });\r\n");
      out.write("                var vectorLayer = new ol.layer.Vector({\r\n");
      out.write("                    source: vectorSource\r\n");
      out.write("                });\r\n");
      out.write("                meuMapa.addLayer(vectorLayer);\r\n");
      out.write("            ");
 }
      out.write("\r\n");
      out.write("\r\n");
      out.write("                var element = document.getElementById('popup');\r\n");
      out.write("                var popup = new ol.Overlay({\r\n");
      out.write("                    element: element,\r\n");
      out.write("                    positioning: 'bottom-center',\r\n");
      out.write("                    stopEvent: false\r\n");
      out.write("                });\r\n");
      out.write("                meuMapa.addOverlay(popup);\r\n");
      out.write("\r\n");
      out.write("                meuMapa.on('click', function (evt) {\r\n");
      out.write("                    var feature = meuMapa.forEachFeatureAtPixel(evt.pixel,\r\n");
      out.write("                            function (feature, layer) {\r\n");
      out.write("                                return feature;\r\n");
      out.write("                            });\r\n");
      out.write("                    if (feature) {\r\n");
      out.write("                        popup.setPosition(evt.coordinate);\r\n");
      out.write("                        var xmlString;\r\n");
      out.write("                        var login = feature.get('name')\r\n");
      out.write("                        var urlString = 'http://localhost:8080/WebRest/LP3Rest/posicoes/';\r\n");
      out.write("                        console.log(urlString);\r\n");
      out.write("                        urlString = urlString.concat(login);\r\n");
      out.write("                        console.log(urlString);\r\n");
      out.write("                        $.ajax({\r\n");
      out.write("                            url: urlString,\r\n");
      out.write("                            data: {\r\n");
      out.write("                                format: 'html'\r\n");
      out.write("                            },\r\n");
      out.write("                            success: function (data) {\r\n");
      out.write("                                $(element).popover({\r\n");
      out.write("                                    'placement': 'top',\r\n");
      out.write("                                    'html': true,\r\n");
      out.write("                                    'content': data\r\n");
      out.write("                                });\r\n");
      out.write("                                $(element).popover('show');\r\n");
      out.write("                            },\r\n");
      out.write("                            error: function (e) {\r\n");
      out.write("                                console.log(e.message);\r\n");
      out.write("                            },\r\n");
      out.write("                            type: 'GET'\r\n");
      out.write("                        });\r\n");
      out.write("                    } else {\r\n");
      out.write("                        $(element).popover('destroy');\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("            <div class=\"row-fluid\">\r\n");
      out.write("                <div class=\"span12\">\r\n");
      out.write("                    <div id=\"MeuMapa\" class=\"map\"><div id=\"popup\"></div></div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}