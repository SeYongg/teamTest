package sp.product.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

/**
 * Servlet implementation class UploadImageServlet
 */
@WebServlet(name = "UploadImage", urlPatterns = { "/uploadImage.do" })
public class UploadImageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UploadImageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 인코딩
		request.setCharacterEncoding("utf-8");
		// 2. 값 추출
		// 2-1. 업로드 경로
		String root = getServletContext().getRealPath("/");
		String saveDirectory = root + "upload/editor";
		// 2-2. 최대 사이즈 지정
		int maxSize = 10 * 1024 * 1024;
		
		// 2-3. request -> MultipartRequest로 변환
		MultipartRequest mRequest = new MultipartRequest(request, saveDirectory, maxSize, "UTF-8", new DefaultFileRenamePolicy());
		String filepath = mRequest.getFilesystemName("file"); // input name
		// 3. 비즈니스 로직
		// 4. 결과처리
		// -> 업로드된 파일 경로를 되돌려주면 끝
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		out.print("/upload/editor/"+filepath);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
