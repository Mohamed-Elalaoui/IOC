package ext;

import dao.IDao;

public class DaoImpl2 implements IDao {
    @Override
    public double getdata() {
        System.out.println("Version capteurs");
        double tmp=1000;
        return tmp;
    }
}
