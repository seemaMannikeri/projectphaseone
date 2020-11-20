import java.io.*;
import java.util.Scanner;
 class ProjectOne {
		 static void addfile() {
	 	   try { 
	 		   	 Scanner filename=new Scanner(System.in);
	 	         String inputfile;
	 	         System.out.println("Enter the file name:");
	 	         inputfile=filename.nextLine().trim();
	 	         File file = new File(inputfile);
	 	         if(file.createNewFile()) {
					System.out.println("New file is created");
	 	         }
	 	         else {
					if(file.exists()) {
						System.out.println("File already exist");
						System.out.println("File path:"+file.getAbsolutePath());
						System.out.println("File name:"+file.getName());	
					}
					else {
						System.out.println("File does not exist..");
					}
				}
	 	   	 }
			catch(Exception e) {
					e.printStackTrace();
				}  
		}
		 
		    static void searchfile() throws Exception {
		    	Scanner filename=new Scanner(System.in);
		         String inputfile;
		         System.out.println("Enter the file name:");
		         inputfile=filename.nextLine().trim();
		    	 File myObj = new File(inputfile);
		    	    if (myObj.exists()) {
		    	    	System.out.println("The file found .");
		    	    } else {
		    	      System.out.println("The file does not exist...");
		    	    }
		     
		   }

	   static void deletefile() {
		   Scanner filename=new Scanner(System.in);
	        String inputfile;
	        System.out.println("Enter the file name:");
	        inputfile=filename.nextLine().trim();	
		   File myObj = new File(inputfile); 
		    if (myObj.delete()) { 
		      System.out.println("Deleted the file: " + myObj.getName());
		    } else {
		      System.out.println("File not found.");
	   }
	   }
	  
	   static void getOptionFromUser(int n) 
	   {   
	 	  try {
	 		 DataInputStream d=new DataInputStream(System.in);
	 	     
	 		 while(true) {
	 	   	    System.out.println("choose option");
	 	   	    System.out.println("1.To add file");
	 	   	    System.out.println("2.To search a file");
	 	   	    System.out.println("3.To delete file");
	 	   	    System.out.println("4.For exit");
	 	   	    n=Integer.parseInt(d.readLine());   
	 	   	
	 	   	      	switch(n) {
	 	   	            case 1: 
	 	   	            	 addfile();
	 	   	                break;
	 	   	             case 2:
	 	   	            	searchfile();
	 	   	                break;
	 	   	              case 3:
	 	   	                deletefile();
	 	   	                break;
	 	   	            case 4:
	 	   	            	System.out.println("Exit...");
	 	   	                System.exit(0);
	 	   	        }
	 	   	    }
	 	    }catch(Exception e) {
	 	    	System.out.println("Before enter ");
	 	    	getOptionFromUser(n);
	 	    }
	   }
		public static void main(String[] args) {
			 int n = 0;
			  getOptionFromUser(n);
			
	    }		
	}

	


