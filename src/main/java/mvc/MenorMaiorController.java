package mvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/mvc/menor-maior")
public class MenorMaiorController extends HttpServlet {
	
	@Override
	protected void doGet(
			HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		//Prepara para a execução.
		String idadeStr = request.getParameter("idade");
		idadeStr = idadeStr == null ? "0" : idadeStr;
		int idade = Integer.parseInt(idadeStr);
		
		//Executa "regras de negócio".
		MenorMaiorModel menorMaiorModel = new MenorMaiorModel(idade);
		String resultado = menorMaiorModel.resultado();
		
		//Passa a váriável para a página JSP.
		request.setAttribute("resultado", resultado);
		//Chama página JSP.
		request.getRequestDispatcher("menor-maior-view.jsp").
			forward(request, response);

	}
	
}
