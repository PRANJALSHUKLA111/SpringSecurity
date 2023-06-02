package com.JwtAuthentications.SpringsecurityJwt.Entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.HashSet;

public class customuser implements UserDetails {
    public Springjwt springjwt;

    public customuser(Springjwt springjwt) {
        this.springjwt = springjwt;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        HashSet<SimpleGrantedAuthority> set = new HashSet<>();
        set.add(new SimpleGrantedAuthority(this.springjwt.getRole()));
        return set;
    }
    @Override
    public String getPassword() {
        return this.springjwt.getSpassword();
    }

    @Override
    public String getUsername() {
        return this.springjwt.getSusername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
