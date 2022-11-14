// Classe principale de l'application.
public class Test
{ // Méthode principale.
    public static void main(String[] args)
    {
    // Création et utilisation du CompteBancaire cb1.
    CompteBancaire cb1 = new 
   CompteBancaire(123456789);
    
    cb1.deposerArgent(100);
    cb1.retirerArgent(80);
    // Création et utilisation du CompteBancaire cb2.
    CompteBancaire cb2 = new 
   CompteBancaire(987654321);
    cb2.retirerArgent(10);
    // Affichage des logs en console.
    
    String s = cb1.js.afficherLog();
    String s2 = cb2.js.afficherLog();
    System.out.println(s);
    System.out.println(s2);
    //trouver la référance sur l'espace mémoire de cb1 et cb2
    System.out.println(cb1.js.toString());
    System.out.println(cb2.js.toString());
    }
   }