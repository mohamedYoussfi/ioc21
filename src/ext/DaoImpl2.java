package ext;

import dao.IDao;

public class DaoImpl2 implements IDao {

	@Override
	public double getData() {
		System.out.println("Version Web servive");
		double d=23;
		return d;
	}

}
