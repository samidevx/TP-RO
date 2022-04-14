package Exo10;
public class Exo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        resolution();
        
	public static void resolution (){
	 try {
		IloCplex simplexe_methode = new IloCplex ();
				 
        int ville=6;
        int hub=2; 
        int dis_i_j[][]= {{0,945,605,4667,4749,4394},{945,0,866,3726,3806,3448},{605,866,0,4471,4541,4152},{4667,3721,4471,0,109,415},{4749,3806,4541,109,0,431},{4394,3448,4152,415,431,0}};
        int qnt_i_j[][]= {{0,500,1000,300,400,1500},{1500,0,250,630,360,1140},{400,510,0,460,320,490},{300,600,810,0,820,310},{400,100,420,730,0,970},{350,1020,260,580,380,0}};	

		double cout[][][][] = null;
				  
		for(int i=0 ; i < ville; i++) {
            for(int j=0 ; j < ville;j++) {
                for(int k=0 ; k < ville; k++) {
                    for(int m=0 ; m < ville; m++) {
                        cout[i][j][k][m]=dis_i_j[i][k]+(dis_i_j[k][m]*0.8)+dis_i_j[m][j];
                        
                    }
                }
            }
        };		  
				
	
	}
}
}