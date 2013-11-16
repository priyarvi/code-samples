package com.examples;

public class AlphaSortingBubble
{
     public static void main(String[ ] args)
     {
             String[ ] names = {"joe", "slim", "ed", "george"};
             sortStringBubble (names);
             for ( int k = 0;  k < 4;  k++ )
                System.out.println( names [ k ] );
      }

      public static void sortStringBubble( String  x [ ] )
      {
            int j;
            boolean flag = true;  // will determine when the sort is finished
            String temp;

            while ( flag )
            {
                  flag = false;
                  for ( j = 0;  j < x.length - 1;  j++ )
                  {
                	//  System.out.println( "j"+ j );
                	//  System.out.println( "x[j] " +x[j] +" x[j+1} "+x[j+1]  );
                          if ( x [ j ].compareToIgnoreCase( x [ j+1 ] ) > 0 )
                          {                 
                        	  System.out.println( "x[j] " +x[j] +" x[j+1} "+x[j+1]  );
                        	  // ascending sort
                                      temp = x [ j ];
                                      x [ j ] = x [ j+1];     // swapping
                                      x [ j+1] = temp; 
                                      flag = true;
                           } 
                   } 
            } 
      } 
}