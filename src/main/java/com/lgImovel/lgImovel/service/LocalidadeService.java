package com.lgImovel.lgImovel.service;

import com.lgImovel.lgImovel.model.Imovel;
import com.lgImovel.lgImovel.model.Localidade;

import java.util.List;

public interface LocalidadeService {

    List<Localidade> findAll();

    Localidade findById (Long id);

    Localidade create ( Localidade localidade);

    Localidade update (Localidade localidade);

    void delete (Long id);
}
