/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.40
 * Generated at: 2025-05-25 06:31:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp._09PagingBoard;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import utils.BoardPage;
import model1.board.BoardDTO;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import model1.board.BoardDAO;

public final class List_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(8);
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("model1.board.BoardDTO");
    _jspx_imports_classes.add("java.util.Map");
    _jspx_imports_classes.add("java.util.HashMap");
    _jspx_imports_classes.add("model1.board.BoardDAO");
    _jspx_imports_classes.add("utils.BoardPage");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

//DB연결 및 CRUD작업을 위한 DAO객체를 생성한다.
BoardDAO dao = new BoardDAO(application);

/*
검색어가 있는 경우 클라이언트가 선택한 필드명과 검색어를 저장할 
Map컬렉션을 생성한다.
*/
Map<String, Object> param = new HashMap<String, Object>();
/*
검색폼에서 입력한 검색어와 필드명을 파라미터로 받아온다.
해당 <form>의 전송방식은 get, action속성은 없는 상태이므로
현재 페이지로 폼값이 전송된다.
*/
String searchField = request.getParameter("searchField");
String searchWord = request.getParameter("searchWord");
//사용자가 입력한 검색어가 있다면...
if (searchWord != null) {
	/* Map컬렉션에 컬럼명과 검색어를 추가한다. */
	param.put("searchField", searchField);
	param.put("searchWord", searchWord);
}
//Map콜렉션을 인수로 게시물의 갯수를 카운트한다.
int totalCount = dao.selectCount(param);

/*** 페이징 코드 추가 부분 ***/
//web.xml에 설정한 컨텍스트 초기화 파라미터를 읽어와서 산술연산을 위해
//정수(int)로 변환한다. 전체 페이지수 계산
int pageSize = Integer.parseInt(application.getInitParameter("POSTS_PER_PAGE"));
int blockPage = Integer.parseInt(application.getInitParameter("PAGES_PER_BLOCK"));
/*
전체 페이지수를 계산한다.
(전체 게시물갯수 / 페이지당 출력할 게시물 갯수) => 결과값의 올림처리
가령 게시물의 갯수가 105개라면 나눴을때 결과가 10.5이 된다. 이때 무조건
올림처리 하여 11페이지가 나오게 된다.
만약 totalcount를 double로 형변환하지 않으면 정수의 결과가 나오게되므로
11페이지가 아니라 10페이지가 됩니다. 따라서 주의해야 한다.
*/
int totalPage = (int)Math.ceil((double)totalCount / pageSize);

/*
목록에 처음 진입했을 때는 페이지관련 파라미터가 없는 상태이므로 무조건 
1page로 지정한다. 만약 파라미터 pageNum이 있다면 request내장객체를 통해
받아온 후 페이지번호로 지정한다.
List.jsp => 이와같이 파라미터가 없는 상태일때는 null
List.jsp?pageNum= => 이와같이 파라미터는 있는데 값이 없을 때는 빈값으로
	체크된다. 따래서 아래 if문은 2개의 조건으로 구성해야 한다.
*/
int pageNum = 1;
String pageTemp = request.getParameter("pageNum");
if (pageTemp != null && !pageTemp.equals(""))
	pageNum = Integer.parseInt(pageTemp); // 요청받은 페이지로 수정(true)

/* false
	게시물의 구간을 계산한다.
	각 페이지의 시작번호와 종료번호를 현재페이지번호와 페이지사이즈를 통해
	계산한 후 DAO로 전달하기 위해 Map컬랙션에 추가한다.
*/
// 목록에 출력할 게시물 범위 계산
int start = (pageNum -1) * pageSize + 1; 	// 첫 게시물 번호
int end = pageNum * pageSize;	// 마지막 게시물 번호
param.put("start", start);
param.put("end", end);
/*** 페이징 코드 추가 부분 end ***/

