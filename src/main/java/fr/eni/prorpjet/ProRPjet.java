/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fr.eni.prorpjet;

import java.util.Scanner;

/**
 *
 * @author erwan
 */
public class ProRPjet {
    static fonctionDofus f = new fonctionDofus();
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

        int choixChoix = 0; 
        int choixZone = 0;
        int choixBoss = 0;
        int choixCoffre = 0;
        int choixTaverne = 0;
        int choixPlace = 0;
        int choixRecommencer = 0;
        int gainKama = 0;
        int nbAlea;
        int nbAleaCoffre;
        Adversaire choixMonstre;
        String affMonstre;
        String affTaverne = "-----------------------------------------------------\n"
                + "Voulez-vous vous reposez (250 kames)?\n"
                + "1 - Oui\n"
                + "2 - Non\n"
                + "-----------------------------------------------------";
        String affCoffre = "-----------------------------------------------------\n" 
                + "Vous trouvez un coffre !\n"
                + "Voulez-vous l'ouvrir ?\n"
                + "1 - Oui\n"
                + "2 - Non\n"
                + "-----------------------------------------------------";
        String affPlace = "-----------------------------------------------------\n" 
                + "Que voulez-vous acheter (250 Kamas)?\n"
                + "1 - Parchemin PV (+5)\n"
                + "2 - Parchemin Critique (+2)\n"
                + "3 - Parchemin d'Attaque (+2)\n"
                + "4 - Parchemin de Défense (+1)\n"
                + "5 - Potion\n"
                + "6 - (retour)\n"
                + "-----------------------------------------------------";
        String affRecommencer = "-----------------------------------------------------\n" 
                + "Voulez-vous recommencer ?\n"
                + "1 - Oui\n"
                + "2 - Non\n"
                + "-----------------------------------------------------";
        // Zone I
        Adversaire bouftou = new Adversaire("Bouftou affamé",
                10,
                10,
                3,
                1,
                20);
        Adversaire tofu = new Adversaire("Tofu immature",
                5,
                5,
                5,
                0,
                40);        
        // Zone II
        Adversaire sanglier = new Adversaire("Sanglier violent",
                20,
                20,
                6,
                5,
                25);
        Adversaire tournesol = new Adversaire("Tournesol fou",
                10,
                10,
                10,
                3,
                50);        
        // Zone III
        Adversaire craqueboule = new Adversaire("Craqueboule stupide",
                40,
                40,
                12,
                10,
                30);
        Adversaire bandit = new Adversaire("Bandit hargneux",
                20,
                20,
                20,
                8,
                60);        
        // Boss I
        Adversaire milimilou = new Adversaire("Milimilou fourbe",
                20,
                20,
                10,
                8,
                25);
        // Boss II
        Adversaire mobEponge = new Adversaire("Mob l'Eponge carré",
                40,
                40,
                20,
                17,
                30);
        // Boss III
        Adversaire bouftouRoyal = new Adversaire("Bouftou Royal",
                80,
                80,
                25,
                20,
                35);

        /*
         * Lance l'introduction.
         * Lance le menu de création du personnage.
         * Créer le personnage.
        */
        Personnage joueur = f.creationPerso();
        
