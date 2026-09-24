package pruebas;

import java.util.List;

import dao.RolDAO;
import dao.RolDAOImplemet;
import model.rol;

public class prueba01 {

	public static void main(String[] args) {
		RolDAO rol = new RolDAOImplemet();
		List<rol> lista = rol.findAll(); 
		for (model.rol r:lista) {
			System.out.println(r.getIdrol());
			System.out.println(r.getRolname());
			System.out.println(r.getRolstatus());
		}
		
		

	}

}
