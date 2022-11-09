package com.cydeo.repository;

import com.cydeo.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {

    //Controller is calling and requesting all the roles
    //need to go to Database and bring all the roles from there


}
