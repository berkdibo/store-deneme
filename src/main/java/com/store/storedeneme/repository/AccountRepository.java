package com.store.storedeneme.repository;

import com.store.storedeneme.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {
}
