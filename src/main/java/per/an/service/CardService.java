package per.an.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import per.an.model.Card;
import per.an.repository.CardRepository;

import javax.transaction.Transactional;

@Service
public class CardService {

    private CardRepository cardRepository;

    @Autowired
    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    @Transactional
    public void createCard(String title) {
        cardRepository.save(Card.builder().title(title).build());
    }
}
