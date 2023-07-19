package bills.app.services;

import bills.app.repositories.ServiceRepository;
import org.springframework.stereotype.Service;

@Service
public class ServiceService {

    private final ServiceRepository serviceRepository;

    public ServiceService(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }
}
