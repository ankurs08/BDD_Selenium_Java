# Java_Maven_BDD_Selenium
This is a java maven selenium test automation framework with basic web automation scenarios covered though BDD

# Dependencies Included
- BDD powered by cucumber
- Rest Assured (io.rest-assured)
- Apache poi

# Features of the framework

        Web/UI testing
- Supports Page object modelling using PageFactory
- Uses css for webelement identification
- Have covered basic scenarios for web automation
- Maven build project for easy execution
- Can support headless chrome execution
- Browsers are configurable through conf.properties file


        API testing
- Supports Rest API testing using the RestAssured library
- API end-points are configurable through properties file
- Supports BDD using Cucumber

# Utilities and Functions
WebUtils
 - initiateDriver
 - launchURL
 - clickLink
 - getText
 - setText
 - clickCheckBox
 - switchToFrame
 - selectFromDropDownByVisibleText
 - doRightClick
 - acceptJsPopUp
 - tearDown
 
ExcelUtils
 - loadXlsFile
 - getCellValue
 
 JsonUtils
 - loadJsonFile
 - getJsonElement
 
 PropertiesUtils
 - getPropValue
 - getAPIPropValue
 
 XmlUtils
 - loadFile
 - getXmlKeyValue
 
        
