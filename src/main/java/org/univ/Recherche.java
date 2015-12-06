package org.univ;

public class Recherche {

		private boolean trouve;
		private int indiceDebut;
		private int indiceFin;
		private int indiceMilieu;
		
		public boolean getTrouve() {
			return trouve;
		}
		public void setTrouve(boolean trouve) {
			this.trouve = trouve;
		}
		public int getIndiceDebut() {
			return indiceDebut;
		}
		public void setIndiceDebut(int indiceDebut) {
			this.indiceDebut = indiceDebut;
		}
		public int getIndiceFin() {
			return indiceFin;
		}
		public void setIndiceFin(int indiceFin) {
			this.indiceFin = indiceFin;
		}
		public int getIndiceMilieu() {
			return indiceMilieu;
		}
		public void setIndiceMilieu(int indiceMilieu) {
			this.indiceMilieu = indiceMilieu;
		}
		
		public Recherche(){
			setTrouve(false);
			setIndiceDebut(0);
			setIndiceFin(0);
			setIndiceMilieu(0);
		}
		
		public boolean rechercheDicho(int tab[],int nbVal, int val){		
			
			setIndiceFin(nbVal);
			
			while(!this.trouve && ((getIndiceFin()- getIndiceDebut()>1))){
				setIndiceMilieu((getIndiceDebut()+ getIndiceFin())/2);
				setTrouve(tab[getIndiceMilieu()]== val);
	
				if(tab[getIndiceMilieu()] > val) setIndiceFin(getIndiceMilieu());
				
				else setIndiceDebut(getIndiceMilieu());
			}
			
			if (tab[getIndiceDebut()]== val) //return ("Oui le nombre "+val+" existe a l'indice "+this.getIndiceDebut());
			 { setTrouve(true);
                         return getTrouve();}
else return getTrouve();
			//else return " Non "+val+" n'existe pas dans le tableau";
			
		}
		
		/*public String rechercheDichoChar(char tab[],int nbVal, char val){		
			
			setIndiceFin(nbVal);
			
			while(!this.trouve && ((getIndiceFin()- getIndiceDebut()>1))){
				setIndiceMilieu((getIndiceDebut()+ getIndiceFin())/2);
				setTrouve(tab[getIndiceMilieu()]== val);
	
				if(tab[getIndiceMilieu()] != val) setIndiceFin(getIndiceMilieu());
				
				else setIndiceDebut(getIndiceMilieu());
			}
			
			if (tab[getIndiceDebut()]== val) return ("Oui le charactere "+val+" existe a l'indice "+this.getIndiceDebut());
			
			else return " Non "+val+" n'existe pas dans le tableau";
			
		}*/
		
}


		
		