        while(true)
        {
            if(joueur.getPvActuel() < 0)
                break;
            
            bouftou.setPvActuel(bouftou.getPvMax());
            tofu.setPvActuel(tofu.getPvMax());
            tournesol.setPvActuel(tournesol.getPvMax());
            sanglier.setPvActuel(sanglier.getPvMax());
            craqueboule.setPvActuel(craqueboule.getPvMax());
            bandit.setPvActuel(bandit.getPvMax());
            
            choixChoix = f.affChoix();
            if(choixChoix == 1)
            { 
                System.out.println("Vous arrivez sur la place marchande");
                choixPlace = f.repet(6, affPlace);
                if(joueur.getKama() >= 250)
                {
                    if(choixPlace == 1)
                    {
                        // Parchemin PV
                        joueur.perdreKama(250);
                        joueur.augPV(5);
                        System.out.println("Vous avez acheté un parchemin de PV.");
                        joueur.affKama();
                        joueur.affVie();
                        
                    }
                    if(choixPlace == 2)
                    {
                        // Parchemin Crit
                        joueur.perdreKama(250);
                        joueur.augCrit(2);
                        System.out.println("Vous avez acheté un parchemin Critique.");
                        joueur.affKama();
                        joueur.affCritique();
                    }
                    if(choixPlace == 3)
                    {
                        // Parchemin Attaque
                        joueur.perdreKama(250);
                        joueur.augAttaque(2);
                        System.out.println("Vous avez acheté un parchemin de Attaque.");
                        joueur.affKama();
                        joueur.affAttaque();
                    }
                    if(choixPlace == 4)
                    {
                        // Parchemin Défense
                        joueur.perdreKama(250);
                        joueur.augDefense(1);
                        System.out.println("Vous avez acheté un parchemin de Défense.");
                        joueur.affKama();
                        joueur.affDefense();                        
                    }
                    if(choixPlace == 5)
                    {
                        // Potion
                        if(joueur.isPotion() == true)
                        {
                            System.out.println("Vous avez déjà une potion.");
                        }
                        else
                        {
                            joueur.perdreKama(250);
                            joueur.setPotion(true);
                            System.out.println("Vous avez acheté une potion.");
                            joueur.affKama();
                        }
                    }
                }
                else
                {
                    System.out.println("Mais enfin, vous n'avez pas assez...");
                }
                System.out.println("Vous quittez la place marchande");
            }
            if(choixChoix == 2)
            {    
                choixZone = f.affZone();
                if(choixZone == 1)
                {
                    System.out.println("Vous vous rendez dans la forêt.");
                    nbAlea = f.alea();
                    if(nbAlea < 20)
                    {
                        // Coffre
                        choixCoffre = f.repet(2, affCoffre);
                        if(choixCoffre == 1)
                        {
                            nbAleaCoffre = f.alea();
                            if(nbAleaCoffre < 20)
                                joueur.pertePv(affCoffrePiege(5));
                            
                            else if(nbAleaCoffre < 90)
                                joueur.gagneKama(affCoffre(5));
                            
                            else
                                affCoffreVide();    
                        }
                    }
                    
                    else if(nbAlea < 85)
                    {
                        // Combat
                        nbAlea = f.alea();
                        if(nbAlea <50)
                            choixMonstre = bouftou;
                        else
                            choixMonstre = tofu;
                        System.out.println("Attention derrière vous ! Un ... " + choixMonstre.getNomAdversaire() + ". Waouh ça s'annonce épique...");
                        affMonstre = combat(joueur, choixMonstre);
                        if(joueur.getPvActuel() < 0)
                            break;
                        if(choixMonstre.getPvActuel() <= 0)
                        {
                            gainKama = f.alea();
                            System.out.println("Vous gagnez "+gainKama+" kamas !");
                            System.out.println("Vous avez vaincu le pitoyable "+affMonstre+" et vous voudriez être félicité ?");
                            joueur.gagneKama(gainKama);
                        }
                        else
                            System.out.println("Vous ne mériteriez même pas un centikama...");
                    }
                    else
                    {
                        // Trouver
                        gainKama = f.alea();
                        System.out.println("Vous avez trouvé " + gainKama + " kamas, quelle CHANCE !");
                        joueur.gagneKama(gainKama);
                    }
                }
                if(choixZone == 2)
                {
                    System.out.println("Vous vous dirigez vers les champs.");
                    nbAlea = f.alea();
                    if(nbAlea < 20)
                    {
                        // Coffre
                        choixCoffre = f.repet(2, affCoffre);
                        nbAleaCoffre = f.alea();
                        if(choixCoffre == 1)
                        {
                            if(nbAleaCoffre < 20)
                                joueur.pertePv(affCoffrePiege(15));
                            
                            else if(nbAleaCoffre < 90)                               
                                joueur.gagneKama(affCoffre(10));
                            
                            else
                                affCoffreVide();   
                        }
                    }
                    
                    else if(nbAlea < 85)
                    {
                        // Combat
                        nbAlea = f.alea();
                        
                        if(nbAlea <50)
                            choixMonstre = sanglier;
                        else
                            choixMonstre = tournesol;
                        System.out.println("Un " + choixMonstre.getNomAdversaire() + " vous agresse. Fin de la blague.");
                        affMonstre = combat(joueur, choixMonstre);
                        if(joueur.getPvActuel() < 0)
                            break;
                        if(choixMonstre.getPvActuel() <= 0)
                        {
                            gainKama = f.alea();
                            System.out.println("Vous gagnez "+gainKama+" kamas !");
                            System.out.println("Vous avez vaincu l'un peu moins pitoyable "+affMonstre+", y'a du mieux.");
                            joueur.gagneKama(gainKama);
                        }
                        else
                            System.out.println("Vous ne mériteriez même pas un centikama...");
                    }
                    else
                    {
                        // Trouver
                        gainKama = f.alea()*5;
                        System.out.println("Vous avez trouvé " + gainKama + " kamas, quelle CHANCE !");
                        joueur.gagneKama(gainKama);
                    }
                }
                if(choixZone == 3)
                {
                    System.out.println("Vous atteignez la zone rocheuse.");
                    nbAlea = f.alea();
                    if(nbAlea < 20)
                    {
                        // Coffre
                        choixCoffre = f.repet(2, affCoffre);
                        nbAleaCoffre = f.alea();
                        if(choixCoffre == 1)
                        {
                            if(nbAleaCoffre < 20)
                                joueur.pertePv(affCoffrePiege(5));
                            
                            else if(nbAleaCoffre < 90)
                                joueur.gagneKama(affCoffre(15));
                            
                            else
                                affCoffreVide();
                        }
                    }
                    
                    else if(nbAlea < 85)
                    {
                        // Combat
                        nbAlea = f.alea();
                        
                        if(nbAlea <50)
                            choixMonstre = bandit;
                        else
                            choixMonstre = craqueboule;
                        System.out.println("Un " + choixMonstre.getNomAdversaire() + " vous agresse. Faut dire que vous l'avez mal regardé aussi, assumez maintenant.");
                        affMonstre = combat(joueur, choixMonstre);
                        if(joueur.getPvActuel() < 0)
                            break;
                        if(choixMonstre.getPvActuel() <= 0)
                        {
                            gainKama = f.alea();
                            System.out.println("Vous gagnez "+gainKama+" kamas !");
                            System.out.println("Vous avez vaincu le "+affMonstre+", enfin un adversaire que mon fils Jauneau (4 ans) ne peut pas battre.");
                            joueur.gagneKama(gainKama);
                        }
                        else
                            System.out.println("Vous ne mériteriez même pas un centikama...");
                    }
                    else
                    {
                        // Trouver
                        gainKama = f.alea()*10;
                        System.out.println("Vous avez trouvé " + gainKama + " kamas, quelle CHANCE !");
                        joueur.gagneKama(gainKama);
                    }
                }   
            }
            if(choixChoix == 3)
            {
                choixBoss = f.affBoss();
                if(choixBoss == 1 && (milimilou.getPvActuel() > 0))
                {
                   System.out.println("Vous voici devant le terrible MILIMILOU");
                   // Combat contre Milimilou
                   combat(joueur, milimilou);
                   if(joueur.getPvActuel() < 0)
                            break;
                   
                   System.out.println("Haha bien joué ! Peut-être le boss le moins impressionnant mais j'avoue que je n'avais pas misé un kama sur vous.");
                   System.out.println("Maintenant, Mob l'Eponge n'attend que vous, une aventure épique c'est impressionnant.");
                   joueur.setKama(500);
                }
                else if(choixBoss == 1 && (milimilou.getPvActuel() <= 0))
                {
                    System.out.println("Vous ne pouvez pas laisser ce petit chiot tranquille ?? Je vais devoir appeler la SPA...");
                }
                if(choixBoss == 2 && (mobEponge.getPvActuel() > 0))
                {
                   System.out.println("Vous vous attaquez au déplorable MOB L'EPONGE");
                   // Combat contre Mob l'éponge
                   combat(joueur, mobEponge);
                   if(joueur.getPvActuel() < 0)
                            break;
                   
                   System.out.println("Vous avez galéré à vaincre une éponge, waouh quel exploit.");
                   System.out.println("Allez vous frotter au BOUFTOU ROYAL maintenant qu'on rigole.");
                   joueur.setKama(1000);
                }
                else if(choixBoss == 2 && (mobEponge.getPvActuel() <= 0))
                {
                    System.out.println("Vous avez déjà épongé Mob l'Eponge. Merci d'ailleurs.");
                }
                if(choixBoss == 3 && (bouftouRoyal.getPvActuel() > 0))
                {
                    System.out.println("Vous foncez sur le colossal BOUFTOU ROYAL");
                    //Combat contre le Bouftou royal
                    combat(joueur, bouftouRoyal);
                    if(joueur.getPvActuel() < 0)
                            break;
                    
                    System.out.println("Vous avez vaincu le terrible BOUFTOU ROYAL (non, il s'est laissé faire).");
                    System.out.println("Vous avez fini le jeux et êtes maintenant un grand aventurier (non, vous êtes juste en train de faire un tp noté).");
                }
                else if(choixBoss == 3 && (bouftouRoyal.getPvActuel() <= 0))
                {
                    System.out.println("Vous n'en avez pas assez ? Le jeux est fini pourquoi tu continues ?");
                }
            }
            if(choixChoix == 4)
            {
                System.out.println("Vous vous posez à la taverne, tranquille.");
                choixTaverne = f.repet(2, affTaverne);
                if(choixTaverne == 1)
                {
                    if( joueur.getKama() >= 250)
                    {
                        joueur.reposTaverne();
                        System.out.println("Un repos salutaire !");
                        joueur.perdreKama(250);
                        joueur.affKama();
                        joueur.affVie();
                    }
                    else
                    {
                        System.out.println("Vous n'avez pas assez de Kamas... Dehors !");
                    }
                }
                System.out.println("Vous quittez la taverne.");
            }
            if(choixChoix == 5)
            {
                joueur.affStats();
            }
            if(choixChoix == 6)
            {
                break;
            }
        }
        if(choixChoix != 6)
        {
            System.out.println("Vous êtes mort !");
            choixRecommencer = f.repet(2, affRecommencer);
            if(choixRecommencer == 1)
            {
                String[] stri = {"r", "r"};
                main(stri);
            }
        }
        System.out.println("Vous quittez Dofus.");
        
    }

    public static String combat(Personnage p, Adversaire a)
    {
        /*
        Dans cette fonction, vous allez devoir coder la fonction combat.
        Elle devra retourner le nom du monstre (voir ligne 341 si vous voulez savoir pourquoi).
        La fonction combat prendra en paramètre un objet Adversaire et un objet Personnage.
        
        Lors de ce combat, c'est le joueur qui commence.
        Vous allez devoir afficher un menu pour le joueur à chaque début de tour :
        "Que voulez-vous faire ?\n"
        "1 - Afficher statistiques\n"
        "2 - Attaquer\n"
        "3 - Utiliser une potion\n"
        "4 - Fuire\n"
        
        "1 - Afficher statistiques\n" -> Affiche les statistiques du Personnage et de son Adversaire.
        "2 - Attaquer\n" -> Le Personnage attaque le Monstre.
         -> Utiliser la fonction subirDegat(int attaquePersonnage, boolean critiquePersonnage) de la classe Adversaire.
        "3 - Utiliser une potion\n" -> Utilise la potion si le joueur en a une.
        "4 - Fuire\n" -> Le combat est fini.
        
        Ensuite, l'Adversaire attaque.
         -> Utiliser la fonction subirDegat(int attaqueAdversaire, boolean critiqueAdversaire) de la classe Personnage.
        Pour les variables critiqueAdversaire et/ou critiquePersonnage, vous pourrez vous aider du code suivant.
        
                nbAlea = f.alea(); // Donne un nombre entre 1 et 100;
                if(nbAlea < a.getCoupCritique()) // Si coupCritique, mettre la variable à true.
                    crit = true;
                else
                    crit = false;
        
        
        Si le joueur ne fuit pas, la seule façon de finir le combat est que l'un des deux antagonistes meurt.
        
        */
        return "";
    }
    public static int affCoffre(int multiplicateurGain)
    {
        /*
        Cette fonction retourne le gain suite à l'ouverture du coffre.
        Ce gain sera généré aléatoirement entre 1 et 100.
        Le multiplicateurGain permet d'augmenter le gain en le multipliant.
        Vous afficherez un message indiquant la somme gagnée.
        */
        return 0;
    }
    public static int affCoffrePiege(int degat)
    {
        /*
        Cette fonction retourne la variable dégât suite à l'ouverture du coffre.
        Vous afficherez un message indiquant au joueur qu'il est tombé sur un coffre piégé.
        Vous afficherez également le nombre de pv qu'il a perdu.
        */
        return 0;
    }
    public static void affCoffreVide()
    {
        /*
        Cette fonction affiche un message expliquant que le coffre est vide.
        */
    }
    
}
