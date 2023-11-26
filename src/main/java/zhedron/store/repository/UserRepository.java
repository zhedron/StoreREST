package zhedron.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zhedron.store.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
