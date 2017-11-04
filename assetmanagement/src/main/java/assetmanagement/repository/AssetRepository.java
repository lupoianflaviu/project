package assetmanagement.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import assetmanagement.model.Asset;

@Repository
public interface AssetRepository extends CrudRepository<Asset, Integer>{

    @Override
    Iterable<Asset> findAll();

    @Override
    Asset findOne(Integer id);

    @Override
    <S extends Asset> S save(S s);

    @Override
    void delete(Integer id);
}
