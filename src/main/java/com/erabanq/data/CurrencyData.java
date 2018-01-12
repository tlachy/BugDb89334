package com.erabanq.data;

import com.erabanq.entity.Currency;
import com.erabanq.repo.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

import static com.erabanq.utils.SecurityUtils.runAs;

@Component
@Profile("initialize-static-data")
public class CurrencyData {

    @Autowired
    CurrencyRepository repository;

    @PostConstruct
    public void initializeStaticData() {

        runAs("system", "system", "ROLE_ADMIN");

        repository.save(new Currency(1L, "AUD", "Australian Dollar'"));
        repository.save(new Currency(2L, "BCH", "Bitcoin Cash'"));
        repository.save(new Currency(3L, "BRL", "Brazilian Real'"));
        repository.save(new Currency(4L, "BTC", "Bitcoin'"));
        repository.save(new Currency(5L, "CAD", "Canadian Dollar'"));
        repository.save(new Currency(6L, "CHF", "Swiss Franc'"));
        repository.save(new Currency(7L, "CNY", "Chinese Yuan Renminbi'"));
        repository.save(new Currency(8L, "CZK", "Czech Koruna'"));
        repository.save(new Currency(9L, "DKK", "Danish Krone'"));
        repository.save(new Currency(10L, "ETH", "Ethereum'"));
        repository.save(new Currency(11L, "EUR", "Euro'"));
        repository.save(new Currency(12L, "GBP", "Pound Sterling'"));
        repository.save(new Currency(13L, "HKD", "Hong Kong Dollar'"));
        repository.save(new Currency(14L, "INR", "Indian Rupee'"));
        repository.save(new Currency(15L, "JPY", "Japanese Yen'"));
        repository.save(new Currency(16L, "KRW", "Korean Republic Won'"));
        repository.save(new Currency(17L, "LTC", "Litecoin'"));
        repository.save(new Currency(18L, "MXN", "Mexican Peso'"));
        repository.save(new Currency(19L, "MYR", "Malaysian Ringgit'"));
        repository.save(new Currency(20L, "NOK", "Norwegian Krone'"));
        repository.save(new Currency(21L, "NZD", "New Zealand Dollar'"));
        repository.save(new Currency(22L, "PLN", "Polish Zloty'"));
        repository.save(new Currency(23L, "RUB", "Russian Ruble'"));
        repository.save(new Currency(24L, "SEK", "Swedish Krona'"));
        repository.save(new Currency(25L, "SGD", "Singapore Dollar'"));
        repository.save(new Currency(26L, "THB", "Thai Baht'"));
        repository.save(new Currency(27L, "TRY", "Turkish Lira'"));
        repository.save(new Currency(28L, "TWD", "New Taiwan Dollar'"));
        repository.save(new Currency(29L, "USD", "US Dollar'"));
        repository.save(new Currency(30L, "XRP", "Ripple'"));
        repository.save(new Currency(31L, "ZAR", "South African Rand'"));

        SecurityContextHolder.clearContext();
        
    }
    
}
