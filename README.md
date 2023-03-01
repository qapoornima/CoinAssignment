## Table of contents

- Requirements
- Recommended modules
- Installation
- Configuration


## Requirements

Java(Version 1.8.0_202)
junit(Version 4.11)
log4j(Version 1.2.2)
cucumber(Version 7.11.1)



## Recommended module

https://coinmarketcap.com/
https://pro-api.coinmarketcap.com/
## Installation

Add all the required dependencies in POM.xml file

##  Configuration
Keep all module wise scenarios in simple english language in Coin.feature file
Keep all required configuration data in TestDataProperties file and get it from Utility class


## Object Repository

All locators will be written on CoinPageLocators class

## Logs

All captured data will be written in testLogs file under logs folder

## Execution Process

Execution will be initiate from the RunnerClass

