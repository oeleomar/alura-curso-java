
public class TestaEscopo {
	public static void main(String[] args) {
		Programa testaCondicional = new Programa();
		
		//Metodos static estão disponíveis apenas para suas classe e não para instancias dela
		Programa.main(args);
		
		
		System.out.println(testaCondicional);
		
		boolean foiPromovido = true;

        if(foiPromovido) {
            double salario = 4200.0;
        } else {
            double salario = 3800.0;
        }
        //Não tem como acessar salário pois está fora do escopo
        //System.out.println(salario);
	}
}
