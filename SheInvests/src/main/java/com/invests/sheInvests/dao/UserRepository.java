package com.invests.sheInvests.dao;

import com.invests.sheInvests.model.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
