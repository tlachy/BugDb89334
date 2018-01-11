package com.erabanq.repo;

import com.erabanq.entity.Country;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CountryRepository extends PagingAndSortingRepository<Country, Long> {

}
