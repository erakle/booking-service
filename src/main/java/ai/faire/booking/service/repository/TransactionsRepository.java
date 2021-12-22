package ai.faire.booking.service.repository;

import ai.faire.booking.service.model.Transactions;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionsRepository extends CrudRepository<Transactions, Long>{
        
}
