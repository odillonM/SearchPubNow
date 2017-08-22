package br.edu.pubnow.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.pubnow.entidades.UsuarioBar;
import br.edu.pubnow.persistenciaDAO.UsuarioBarDAO;

/**
 * Servlet implementation class SAutenticaUsuario
 */
@WebServlet("/SAutenticaUsuario")
public class SAutenticaUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SAutenticaUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String sLogin= request.getParameter("login");
		String sSenha= request.getParameter("senha");
		
		UsuarioBar usuarioBar = new UsuarioBar();
		usuarioBar.setLogin("sLogin");
		usuarioBar.setLogin("sSenha");
		
		try {
			
			UsuarioBarDAO usuarioBarDao = new UsuarioBarDAO();
			UsuarioBar usuarioAutenticado = usuarioBarDao.autenticacaoBar(usuarioBar);
			
			if(usuarioAutenticado != null ) {
				response.sendRedirect("menubar.jsp");
			}else {
				response.sendRedirect("errologin.jsp");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		doGet(request, response);
	}

}
