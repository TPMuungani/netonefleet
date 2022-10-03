package com.example.netonefleet.servicies.implementation;

import com.example.netonefleet.models.Supplier;
import com.example.netonefleet.repositories.SupplierRepository;
import com.example.netonefleet.servicies.SupplierService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImplementation implements SupplierService {

    private SupplierRepository supplierRepository;

    public SupplierServiceImplementation(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    @Override
    public List<Supplier> getAllSuppliers() {
        return supplierRepository.findAll();
    }
}
