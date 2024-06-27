import java.util.ArrayList;
/**
 * Cette classe représente une planète dans le système solaire.
 * Elle contient des informations sur le nom, la distance par rapport au soleil,
 * et d'autres caractéristiques pertinentes.
 */

public class Planet extends Astre implements IOrbiteAutour,IAffichable,IAJouterSatellite {

    private ArrayList<Astre> liseDeSat = new ArrayList<>();
    public Planet(){

    }
    public Planet(String nom){
    this.nom = nom;
    }
    @Override
    public void Afficher() {

    }

    /**
     * @param astre
     */
    @Override
    public void Orbiter(Astre astre) {

    }
    public void ajouterSatellite(Astre astre)
    {
        liseDeSat.add(astre);

    }


}
