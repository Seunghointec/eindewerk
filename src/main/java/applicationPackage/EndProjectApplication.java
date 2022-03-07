package applicationPackage;


/* Framework vs Libraries
1. Spring -> framework (collection code that are given to the application/framework to be used)
2. Libraries - piece of codes (structured and indexed) that we/our code are going to use in our class/application
3. what to use depends on who has the control
4. if we want to make sure application does what we say -> libraries packages
5. Framework we write the code, and give framework control over all application layers (inversion of control)
6. Spring has to connect all the layer ton have the control
spring initialization
 * When we build an application in a network medium
 * there is input (e.g. data/action) (input is given by user/client (aka GUI) or other application/machines (API)
 * Application in middle (this is what we build)
 * Application Stage (JPA and JDBC works behind spring Core)
 * 1. Accept request (GUI (user (people)-interaction) or API (electronic/machines user-interaction)))
 * 2. Process request, (adjusting stocks) (organisation of the data: layers: are structured by Java packages )
 * step 2 example: result of measurement asking or calculating salary
 * process a. client input parameters (from 1 hour to 3 hours work, salaries per month, stock) + action (request, adjustment)
 * process b. 1. Database actions: Data Access layer/DAO/Repository (in and output of data of all application)
 *              I. application looks for where/which data are available
 *              II. data sends to the applications (stocks data from db)
                III. @Entity are special objects and classes that are stored in ORM database
                        1.data (business data) are given to entity (i.e. properties of data object are important)
                IV. @Component are general managing beans that are in three layers
                        1.data layers (data could be application data, that can included portal servers)
                        2. Spring does everything for you, manages three layers for you
 *            2. Data processing actions: business logic/service layer(automations/calculation)
 *              III. Control of input data (data validation)
 *              IV. Do calculations (calculation of salaries basis data that were collected, calculate new stocks)
 *            3. IO actions(input/output) (view/Controller/Presentation layers)
 *              V. write new adjustment or output (new stock writing, salary, measurement)
 *              VI. data send to the client (output of result)
 * 3. Output the result
 * output at the end (output data (process success/something went wrong)
 * output
 * 1. seen by user  (graphic) (GUI e.g. Text-field "hello world", button, tables, images)
 * 2. application/machines (easier to see data)
 * API e.g. raw data (non-processed- hard to understand:bits,radius,degrees or
 * meta -data-(descriptive) (JSON (Key value _pairs)"title" : "alper", XML, HTML))) */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EndProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(EndProjectApplication.class, args);
    }
    // wwe are running this class that contains our project.
    // persistence context -> managing for entity that class we are running here (database collection from ORM)
    // Application context -> classes (aka beans (application object) en object
    // Application context -> these classes and objects present in API, database layer, service layer
}
