package com.excelfore.TMPV.Service;

import com.excelfore.TMPV.Entities.CatalogueItem;
import com.excelfore.TMPV.Repositories.CatalogueItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CatalogueItemService {

    @Autowired
    private CatalogueItemRepository repository;

    public CatalogueItem createCatalogueItem(CatalogueItem item) {
        item.setCreatedAt(LocalDate.now());
        return repository.save(item);
    }

    public CatalogueItem updateCatalogueItem(Long id, CatalogueItem updatedItem) {
        return repository.findById(id)
                .map(item -> {
                    item.setVersion(updatedItem.getVersion());
                    item.setContainerId(updatedItem.getContainerId());
                    item.setFileSize(updatedItem.getFileSize());
                    item.setType(updatedItem.getType());
                    item.setEcuName(updatedItem.getEcuName());
                    item.setS3Uri(updatedItem.getS3Uri());
                    item.setAdditionalAttributes(updatedItem.getAdditionalAttributes());
                    item.setUpdatedAt(LocalDate.now());
                    item.setUpdatedBy(updatedItem.getUpdatedBy());
                    return repository.save(item);
                })
                .orElseThrow(() -> new RuntimeException("Catalogue item not found"));
    }

    public void deleteCatalogueItem(Long id) {
        repository.deleteById(id);
    }

    public List<CatalogueItem> getAllCatalogueItems() {
        return repository.findAll();
    }

    public CatalogueItem getCatalogueItemById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Catalogue item not found"));
    }
}

