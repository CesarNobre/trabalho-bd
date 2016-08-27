package br.com.fiap.presentation;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallableStatementnt call = connection.prepareCall("{ ? = call MYSCHEMA.MYFUNC(?,?) }");
	    call.registerOutParameter( 1, Types.INTEGER ); // or whatever it is
	    call.setLong(2, id);
	    call.setLong(3, transId);
	    call.execute();
	    int result = call.getInt(1);
	}

}
