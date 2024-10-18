package com.excelfore.TMPV.Repositories;

import com.excelfore.TMPV.Entities.CatalogueItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogueItemRepository extends JpaRepository<CatalogueItem, Long> {
    // Custom queries can be added here
}
