package consolaCliente;

import java.util.List;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import datatypes.DTRecursos;
import servletsNegocios.NegocioRecursosRemote;

public class TestClient {

	public static void main(String[] args) {

		Properties props = new Properties();

		props.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");

		props.put(Context.PROVIDER_URL, "remote+http://localhost:8080");

		String jndiName = "ejb:Ejercicio1/Negocios/NegocioRecursos!servletsNegocios.NegocioRecursosRemote";

		try {
			Context ctx = new InitialContext(props);

			NegocioRecursosRemote conexionRemota = (NegocioRecursosRemote) ctx.lookup(jndiName);

			conexionRemota.addRecursoNegocio("4", 4, 1, "Comestible");

			List<DTRecursos> list = conexionRemota.getRecursos();
			
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getCodigo());
			}

		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
