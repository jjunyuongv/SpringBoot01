/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.40
 * Generated at: 2025-05-13 07:24:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp._11JSTL.etc;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class Xml_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/lib/jakarta.servlet.jsp.jstl-3.0.1.jar", Long.valueOf(1747033872563L));
    _jspx_dependants.put("jar:file:/C:/DevData/JSP_Servlet/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/MustHHaveJSP/WEB-INF/lib/jakarta.servlet.jsp.jstl-3.0.1.jar!/META-INF/c.tld", Long.valueOf(1664421078000L));
    _jspx_dependants.put("jar:file:/C:/DevData/JSP_Servlet/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/MustHHaveJSP/WEB-INF/lib/jakarta.servlet.jsp.jstl-3.0.1.jar!/META-INF/x.tld", Long.valueOf(1664421078000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fcharEncoding_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fx_005fparse_0026_005fxml_005fvar_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fx_005fout_0026_005fselect_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fx_005fforEach_0026_005fvar_005fselect;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fx_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fx_005fwhen_0026_005fselect;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fx_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fx_005fif_0026_005fselect;

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fcharEncoding_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fx_005fparse_0026_005fxml_005fvar_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fx_005fout_0026_005fselect_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fx_005fforEach_0026_005fvar_005fselect = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fx_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fx_005fwhen_0026_005fselect = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fx_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fx_005fif_0026_005fselect = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar.release();
    _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fcharEncoding_005fnobody.release();
    _005fjspx_005ftagPool_005fx_005fparse_0026_005fxml_005fvar_005fnobody.release();
    _005fjspx_005ftagPool_005fx_005fout_0026_005fselect_005fnobody.release();
    _005fjspx_005ftagPool_005fx_005fforEach_0026_005fvar_005fselect.release();
    _005fjspx_005ftagPool_005fx_005fchoose.release();
    _005fjspx_005ftagPool_005fx_005fwhen_0026_005fselect.release();
    _005fjspx_005ftagPool_005fx_005fotherwise.release();
    _005fjspx_005ftagPool_005fx_005fif_0026_005fselect.release();
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("	<head>\r\n");
      out.write("	<meta charset=\"UTF-8\">\r\n");
      out.write("	<title>JSTL - xml</title>\r\n");
      out.write("	</head>\r\n");
      out.write("	<body>\r\n");
      out.write("		");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("		\r\n");
      out.write("		");
      if (_jspx_meth_x_005fparse_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("		\r\n");
      out.write("		<h4>파싱 1</h4>\r\n");
      out.write("		제목 : ");
      if (_jspx_meth_x_005fout_005f0(_jspx_page_context))
        return;
      out.write("<br />\r\n");
      out.write("		저자 : ");
      if (_jspx_meth_x_005fout_005f1(_jspx_page_context))
        return;
      out.write("<br />\r\n");
      out.write("		가격 : ");
      if (_jspx_meth_x_005fout_005f2(_jspx_page_context))
        return;
      out.write("<br />\r\n");
      out.write("		\r\n");
      out.write("		<h4>파싱 2</h4>\r\n");
      out.write("		<table border=\"1\">\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th>제목</th><th>저자</th><th>가격</th>\r\n");
      out.write("			</tr>\r\n");
      out.write("			");
      if (_jspx_meth_x_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("		</table>\r\n");
      out.write("		\r\n");
      out.write("		<h4>피싱 3</h4>\r\n");
      out.write("		<table border=\"1\">\r\n");
      out.write("			");
      if (_jspx_meth_x_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("		</table>\r\n");
      out.write("		\r\n");
      out.write("	</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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

  private boolean _jspx_meth_c_005fset_005f0(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    jakarta.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /11JSTL/etc/Xml.jsp(12,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("booklist");
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_eval_c_005fset_005f0 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_005fset_005f0 != jakarta.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_c_005fset_005f0);
      }
      do {
        out.write("\r\n");
        out.write("			");
        if (_jspx_meth_c_005fimport_005f0(_jspx_th_c_005fset_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("		");
        int evalDoAfterBody = _jspx_th_c_005fset_005f0.doAfterBody();
        if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_005fset_005f0 != jakarta.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_c_005fset_005f0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fimport_005f0(jakarta.servlet.jsp.tagext.JspTag _jspx_th_c_005fset_005f0, jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    jakarta.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_005fimport_005f0 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fcharEncoding_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_005fimport_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fimport_005f0.setParent((jakarta.servlet.jsp.tagext.Tag) _jspx_th_c_005fset_005f0);
    // /11JSTL/etc/Xml.jsp(13,3) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fimport_005f0.setUrl("/11JSTL/inc/BookList.xml");
    // /11JSTL/etc/Xml.jsp(13,3) name = charEncoding type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fimport_005f0.setCharEncoding("UTF-8");
    int[] _jspx_push_body_count_c_005fimport_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fimport_005f0 = _jspx_th_c_005fimport_005f0.doStartTag();
      if (_jspx_th_c_005fimport_005f0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fimport_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fimport_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fimport_005f0.doFinally();
    }
    _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fcharEncoding_005fnobody.reuse(_jspx_th_c_005fimport_005f0);
    return false;
  }

  private boolean _jspx_meth_x_005fparse_005f0(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    //  x:parse
    org.apache.taglibs.standard.tag.rt.xml.ParseTag _jspx_th_x_005fparse_005f0 = (org.apache.taglibs.standard.tag.rt.xml.ParseTag) _005fjspx_005ftagPool_005fx_005fparse_0026_005fxml_005fvar_005fnobody.get(org.apache.taglibs.standard.tag.rt.xml.ParseTag.class);
    _jspx_th_x_005fparse_005f0.setPageContext(_jspx_page_context);
    _jspx_th_x_005fparse_005f0.setParent(null);
    // /11JSTL/etc/Xml.jsp(16,2) name = xml type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_x_005fparse_005f0.setXml((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ booklist }", java.lang.Object.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
    // /11JSTL/etc/Xml.jsp(16,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_x_005fparse_005f0.setVar("blist");
    int _jspx_eval_x_005fparse_005f0 = _jspx_th_x_005fparse_005f0.doStartTag();
    if (_jspx_th_x_005fparse_005f0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005fx_005fparse_0026_005fxml_005fvar_005fnobody.reuse(_jspx_th_x_005fparse_005f0);
    return false;
  }

  private boolean _jspx_meth_x_005fout_005f0(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    //  x:out
    org.apache.taglibs.standard.tag.rt.xml.ExprTag _jspx_th_x_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.xml.ExprTag) _005fjspx_005ftagPool_005fx_005fout_0026_005fselect_005fnobody.get(org.apache.taglibs.standard.tag.rt.xml.ExprTag.class);
    _jspx_th_x_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_x_005fout_005f0.setParent(null);
    // /11JSTL/etc/Xml.jsp(19,7) name = select type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_x_005fout_005f0.setSelect("$blist/booklist/book[1]/name");
    int _jspx_eval_x_005fout_005f0 = _jspx_th_x_005fout_005f0.doStartTag();
    if (_jspx_th_x_005fout_005f0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005fx_005fout_0026_005fselect_005fnobody.reuse(_jspx_th_x_005fout_005f0);
    return false;
  }

  private boolean _jspx_meth_x_005fout_005f1(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    //  x:out
    org.apache.taglibs.standard.tag.rt.xml.ExprTag _jspx_th_x_005fout_005f1 = (org.apache.taglibs.standard.tag.rt.xml.ExprTag) _005fjspx_005ftagPool_005fx_005fout_0026_005fselect_005fnobody.get(org.apache.taglibs.standard.tag.rt.xml.ExprTag.class);
    _jspx_th_x_005fout_005f1.setPageContext(_jspx_page_context);
    _jspx_th_x_005fout_005f1.setParent(null);
    // /11JSTL/etc/Xml.jsp(20,7) name = select type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_x_005fout_005f1.setSelect("$blist/booklist/book[1]/author");
    int _jspx_eval_x_005fout_005f1 = _jspx_th_x_005fout_005f1.doStartTag();
    if (_jspx_th_x_005fout_005f1.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005fx_005fout_0026_005fselect_005fnobody.reuse(_jspx_th_x_005fout_005f1);
    return false;
  }

  private boolean _jspx_meth_x_005fout_005f2(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    //  x:out
    org.apache.taglibs.standard.tag.rt.xml.ExprTag _jspx_th_x_005fout_005f2 = (org.apache.taglibs.standard.tag.rt.xml.ExprTag) _005fjspx_005ftagPool_005fx_005fout_0026_005fselect_005fnobody.get(org.apache.taglibs.standard.tag.rt.xml.ExprTag.class);
    _jspx_th_x_005fout_005f2.setPageContext(_jspx_page_context);
    _jspx_th_x_005fout_005f2.setParent(null);
    // /11JSTL/etc/Xml.jsp(21,7) name = select type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_x_005fout_005f2.setSelect("$blist/booklist/book[1]/price");
    int _jspx_eval_x_005fout_005f2 = _jspx_th_x_005fout_005f2.doStartTag();
    if (_jspx_th_x_005fout_005f2.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005fx_005fout_0026_005fselect_005fnobody.reuse(_jspx_th_x_005fout_005f2);
    return false;
  }

  private boolean _jspx_meth_x_005fforEach_005f0(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    jakarta.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  x:forEach
    org.apache.taglibs.standard.tag.common.xml.ForEachTag _jspx_th_x_005fforEach_005f0 = (org.apache.taglibs.standard.tag.common.xml.ForEachTag) _005fjspx_005ftagPool_005fx_005fforEach_0026_005fvar_005fselect.get(org.apache.taglibs.standard.tag.common.xml.ForEachTag.class);
    _jspx_th_x_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_x_005fforEach_005f0.setParent(null);
    // /11JSTL/etc/Xml.jsp(28,3) name = select type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_x_005fforEach_005f0.setSelect("$blist/booklist/book");
    // /11JSTL/etc/Xml.jsp(28,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_x_005fforEach_005f0.setVar("item");
    int[] _jspx_push_body_count_x_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_x_005fforEach_005f0 = _jspx_th_x_005fforEach_005f0.doStartTag();
      if (_jspx_eval_x_005fforEach_005f0 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("			<tr>\r\n");
          out.write("				<td>");
          if (_jspx_meth_x_005fout_005f3(_jspx_th_x_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_x_005fforEach_005f0))
            return true;
          out.write("</td>\r\n");
          out.write("				<td>");
          if (_jspx_meth_x_005fout_005f4(_jspx_th_x_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_x_005fforEach_005f0))
            return true;
          out.write("</td>\r\n");
          out.write("				<td>\r\n");
          out.write("					");
          if (_jspx_meth_x_005fchoose_005f0(_jspx_th_x_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_x_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("				</td>\r\n");
          out.write("			</tr>\r\n");
          out.write("			");
          int evalDoAfterBody = _jspx_th_x_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_x_005fforEach_005f0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_x_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_x_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_x_005fforEach_005f0.doFinally();
    }
    _005fjspx_005ftagPool_005fx_005fforEach_0026_005fvar_005fselect.reuse(_jspx_th_x_005fforEach_005f0);
    return false;
  }

  private boolean _jspx_meth_x_005fout_005f3(jakarta.servlet.jsp.tagext.JspTag _jspx_th_x_005fforEach_005f0, jakarta.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_x_005fforEach_005f0)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    //  x:out
    org.apache.taglibs.standard.tag.rt.xml.ExprTag _jspx_th_x_005fout_005f3 = (org.apache.taglibs.standard.tag.rt.xml.ExprTag) _005fjspx_005ftagPool_005fx_005fout_0026_005fselect_005fnobody.get(org.apache.taglibs.standard.tag.rt.xml.ExprTag.class);
    _jspx_th_x_005fout_005f3.setPageContext(_jspx_page_context);
    _jspx_th_x_005fout_005f3.setParent((jakarta.servlet.jsp.tagext.Tag) _jspx_th_x_005fforEach_005f0);
    // /11JSTL/etc/Xml.jsp(30,8) name = select type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_x_005fout_005f3.setSelect("$item/name");
    int _jspx_eval_x_005fout_005f3 = _jspx_th_x_005fout_005f3.doStartTag();
    if (_jspx_th_x_005fout_005f3.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005fx_005fout_0026_005fselect_005fnobody.reuse(_jspx_th_x_005fout_005f3);
    return false;
  }

  private boolean _jspx_meth_x_005fout_005f4(jakarta.servlet.jsp.tagext.JspTag _jspx_th_x_005fforEach_005f0, jakarta.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_x_005fforEach_005f0)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    //  x:out
    org.apache.taglibs.standard.tag.rt.xml.ExprTag _jspx_th_x_005fout_005f4 = (org.apache.taglibs.standard.tag.rt.xml.ExprTag) _005fjspx_005ftagPool_005fx_005fout_0026_005fselect_005fnobody.get(org.apache.taglibs.standard.tag.rt.xml.ExprTag.class);
    _jspx_th_x_005fout_005f4.setPageContext(_jspx_page_context);
    _jspx_th_x_005fout_005f4.setParent((jakarta.servlet.jsp.tagext.Tag) _jspx_th_x_005fforEach_005f0);
    // /11JSTL/etc/Xml.jsp(31,8) name = select type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_x_005fout_005f4.setSelect("$item/author");
    int _jspx_eval_x_005fout_005f4 = _jspx_th_x_005fout_005f4.doStartTag();
    if (_jspx_th_x_005fout_005f4.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005fx_005fout_0026_005fselect_005fnobody.reuse(_jspx_th_x_005fout_005f4);
    return false;
  }

  private boolean _jspx_meth_x_005fchoose_005f0(jakarta.servlet.jsp.tagext.JspTag _jspx_th_x_005fforEach_005f0, jakarta.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_x_005fforEach_005f0)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    jakarta.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  x:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_x_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fx_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_x_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_x_005fchoose_005f0.setParent((jakarta.servlet.jsp.tagext.Tag) _jspx_th_x_005fforEach_005f0);
    int _jspx_eval_x_005fchoose_005f0 = _jspx_th_x_005fchoose_005f0.doStartTag();
    if (_jspx_eval_x_005fchoose_005f0 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("						");
        if (_jspx_meth_x_005fwhen_005f0(_jspx_th_x_005fchoose_005f0, _jspx_page_context, _jspx_push_body_count_x_005fforEach_005f0))
          return true;
        out.write("\r\n");
        out.write("						");
        if (_jspx_meth_x_005fotherwise_005f0(_jspx_th_x_005fchoose_005f0, _jspx_page_context, _jspx_push_body_count_x_005fforEach_005f0))
          return true;
        out.write("\r\n");
        out.write("					");
        int evalDoAfterBody = _jspx_th_x_005fchoose_005f0.doAfterBody();
        if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_x_005fchoose_005f0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005fx_005fchoose.reuse(_jspx_th_x_005fchoose_005f0);
    return false;
  }

  private boolean _jspx_meth_x_005fwhen_005f0(jakarta.servlet.jsp.tagext.JspTag _jspx_th_x_005fchoose_005f0, jakarta.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_x_005fforEach_005f0)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    jakarta.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  x:when
    org.apache.taglibs.standard.tag.common.xml.WhenTag _jspx_th_x_005fwhen_005f0 = (org.apache.taglibs.standard.tag.common.xml.WhenTag) _005fjspx_005ftagPool_005fx_005fwhen_0026_005fselect.get(org.apache.taglibs.standard.tag.common.xml.WhenTag.class);
    _jspx_th_x_005fwhen_005f0.setPageContext(_jspx_page_context);
    _jspx_th_x_005fwhen_005f0.setParent((jakarta.servlet.jsp.tagext.Tag) _jspx_th_x_005fchoose_005f0);
    // /11JSTL/etc/Xml.jsp(34,6) name = select type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_x_005fwhen_005f0.setSelect("$item/price >= 20000");
    int _jspx_eval_x_005fwhen_005f0 = _jspx_th_x_005fwhen_005f0.doStartTag();
    if (_jspx_eval_x_005fwhen_005f0 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("							2만 원 이상 <br />\r\n");
        out.write("						");
        int evalDoAfterBody = _jspx_th_x_005fwhen_005f0.doAfterBody();
        if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_x_005fwhen_005f0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005fx_005fwhen_0026_005fselect.reuse(_jspx_th_x_005fwhen_005f0);
    return false;
  }

  private boolean _jspx_meth_x_005fotherwise_005f0(jakarta.servlet.jsp.tagext.JspTag _jspx_th_x_005fchoose_005f0, jakarta.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_x_005fforEach_005f0)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    jakarta.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  x:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_x_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fx_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_x_005fotherwise_005f0.setPageContext(_jspx_page_context);
    _jspx_th_x_005fotherwise_005f0.setParent((jakarta.servlet.jsp.tagext.Tag) _jspx_th_x_005fchoose_005f0);
    int _jspx_eval_x_005fotherwise_005f0 = _jspx_th_x_005fotherwise_005f0.doStartTag();
    if (_jspx_eval_x_005fotherwise_005f0 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("							2만 원 미만 <br />\r\n");
        out.write("						");
        int evalDoAfterBody = _jspx_th_x_005fotherwise_005f0.doAfterBody();
        if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_x_005fotherwise_005f0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005fx_005fotherwise.reuse(_jspx_th_x_005fotherwise_005f0);
    return false;
  }

  private boolean _jspx_meth_x_005fforEach_005f1(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    jakarta.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  x:forEach
    org.apache.taglibs.standard.tag.common.xml.ForEachTag _jspx_th_x_005fforEach_005f1 = (org.apache.taglibs.standard.tag.common.xml.ForEachTag) _005fjspx_005ftagPool_005fx_005fforEach_0026_005fvar_005fselect.get(org.apache.taglibs.standard.tag.common.xml.ForEachTag.class);
    _jspx_th_x_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_x_005fforEach_005f1.setParent(null);
    // /11JSTL/etc/Xml.jsp(48,3) name = select type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_x_005fforEach_005f1.setSelect("$blist/booklist/book");
    // /11JSTL/etc/Xml.jsp(48,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_x_005fforEach_005f1.setVar("item");
    int[] _jspx_push_body_count_x_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_x_005fforEach_005f1 = _jspx_th_x_005fforEach_005f1.doStartTag();
      if (_jspx_eval_x_005fforEach_005f1 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("			<tr>\r\n");
          out.write("				<td>");
          if (_jspx_meth_x_005fout_005f5(_jspx_th_x_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_x_005fforEach_005f1))
            return true;
          out.write("</td>\r\n");
          out.write("				<td>");
          if (_jspx_meth_x_005fout_005f6(_jspx_th_x_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_x_005fforEach_005f1))
            return true;
          out.write("</td>\r\n");
          out.write("				<td>");
          if (_jspx_meth_x_005fout_005f7(_jspx_th_x_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_x_005fforEach_005f1))
            return true;
          out.write("</td>\r\n");
          out.write("				<td>");
          if (_jspx_meth_x_005fif_005f0(_jspx_th_x_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_x_005fforEach_005f1))
            return true;
          out.write("</td>\r\n");
          out.write("			</tr>\r\n");
          out.write("			");
          int evalDoAfterBody = _jspx_th_x_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_x_005fforEach_005f1.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_x_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_x_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_x_005fforEach_005f1.doFinally();
    }
    _005fjspx_005ftagPool_005fx_005fforEach_0026_005fvar_005fselect.reuse(_jspx_th_x_005fforEach_005f1);
    return false;
  }

  private boolean _jspx_meth_x_005fout_005f5(jakarta.servlet.jsp.tagext.JspTag _jspx_th_x_005fforEach_005f1, jakarta.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_x_005fforEach_005f1)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    //  x:out
    org.apache.taglibs.standard.tag.rt.xml.ExprTag _jspx_th_x_005fout_005f5 = (org.apache.taglibs.standard.tag.rt.xml.ExprTag) _005fjspx_005ftagPool_005fx_005fout_0026_005fselect_005fnobody.get(org.apache.taglibs.standard.tag.rt.xml.ExprTag.class);
    _jspx_th_x_005fout_005f5.setPageContext(_jspx_page_context);
    _jspx_th_x_005fout_005f5.setParent((jakarta.servlet.jsp.tagext.Tag) _jspx_th_x_005fforEach_005f1);
    // /11JSTL/etc/Xml.jsp(50,8) name = select type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_x_005fout_005f5.setSelect("$item/name");
    int _jspx_eval_x_005fout_005f5 = _jspx_th_x_005fout_005f5.doStartTag();
    if (_jspx_th_x_005fout_005f5.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005fx_005fout_0026_005fselect_005fnobody.reuse(_jspx_th_x_005fout_005f5);
    return false;
  }

  private boolean _jspx_meth_x_005fout_005f6(jakarta.servlet.jsp.tagext.JspTag _jspx_th_x_005fforEach_005f1, jakarta.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_x_005fforEach_005f1)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    //  x:out
    org.apache.taglibs.standard.tag.rt.xml.ExprTag _jspx_th_x_005fout_005f6 = (org.apache.taglibs.standard.tag.rt.xml.ExprTag) _005fjspx_005ftagPool_005fx_005fout_0026_005fselect_005fnobody.get(org.apache.taglibs.standard.tag.rt.xml.ExprTag.class);
    _jspx_th_x_005fout_005f6.setPageContext(_jspx_page_context);
    _jspx_th_x_005fout_005f6.setParent((jakarta.servlet.jsp.tagext.Tag) _jspx_th_x_005fforEach_005f1);
    // /11JSTL/etc/Xml.jsp(51,8) name = select type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_x_005fout_005f6.setSelect("$item/author");
    int _jspx_eval_x_005fout_005f6 = _jspx_th_x_005fout_005f6.doStartTag();
    if (_jspx_th_x_005fout_005f6.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005fx_005fout_0026_005fselect_005fnobody.reuse(_jspx_th_x_005fout_005f6);
    return false;
  }

  private boolean _jspx_meth_x_005fout_005f7(jakarta.servlet.jsp.tagext.JspTag _jspx_th_x_005fforEach_005f1, jakarta.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_x_005fforEach_005f1)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    //  x:out
    org.apache.taglibs.standard.tag.rt.xml.ExprTag _jspx_th_x_005fout_005f7 = (org.apache.taglibs.standard.tag.rt.xml.ExprTag) _005fjspx_005ftagPool_005fx_005fout_0026_005fselect_005fnobody.get(org.apache.taglibs.standard.tag.rt.xml.ExprTag.class);
    _jspx_th_x_005fout_005f7.setPageContext(_jspx_page_context);
    _jspx_th_x_005fout_005f7.setParent((jakarta.servlet.jsp.tagext.Tag) _jspx_th_x_005fforEach_005f1);
    // /11JSTL/etc/Xml.jsp(52,8) name = select type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_x_005fout_005f7.setSelect("$item/price");
    int _jspx_eval_x_005fout_005f7 = _jspx_th_x_005fout_005f7.doStartTag();
    if (_jspx_th_x_005fout_005f7.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005fx_005fout_0026_005fselect_005fnobody.reuse(_jspx_th_x_005fout_005f7);
    return false;
  }

  private boolean _jspx_meth_x_005fif_005f0(jakarta.servlet.jsp.tagext.JspTag _jspx_th_x_005fforEach_005f1, jakarta.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_x_005fforEach_005f1)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    jakarta.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  x:if
    org.apache.taglibs.standard.tag.common.xml.IfTag _jspx_th_x_005fif_005f0 = (org.apache.taglibs.standard.tag.common.xml.IfTag) _005fjspx_005ftagPool_005fx_005fif_0026_005fselect.get(org.apache.taglibs.standard.tag.common.xml.IfTag.class);
    _jspx_th_x_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_x_005fif_005f0.setParent((jakarta.servlet.jsp.tagext.Tag) _jspx_th_x_005fforEach_005f1);
    // /11JSTL/etc/Xml.jsp(53,8) name = select type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_x_005fif_005f0.setSelect("$item/name = '총,균,쇠'");
    int _jspx_eval_x_005fif_005f0 = _jspx_th_x_005fif_005f0.doStartTag();
    if (_jspx_eval_x_005fif_005f0 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('구');
        out.write('매');
        out.write('함');
        int evalDoAfterBody = _jspx_th_x_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_x_005fif_005f0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005fx_005fif_0026_005fselect.reuse(_jspx_th_x_005fif_005f0);
    return false;
  }
}
