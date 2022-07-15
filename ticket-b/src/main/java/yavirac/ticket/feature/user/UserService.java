package yavirac.seguridad.feature.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    //CRUD = Create, Read, Update, Delete

    public User save(User user){

        return userRepository.save(user);
    }

    public User findById(long id){
        return userRepository.findById(id).orElse(new User());
    }

    public User update(User user){
        return userRepository.save(user);
    }

    public void deleteById(long id){
        userRepository.deleteById(id);
    }
    
}