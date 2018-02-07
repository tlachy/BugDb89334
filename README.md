# BugDb89334

# How to reproduce

* install java 9
* install maven 3.*
* clone this project
* create empty mysql db like desc in application.properties:

            spring.jpa.hibernate.ddl-auto=create
            spring.datasource.url=jdbc:mysql://localhost:3306/psp_db
            spring.datasource.username=psp_user
            spring.datasource.password=password

* table and everything will be created on the run
* run "mvn clean install"
* run "java -jar --add-modules java.xml.bind psp-1.0-SNAPSHOT.jar"
* go to "http://localhost:8080/swagger-ui.html#!/transfer45controller/tranferUsingPOST"
* send:

                          {
                            "ammount": 10,
                            "fromAccountId": 1,
                            "toAccountId": 2
                          }
              
and then

              {
                "ammount": 20,
                "fromAccountId": 2,
                "toAccountId": 1
              }
              
Relevant service code is here:

              @Transactional(REQUIRES_NEW)
                  public void transfer(Account fromAccount, Account toAccount, BigDecimal amount) throws InterruptedException {

                      fromAccount.setBalance(fromAccount.getBalance().subtract(amount));
                      accountRepository.save(fromAccount);

                      if(fromAccount.getId() == 1L){
                          Thread.currentThread().sleep(10000);
                      }

                      toAccount.setBalance(toAccount.getBalance().add(amount));
                      accountRepository.save(toAccount);

                      transferRepository.save(new Transfer(fromAccount, toAccount, amount));
                  }
