package com.lgImovel.lgImovel.service;

import com.lgImovel.lgImovel.model.Imovel;

import java.util.List;

public interface ImovelService {

    List<Imovel> findAll();

    Imovel findById (Long id);

    Imovel create (Imovel imovel);

    Imovel update (Imovel imovel);

    void delete (Long id);


}
