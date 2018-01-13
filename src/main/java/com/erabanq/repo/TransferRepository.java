package com.erabanq.repo;

import com.erabanq.entity.Transfer;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TransferRepository extends PagingAndSortingRepository<Transfer, Long> {
}
