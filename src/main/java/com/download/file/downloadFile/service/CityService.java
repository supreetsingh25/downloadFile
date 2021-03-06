package com.download.file.downloadFile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.download.file.downloadFile.model.City;
import com.download.file.downloadFile.repository.CityRepository;

@Service
public class CityService implements ICityService {

    @Autowired
    private CityRepository repository;

    @Override
    public List<City> findAll() {

        List<City> cities = (List<City>) repository.findAll();
        
        return cities;
    }

    @Override
    public City findById(Long id) {
        City city = repository.findById(id).get();
        return city;
    }
}