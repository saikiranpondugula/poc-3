package com.poc4.repository;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poc4.entity.UserInfo;
@Repository
public interface UserRepository extends JpaRepository<UserInfo, Integer> {

}
