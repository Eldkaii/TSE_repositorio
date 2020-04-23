package TipoRecursosServlets;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datatypes.DTRecursos;
import datatypes.DTTipoDeRecurso;
import servletsNegocios.NegocioRecursosLocal;


@WebServlet("/TiposDeRecursosServlets")
public class TiposDeRecursosServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	NegocioRecursosLocal conexionNegociosRecursos;

    public TiposDeRecursosServlets() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String url = "/verTiposDeRecursos.jsp";
		List<DTTipoDeRecurso> tipoRecursosEnBase = conexionNegociosRecursos.getTiposDeRecursos() ;
		request.setAttribute("ListaTiposDeRecursos", tipoRecursosEnBase);
		getServletContext().getRequestDispatcher(url).forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String url = "/verRecursos.jsp";
		String ntdp = request.getParameter("nombreTipoDeRecurso");
		List<DTRecursos> recursosFiltrados =  conexionNegociosRecursos.getRecursosDeTipo(ntdp);
		request.setAttribute("ListaRecursos", recursosFiltrados);
		getServletContext().getRequestDispatcher(url).forward(request, response);
	}

}
