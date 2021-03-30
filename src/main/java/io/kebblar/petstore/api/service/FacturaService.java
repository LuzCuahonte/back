package io.kebblar.petstore.api.service;

import io.kebblar.petstore.api.model.Factura;

import java.util.List;

import io.kebblar.petstore.api.exceptions.BusinessException;

public interface FacturaService {
	//int insert(Factura factura) throws BusinessException;

	List<Factura> getAll() throws BusinessException;

}
