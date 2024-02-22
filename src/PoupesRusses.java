
class PoupeeRusse extends Poupee {
    private String Nom;

    public PoupeeRusse(String Nom ,int taille ){
        super(taille);
        this.Nom=Nom;
    }




    public String getNom(){
        return Nom;
    }
    public void setNom(String Nom){
        this.Nom=Nom;
    }

    @Override
    public void ouvrir() {
        if (!isouvert()) {
            setOuvert(true);
            System.out.println("La poupée "+this.getNom()+" a été ouvrir avec succes");
        } else {
            System.out.println("la poupée "+this.getNom()+" est déja ouverte");
        }
    }

    @Override
    public void fermer() {
        if (isouvert()) {
            setOuvert(false);
            System.out.println("La poupée "+this.getNom()+" a été fermer avec succes.");
        } else {
            System.out.println("La poupée "+this.getNom()+" est déja fermer.");
        }
    }

    @Override
    public void placerDans(Poupee p) {

    }


    @Override
    public void sortirDe(Poupee p) {

    }
    public void afficherPoupees() {{
        System.out.print("Nom=" + this.getNom()+ ", Taille=" +this.getTaille()+"\n");
    }
    }

}