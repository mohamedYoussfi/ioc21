package dao;

public class DaoImpl implements IDao {

	@Override
	public double getData() {
		System.out.println("Version base de donn�es");
		double data=80;
		return data;
	}

}
