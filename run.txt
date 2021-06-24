set projectLocation=D:\Eclipse\Automation_Framework
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\Testng.xml
timeout 60