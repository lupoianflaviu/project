package assetmanagement.service;

import assetmanagement.model.Asset;

public interface AssetService {

    Iterable<Asset> findAll();
}
