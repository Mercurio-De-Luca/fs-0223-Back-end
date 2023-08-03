package com.epicode.day9.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epicode.day9.security.entity.ERole;
import com.epicode.day9.security.entity.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    
	Optional<Role> findByRoleName(ERole roleName);

}
