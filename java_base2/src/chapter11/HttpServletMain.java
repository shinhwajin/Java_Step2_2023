package chapter11;

public class HttpServletMain {

	public static void main(String[] args) {
		method(new FileDownloadService());
		method(new LoginService());
		
	}

	//�޼ҵ�� method(static)
	public static void method(HttpServlet http) {
		http.service();
	}
}