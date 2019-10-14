package per.an.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import per.an.model.Card;

@Repository
public interface CardRepository extends CrudRepository<Card, Long> {
}
