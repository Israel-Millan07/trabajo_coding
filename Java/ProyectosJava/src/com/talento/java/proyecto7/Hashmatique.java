package com.talento.java.proyecto7;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Hashmatique {

	private static List<String> keys;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("LA MACARENA", "Baila tu cuerpo alegria macarena ");
        userMap.put("LA CUCARACHA", "La cucaracha la cucaracha ya no puede caminar ");
        userMap.put("LA BATIDORA", "La batidora bate que bate ");
        userMap.put("MAYONESA", "Ma yo ne sa ella me bate como haciendo mayonesa ");
        // get the keys by using the keySet method
        String cancion="LA CUCARACHA";
        boolean indicador=false;
        
		keys = new ArrayList<String>(userMap.keySet()); 

          Collections.sort(keys);
                
          for (Iterator<String> iterator = keys.iterator(); iterator.hasNext();) {
			String key = iterator.next();
		
			if(key==cancion) {
				System.out.println("titulo:"+key+" - letra:"+userMap.get(key)); 
	            indicador=true;
	            continue;
	        }
	        	if(indicador==true) {
	             System.out.println("titulo:"+key+" - letra:"+userMap.get(key)); 
	        }
		}



      //  Set<String> keys = userMap.keySet();
//        for(String key : keys) {
//        	System.out.println(key);
//        	if(key==cancion) {
//            System.out.println(key);
//            System.out.println(userMap.get(key)+"1");
//            
//            indicador=true;
//            //continue;
//        }
//        	if(indicador==true) {
//        	 System.out.println(key);
//             System.out.println(userMap.get(key)); 
//        }
//        	}
    
	}

}
