package per.an.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import per.an.model.Border;

@Repository
public interface BorderRepository extends CrudRepository<Border, Long> {
}
