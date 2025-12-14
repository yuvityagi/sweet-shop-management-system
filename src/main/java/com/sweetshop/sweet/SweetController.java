package com.sweetshop.sweet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sweets")
public class SweetController {

    @Autowired
    private SweetRepository sweetRepository;

    // ✅ CREATE
    @PostMapping
    public Sweet addSweet(@RequestBody Sweet sweet) {
        return sweetRepository.save(sweet);
    }

    // ✅ READ ALL
    @GetMapping
    public List<Sweet> getAllSweets() {
        return sweetRepository.findAll();
    }

    // ✅ UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<Sweet> updateSweet(
            @PathVariable Long id,
            @RequestBody Sweet updatedSweet) {

        return sweetRepository.findById(id)
                .map(sweet -> {
                    sweet.setName(updatedSweet.getName());
                    sweet.setPrice(updatedSweet.getPrice());
                    sweet.setQuantity(updatedSweet.getQuantity());
                    return ResponseEntity.ok(sweetRepository.save(sweet));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // ✅ DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteSweet(@PathVariable Long id) {

        if (!sweetRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }

        sweetRepository.deleteById(id);
        return ResponseEntity.ok("Sweet deleted successfully");
    }
}
