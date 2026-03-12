package com.example.mobile.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mobile.entity.Mobile;

import java.util.List;

public interface MobileRepository extends JpaRepository<Mobile, Long> {

    List<Mobile> findByBrandName(String brandName);
}