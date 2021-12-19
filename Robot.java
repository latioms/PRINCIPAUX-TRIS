class Robot {

	// Defiinittion des constante
	 static final int NORD = 0 ;
	 static final int EST = 1 ;
	 static final int SUD = 2 ;
	 static final int OUEST = 3;
  
  /*Definition des variables d'etat des instances et Initialise a 0 par default*/

   private int x  ;
   private int y  ;

   private int orientation  ;
   // Definitons des Accesseurs

   public int getX(){return (x);}
   public int getY(){return  (y);}
   public int getOrientation(){return (orientation);}



   /*Definition des Constructeurs*/

   public Robot(){}

   		//l'orientation qui aura la valeur nord deja initialise

	public Robot(int a, int b){

		// cette methode placera directement le robot a la position initie
		
		this.x = a ;
		this.y = b;
	}

	public Robot(int x,int y, int direction){

		//meme methode que la precedente mais avec l'orientation applique
		this.x = x ;
		this.y = y ;

		if (direction < 4) {
			orientation = direction ;
		}		
	}

   /*les differente Methodes que constitue cette class*/

   public void avancer(){

   	switch(orientation){
   		case NORD : y++ ;
   			break;
   		case EST : x++;
   			break;
   		case SUD : y--;
   			break;
   		case OUEST : x--;
   			break;}
   }

   public void avancerDeuxPas(){
   	avancer();
   	avancer();
   }

  public void tournerGauche(){
   	switch(orientation){
   		case NORD : orientation = OUEST;
   			break;
   		case EST : orientation = NORD ;
   			break;
   		case SUD : orientation = EST ;
   			break;
   		case OUEST : orientation =  SUD ;
   			break;}
	}
	public void tournerDroite(){
   	 switch(orientation){
   		case NORD : orientation = EST;
   			break;
   		case EST : orientation = SUD;
   			break;
   		case SUD : orientation = OUEST ;
   			break;
   		case OUEST : orientation =  NORD;
   			break;}
   	}
          // distance d'un robot dans un plan
	public void distance(){
   		double d = Math.sqrt((double)(x*x + y*y)) ;
         System.out.println(d) ;
   	} 
   public void distance(Robot , robot4){
         int a, b ;
         a = this.x - robot4.x ;
         b = this.y - robot4.y ;
         double c = Math.sqrt((double)(a*a + b*b)) ;
         System.out.println(c) ;      

      }
      // Distance de deux Robot

    public double distance(Robot robot4,Robot robot2){
         int a, b ;
         a = robot2.x - robot4.x ;
         b = robot2.y - robot4.y ;
         double c = Math.sqrt((double)(a*a + b*b)) ;
         return c ;
         
 //   Connaitre entre deux Robot qui est le plusFort

   public Robot plusFort( Robot a , Robot b){
      double compareA,compareB;
      compareA=a.distanceOrig();
      compareB=b.distanceOrig();
      if(compareB<=compareA)
          return a;
       else
         return b;
   }
 // Avancer le plusFort dees Robot
   public void Robot avancerplusFort( Robot a , Robot b){
      double compareA,compareB;
      compareA=a.distanceOrig();
      compareB=b.distanceOrig();
      if(compareB<=compareA)
           a.avancerDeuxPas();
       else
           b.avancerDeuxPas();
   }

 //Methodes de test et d'affichage
      public void afficher(){
         System.out.println("je suis un robot de coordonnees " + x +' '+y);
      }
      public void afficherOrientation(){
               switch(orientation){
         case NORD : System.out.println("L'orientation est NORD");
            break;
         case EST : System.out.println("L'orientation est EST");
            break;
         case SUD : System.out.println("L'orientation est SUD");
            break;
         case OUEST : System.out.println("L'orientation est OUEST");
            break;
         default:
            System.out.println("L'orientation entree est incorrecte");
            break;}
     }
     // methode tostring
     

      
}


 