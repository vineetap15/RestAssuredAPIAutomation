// package ApiTests.getApis;

// import utils.Utils;
// import io.restassured.http.ContentType;
// import io.restassured.path.json.JsonPath;
// import io.restassured.response.Response;
// import org.testng.*;
// import org.testng.annotations.BeforeSuite;
// import org.testng.annotations.Test;
// import java.util.*;
// import ApiTests.*;
// import helpers.HelperTestMethods;

// public class UseCase5Test {

//     private Response res = null; //Response
//     private JsonPath jp = null; //JsonPath

//     //Instantiate a Helper Test Methods (htm) Object
//     HelperTestMethods htm = new HelperTestMethods();

//     @BeforeSuite
//     public void setup (){
//         //Test Setup
//         Utils.setBaseURI(); //Setup Base URI
//         //Utils.setBasePath("search"); //Setup Base Path
//         Utils.setContentType(ContentType.JSON); //Setup Content Type
//         Utils.setJsonPathTerm("findByStatus"); //Setup Json Path Term
//        Utils.createSearchQueryPath("paris hilton", "status", "sold"); //Set up search term, param and param value
//         res = Utils.getResponse(); //Get response
//         jp = Utils.getJsonPath(res); //Set JsonPath
        
//     }

//     @Test
//     public void T01_StatusCodeTest() {
//         //Verify the http response status returned. Check Status Code is 200?
//         htm.checkStatusIs200(res);
//     }

// }

   


