package com.excelfore.TMPV.Controller;

import com.excelfore.TMPV.Entities.CatalogueItem;
import com.excelfore.TMPV.Service.CatalogueItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/catalogue")
public class CatalogueItemController {

    @Autowired
    private CatalogueItemService service;

    @PostMapping
    public ResponseEntity<CatalogueItem> createCatalogueItem(@RequestBody CatalogueItem item) {
        return ResponseEntity.ok(service.createCatalogueItem(item));
    }

    @PutMapping("/{id}")
    public ResponseEntity<CatalogueItem> updateCatalogueItem(@PathVariable Long id, @RequestBody CatalogueItem item) {
        return ResponseEntity.ok(service.updateCatalogueItem(id, item));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCatalogueItem(@PathVariable Long id) {
        service.deleteCatalogueItem(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<CatalogueItem>> getAllCatalogueItems() {
        return ResponseEntity.ok(service.getAllCatalogueItems());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CatalogueItem> getCatalogueItemById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getCatalogueItemById(id));
    }
}
