package com.bitirmeproje.internproject.repository;

import com.bitirmeproje.internproject.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users,Integer> {

}
