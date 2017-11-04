package assetmanagement.service;

import assetmanagement.model.Asset;

public interface AssetService {

    Iterable<Asset> findAll();

    Asset findOne(Integer id);

    <S extends Asset> S save(S s);
}