//목록에 출력할 게시물을 추출하여 반환받는다.
//List<BoardDTO> boardLists = dao.selectList(param);
List<BoardDTO> boardLists = dao.selectListPage(param);
//자원해제
dao.close();

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("	<head>\r\n");
      out.write("	<meta charset=\"UTF-8\">\r\n");
      out.write("	<title>회원제 게시판</title>\r\n");
      out.write("	</head>\r\n");
      out.write("	<body>\r\n");
      out.write("		<!-- 공통 링크 -->\r\n");
      out.write("		");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Common/Link.jsp", out, false);
      out.write("  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- 앞에서 계산해둔 전체페이지수와 파라미터를 통해 얻어온 현재 \r\n");
      out.write("		페이지번호를 출력한다. -->\r\n");
      out.write("    <h2>목록 보기(List) - 현재 페이지 : ");
      out.print( pageNum );
      out.write("(전체 : ");
      out.print( totalPage );
      out.write(")</h2>\r\n");
      out.write("	\r\n");
      out.write("	<!-- 검색 폼 -->\r\n");
      out.write("	<!--  전송 은 get 방식이고， action 속성을 지정하지 않았으므로 \r\n");
      out.write("   	submit하면 폼값이 현재 페이지로 전송된다. -->\r\n");
      out.write("	<form method=\"get\">\r\n");
      out.write("		<table border=\"1\" width=\"90%\">\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td align=\"center\">\r\n");
      out.write("				<!-- 검색 항목(searchField)은 제목과 내용 중 선택 -->\r\n");
      out.write("				<select name=\"searchField\">\r\n");
      out.write("						<option value=\"title\">제목</option>\r\n");
      out.write("						<option value=\"content\">내용</option>\r\n");
      out.write("				</select> <input type=\"text\" name=\"searchWord\" /> <input type=\"submit\"\r\n");
      out.write("					value=\"검색하기\" /></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</table>\r\n");
      out.write("	</form>\r\n");
      out.write("	<!-- 게시물 목록 테이블(표) -->\r\n");
      out.write("	<table border=\"1\" width=\"90%\">\r\n");
      out.write("		<!-- 각 컬럼의 이름 -->\r\n");
      out.write("		<tr>\r\n");
      out.write("			<th width=\"10%\">번호</th>\r\n");
      out.write("			<th width=\"50%\">제목</th>\r\n");
      out.write("			<th width=\"15%\">작성자</th>\r\n");
      out.write("			<th width=\"10%\">조회수</th>\r\n");
      out.write("			<th width=\"15%\">작성일</th>\r\n");
      out.write("		</tr>\r\n");
      out.write("		 <!-- 목록의 내용 -->\r\n");
      out.write("		");

		if (boardLists.isEmpty()) {
		
      out.write("\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td colspan=\"5\" align=\"center\">등록된 게시물이 없습니다^^*</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				");

		}
		else {
			// 출력할 게시물이 있는 경우에는 확장 for문으로 List컬랙션에
			// 저장된 데이터의 갯수만큼 반복하여 출력한다.
		    int virtualNum = 0; // 화면상에서의 게시물 번호
		    
			 // 페이지가 적용된 가상번호를 계산하기 위해 생성한 변수
		    int countNum = 0;
		    
		    for (BoardDTO dto : boardLists)
		    {
		    	// 현재 출력할 게시물의 갯수에 따라 출력번호는 달라지므로
		    	// totalCount를 사용하여 가상번호를 부여한다.
//	 	        virtualNum = totalCount--;    // 기존코드   
		    	
				// 현재 페이지번호를 적용한 가상번호 계산하기
	    		// 전체 게시물수 - (((현재페이지-1)*한페이출력갯수) + countNum증가치)
		        virtualNum = totalCount - (((pageNum - 1) * pageSize) + countNum++);
		
      out.write("\r\n");
      out.write("		<tr align=\"center\">\r\n");
      out.write("			<!-- 게시물의 가상 번호 -->\r\n");
      out.write("			<td>");
      out.print( virtualNum );
      out.write("</td>\r\n");
      out.write("			<td align=\"left\">\r\n");
      out.write("				<!--  게시물의 일련번호가 매개변수로 전달 -->\r\n");
      out.write("				<a href=\"View.jsp?num=");
      out.print( dto.getNum() );
      out.write('"');
      out.write('>');
      out.print( dto.getTitle() );
      out.write("</a>\r\n");
      out.write("			</td>\r\n");
      out.write("			<!-- 작성자 아이디 -->\r\n");
      out.write("			<td align=\"center\">");
      out.print( dto.getId() );
      out.write("</td>\r\n");
      out.write("			<!-- 조회수 -->     \r\n");
      out.write("			<td align=\"center\">");
      out.print( dto.getVisitcount() );
      out.write("</td>\r\n");
      out.write("			<!-- 작성일 --> \r\n");
      out.write("			<td align=\"center\">");
      out.print( dto.getPostdate() );
      out.write("</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		");

		    }
		}
		
      out.write("\r\n");
      out.write("	</table>\r\n");
      out.write("\r\n");
      out.write("	<table border=\"1\" width=\"90%\">\r\n");
      out.write("		<tr align=\"right\">\r\n");
      out.write("			\r\n");
      out.write("			<td align=\"center\">\r\n");
      out.write("				<!-- \r\n");
      out.write("        			totalCount : 전체 게시물의 갯수\r\n");
      out.write("        			pageSize : 한페이지에 출력할 게시물의 갯수\r\n");
      out.write("        			blockPage : 한블럭당 출력할 페이지번호의 갯수\r\n");
      out.write("        			pageNum : 현재 페이지 번호\r\n");
      out.write("        			request.getRequestURI() : request내장객체를 통해 현재페이지의\r\n");
      out.write("        				HOST를 제외한 나머지 경로명을 얻어올 수 있다. 여기서 얻은\r\n");
      out.write("        				경로명을 통해 \"경록명.jsp?pageNum=페이지번호\"와 같은 바로\r\n");
      out.write("        				가기 링크를 생성한다.\r\n");
      out.write("        		 -->\r\n");
      out.write("        		");
 
        		System.out.println("현재경로="+ request.getRequestURI());
        		
      out.write(" \r\n");
      out.write("				");
      out.print( BoardPage.pagingStr(totalCount, pageSize,
						blockPage, pageNum, request.getRequestURI()) );
      out.write("	\r\n");
      out.write("			</td>\r\n");
      out.write("			<td><button type=\"button\" onclick=\"location.href='Write.jsp';\">글쓰기\r\n");
      out.write("				</button></td>\r\n");
      out.write("		</tr>\r\n");
      out.write("	</table>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
}
