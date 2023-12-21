package dev.carlrs.sectorapi.controllers;

import dev.carlrs.sectorapi.rest.ResponseObject;
import dev.carlrs.sectorapi.rest.Sector;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sectors")
public class SectorController {
    @RequestMapping(value = "/types/listing", method = RequestMethod.GET)
    public ResponseObject<List<Sector>> sectorTypeListing() {
        return new ResponseObject();
    }
}
