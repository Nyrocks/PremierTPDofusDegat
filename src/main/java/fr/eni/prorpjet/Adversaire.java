/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.eni.prorpjet;

/**
 *
 * @author erwan
 */
public class Adversaire {
    private String nomAdversaire;
    private int pvActuel;
    private int pvMax;
    private int attaque;
    private int defense;
    private int coupCritique;
    private int zone;
    public Adversaire(String unNom, int unNbPvActuel, int unNbPvMax, int uneAtk, int uneDef, int unCC)
    {      
        this.nomAdversaire = unNom;
        this.pvActuel = unNbPvActuel;
        this.pvMax = unNbPvMax;
        this.attaque = uneAtk;
        this.defense = uneDef;
        this.coupCritique = unCC;
        /*
        Ecrire le constructeur.
        */
    }

    public int getZone() {
        return zone;
    }

    public void setZone(int zone) {
        this.zone = zone;
    }

    public String getNomAdversaire() {
        return nomAdversaire;
    }

    public int getPvActuel() {
        return pvActuel;
    }

    public int getPvMax() {
        return pvMax;
    }

    public int getAttaque() {
        return attaque;
    }

    public int getDefense() {
        return defense;
    }

    public double getCoupCritique() {
        return coupCritique;
    }

    public void setNomAdversaire(String nomAdversaire) {
        this.nomAdversaire = nomAdversaire;
    }

    public void setPvActuel(int pvActuel) {
        this.pvActuel = pvActuel;
    }

    public void setPvMax(int pvMax) {
        this.pvMax = pvMax;
    }

    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setCoupCritique(int coupCritique) {
        this.coupCritique = coupCritique;
        
    }   

    
    public void affStatsCombat() {
        System.out.println(this.nomAdversaire);
        System.out.println(this.pvActuel);
        System.out.println(this.attaque);
        System.out.println(this.coupCritique);
        /*
        Cette fonction affiche les stats de l'adversaire. (Nom, PV, Att, Def, Crit)
        */
    }
    public void subirDegat(int attaquePersonnage, boolean critiquePersonnage)
    {
        /*
        Cette fonction va servir à faire baisser les points de vie de l'adversaire.
        Vous devrez modifier l'attribut "pvActuel" de l'adversaire pointé.
        Deux arguments :
         -> attaquePersonnage qui correspond à l'attaque du joueur.
         -> critiquePersonnage qui dit si un joueur à réaliser un coup critique ou non.
        Calcul des dégâts : attaquePersonnage + (attaquePersonnage si critiquePersonnage == true) - defense de l'adversaire.
        
        /!\ Attention au calcul des dégâts donnant un résultat négatif /!\
        */
    }
}
