package com.serenitydojo;

public class Hamster extends Pet{

    private String favoriteGame;

    public Hamster(String name, String favoriteGame, int age) {

        super(name, age);
        this.favoriteGame = favoriteGame;
    }

    public String getFavoriteGame() {
        return favoriteGame;
    }

    public void setFavoriteGame(String favoriteGame) {
        this.favoriteGame = favoriteGame;
    }

    public String play(){
        return "runs in " + favoriteGame;
    }
}
