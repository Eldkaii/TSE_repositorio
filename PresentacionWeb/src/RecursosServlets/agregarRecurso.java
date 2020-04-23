package RecursosServlets;

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



@WebServlet("/agregarRecurso")
public class agregarRecurso extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	@EJB
	NegocioRecursosLocal conexionNegociosRecursos;
	
    public agregarRecurso() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/verRecursos.jsp";
		List<DTRecursos> recursosEnBase = conexionNegociosRecursos.getRecursos();
		request.setAttribute("ListaRecursos", recursosEnBase);
		getServletContext().getRequestDispatcher(url).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String url = "/verRecursos.jsp";
		
		String codigo = request.getParameter("codigoRecurso");
		double precioUnitario = Double.parseDouble(request.getParameter("precioUnitarioRecurso"));
		double cantidad = Double.parseDouble(request.getParameter("cantidadRecurso"));
		String nombreTipo = request.getParameter("tipoRecurso");
		
		try{
			conexionNegociosRecursos.addRecursoNegocio(codigo, precioUnitario, cantidad, nombreTipo);
		}
		catch(Exception  e){
			System.out.println(e.getMessage());
		}
		
		List<DTRecursos> recursosEnBase = conexionNegociosRecursos.getRecursos();
		request.setAttribute("ListaRecursos", recursosEnBase);
		
		getServletContext().getRequestDispatcher(url).forward(request, response);
	}

}
