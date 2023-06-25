package com.example.someprojects.apiTests;

import com.example.someprojects.readProperties.ConfigProvider;
import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;
import org.junit.Test;

import javax.sound.midi.Soundbank;
import java.time.Instant;
import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;
public class ReqresTest {

    @Test
    public void checkAvatartId(){
        Specifications.installSpecification(Specifications.requestSpecification(ConfigProvider.URL_API), Specifications.responseSpecification(200));

        List<UserData> userDataList = given()
                .when()
                .get("api/users?page=2")
                .then().log().all()
                .extract().body().jsonPath().getList("data", UserData.class);

        userDataList.forEach(x-> Assert.assertTrue(x.getAvatar().contains(x.getId().toString())));
        userDataList.forEach(x-> Assert.assertTrue(x.getEmail().endsWith("@reqres.in")));

        List<String> avatars = userDataList.stream().map(UserData::getAvatar).collect(Collectors.toList());
        List<String> ids = userDataList.stream().map(x->x.getId().toString()).collect(Collectors.toList());

        for (int i = 0; i < avatars.size(); i++){
            Assert.assertTrue(avatars.get(i).contains(ids.get(i)));
        }
    }

    @Test
    public void checkResourceYears(){
        Specifications.installSpecification(Specifications.requestSpecification(ConfigProvider.URL_API), Specifications.responseSpecification(200));

        List<ResourceData> resourceDataList = given()
                .when()
                .get("/api/unknown")
                .then().log().all()
                .extract().body().jsonPath().getList("data", ResourceData.class);

        resourceDataList.forEach(x-> Assert.assertFalse(x.getYear().toString().isEmpty()));

        List<Integer> years = resourceDataList.stream().map(ResourceData::getYear).collect(Collectors.toList());
        List<Integer> yearsSorted = years.stream().sorted().collect(Collectors.toList());

        Assert.assertEquals(yearsSorted, years);

    }

    @Test
    public void checkBooksDemoQA(){
        Specifications.installSpecification(Specifications.requestSpecification(ConfigProvider.URL_DEMOQA), Specifications.responseSpecification(200));

        List<BookData> bookDataList = given()
                .when()
                .get("/BookStore/v1/Books")
                .then().log().all()
                .extract().body().jsonPath().getList("books", BookData.class);

        bookDataList.forEach(x-> Assert.assertFalse(x.getDescription().isEmpty()));

    }

    @Test
    public void checkUserCreation(){
        Specifications.installSpecification(Specifications.requestSpecification(ConfigProvider.URL_API), Specifications.responseSpecification(201));

        UserCreation userCreation = new UserCreation("morpheus", "leader");

        UserCreationResponse userCreationResponse = given()
                .body(userCreation)
                .post("/api/users")
                .then().log().all()
                .extract().as(UserCreationResponse.class);

        Assert.assertTrue(userCreationResponse.getName().equals(userCreation.getName()));
        Assert.assertTrue(userCreationResponse.getJob().equals(userCreation.getJob()));
        Assert.assertFalse(userCreationResponse.getId().isEmpty());

    }


}
















