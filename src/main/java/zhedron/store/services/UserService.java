package zhedron.store.services;

import org.springframework.stereotype.Service;
import zhedron.store.entity.User;
import zhedron.store.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> findAll () {
        return repository.findAll();
    }

    public void save (User user) {
        repository.save(user);
    }

    public void delete (int id) {
        repository.deleteById(id);
    }

    public void update (User user, int id) {
        User updated = repository.findById(id).orElse(null);

        updated.setProducts(user.getProducts());

        repository.save(updated);
    }
}
