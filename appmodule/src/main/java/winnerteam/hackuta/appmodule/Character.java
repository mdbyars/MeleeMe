package winnerteam.hackuta.appmodule;

public class Character {

    private int id;
    private String name, attackName, damage, combination;
    private int imageRes, characterNoise;


    private Character(){}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImageRes() {
        return imageRes;
    }

    public void setImageRes(int imageRes) {
        this.imageRes = imageRes;
    }

    public int getCharacterNoise() {
        return characterNoise;
    }

    public void setCharacterNoise(int characterNoise) {
        this.characterNoise = characterNoise;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAttackName() {
        return attackName;
    }

    public void setAttackName(String attackName) {
        this.attackName = attackName;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public String getCombination() {
        return combination;
    }

    public void setCombination(String combination) {
        this.combination = combination;
    }
}
