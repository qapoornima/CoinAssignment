## Table of contents

- Requirements
- Recommended modules
- Installation
  Element Locators
- Configuration


## Requirements

Java(Version 1.8.0_202)
junit(Version 4.11)
log4j(Version 1.2.2)
cucumber(Version 7.11.1)
rest-assured(4.2.0)



## Recommended module

https://coinmarketcap.com/

https://pro-api.coinmarketcap.com/

## Installation

Add all the required dependencies in POM.xml file

##  Configuration
Keep all module wise scenarios in simple english language in Coin.feature file
Keep all required configuration data in TestDataProperties file and get it from Utility class


## Element Locators

All locators will be written on CoinPageLocators class for UI scenario

## Object Repository

All Test data are keep in TestDataProperties file

Common Methods are in Utility class and in Get Price class(API related scenario only)

## Logs

All captured data will be written in contentlogs file under log folder

## Execution Process

Execution will be initiate from the RunnerClass for both the scenarios

