
public class ZooManagement {

    int nbrCages;
    String zooName;

    public ZooManagement() {
        this.nbrCages = 20;
        this.zooName = "my zoo";
    }

    public ZooManagement(String nom, int cages) {
        this.zooName = nom;
        this.nbrCages = cages;
    }

    public void afficherInfo() {
        System.out.println(zooName + " comporte " + nbrCages + " cages");
    }

    public void setZooName(String nom) {
            this.zooName = nom;

    }

    public void setNbrCages(int cages) {
        if (cages > 0) {
            this.nbrCages = cages;
        }
    }

    public String getZooName() {
        return zooName;
    }

    public int getNbrCages() {
        return nbrCages;
    }
}