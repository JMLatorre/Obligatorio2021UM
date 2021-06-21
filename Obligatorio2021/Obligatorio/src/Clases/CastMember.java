package Clases;

import java.util.Date;

public class CastMember {

    private String imdbNameId;
    private String name;
    private String birthName;
    private String height;
    private String bio;
    private String birthDate;
    private String birthState;
    private String birthCity;
    private String deathDate;
    private String deathState;
    private String deathCountry;
    private String deathCity;
    private String spousesString;
    private String spouses;
    private String divorces;
    private String spousesWithChildren;
    private String children;

    public CastMember(){

    }

    //Lista
    public CastMember(String imdbNameId, String name, String birthName, String height, String bio, String birthDate, String birthState, String birthCity, String deathDate, String deathState, String deathCountry, String deathCity, String spousesString, String spouses, String divorces, String spousesWithChildren, String children) {
        this.imdbNameId = imdbNameId;
        this.name = name;
        this.birthName = birthName;
        this.height = height;
        this.bio = bio;
        this.birthDate = birthDate;
        this.birthState = birthState;
        this.birthCity = birthCity;
        this.deathDate = deathDate;
        this.deathState = deathState;
        this.deathCountry = deathCountry;
        this.deathCity = deathCity;
        this.spousesString = spousesString;
        this.spouses = spouses;
        this.divorces = divorces;
        this.spousesWithChildren = spousesWithChildren;
        this.children = children;
    }

    public String getImdbNameId() {
        return imdbNameId;
    }

    public void setImdbNameId(String imdbNameId) {
        this.imdbNameId = imdbNameId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthName() {
        return birthName;
    }

    public void setBirthName(String birthName) {
        this.birthName = birthName;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthState() {
        return birthState;
    }

    public void setBirthState(String birthState) {
        this.birthState = birthState;
    }

    public String getBirthCity() {
        return birthCity;
    }

    public void setBirthCity(String birthCity) {
        this.birthCity = birthCity;
    }

    public String getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(String deathDate) {
        this.deathDate = deathDate;
    }

    public String getDeathState() {
        return deathState;
    }

    public void setDeathState(String deathState) {
        this.deathState = deathState;
    }

    public String getDeathCountry() {
        return deathCountry;
    }

    public void setDeathCountry(String deathCountry) {
        this.deathCountry = deathCountry;
    }

    public String getDeathCity() {
        return deathCity;
    }

    public void setDeathCity(String deathCity) {
        this.deathCity = deathCity;
    }

    public String getSpousesString() {
        return spousesString;
    }

    public void setSpousesString(String spousesString) {
        this.spousesString = spousesString;
    }

    public String getSpouses() {
        return spouses;
    }

    public void setSpouses(String spouses) {
        this.spouses = spouses;
    }

    public String getDivorces() {
        return divorces;
    }

    public void setDivorces(String divorces) {
        this.divorces = divorces;
    }

    public String getSpousesWithChildren() {
        return spousesWithChildren;
    }

    public void setSpousesWithChildren(String spousesWithChildren) {
        this.spousesWithChildren = spousesWithChildren;
    }

    public String getChildren() {
        return children;
    }

    public void setChildren(String children) {
        this.children = children;
    }
}

