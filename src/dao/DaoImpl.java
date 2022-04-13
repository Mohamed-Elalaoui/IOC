package dao;

public class DaoImpl implements IDao{
    @Override
    public double getdata() {
        System.out.println("Version base de données");
        double temp= Math.random()*40;
        return temp;
    }
}
