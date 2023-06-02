package com.JwtAuthentications.SpringsecurityJwt;

import com.JwtAuthentications.SpringsecurityJwt.Entity.Springjwt;
import com.JwtAuthentications.SpringsecurityJwt.Repo.Springrep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringsecurityJwtApplication implements CommandLineRunner {
	@Autowired
	public Springrep springrep;
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;



	public static void main(String[] args) {
		SpringApplication.run(SpringsecurityJwtApplication.class, args);

	}
	@Override
	public void run(String... args) throws Exception {

		Springjwt springjwt=new Springjwt();
		springjwt.setSusername("raj");
		springjwt.setSpassword(this.bCryptPasswordEncoder.encode("raj"));
		springjwt.setSemail("23@gmail");
		springjwt.setRole("ROLE_NORMAL");
		this.springrep.save(springjwt);

		Springjwt springjwt1=new Springjwt();
		springjwt1.setSpassword(this.bCryptPasswordEncoder.encode("jain"));
		springjwt1.setSusername("shenky");
		springjwt1.setSemail("3345");
		springjwt1.setRole("ROLE_ADMIN");
		this.springrep.save(springjwt1);

	}
}
