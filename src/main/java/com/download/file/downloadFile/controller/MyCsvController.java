package com.download.file.downloadFile.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.download.file.downloadFile.model.City;
import com.download.file.downloadFile.service.ICityService;
import com.download.file.downloadFile.util.WriteCsvToResponse;

@RestController
public class MyCsvController {

    @Autowired
    ICityService cityService;

    @RequestMapping(value = "/cities", produces = "text/csv")
    public void findCities(HttpServletResponse response) throws IOException {

        List<City> cities = (List<City>) cityService.findAll();

        WriteCsvToResponse.writeCities(response.getWriter(), cities);
    }

    @RequestMapping(value = "/cities/{cityId}", produces = "text/csv")
    public void findCity(@PathVariable Long cityId, HttpServletResponse response) throws IOException {

        City city = cityService.findById(cityId);
        WriteCsvToResponse.writeCity(response.getWriter(), city);
    }
}