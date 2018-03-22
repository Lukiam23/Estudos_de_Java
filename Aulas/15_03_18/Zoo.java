class Zoo{	
	Animal animais[] = new Animal[100];									
	public static void main(String arg[]){
		Zoo zoo = new Zoo();
		zoo.animais[0] = new Tigre(100,2);
		System.out.println(zoo.animais[0].emitirSom());
	
	/*	zoo.animais[1] = new Ave(1,0.5f);
		zoo.animais[2] = new Reptil(2,1);
		zoo.animais[3] = new Reptil(2,1);
		zoo.animais[4] = new Ave(1,0.5f);
		zoo.animais[5] = new Ave(1,0.5f);
	*/
		
	}
}
