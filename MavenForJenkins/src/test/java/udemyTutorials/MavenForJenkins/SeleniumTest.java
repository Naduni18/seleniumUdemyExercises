/**
 * 
 */
package udemyTutorials.MavenForJenkins;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

/**
 * @author Naduni
 *
 */
public class SeleniumTest {

	@Test
	public void login() {
		System.out.println("Selenium login");
	}
	
	@Test
	public void logout() {
		System.out.println("Selenium logout");
	}
	
}
/*
mvn -v
mvn --version
mvn clean
mvn compile
mvn test
mvn test -PSmoke

all classes must have name ending with word "Test" for maven to run
maven-surefire-plugin must add to pom.xml to run maven project
use maven-archetype-quickstart template for testframework

java -jar jenkins.war --enable-future-java -httpPort-9090
http://localhost:9090/


jenkins triggers
minute hours days months dayweek
* 7 * * *
*/