package ru.nsu.kosarev.db.building.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ru.nsu.kosarev.db.building.entity.Building;

@Repository
public interface BuildingRepository extends PagingAndSortingRepository<Building, Integer>, JpaSpecificationExecutor<Building> {

}