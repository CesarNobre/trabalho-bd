package br.com.fiap.presentation;



import javax.persistence.EntityManager;
import javax.persistence.StoredProcedureQuery;
import javax.persistence.TypedQuery;

import br.com.fiap.singleton.EMSingleton;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		EntityManager em = EMSingleton.getInstance().createEntityManager();
		//StoredProcedureQuery storedProcedure = em.createStoredProcedureQuery("sales_tax");
		//storedProcedure.execute();
		String query = "select FUNCTION('FNC_CALCULO') from dual";
		TypedQuery<String> emps = em.createQuery(query, String.class);
		System.out.println(emps.getResultList());
	}

}
