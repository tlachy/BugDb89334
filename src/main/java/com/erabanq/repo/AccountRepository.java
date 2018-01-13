package com.erabanq.repo;

import com.erabanq.entity.Account;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AccountRepository extends PagingAndSortingRepository<Account, Long> {
}