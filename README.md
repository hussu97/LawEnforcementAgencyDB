# Law Enforcement System
![Main Page](/screenshots/main.png)  
**Project for - CMP320 - Database Systems**  
**Project Duration - October-December 2017**  
**Collaborators - [Gehad Aboarab](https://github.com/gehad-aboarab), [Ahmed Abou Bakr](https://github.com/ahmed8498/)**
***
A system built using the Java Swing library, and Oracle SQL as the database for the system.

Our application is suitable for police stations of various sizes, with functionalities for multiple departments within one police station. The database application also contains support for prisons within the law enforcement system, and also storage options for the criminals sent to prison.

Our application employed a 3-tiered architecture, consisting of the User Interface (*/UIP*) Application Logic (*/ALP*) and the Database System (*/DSP*) layers 

### Entities of the system
#### Employees
People working in various positions within the agency. Examples include - Prison guards,
Police cops, Clerical staff, etc.
#### Stations
Physical buildings where employees work. Consists of various **departments** that operate under it.
#### Prisons
Areas where prisoners are stored. Consists **cells** of different types and sizes, and can store any number of prisoners.
#### Inmates
People caught by the Law, and are staying in the prisons, until their sentenced period is over.

## Requirements
* [Java 8](https://www.java.com/en/download/)
* [Oracle SQL Server](https://www.oracle.com/technetwork/database/migration/connect-sqlserver-1945229.html)
* Any Java IDE ([Netbeans 8.2](https://netbeans.org/downloads/8.2/) was used in this project)

## Installation
1. Clone the repo by using the following command
``` bash
$ git clone https://github.com/hussu97/LawEnforcementSystem.git
$ cd LawEnforcementSystem
```
2. Open the project in your Java IDE
3. Change the following details from the link in the [OracleJDBCConnection.java](/DSP/OracleJDBCConnection.java) file
``` java
 public static String  CONNECTION_STRING = "jdbc:oracle:thin:username/password@domainname:port:orcl";
```
4. Build and Run your project

## Functions
* View, edit and remove employees
* View, edit and remove stations and sub-stations
* View, edit and remove prisons
* Add or discharge criminals from prisons, or move them to different cells

## Additional Screenshots

### Add Employee page
![Add Employee](/screenshots/addemployee.png)
***
### Add Inmate page
![Add Inmate](/screenshots/addinmate.png)
***
### Prison Information page
![Prison Information](/screenshots/prisoninfo.png)
***
### Station Information page
![Station Information](/screenshots/stationinfo.png)
***
## License
[GNUv3](https://github.com/hussu97/LawEnforcementSystem/blob/develop/LICENSE)
