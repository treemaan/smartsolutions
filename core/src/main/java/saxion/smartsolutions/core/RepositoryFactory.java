package saxion.smartsolutions.core;

import saxion.smartsolutions.core.brand.repo.BrandRepository;
import saxion.smartsolutions.core.device.repo.DeviceRepository;
import saxion.smartsolutions.core.model.repo.ModelRepository;
import saxion.smartsolutions.core.part.repo.PartRepository;

public interface RepositoryFactory {

    TransactionalContext newTransactionalContext();

    BrandRepository brandRepository();

    ModelRepository modelRepository();

    DeviceRepository deviceRepository();

    PartRepository partRepository();
}