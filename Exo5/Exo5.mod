/*********************************************
 * OPL 12.6.0.0 Model
 * Author: WIN27
 * Creation Date: 13 avril 2022 at 17:39:19
 *********************************************/

	int n = ...; //le nombre des emplacements

	range emplacements = 1..n; 
	int rue[1..53][1..2]=...; 
	dvar boolean x[emplacements];



	// La Fenction Objectif

	minimize  sum(i in emplacements)  x[i];

	// Les contraintes

	subject to

	{

	// les contraintes (Xi + Xj >= 1) est pour tout (i,j) appartient à R

	forall(i in emplacements)
	   forall(j in emplacements)
	      if(rue[j][1]==i||rue[j][2]==j)
	      x[i]+x[j]>=1; 
	  
	 	    
    }

