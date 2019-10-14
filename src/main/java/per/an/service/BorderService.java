package per.an.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import per.an.repository.BorderRepository;

@Service
public class BorderService {

    private BorderRepository borderRepository;

    @Autowired
    public BorderService(BorderRepository borderRepository) {
        this.borderRepository = borderRepository;
    }
}
