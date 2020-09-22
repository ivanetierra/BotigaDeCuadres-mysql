
package whitecollar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import whitecollar.model.Collar;
import whitecollar.service.CollarServiceImpl;

import java.util.List;

@RestController
@RequestMapping
public class CollarController {

    @Autowired
    CollarServiceImpl collarServiceImpl;

    @GetMapping("/collars") //show all collars
    public List<Collar> all() {

        return collarServiceImpl.listCollars();
    }



}

