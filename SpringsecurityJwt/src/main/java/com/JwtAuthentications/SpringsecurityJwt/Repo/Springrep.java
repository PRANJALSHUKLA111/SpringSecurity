package com.JwtAuthentications.SpringsecurityJwt.Repo;

import com.JwtAuthentications.SpringsecurityJwt.Entity.Springjwt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Springrep extends JpaRepository<Springjwt,String> {
//  public  Springjwt findByUsername(String susername);
//
}
