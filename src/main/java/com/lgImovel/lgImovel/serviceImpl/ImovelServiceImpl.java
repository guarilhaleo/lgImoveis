package com.lgImovel.lgImovel.serviceImpl;

import com.lgImovel.lgImovel.model.Imovel;
import com.lgImovel.lgImovel.repository.ImovelRepository;
import com.lgImovel.lgImovel.service.ImovelService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service

public class ImovelServiceImpl implements ImovelService {

    private final ImovelRepository imovelRepository;

    public ImovelServiceImpl( ImovelRepository imovelRepository ) {
        this.imovelRepository = imovelRepository;


    }

    @Override
    public List<Imovel> findAll() {
        return imovelRepository.findAll();
    }

    @Override
    public Imovel findById( Long id ) {
        String message = String.format("Resource id %s not found", id);
        return this.imovelRepository
                .findById(id)
                .orElseThrow(() -> new EntityNotFoundException(message));
    }

    @Override
    public Imovel create( Imovel imovel ) {
        return imovelRepository.save(imovel);
    }

    @Override
    public Imovel update( Imovel imovel ) {
        return imovelRepository.save(imovel);
    }

    @Override
    public void delete( Long id ) {

        Imovel imovel = this.findById(id);
        this.imovelRepository.delete(imovel);

    }
}
