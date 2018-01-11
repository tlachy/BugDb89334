package com.erabanq.data;

import com.erabanq.entity.Country;
import com.erabanq.repo.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class CountryData {

    @Autowired
    CountryRepository countryRepository;

    @PostConstruct
    void load(){

        countryRepository.save(new Country("AFGHANISTAN", "Afghanistan"));
        countryRepository.save(new Country("ALBANIA", "Albania"));
        countryRepository.save(new Country("ALGERIA", "Algeria"));
        countryRepository.save(new Country("ANDORRA", "Andorra"));
        countryRepository.save(new Country("ANGOLA", "Angola"));
        countryRepository.save(new Country("ANTIGUA_AND_BARBUDA", "Antigua and Barbuda"));
        countryRepository.save(new Country("ARGENTINA", "Argentina"));
        countryRepository.save(new Country("ARMENIA", "Armenia"));
        countryRepository.save(new Country("AUSTRALIA", "Australia"));
        countryRepository.save(new Country("AUSTRIA", "Austria"));
        countryRepository.save(new Country("AZERBAIJAN", "Azerbaijan"));
        countryRepository.save(new Country("BAHAMAS", "Bahamas"));
        countryRepository.save(new Country("BAHRAIN", "Bahrain"));
        countryRepository.save(new Country("BANGLADESH", "Bangladesh"));
        countryRepository.save(new Country("BARBADOS", "Barbados"));
        countryRepository.save(new Country("BELARUS", "Belarus"));
        countryRepository.save(new Country("BELGIUM", "Belgium"));
        countryRepository.save(new Country("BELIZE", "Belize"));
        countryRepository.save(new Country("BENIN", "Benin"));
        countryRepository.save(new Country("BHUTAN", "Bhutan"));
        countryRepository.save(new Country("BOLIVIA", "Bolivia"));
        countryRepository.save(new Country("BOSNIA_AND_HERZEGOVINA", "Bosnia and Herzegovina"));
        countryRepository.save(new Country("BOTSWANA", "Botswana"));
        countryRepository.save(new Country("BRAZIL", "Brazil"));
        countryRepository.save(new Country("BRUNEI", "Brunei"));
        countryRepository.save(new Country("BULGARIA", "Bulgaria"));
        countryRepository.save(new Country("BURKINA_FASO", "Burkina Faso"));
        countryRepository.save(new Country("BURUNDI", "Burundi"));
        countryRepository.save(new Country("CABO_VERDE", "Cabo Verde"));
        countryRepository.save(new Country("CAMBODIA", "Cambodia"));
        countryRepository.save(new Country("CAMEROON", "Cameroon"));
        countryRepository.save(new Country("CANADA", "Canada"));
        countryRepository.save(new Country("CENTRAL_AFRICAN_REPUBLIC", "Central African Republic"));
        countryRepository.save(new Country("CHAD", "Chad"));
        countryRepository.save(new Country("CHILE", "Chile"));
        countryRepository.save(new Country("CHINA", "China"));
        countryRepository.save(new Country("COLOMBIA", "Colombia"));
        countryRepository.save(new Country("COMOROS", "Comoros"));
        countryRepository.save(new Country("DEMOCRATIC_REPUBLIC_OF_THE_CONGO", "Democratic Republic of the Congo"));
        countryRepository.save(new Country("REPUBLIC_OF_THE_CONGO", "Republic of the Congo"));
        countryRepository.save(new Country("COSTA_RICA", "Costa Rica"));
        countryRepository.save(new Country("COTE_DIVOIRE", "Cote dIvoire"));
        countryRepository.save(new Country("CROATIA", "Croatia"));
        countryRepository.save(new Country("CUBA", "Cuba"));
        countryRepository.save(new Country("CYPRUS", "Cyprus"));
        countryRepository.save(new Country("CZECH_REPUBLIC", "Czech Republic"));
        countryRepository.save(new Country("DENMARK", "Denmark"));
        countryRepository.save(new Country("DJIBOUTI", "Djibouti"));
        countryRepository.save(new Country("DOMINICA", "Dominica"));
        countryRepository.save(new Country("DOMINICAN_REPUBLIC", "Dominican Republic"));
        countryRepository.save(new Country("ECUADOR", "Ecuador"));
        countryRepository.save(new Country("EGYPT", "Egypt"));
        countryRepository.save(new Country("EL_SALVADOR", "El Salvador"));
        countryRepository.save(new Country("EQUATORIAL_GUINEA", "Equatorial Guinea"));
        countryRepository.save(new Country("ERITREA", "Eritrea"));
        countryRepository.save(new Country("ESTONIA", "Estonia"));
        countryRepository.save(new Country("ETHIOPIA", "Ethiopia"));
        countryRepository.save(new Country("FIJI", "Fiji"));
        countryRepository.save(new Country("FINLAND", "Finland"));
        countryRepository.save(new Country("FRANCE", "France"));
        countryRepository.save(new Country("GABON", "Gabon"));
        countryRepository.save(new Country("GAMBIA", "Gambia"));
        countryRepository.save(new Country("GEORGIA", "Georgia"));
        countryRepository.save(new Country("GERMANY", "Germany"));
        countryRepository.save(new Country("GHANA", "Ghana"));
        countryRepository.save(new Country("GREECE", "Greece"));
        countryRepository.save(new Country("GRENADA", "Grenada"));
        countryRepository.save(new Country("GUATEMALA", "Guatemala"));
        countryRepository.save(new Country("GUINEA", "Guinea"));
        countryRepository.save(new Country("GUINEA_BISSAU", "Guinea Bissau"));
        countryRepository.save(new Country("GUYANA", "Guyana"));
        countryRepository.save(new Country("HAITI", "Haiti"));
        countryRepository.save(new Country("HONDURAS", "Honduras"));
        countryRepository.save(new Country("HUNGARY", "Hungary"));
        countryRepository.save(new Country("ICELAND", "Iceland"));
        countryRepository.save(new Country("INDIA", "India"));
        countryRepository.save(new Country("INDONESIA", "Indonesia"));
        countryRepository.save(new Country("IRAN", "Iran"));
        countryRepository.save(new Country("IRAQ", "Iraq"));
        countryRepository.save(new Country("IRELAND", "Ireland"));
        countryRepository.save(new Country("ISRAEL", "Israel"));
        countryRepository.save(new Country("ITALY", "Italy"));
        countryRepository.save(new Country("JAMAICA", "Jamaica"));
        countryRepository.save(new Country("JAPAN", "Japan"));
        countryRepository.save(new Country("JORDAN", "Jordan"));
        countryRepository.save(new Country("KAZAKHSTAN", "Kazakhstan"));
        countryRepository.save(new Country("KENYA", "Kenya"));
        countryRepository.save(new Country("KIRIBATI", "Kiribati"));
        countryRepository.save(new Country("KOSOVO", "Kosovo"));
        countryRepository.save(new Country("KUWAIT", "Kuwait"));
        countryRepository.save(new Country("KYRGYZSTAN", "Kyrgyzstan"));
        countryRepository.save(new Country("LAOS", "Laos"));
        countryRepository.save(new Country("LATVIA", "Latvia"));
        countryRepository.save(new Country("LEBANON", "Lebanon"));
        countryRepository.save(new Country("LESOTHO", "Lesotho"));
        countryRepository.save(new Country("LIBERIA", "Liberia"));
        countryRepository.save(new Country("LIBYA", "Libya"));
        countryRepository.save(new Country("LIECHTENSTEIN", "Liechtenstein"));
        countryRepository.save(new Country("LITHUANIA", "Lithuania"));
        countryRepository.save(new Country("LUXEMBOURG", "Luxembourg"));
        countryRepository.save(new Country("MACEDONIA", "Macedonia"));
        countryRepository.save(new Country("MADAGASCAR", "Madagascar"));
        countryRepository.save(new Country("MALAWI", "Malawi"));
        countryRepository.save(new Country("MALAYSIA", "Malaysia"));
        countryRepository.save(new Country("MALDIVES", "Maldives"));
        countryRepository.save(new Country("MALI", "Mali"));
        countryRepository.save(new Country("MALTA", "Malta"));
        countryRepository.save(new Country("MARSHALL_ISLANDS", "Marshall Islands"));
        countryRepository.save(new Country("MAURITANIA", "Mauritania"));
        countryRepository.save(new Country("MAURITIUS", "Mauritius"));
        countryRepository.save(new Country("MEXICO", "Mexico"));
        countryRepository.save(new Country("MICRONESIA", "Micronesia"));
        countryRepository.save(new Country("MOLDOVA", "Moldova"));
        countryRepository.save(new Country("MONACO", "Monaco"));
        countryRepository.save(new Country("MONGOLIA", "Mongolia"));
        countryRepository.save(new Country("MONTENEGRO", "Montenegro"));
        countryRepository.save(new Country("MOROCCO", "Morocco"));
        countryRepository.save(new Country("MOZAMBIQUE", "Mozambique"));
        countryRepository.save(new Country("MYANMAR", "Myanmar"));
        countryRepository.save(new Country("NAMIBIA", "Namibia"));
        countryRepository.save(new Country("NAURU", "Nauru"));
        countryRepository.save(new Country("NEPAL", "Nepal"));
        countryRepository.save(new Country("NETHERLANDS", "Netherlands"));
        countryRepository.save(new Country("NEW_ZEALAND", "New Zealand"));
        countryRepository.save(new Country("NICARAGUA", "Nicaragua"));
        countryRepository.save(new Country("NIGER", "Niger"));
        countryRepository.save(new Country("NIGERIA", "Nigeria"));
        countryRepository.save(new Country("NORTH_KOREA", "North Korea"));
        countryRepository.save(new Country("NORWAY", "Norway"));
        countryRepository.save(new Country("OMAN", "Oman"));
        countryRepository.save(new Country("PAKISTAN", "Pakistan"));
        countryRepository.save(new Country("PALAU", "Palau"));
        countryRepository.save(new Country("PALESTINE", "Palestine"));
        countryRepository.save(new Country("PANAMA", "Panama"));
        countryRepository.save(new Country("PAPUA_NEW_GUINEA", "Papua New Guinea"));
        countryRepository.save(new Country("PARAGUAY", "Paraguay"));
        countryRepository.save(new Country("PERU", "Peru"));
        countryRepository.save(new Country("PHILIPPINES", "Philippines"));
        countryRepository.save(new Country("POLAND", "Poland"));
        countryRepository.save(new Country("PORTUGAL", "Portugal"));
        countryRepository.save(new Country("QATAR", "Qatar"));
        countryRepository.save(new Country("ROMANIA", "Romania"));
        countryRepository.save(new Country("RUSSIA", "Russia"));
        countryRepository.save(new Country("RWANDA", "Rwanda"));
        countryRepository.save(new Country("SAINT_KITTS_AND_NEVIS", "Saint Kitts and Nevis"));
        countryRepository.save(new Country("SAINT_LUCIA", "Saint Lucia"));
        countryRepository.save(new Country("SAINT_VINCENT_AND_THE_GRENADINES", "Saint Vincent and the Grenadines"));
        countryRepository.save(new Country("SAMOA", "Samoa"));
        countryRepository.save(new Country("SAN_MARINO", "San Marino"));
        countryRepository.save(new Country("SAO_TOME_AND_PRINCIPE", "Sao Tome and Principe"));
        countryRepository.save(new Country("SAUDI_ARABIA", "Saudi Arabia"));
        countryRepository.save(new Country("SENEGAL", "Senegal"));
        countryRepository.save(new Country("SERBIA", "Serbia"));
        countryRepository.save(new Country("SEYCHELLES", "Seychelles"));
        countryRepository.save(new Country("SIERRA_LEONE", "Sierra Leone"));
        countryRepository.save(new Country("SINGAPORE", "Singapore"));
        countryRepository.save(new Country("SLOVAKIA", "Slovakia"));
        countryRepository.save(new Country("SLOVENIA", "Slovenia"));
        countryRepository.save(new Country("SOLOMON_ISLANDS", "Solomon Islands"));
        countryRepository.save(new Country("SOMALIA", "Somalia"));
        countryRepository.save(new Country("SOUTH_AFRICA", "South Africa"));
        countryRepository.save(new Country("SOUTH_KOREA", "South Korea"));
        countryRepository.save(new Country("SOUTH_SUDAN", "South Sudan"));
        countryRepository.save(new Country("SPAIN", "Spain"));
        countryRepository.save(new Country("SRI_LANKA", "Sri Lanka"));
        countryRepository.save(new Country("SUDAN", "Sudan"));
        countryRepository.save(new Country("SURINAME", "Suriname"));
        countryRepository.save(new Country("SWAZILAND", "Swaziland"));
        countryRepository.save(new Country("SWEDEN", "Sweden"));
        countryRepository.save(new Country("SWITZERLAND", "Switzerland"));
        countryRepository.save(new Country("SYRIA", "Syria"));
        countryRepository.save(new Country("TAIWAN", "Taiwan"));
        countryRepository.save(new Country("TAJIKISTAN", "Tajikistan"));
        countryRepository.save(new Country("TANZANIA", "Tanzania"));
        countryRepository.save(new Country("THAILAND", "Thailand"));
        countryRepository.save(new Country("TIMOR_LESTE", "Timor Leste"));
        countryRepository.save(new Country("TOGO", "Togo"));
        countryRepository.save(new Country("TONGA", "Tonga"));
        countryRepository.save(new Country("TRINIDAD_AND_TOBAGO", "Trinidad and Tobago"));
        countryRepository.save(new Country("TUNISIA", "Tunisia"));
        countryRepository.save(new Country("TURKEY", "Turkey"));
        countryRepository.save(new Country("TURKMENISTAN", "Turkmenistan"));
        countryRepository.save(new Country("TUVALU", "Tuvalu"));
        countryRepository.save(new Country("UGANDA", "Uganda"));
        countryRepository.save(new Country("UKRAINE", "Ukraine"));
        countryRepository.save(new Country("UNITED_ARAB_EMIRATES", "United Arab Emirates"));
        countryRepository.save(new Country("UNITED_KINGDOM", "United Kingdom"));
        countryRepository.save(new Country("UNITED_STATES_OF_AMERICA", "United States of America"));
        countryRepository.save(new Country("URUGUAY", "Uruguay"));
        countryRepository.save(new Country("UZBEKISTAN", "Uzbekistan"));
        countryRepository.save(new Country("VANUATU", "Vanuatu"));
        countryRepository.save(new Country("VATICAN_CITY", "Vatican City"));
        countryRepository.save(new Country("VENEZUELA", "Venezuela"));
        countryRepository.save(new Country("VIETNAM", "Vietnam"));
        countryRepository.save(new Country("YEMEN", "Yemen"));
        countryRepository.save(new Country("ZAMBIA", "Zambia"));
        countryRepository.save(new Country("ZIMBABWE", "Zimbabwe"));
    }
}