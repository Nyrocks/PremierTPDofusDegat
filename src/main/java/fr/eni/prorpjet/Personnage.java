/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.eni.prorpjet;

/**
 *
 * @author erwan
 */
public class Personnage {
    private String nomPersonnage;
    private String classePersonnage;
    private int pvActuel;
    private int pvMax;
    private int attaque;
    private int defense;
    private int coupCritique;
    private int kama;
    private boolean potion;

    public Personnage(String nomPersonnage,
            String classePersonnage,
            int pvActuel,
            int pvMax,
            int attaque,
            int defense,
            int coupCritique) 
    {
        this.nomPersonnage = nomPersonnage;
        this.classePersonnage = classePersonnage;
        
        this.pvMax = pvMax;
        this.attaque = attaque;
        this.defense = defense;
        this.coupCritique = coupCritique;
        this.kama = 150;
        this.potion = true;
        switch(this.classePersonnage)
        {
            case "Féca":
                this.defense += 1;
                this.attaque -= 2;
                break;
            case "Iop":
                this.attaque += 2;
                this.coupCritique -= 10;
                break;
            case "Cra":
                this.coupCritique += 10;
                this.defense -= 1;
                break;
            case "Sadida":
                this.attaque += 2;
                this.pvMax -= 10;
                break;
            case "Osamodas":
                this.pvMax += 10;
                this.attaque -= 2;
                break;
            case "Sacrieur":
                this.pvMax += 10;
                this.defense -= 1;
                break;
            case "Pandawa":
                this.pvMax += 10;
                this.coupCritique -= 10;
                break;
            case "Eniripsa":
                this.defense += 1;
                this.coupCritique -= 10;
                break;
            case "Sram":
                this.attaque += 2;
                this.defense -= 1;
                break;
            case "Xélor":
                this.defense += 1;
                this.pvMax -= 10;
                break;
            case "Enutrof":
                this.coupCritique += 10;
                this.attaque -= 2;
                break;
            case "Ecaflip":
                this.coupCritique += 10;
                this.pvMax -= 10;
                break;
            
                
        }
        this.pvActuel = this.pvMax;
    }

    public String getNomPersonnage() {
        return nomPersonnage;
    }

    public void setNomPersonnage(String nomPersonnage) {
        this.nomPersonnage = nomPersonnage;
    }

    public String getClassePersonnage() {
        return classePersonnage;
    }

    public void setClassePersonnage(String classePersonnage) {
        this.classePersonnage = classePersonnage;
    }

    public int getPvActuel() {
        return pvActuel;
    }

    public void setPvActuel(int pvActuel) {
        this.pvActuel = pvActuel;
    }

    public int getPvMax() {
        return pvMax;
    }

    public void setPvMax(int pvMax) {
        this.pvMax = pvMax;
    }

    public int getAttaque() {
        return attaque;
    }

    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public double getCoupCritique() {
        return coupCritique;
    }

    public void setCoupCritique(int coupCritique) {
        this.coupCritique = coupCritique;
    }

    public int getKama() {
        return kama;
    }

    public void setKama(int kama) {
        this.kama = kama;
    }

    public boolean isPotion() {
        return potion;
    }

    public void setPotion(boolean potion) {
        this.potion = potion;
    }

    
    public void affStats() {
        /*
        Cette fonction affiche la classe du joueur, son nom ainsi que son nombre de kamas.
        Cette fonction affichera également les stats du joueur. (Nom, PV, Att, Def, Crit).
        Elle affichera aussi si le joueur a une potion ou non.
        */
    }
    public void affStatsCombat() {
        /*
        Cette fonction affiche les stats du joueur. (Nom, PV, Att, Def, Crit)
        Elle affichera aussi si le joueur a une potion ou non.
        */
    }
    public void gagneKama(int gainKama)
    {
        /*
        Cette fonction augmente les kamas du joueur (kama de base + gainKama)
        */
    }
    public void perdreKama(int perdreKama)
    {
        /*
        Cette fonction diminue les kamas du joueur (kama de base - perdreKama)
        /!\ On ne peut pas avoir un nombre de kamas négatif /!\
        */
    }
    public void pertePv(int degat)
    {
        /*
        Cette fonction diminue les pvActuel du joueur (pvActuel - degat)
        /!\ On ne peut pas avoir un nombre de pv négatif /!\
        */
    }
    public void utilisationPotion()
    {
        /* 
        Cette fonction met les pvActuel du joueur au max.
        */
    }
    public void reposTaverne()
    {
        /* 
        Cette fonction augmente les pvActuel du joueur de 5.
        /!\ Le joueur ne pourra pas avoir plus de pvActuel que de pvMax. /!\
        */ 
    }
    public void affKama()
    {
        /*
        Cette fonction affiche le nombre de kamas en la possession du joueur.
        */
    }
    public void affVie()
    {
        /*
        Cette fonction affiche le nombre de pv sous la forme "pvActuel" / "pvMax"
        Exemple affichage -> " Vous avez 45/60 pv. "
        */
    }
    public void augPV(int augmentation)
    {
        /*
        Augmente les pvActuel et pvMax à l'aide de l'argument augmentation.
        */
    }
    public void augCrit(int augmentation)
    {
        /*
        Augmente l'attribut critique à l'aide de l'argument augmentation.
        */
    }
    public void augAttaque(int augmentation)
    {
        /*
        Augmente l'attribut attaque à l'aide de l'argument augmentation.
        */
    }
    public void augDefense(int augmentation)
    {
        /*
        Augmente l'attribut defense à l'aide de l'argument augmentation.
        */
    }
    public void affAttaque()
    {
        /*
        Affiche l'attaque du joueur.
        */
    }
    public void affDefense()
    {
        /*
        Affiche la défense du joueur.
        */
    }
    public void affCritique()
    {
        /*
        Affiche le pourcentage de critique du joueur sous la forme critique%.
         -> Par exemple : "Vous avez 25% de critique"
        */
    }
    public void subirDegat(int attaqueAdversaire, boolean critiqueAdversaire)
    {
        /*
        Cette fonction va servir à faire baisser les points de vie du personnage.
        Vous devrez modifier l'attribut "pvActuel" du joueur.
        Deux arguments :
         -> attaqueAdversaire qui correspond à l'attaque du Adversaire.
         -> critiqueAdversaire qui dit si un Adversaire à réaliser un coup critique ou non.
        Calcul des dégâts : attaqueAdversaire + (attaqueAdversaire si critiqueAdversaire == true) - defense du joueur.
        
        /!\ Attention au calcul des dégâts donnant un résultat négatif /!\
        */
    }
}
