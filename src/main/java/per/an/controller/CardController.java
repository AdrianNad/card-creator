package per.an.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import per.an.service.CardService;

@RestController
@RequestMapping("/cards")
public class CardController {

    private CardService cardService;

    @Autowired
    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping("/test")
    public ResponseEntity testEndpoint() {
        cardService.createCard("TestCardName");
        return ResponseEntity.status(201).build();
    }
}