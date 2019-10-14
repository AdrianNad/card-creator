package per.an.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import per.an.model.Type;

@Repository
public interface TypeRepository extends CrudRepository<Type, Long> {
}
