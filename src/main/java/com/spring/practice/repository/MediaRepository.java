package com.spring.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.practice.entity.Media;

@Repository
public interface MediaRepository extends JpaRepository<Media,Long> {

}

