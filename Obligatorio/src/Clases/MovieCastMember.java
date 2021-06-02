package Clases;

import java.util.List;

public class MovieCastMember {
    private int ordering;
    private String category;
    private String job;
    private List<String> characters;
    private CastMember castMember;
    public MovieCastMember(int ordering, String category, String job, List<String> characters,CastMember castMember) {
        this.ordering = ordering;
        this.category = category;
        this.job = job;
        this.characters = characters;
    }

    public CastMember getCastMember() {
        return castMember;
    }

    public void setCastMember(CastMember castMember) {
        this.castMember = castMember;
    }

    public int getOrdering() {
        return ordering;
    }

    public void setOrdering(int ordering) {
        this.ordering = ordering;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public List<String> getCharacters() {
        return characters;
    }

    public void setCharacters(List<String> characters) {
        this.characters = characters;
    }
}
