/*
  Titre      : PlusGrandeValeur
  Auteur     : Crepin Vardin Fouelefack
  Date       : 10/20/2022
  Description: Remplissage dynamique d'un tableau et affichage du max et son index
  Version    : 0.0.1
*/

//Lien github  https://github.com/crepin21/UtilisationRandom_20-10-2022

//Importation des librairies necessaires
import java.util.Random; 

//Declaration de la classe
public class PlusGrandeValeur 
{
    public static void main(String[] args) throws Exception 
    {

        //Declaration des constantes
        int MAX = 100;
        int MIN = 0;

        //Declaration des variables
        int tab[]          = new int[15];
        int IndexPlusGrand = 0;
        int ValeurIndexMax = 0;
        //Variable de type random
        Random Rand = new Random();

        //Remplissage et affichage des elements du tableau
        for (int i = 0; i < tab.length; i++) {
            tab[i] = Rand.nextInt(MAX - MIN + 1) + MIN;
            System.out.print("tableau [" + i + "] = " + tab[i]);
            System.out.println();
        }
        
        // Recherche de l'element le plus grand ainsi que son index
        for (int j = 0; j < tab.length; j++) 
            {
                if (ValeurIndexMax < tab[j]) 
                {
                    ValeurIndexMax = tab[j];
                    IndexPlusGrand = j;
                }
            }

        //Affichage du message final
        System.out.println("Le plus grand nombre du tableau est : " + ValeurIndexMax);
        System.out.println("Il est a l'index : " + IndexPlusGrand);
        
    }
}
