package webpage.register;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import webpage.register.User;

@Repository
public interface UserRepository extends CrudRepository<User , Integer> {
   
}