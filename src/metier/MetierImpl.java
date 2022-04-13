package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao; //Couplage faible
    @Override
    public double calcul() {
        double tmp=dao.getdata();
        double res=tmp*Math.PI/Math.cos(tmp*5);
        return res;
    }

    /*
    Injecter dans la variable dao un ojet d'une classe
    qui implemente l'interface IDao
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
