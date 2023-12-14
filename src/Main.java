import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String personaDaCercare="Mario";
        if (setpersone().contains(personaDaCercare)){
            System.out.println(" contiene " + personaDaCercare);
        }else {
            System.out.println("non contiene " + personaDaCercare);
        }
    }
    public static HashSet<String>setpersone(){
        HashSet<String> persone = new HashSet<>();
        persone.add("Mario");
        persone.add("Ivan");
        persone.add("Luigi");
        return persone;


    }


}