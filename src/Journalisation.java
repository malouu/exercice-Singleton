import java.text.SimpleDateFormat;
import java.util.Date;

public class Journalisation
{private static Journalisation instance = null; 
    // Chaine de caractères représentant les messages de log.
 private String log;
 
 public Journalisation()
 {
 log = new String();
 }
 public static Journalisation getInstance()
 {
    if(instance==null)
    synchronized(Journalisation.class)
    {
        if(instance==null)
        instance = new Journalisation();
    }
    return instance;
    }
   
 
 
 // Méthode qui permet d'ajouter un message de log.
 public void ajouterLog(String log)
 {
 // On ajoute également la date du message.
 Date d = new Date();
 SimpleDateFormat dateFormat = new 
SimpleDateFormat("dd/MM/yy HH'h'mm");
 this.log+="["+dateFormat.format(d)+"] "+log+"\n";
 }
 
 // Méthode qui retourne tous les messages de log.
 public String afficherLog()
 {
 return log;
 }
}
