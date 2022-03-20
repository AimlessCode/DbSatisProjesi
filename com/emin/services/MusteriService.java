package com.emin.services;

import com.emin.repository.MusteriRepository;
import com.emin.repository.entity.Musteri;

import java.util.List;


public class MusteriService {

    private final MusteriRepository musteriRepository;

    public MusteriService() {
        musteriRepository = new MusteriRepository();
    }

    public void save(Musteri musteri) {
        musteriRepository.save(musteri);


    }

    public void update(Musteri musteri) {
        musteriRepository.update(musteri);
    }

    public void delete(long id) {
        musteriRepository.delete(id);
    }

    public List<Musteri> findAll() {
        return musteriRepository.findAll();
    }


}