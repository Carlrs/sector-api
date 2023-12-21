package dev.carlrs.sectorapi.controllers;

import dev.carlrs.sectorapi.rest.Company;
import dev.carlrs.sectorapi.rest.ResponseObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
public class CompanyController {
    @RequestMapping(method = RequestMethod.POST)
    public ResponseObject<Company> saveSectors() {
        return new ResponseObject();
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseObject<Company> getSectors() {
        return new ResponseObject();
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseObject<Company> editSectors() {
        return new ResponseObject();
    }
}
