package assetmanagement.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import assetmanagement.model.Asset;

@Repository
public interface AssetRepository extends CrudRepository<Asset, Long>{

    @Override
    Iterable<Asset> findAll();
}
