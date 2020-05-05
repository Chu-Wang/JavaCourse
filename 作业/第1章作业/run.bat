set JAVA_HOME = C:\Program Files\Java\jdk1.8.0_231
set path=%path%;%JAVA_HOME%\bin

set classpath=F:\chapter1\class
java -classpath %classpath% homework.ch1.Welcome

set classpath=F:\chapter1\jar\run.jar
java -classpath %classpath% homework.ch1.Welcome

pause