package com.example.mobile.service;

import com.example.mobile.dto.MobileDTO;
import com.example.mobile.entity.Mobile;

import java.util.List;
public interface MobileService {

    Mobile addMobile(MobileDTO dto);

    List<Mobile> getAllMobiles();

    Mobile getMobileById(Long id);

    Mobile updateMobile(Long id, MobileDTO dto);

    void deleteMobile(Long id);

    List<Mobile> searchByBrand(String brandName);
}