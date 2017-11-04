package assetmanagement.repository;

import org.springframework.data.repository.CrudRepository;

import assetmanagement.model.Intervention;

public interface InterventionRepository extends CrudRepository<Intervention, Integer> {
}
