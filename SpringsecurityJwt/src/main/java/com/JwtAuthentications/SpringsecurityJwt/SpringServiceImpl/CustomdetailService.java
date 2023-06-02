package com.JwtAuthentications.SpringsecurityJwt.SpringServiceImpl;

import com.JwtAuthentications.SpringsecurityJwt.Entity.Springjwt;
import com.JwtAuthentications.SpringsecurityJwt.Entity.customuser;
import com.JwtAuthentications.SpringsecurityJwt.Repo.Springrep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public class CustomdetailService implements UserDetailsService {
    @Autowired
    Springrep springrep;
    @Override
    public UserDetails loadUserByUsername(String susername) throws UsernameNotFoundException {
        Springjwt byId = springrep.getById(susername);
        if(byId==null){
            throw new UsernameNotFoundException("not found");
        }return new customuser(byId);


    }
}
