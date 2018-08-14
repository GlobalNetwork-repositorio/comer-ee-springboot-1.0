package com.adicse.comercial.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adicse.comercial.dao.IUbigeoDao;
import com.adicse.comercial.model.Ubigeo;

@Service
@Transactional
public class UbigeoService implements IAdicseService<Ubigeo, String> {
	
	@Autowired
	private IUbigeoDao iUbigeoDao;
	
	@Override
	public Page<?> paginationParmsExtra(Integer pagenumber, Integer rows, String sortdireccion, String sortcolumn,
			Object filter, Object paramsExtra) {
		return null;
	}

	@Override
	public Page<?> pagination(Integer pagenumber, Integer rows, String sortdireccion, String sortcolumn,
			Object filter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ubigeo> getall() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ubigeo> getallbyid(List<?> lst) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ubigeo grabar(Ubigeo entidad) {
		// TODO Auto-generated method stub
		return iUbigeoDao.save(entidad);
	}

	@Override
	public void delete(Ubigeo entidad) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletebyid(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional(readOnly=true)
	public Boolean exists(String id) {
		// TODO Auto-generated method stub
		return iUbigeoDao.existsById(id);
	}

	@Override
	@Transactional(readOnly=true)
	public Optional<Ubigeo> findbyid(String id) {
		// TODO Auto-generated method stub
		return iUbigeoDao.findById(id);
	}

	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Ubigeo> EntityForSpecificatios(Ubigeo entidad, Object filter) {
		// TODO Auto-generated method stub
		return null;
	}

	


	

}
