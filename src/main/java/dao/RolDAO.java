package dao;
import java.util.List;

import model.rol;

public interface RolDAO {
	
	public void create(rol rol);
	public void update(rol rol);
	public void delete(int id);
	public rol find(int id);
	public List<rol> findAll();

}
