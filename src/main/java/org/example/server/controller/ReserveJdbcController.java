package org.example.server.controller;

import org.example.server.jdbc.ReserveJdbc;
import org.example.server.jdbc.ReserveJdbcRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/jdbc/reserves")
public class ReserveJdbcController {

    private final ReserveJdbcRepository repository;

    public ReserveJdbcController(ReserveJdbcRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Iterable<ReserveJdbc> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ReserveJdbc getById(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Reserve not found: " + id));
    }

    @PostMapping
    public ReserveJdbc create(@RequestBody ReserveJdbc reserve) {
        return repository.save(reserve);
    }

    @PutMapping("/{id}")
    public ReserveJdbc update(@PathVariable Long id, @RequestBody ReserveJdbc reserve) {
        reserve.setId(id);
        return repository.save(reserve);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
