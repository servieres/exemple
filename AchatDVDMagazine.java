/*__________________________________________________________________________________*
 *                                                                                  *
 * IUT DE RODEZ - DUT INFORMATIQUE                                                  *
 * PROGRAMMATION JAVA                                                               *
 *                                                CORRECTION -ACHAT DVD ET MAGAZINE *
 * _________________________________________________________________________________*
 */


// deuxieme essai contribution

/*
 * Calcul du prix d'achat de DVD et magazines
 * AchatDVDMagazine.java                                           11/21
 */
package notiondebase.affectation;
import java.util.Scanner;


/**
 * Le prix d'un coffret de DVD est de 39 euros, et celui d'un magazine est de 
 * 9 euros. Les frais de port sont fixes et s'élèvent à 7 euros.
 * Ce programme demande à l'utilisateur de saisir le nombre de coffrets 
 * commandés, ainsi que le nombre de magazines.
 * Le programme affiche le montant à payer hors frais de port, le montant 
 * des frais de port et le montant total.
 * De plus, des points cadeaux sont attribués suivant le montant de l'achat
 * (hors frais de port) et selon la règle suivante : 1 point par tranche de 
 * 15 euros. Le programme affiche également le nombre de points cadeau
 * acquis.
 * @author INFO1
 * @version 1.0
 */
public class AchatDVDMagazine {

    /**
     * Programme principale
     * @param args  argument non utilisé
     */
    public static void main(String[] args) {
        
        // déclaration d'un objet Scanner pour les saisies
        Scanner entree = new Scanner(System.in);
        
        final int PRIX_COFFRET = 39;        // prix du coffret de DVD
        final int PRIX_MAGAZINE = 9;        // prix d'un exemplaire du magazine
        final int FRAIS_PORT = 7;           // frais de port
        final int TRANCHE = 15;             // tranche pour les points cadeau
        
        int nombreCoffret;                  // nombre de coffrets achetés
        int nombreMagazine;                 // nombre de magazines achetés
        int montantAchat;                   // montant des coffrets et magazines
        int montantTotal;                   // montant total à payer
        int nbPointCadeau;                  // nombre de points cadeau acquis
        
        // saisies des quantités
        System.out.print("Entrez le nombre de coffrets achetés : ");
        nombreCoffret = entree.nextInt();
        System.out.print("Entrez le nombre de magazines achetés : ");
        nombreMagazine = entree.nextInt();
        
        // calcul des différents montants
        montantAchat = nombreCoffret * PRIX_COFFRET + nombreMagazine * PRIX_MAGAZINE;
        montantTotal = montantAchat + FRAIS_PORT;
        nbPointCadeau = montantAchat / TRANCHE;
        
        // on affiche les résultats
        System.out.println("\nMontant des achats .................. : "
                           + montantAchat + " euros"
                           + "\nMontant des frais de port ........... : "
                           + FRAIS_PORT + " euros"
                           + "\nMontant total à payer ............... : "
                           + montantTotal + " euros"
                           + "\nPoints cadeau acquis ................ : "
                           + nbPointCadeau);
    }    
}
