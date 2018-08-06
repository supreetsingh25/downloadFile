package com.download.file.downloadFile.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.download.file.downloadFile.model.City;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {

}