package net.codejava.spring.dao;

import java.sql.Date;
import java.util.List;

import net.codejava.spring.model.view.PhoView;

public interface PhoDAO {
	public List<PhoView> list();
	
	public PhoView get(int id);
	
	public PhoView getPhoByLicenseAndDate(int id, Date date);
	
	public void saveOrUpdate(PhoView pho);
	
	public void delete(int id);
}