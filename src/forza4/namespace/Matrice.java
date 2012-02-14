package forza4.namespace;


import java.io.*;


public class Matrice {
	static int col1,col2,col3,col4,col5,col6,col7;
	static int pos;
	static int valore;
	static boolean pl1;
	static boolean pl2;
	static boolean win;
	
	
	//public static void main(String[] arg0) throws IOException{
	//	int Matr[][];
	//	col1=col2=col3=col4=col5=col6=col7=5;
	//	pl1=true;
	//	pl2=false;
	//	win=true;
	//	Matr= new int [6][7];

	//	inputMatric(Matr);
		
	//}
	
	
//carica matrice in tempo reale(prototipo forza4) funza
	public static void inputMatric(int matr[][]) throws IOException{
		while((col1>=0 || col2>=0 || col3>=0 || col4>=0 || col5>=0 || col6>=0 || col7>=0) && (win)){
			
			if (pl1){
				System.out.print("Giocatore1:  ");
			}
			else{
				System.out.print("Giocatore2:  ");
			}
			
		System.out.println("Inserisci posizione");
		System.out.flush();
		pos=System.in.read()-'0';
		System.in.skip(2);
		pos=pos-1;
		
			switch(pos)
			{
			case 0:
				{
				if (col1>=0){
					Turno();
					matr[col1][pos]=valore;
					CheckWin(matr,col1,pos);
					printMatric(matr);
					col1=col1-1;
				}else System.out.println("Posizione non valida");
				}
				break;
			case 1:
				{if (col2>=0){
					Turno();
					matr[col2][pos]=valore;
					CheckWin(matr,col2,pos);
					printMatric(matr);
					col2=col2-1;
				}else System.out.println("Posizione non valida");
				}
				break;
			case 2:
				{if (col3>=0){
					Turno();
					matr[col3][pos]=valore;
					CheckWin(matr,col3,pos);
					printMatric(matr);
					col3=col3-1;
				}else System.out.println("Posizione non valida");
				}
				break;
			case 3:
				{if (col4>=0){
					Turno();
					matr[col4][pos]=valore;
					CheckWin(matr,col4,pos);
					printMatric(matr);
					col4=col4-1;
				}else System.out.println("Posizione non valida");
				}
				break;
			case 4:
				{if (col5>=0){
					Turno();
					matr[col5][pos]=valore;
					CheckWin(matr,col5,pos);
					printMatric(matr);
					col5=col5-1;
				}else System.out.println("Posizione non valida");
				}
				break;
			case 5:
				{if (col6>=0){
					Turno();
					matr[col6][pos]=valore;
					CheckWin(matr,col6,pos);
					printMatric(matr);
					col6=col6-1;
				}else System.out.println("Posizione non valida");
				}
				break;
			case 6:
				{if (col7>=0){
					Turno();
					matr[col7][pos]=valore;
					CheckWin(matr,col7,pos);
					printMatric(matr);
					col7=col7-1;
				}else System.out.println("Posizione non valida");
				}
				break;
				
			default : System.out.println("Posizione non valida");
				}
		}
}
	
	
//controlla se player ha vinto...da finire diagonali(3 zone su 4 da fare,prima ok)

		public static void CheckWin(int matr[][],int posY,int posX){
			int temp;
			
//************cerco orizzontali*****************ok
			System.out.println(posX);
			//se inserisco nella meta sx
			if (posX<4)
			{
				for(int i=0;i<4;i++)
				{
					temp =matr[posY][i];
					if(temp==matr[posY][i+1] && temp==matr[posY][i+2] && temp==matr[posY][i+3]){
						ChihaVinto(temp);
						if(!win)System.out.println("orizzontale da sx verso dx");
						break;}
				}	
			}
			//se inserisco nella meta' dx
			else if (posX>=4){
				for(int i=6;i>3;i--){
					temp =matr[posY][i];
					if(temp==matr[posY][i-1] && temp==matr[posY][i-2] && temp==matr[posY][i-3]){
						ChihaVinto(temp);
						if(!win)System.out.println("orizzontale da dx verso sx");
						break;}}
			}
			
//**********cerco verticale verso basso(posso fare 4 solo verso il basso)**********ok
			if(posY<=2 && win==true){
			temp =matr[posY][posX];
				if (temp==matr[posY+1][posX] && temp==matr[posY+2][posX] && temp==matr[posY+3][posX]){
				ChihaVinto(temp);
				if(!win){
					System.out.println("verticale");
				}
				}
			}
				

			//****************cazzooooooooooooooooooooo**************diagonali
			for(int j=0;j<6;j++)
			{   if(!win)break;
				for (int i=0;i<7;i++)
				{
					temp=matr[j][i];
					if (temp != 0)
					{	//basso sx
						if (j>2 && i<=3){
							if(temp==matr[j-1][i+1] && 
							   temp==matr[j-2][i+2] &&
							   temp==matr[j-3][i+3]){
								ChihaVinto(temp);
								if (!win)break;
							}
						}//alto sx
						else if(j<=2 && i<=3){
							if (temp==matr[j+1][i+1] &&
								temp==matr[j+2][i+2] &&
								temp==matr[j+3][i+3]){
								ChihaVinto(temp);
								if(!win)break;
							}
						}//alto dx
						else if(j<=2 && i>=3){
							if (temp==matr[j+1][i-1] && 
								temp==matr[j+2][i-2] &&
								temp==matr[j+3][i-3]){
								ChihaVinto(temp);
								if(!win)break;
							}
						}//basso dx
						else if(j>2 && i>=3){
							if (temp==matr[j-1][i-1] &&
								temp==matr[j-2][i-2] &&
								temp==matr[j-3][i-3]){
								ChihaVinto(temp);
								if(!win)break;
							}
						}
					}
				}
			}
			
			
			System.out.flush();
		}
	
	public static void ChihaVinto(int player){
		if (player==1){
			System.out.println("Giocatore 1 Vince");
			win=false;
		}else if (player==2){
			System.out.println("Giocatore 2 Vince");
			win=false;
		}
	}
		
	//gestisce turno dei giocatori
	public static void Turno(){
		if (pl1){
			pl1=false;
			pl2=true;	
			valore = 1;
		}
		else{
			pl1=true;
			pl2=false;
			valore = 2;
		}
	}
	
	//prova per caricare matrice
	public static void loadMatric(int matr[][]) throws IOException{

		for(int i=0;i<7;i++){
			for(int j=0;j<6;j++){
				System.out.print("INSERISCI"+i+j+": ");
				System.out.flush();
				matr[i][j]=System.in.read()-'0';
				System.in.skip(2);
			}}}
	
	//stampa matrice
	public static void printMatric(int matr[][]){
		System.out.println();
		for(int i=0;i<6;i++){
			for(int j=0;j<7;j++){
				System.out.flush();
				System.out.print(matr[i][j]+" ");
			}
			System.out.println();
		}
	}

	
	
}