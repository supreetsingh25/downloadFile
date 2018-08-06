package com.download.file.downloadFile.service;

import java.util.List;

import com.download.file.downloadFile.model.City;

public interface ICityService {

    public List<City> findAll();
    public City findById(Long id);
}