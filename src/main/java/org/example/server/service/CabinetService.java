package org.example.server.service;

import org.example.server.entity.Cabinet;
import org.example.server.repository.CabinetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CabinetService {

    private final CabinetRepository cabinetRepository;

    public CabinetService(CabinetRepository cabinetRepository) {
        this.cabinetRepository = cabinetRepository;
    }

    public List<Cabinet> findAll() {
        return cabinetRepository.findAll();
    }

    public Cabinet save(Cabinet cabinet) {
        return cabinetRepository.save(cabinet);
    }

    public Cabinet findById(String id) {
        return cabinetRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Cabinet not found: " + id));
    }

    public void deleteById(String id) {
        cabinetRepository.deleteById(id);
    }
}
