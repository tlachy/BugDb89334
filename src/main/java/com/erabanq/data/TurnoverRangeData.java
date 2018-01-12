package com.erabanq.data;

import com.erabanq.entity.TurnoverRange;
import com.erabanq.repo.TurnoverRangeRepository;
import static com.erabanq.utils.SecurityUtils.runAs;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
@Profile("initialize-static-data")
public class TurnoverRangeData {
    
    @Autowired
    TurnoverRangeRepository repository;
    
    @PostConstruct
    public void initializeStaticData() {

        runAs("system", "system", "ROLE_ADMIN");

        repository.save(new TurnoverRange(1L, "0K_1K", "0k - 1k", 0, 1000));
        repository.save(new TurnoverRange(1L, "1K_5K", "1k - 5k", 1000, 5000));
        repository.save(new TurnoverRange(1L, "5K_10K", "5k - 10k", 5000, 10000));
        repository.save(new TurnoverRange(1L, "10K_25K", "10k - 25k", 10000, 25000));
        repository.save(new TurnoverRange(1L, "25K_50K", "25k - 50k", 25000, 50000));
        repository.save(new TurnoverRange(1L, "50K_100K", "50k - 100k", 50000, 100000));
        repository.save(new TurnoverRange(1L, "100K_250K", "100k - 250k", 100000, 250000));
        repository.save(new TurnoverRange(1L, "250K_500K", "250k - 500k", 250000, 500000));
        repository.save(new TurnoverRange(1L, "500K_750K", "500k - 750k", 500000, 750000));
        repository.save(new TurnoverRange(1L, "750K_999K", "750k - 999k", 750000, 999000));
        repository.save(new TurnoverRange(1L, "1M_2M", "1M - 2M", 1000000, 2000000));
        repository.save(new TurnoverRange(1L, "2M_3M", "2M - 3M", 2000000, 3000000));
        repository.save(new TurnoverRange(1L, "3M_5M", "3M - 5M", 3000000, 5000000));
        repository.save(new TurnoverRange(1L, "5M_10M", "5M - 10M", 5000000, 10000000));
        repository.save(new TurnoverRange(1L, "10M_100M", "10M - 100M", 10000000, 100000000));
        
        SecurityContextHolder.clearContext();
        
    }
    
}
