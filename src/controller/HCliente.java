package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Cliente;
import model.Modalidade;
import service.SCliente;
import service.SModalidade;

/**
 * Servlet implementation class HCliente
 */
@WebServlet("/HCliente")
public class HCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private SCliente servCliente;
    private SModalidade servModalidade;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HCliente() {
        super();

        this.servCliente = new SCliente();
        this.servModalidade = new SModalidade();
        this.servModalidade.fillMod();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameterMap().containsKey("add_c")){
			
			request.setAttribute("lista", this.servCliente.getArCliente());
			request.getRequestDispatcher("show.jsp").forward(request, response);
			
		}else{
			request.setAttribute("listaM", this.servModalidade.getArMod());
			request.getRequestDispatcher("add.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameterMap().containsKey("add_c")){
			
			Cliente c = new Cliente(this.servCliente.getArCliente().size(), request.getParameter("nome_c"), request.getParameter("cont_c"));
		
			String mod[] = request.getParameterValues("mod_c");
			ArrayList<Modalidade> arM = new ArrayList<Modalidade>();
			for(int i=0; i < mod.length; i++){
				Modalidade m = new Modalidade(mod[i]);
				//c.getArMod().add(m);
				arM.add(m);
			}
			
			c.setArMod(arM);
			this.servCliente.addCliente(c);
		}
		
		this.doGet(request, response);
	}

}
