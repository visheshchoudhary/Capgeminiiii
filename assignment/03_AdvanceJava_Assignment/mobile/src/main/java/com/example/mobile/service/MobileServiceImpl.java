package com.example.mobile.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.mobile.dto.MobileDTO;
import com.example.mobile.entity.Mobile;
import com.example.mobile.repository.MobileRepository;

import java.util.List;
import com.example.mobile.exception.ResourceNotFoundException;  // ✅ ADD THIS



@Service
public class MobileServiceImpl implements MobileService {

    @Autowired
    private MobileRepository repository;

    @Override
    public Mobile addMobile(MobileDTO dto) {

        Mobile mobile = new Mobile();
        mobile.setBrandName(dto.getBrandName());
        mobile.setModelName(dto.getModelName());
        mobile.setPrice(dto.getPrice());
        mobile.setRam(dto.getRam());
        mobile.setStorage(dto.getStorage());
        mobile.setColor(dto.getColor());

        return repository.save(mobile);
    }

    @Override
    @Cacheable("mobiles")
    public List<Mobile> getAllMobiles() {
        return repository.findAll();
    }

    @Override
    public Mobile getMobileById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Mobile not found with id " + id));
    }

    @Override
    @CacheEvict(value = "mobiles", allEntries = true)
    public void deleteMobile(Long id) {
        Mobile mobile = getMobileById(id);
        repository.delete(mobile);
    }

    @Override
    @CacheEvict(value = "mobiles", allEntries = true)
    public Mobile updateMobile(Long id, MobileDTO dto) {

        Mobile mobile = getMobileById(id);

        mobile.setBrandName(dto.getBrandName());
        mobile.setModelName(dto.getModelName());
        mobile.setPrice(dto.getPrice());
        mobile.setRam(dto.getRam());
        mobile.setStorage(dto.getStorage());
        mobile.setColor(dto.getColor());

        return repository.save(mobile);
    }

    @Override
    public List<Mobile> searchByBrand(String brandName) {
        return repository.findByBrandName(brandName);
    }
}