/*
package whitecollar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import whitecollar.model.Collar;
import whitecollar.repository.ICollarRepository;
import whitecollar.service.CollarServiceImpl;

import java.util.List;
import java.util.Optional;

@RestController
public class CollarController {

    @Autowired
    CollarServiceImpl collarServiceImpl;

    @GetMapping("/collars")
    public List<Collar> all() {
        return collarServiceImpl.listCollars();
    }




}

 */