package pucrs.s2b.parametrizartestesomalista;

public class App {
public static void main(String[] args) {
	int a = 20;
	int b = 30;
	
	int r = somar(a, b);
	
	if (r == 50)
		
		System.out.println(" Sucesso");
	else
			
	System.out.println("Falha");
}

public static int somar(int a, int b) {
	int r = a + b;
	return r;
}

}