import java.util.Arrays;

public class Tri {

 private Object iArr[];
	   
	   
public Tri( Object tab[]){
		   
 this.iArr=tab;
		   
	   }

 
public void trier() {
		   
Arrays.sort(this.iArr);
		   
for (Object number : this.iArr) {
	  System.out.println("Valeur = " + number);
	   }

}

}

   // initialiser le tableau non trié int
   //int iArr[] = {2, 1, 9, 6, 4};

   // afficher tous les éléments
  // for (int number : iArr) {
  // System.out.println("Number = " + number);
  // }

   // trier le tableau
  // Arrays.sort(iArr);

   // afficher tous les éléments triés
  // System.out.println("le tableau trié int array est:");
  // for (int number : iArr) {
  // System.out.println("Nombre = " + number);
  // }
   
  // }
//}
	   
	   
	   
	   
	   
	   
   