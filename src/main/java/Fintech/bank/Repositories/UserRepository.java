package Fintech.bank.Repositories;

import Fintech.bank.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsername(String username);
    User findByPassword(String password);
    User findByAccountNumber(String accountNumber);

}
