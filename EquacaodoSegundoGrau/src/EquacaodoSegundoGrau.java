import org.omg.CORBA.PUBLIC_MEMBER;

public class EquacaodoSegundoGrau {
		double a, b, c;
		
		public void inicializaCoeficiente(double x, double y, double z){
			this.a = x;
			this.b = y;
			this.c = z;
		}
		
		public double delta(){
			return ((b*b)-(4*a*c));
		}
		//public double x1(){
		//	return ((-b + )) 
		//}
		
}
	