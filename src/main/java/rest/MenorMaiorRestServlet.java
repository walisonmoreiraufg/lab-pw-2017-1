package rest;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/menormaiorrest")
public class MenorMaiorRestServlet extends HttpServlet {

    @Override
    protected void doGet(
            HttpServletRequest req,
            HttpServletResponse resp) throws ServletException, IOException {

        String idadeStr = req.getParameter("idade");
        int idade = idadeStr == null ? 0 : Integer.parseInt(idadeStr);

        String resultado;
        if (idade < 18) {
            resultado = "Menor";
        } else {
            resultado = "Maior";
        }

        resp.getOutputStream().print(
                "{"
                + "\"resultado\":\"" + resultado + "\","
                + "\"dataDeProcessamento\":\"" + new Date() + "\""
              + "}");
    }

}
