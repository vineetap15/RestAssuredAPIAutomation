// package e2e.steps.pets;

// import io.restassured.http.ContentType;
// import io.restassured.response.Response;

// import helpers.HelperTestMethods;
// import cucumber.api.java.en.Given;
// import cucumber.api.java.en.Then;
// import cucumber.api.java.en.When;
// import utils.Utils;
// import utils.models.pet.CreatePet;

// public class DeletePet {

//     private static Response res = null; // Response
//     // Instantiate a Helper Test Methods (htm) Object
//     HelperTestMethods htm = new HelperTestMethods();
//     CreatePet createPet = new CreatePet();


//     @Given("^the user has DELETE api of pet$")
// public void the_user_has_DELETE_api_of_pet() throws Throwable {
//     Utils.setBaseURI(); // Setup Base 

// }

// @When("^the user hits the delete api with id \"([^\"]*)\"$")
// public void the_user_hits_the_delete_api(String id) throws Throwable {
//     Utils.setJsonPathTerm(id);
//     res = Utils.getPetDeleteResponse(ContentType.JSON);
 
// }

// @Then("^the pet should be deleted$")
// public void the_pet_should_be_deleted() throws Throwable {
//     htm.checkStatusIs200(res);
    
  
// }


// }



