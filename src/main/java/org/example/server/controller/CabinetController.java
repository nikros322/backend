package org.example.server.controller;

import jakarta.validation.Valid;
import org.example.server.entity.Cabinet;
import org.example.server.service.CabinetService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cabinets")
public class CabinetController {

    private final CabinetService cabinetService;

    public CabinetController(CabinetService cabinetService) {
        this.cabinetService = cabinetService;
    }

    @GetMapping
    public List<Cabinet> getAll() {
        return cabinetService.findAll();
    }

    @GetMapping("/{id}")
    public Cabinet getById(@PathVariable String id) {
        return cabinetService.findById(id);
    }

    @PostMapping
    public Cabinet create(@Valid @RequestBody Cabinet cabinet) {
        return cabinetService.save(cabinet);
    }

    @PutMapping("/{id}")
    public Cabinet update(@PathVariable String id, @Valid @RequestBody Cabinet cabinet) {
        cabinet.setId(id);
        return cabinetService.save(cabinet);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        cabinetService.deleteById(id);
    }
}
