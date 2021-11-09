package com.company;

public class Main {
    public static void main(String[] args) {
        com.company.Boss jonyy = new com.company.Boss();
        ((com.company.Boss) jonyy).setHealth(1000);
        ((com.company.Boss) jonyy).setDamage(90);
        jonyy.setShield("Барьер");
        System.out.println("jonyy " + ((com.company.Boss) jonyy).getHealth() + " XP " + ((com.company.Boss) jonyy).getDamage() + " DD " + jonyy.getShield() + " PP");

        Hero[] marvel = creatHeroes();

        for (int i = 0; i < marvel.length; i++) {

            System.out.println(marvel[i].getName() + " " + marvel[i].getDamage() + " " + marvel[i].getHealth() + " " + marvel[i].getPower());


        }
    }


    public static Hero[] creatHeroes() {

        Hero aquaman = new Hero(300, 25, "electric trident", "aquaman");
        Hero superman = new Hero(250, 30, "superpower", "superman");
        Hero captainAmerica = new Hero(350, 35, "invulnerability", "captainAmerica");
        Hero[] marvel = {aquaman, superman, captainAmerica};

        return marvel;
    }
}