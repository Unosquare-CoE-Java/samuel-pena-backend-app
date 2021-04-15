package com.unosquare.inventory.security.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.unosquare.inventory.security.model.User;

@FeignClient(name="users-service")
public interface UserFeignClient {

	@GetMapping("/users/search/findByUsername")
	public User findByUsername(@RequestParam String username);
}
