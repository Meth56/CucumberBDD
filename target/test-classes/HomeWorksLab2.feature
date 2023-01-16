Feature: Functional Testing

  @HomeworksLab2
Scenario:VerifyAdd Tariff Plan from guru99 Demo Website
Given The user wants to see Guru demo site
When The user wants to Add Tariff Plan
Then The user wants to verify "Add Tariff Plans" headerr
Then The user wants to Add Tariff Plan details as
| MonthlyRental| 10|
| FreeLocalMinutes| 12|
| FreeInternationalMinutes| 13|
| FreeSMSPack| 15|
| LocalPerMinutesCharges| 18|
| InternationalPerMinutesCharges| 25|
| SMSPerCharges| 28|
And The user wants to submit
Then The user wants to verify message as a "Congratulation you add Tariff Plan"