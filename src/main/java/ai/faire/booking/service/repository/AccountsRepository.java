package ai.faire.booking.service.repository;

import ai.faire.booking.service.model.Accounts;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepository extends CrudRepository<Accounts, Long>{

    public boolean existsByAccountNumber(String accountNumber);

    public Accounts findByAccountNumber(String accountNumber);
    
}
