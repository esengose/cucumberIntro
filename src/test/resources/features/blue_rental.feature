
@blue_rental_login
Feature: blue_rental_login
  Scenario Outline: US167854_manager_login_test

Given kullanici "https://www.bluerentalcars.com/" gider
When kullanici login sayfasina gider
And kullanıcı "<adini>" girer
And "<sifreyi>" girer
And login butonuna basar
Then login islemi gerçekleşir

    Examples:veriler
      | adini | sifreyi |
      | sam.walker@bluerentalcars.com | c!fas_art |
      | kate.brown@bluerentalcars.com | tad1$Fas |
      | raj.khan@bluerentalcars.com | v7Hg_va^ |
      | pam.raymond@bluerentalcars.com | Nga^g6! |

