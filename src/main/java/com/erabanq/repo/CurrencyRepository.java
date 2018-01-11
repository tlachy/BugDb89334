package com.erabanq.repo;

import com.erabanq.entity.Currency;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface CurrencyRepository extends PagingAndSortingRepository<Currency, Long> {

}
