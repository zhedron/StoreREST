package zhedron.store.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import zhedron.store.entity.User;
import zhedron.store.services.UserService;

import java.util.List;

@RestController
@RequestMapping ("/users")
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public ResponseEntity<?> create (@RequestBody User user) {
        service.save(user);

        return ResponseEntity.ok(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?> findAll () {
        List<User> users = service.findAll();

        return ResponseEntity.ok(users);
    }

    @PutMapping ("/update/{id}")
    public ResponseEntity<?> update (@RequestBody  User user, @PathVariable int id) {
        service.update(user, id);

        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping ("/delete/{id}")
    public ResponseEntity<?> delete (@PathVariable int id) {
        service.delete(id);

        return ResponseEntity.ok(HttpStatus.OK);
    }
}
