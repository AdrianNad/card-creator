package per.an.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import per.an.service.BorderService;

@RestController
@RequestMapping("/borders")
public class BorderController {

    private BorderService borderService;

    @Autowired
    public BorderController(BorderService borderService) {
        this.borderService = borderService;
    }
}
