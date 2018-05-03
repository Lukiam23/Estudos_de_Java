class SSPDS {
	 public void registrar() throws IdadeMenorZeroException{
	 	Pessoa p = null;
	 	try{
	 		p = new Pessoa(-10);
	 	} catch(Exception e){
	 		throw e;
	 	}
	 	System.out.println(p);
	 }
}