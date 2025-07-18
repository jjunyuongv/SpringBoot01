/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.40
 * Generated at: 2025-05-24 04:04:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp._09PagingBoard;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import model1.board.BoardDAO;
import model1.board.BoardDTO;
import utils.JSFunction;

public final class WriteProcess_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/09PagingBoard/IsLoggedIn.jsp", Long.valueOf(1747127111238L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(4);
    _jspx_imports_classes.add("utils.JSFunction");
    _jspx_imports_classes.add("model1.board.BoardDTO");
    _jspx_imports_classes.add("model1.board.BoardDAO");
  }

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
  }

  public void _jspDestroy() {
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
      out.write("<!-- 글쓰기 페이지에 오랫동안 머물러 세션이 삭제되는 경우가\r\n");
      out.write("있으므로 글쓰기 처리 페이지에서도 반드시 로그인을 확인해야된다. -->\r\n");
      out.write("\r\n");
      out.write("\r\n");

/*
로그인 체크를 위한 파일로 섹션영역에 UserId라는 속성값이 없으면
경고창을 띄운 후 로그인 페이지로 이동한다.
로그인이 필요한 모든 페이지 상단에 include지시어를 통해 포함시킬 
예정이다.
*/
if (session.getAttribute("UserId") == null) {
	JSFunction.alertLocation("로그인 후 이용해주십시오.", "../06Session/LoginForm.jsp", out);
	return;
}

      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');

//클라이언트가 작성한 폼값을 받는다.
String title = request.getParameter("title");
String content = request.getParameter("content");

//폼값을 DTO객체에 저장한다.
BoardDTO dto = new BoardDTO();
dto.setTitle(title);
dto.setContent(content);
/*
특히 아이디의 경우 로그인 후 작성페이지에 진입할 수 있으므로
세션영역에 저장된 회원아이디를 가져와 DTO에 저장한다.
board 컬럼의 id는 member 컬럼의 id와 외래키로 설정되어있어 id가 
빈값이면 제약조건 위배로 오류가 발생하기 때문
*/
dto.setId(session.getAttribute("UserId").toString());

//DB연결을 위해 DAO객체를 생성한다.
BoardDAO dao = new BoardDAO(application);
//입력값이 저장된 DTO객체를 인수를 전달하여 insert쿼리문을 실행한다.
int iResult = dao.insertWrite(dto);

//더미데이터 100개 만들기 안쓸땐 주석
/* int iResult = 0;
for(int i =1; i<=100; i++)
{
	dto.setTitle(title+"-"+i);
	iResult = dao.insertWrite(dto);
} */
//자원해제
dao.close();

if (iResult == 1) {
	// 입력에  성공한 경우 리스트로 이동하여 새롭게 등록된 게시물을 확인한다.
	response.sendRedirect("List.jsp");
} else {
	// 실패하였다면 재입력을 위해 글쓰기 페이지로 다시 돌아간다.
	JSFunction.alertBack("글쓰기에 실패하였습니다.", out);
}


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
}
