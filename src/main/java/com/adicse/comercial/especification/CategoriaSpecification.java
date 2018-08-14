package com.adicse.comercial.especification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.apache.commons.lang3.StringUtils;
import org.springframework.data.jpa.domain.Specification;

import com.adicse.comercial.model.Categoria;





public class CategoriaSpecification implements Specification<Categoria> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final Categoria filter;

	public CategoriaSpecification(Categoria filter) {
		this.filter = filter;
	}	

	@Override
	public Predicate toPredicate(Root<Categoria> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
		// TODO Auto-generated method stub
		Predicate p = cb.conjunction();
		
		if( filter.getIdcategoria() != null ){
			p.getExpressions().add(cb.equal(root.get("idcategoria") , filter.getIdcategoria() ));
		}
		if (StringUtils.isNotBlank(filter.getDsccategoria() )) {
			p.getExpressions().add(cb.like(cb.lower(root.get("dsccategoria")),"%"+ filter.getDsccategoria().toLowerCase() + "%"));
		}
	

		return p;		
		
	}



}
