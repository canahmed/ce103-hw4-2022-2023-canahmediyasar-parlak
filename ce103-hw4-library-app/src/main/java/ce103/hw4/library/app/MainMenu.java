package ce103.hw4.library.app;
import java.util.Scanner;

import ce103.hw4.library.cmd.FileOperations;
import ce103.hw4.library.lib.CustomerFeature;
import ce103.hw4.library.lib.MedicineFeature;
import ce103.hw4.library.lib.SupplierFeature;

import static java.lang.System.exit;



public class MainMenu {
	
	
	   
	    @SuppressWarnings("unused")
		public static void main(String[] args) {
	    	
	    	
	    	
	    	
	        String[] options = {"|  Supplier Info  |   Customer Info  |   Medicine  |   Report  |   Bill   |  About  |   Exit  |"};
	                            
	        
	        Scanner scanner = new Scanner(System.in);
	        
	        int option = 1;
	        String input;
	                
	        
	        
            //System.out.println("input : " + input);
	        
	       
	       
	        while (option!=2){
	            MenuDesign.printMenu(options);
	            try {
	            	for(int i=0;i<=7;i++) {
	            		System.out.println("|                                                                                             |");
	            	}
	            	System.out.println("|                                  Welcome to Medical Store                                   |");
	            	for(int i=0;i<=7;i++) {
	            		System.out.println("|                                                                                             |");
	            	}
	            	System.out.println("-----------------------------------------------------------------------------------------------");
	            	System.out.print("|    Enter Operations Number Which You Want:");
	            	
	                input = scanner.next();
	                
	                switch (input){
	                    case "s","S": option1();option=1; break;
	                    case "c","C": option2();option=1; break;
	                    case "m","M": option3();option=1; break;
	                    case "r","R": option4();option=1; break;
	                    case "b","B": option5();option=1; break;
	                    case "a","A": option6();option=1; break;
	                    case "e","E": exit(0);option=2;
	                }
	            }
	            catch (Exception ex){
	                System.out.println("Please enter an integer value between 0 and 6");
	                break;
	                
	            	}
	        	}
	        }
	    
	// Options
	    private static void option1() {
	    	
	    	
	    	Scanner scanner = new Scanner(System.in);
	    	String supplierInput;
	    	int supplierId;
	    	long contactNum;
	    	String supplierName;
	    	String cityName;
	    	String email;
	    	String SupInput;
	    	System.out.println("-----------------------------------------------------------------------------------------------");
	    	System.out.println("|                                       Supplier Info                                         |");
	    	System.out.println("-----------------------------------------------------------------------------------------------");
	    	for(int i=0;i<=2;i++) {
        		System.out.println("|                                                                                             |");
        	}
	    	
	        System.out.println("|                                      Add New Supplier                                       |");
	        for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
	        System.out.println("|                                       Update Supplier                                       |");
	        for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
	        System.out.println("|                                       Search Supplier                                       |");
	        for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
	        System.out.println("|                                        List Supplier                                        |");
	        for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
	        System.out.println("|                                          Main Menu                                          |");
	        for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
	        System.out.println("-----------------------------------------------------------------------------------------------");
	        try {
	        	
	        	System.out.print("|    Enter Operations Number Which You Want:");
	        supplierInput = scanner.next();
	         
            switch (supplierInput){
                case "a","A":
                	
                	System.out.println("-----------------------------------------------------------------------------------------------");
                	System.out.println("|                                       Add New Supplier                                      |");
                	System.out.println("-----------------------------------------------------------------------------------------------");
                	for(int i=0;i<=1;i++) {
                		System.out.println("|                                                                                             |");
                	}
                	System.out.print("|  Supplier ID:");
                	supplierId = scanner.nextInt();
                	System.out.println("|                                                                                             |");
                	
                	System.out.print("|  Supplier Name:");
        	    	supplierName=scanner.next();
        	    	System.out.println("|                                                                                             |");
  
                	System.out.print("|  Contact Number:");
                	contactNum = scanner.nextLong();
        	    	System.out.println("|                                                                                             |");
        	    	
        	    	System.out.print("|  City Name:");
        	    	cityName=scanner.next();
        	    	System.out.println("|                                                                                             |");
        	    	
        	    	System.out.print("|  Email:");
        	    	email=scanner.next();
        	    	System.out.println("|                                                                                             |");
        	    	
        	    	System.out.print("|                           <<Press s for Save,Press c for Cancel[s/c]>>");
        	    	SupInput=scanner.next();
        	    	switch(SupInput) {
        	    	case "s","S":
        	    		MainFunctions.AddSupplier(supplierId, contactNum, supplierName, cityName, email);
        	    		for(int i=0;i<=2;i++) {
                    		System.out.println("|                                                                                             |");
                    	}
        	    		System.out.println("-----------------------------------------------------------------------------------------------");
                    	System.out.println("|                               Supplier Added Successfully                                   |");
                    	System.out.println("-----------------------------------------------------------------------------------------------");
                    	
                    	Thread.sleep(2500);
                    	break;
        	    	case "c","C":
        	    		
        	    		break;
        	    	}
                	
                	
                	
                	
                case "u","U": MainFunctions.supplierUptade(); break;
                case "s","S": 
                	String searchSupplierInput;
                	int searchId;
                	String searchName;
                	System.out.println("-----------------------------------------------------------------------------------------------");
                	System.out.println("|                                       Search Supplier                                       |");
                	System.out.println("-----------------------------------------------------------------------------------------------");
                	for(int i=0;i<=1;i++) {
                		System.out.println("|                                                                                             |");
                	}
                	System.out.println("|                                          Search By ID                                       |");
                	for(int i=0;i<=1;i++) {
                		System.out.println("|                                                                                             |");
                	}
                	System.out.println("|                                         Search By Name                                      |");
        	    	System.out.println("|                                                                                             |");
                	
        	    	for(int i=0;i<=3;i++) {
                		System.out.println("|                                                                                             |");
                	}
                	
        	    
        	    	System.out.println("-----------------------------------------------------------------------------------------------");
                	System.out.print("                      <<Press ı for Search By Id,Press n for Search By Name>>");
                	searchSupplierInput=scanner.next();
                	switch(searchSupplierInput) {
                	
                	case "ı","I":
                		System.out.println("-----------------------------------------------------------------------------------------------");
                		System.out.println("|                                        Search By ID                                         |");
                		System.out.println("-----------------------------------------------------------------------------------------------");
                		for(int i=0;i<=1;i++) {
                			System.out.println("|                                                                                             |");
                		}
                		System.out.print("Supplier ID:");
                		searchId=scanner.nextInt();
                		
                		
                        	for(int c =1 ; c<5 ;c++)
                    		{
                        		
                        		
                    			byte[] supplierWrittenBytes = FileOperations.readBlock(c, SupplierFeature.SUPPLIER_DATA_BLOCK_SIZE, "supplier.dat");
                    			
                    			
                    			
                    				
                    				SupplierFeature supplierWrittenObject = SupplierFeature.ByteArrayBlockToBook(supplierWrittenBytes);
                    				
                    			
                    			if(searchId==supplierWrittenObject.getId()) {
            					
            					
            					System.out.println(" Supplier Num: " + supplierWrittenObject.getContactNum());
            					System.out.println(" Supplier Name: " + supplierWrittenObject.getSupplierName());
            					System.out.println(" Suppliers City: " + supplierWrittenObject.getCityName());
            					System.out.println(" Supplier Mail: " + supplierWrittenObject.getEmail());
            					System.out.println("|---------------------------------------------------------------------------------------------|");
                    			}
                    			
                    				
                    			
                    		}
                        	
                        	
                        		
                        		Thread.sleep(2500);
                        		


                        		break;
                	
                	case "n","N":
                		
                		System.out.println("-----------------------------------------------------------------------------------------------");
            		System.out.println("|                                       Search By Name                                        |");
            		System.out.println("-----------------------------------------------------------------------------------------------");
            		for(int i=0;i<=1;i++) {
            			System.out.println("|                                                                                             |");
            		}
            		System.out.print(" Supplier Name:");
            		searchName=scanner.next();
            		
            		
                    	for(int c =1 ; c<5 ;c++)
                		{
                    		
                    		
                			byte[] supplierWrittenBytes = FileOperations.readBlock(c, SupplierFeature.SUPPLIER_DATA_BLOCK_SIZE, "supplier.dat");
                			
                			
                			
                				
                				SupplierFeature supplierWrittenObject = SupplierFeature.ByteArrayBlockToBook(supplierWrittenBytes);
                				
                			
                			if(searchName.equals(supplierWrittenObject.getSupplierName())) {
        					
                			System.out.println(" Supplier ID: " + supplierWrittenObject.getId());
        					System.out.println(" Supplier Num: " + supplierWrittenObject.getContactNum());
        					System.out.println(" Suppliers City: " + supplierWrittenObject.getCityName());
        					System.out.println(" Supplier Mail: " + supplierWrittenObject.getEmail());
        					System.out.println("|---------------------------------------------------------------------------------------------|");
                			}
                			
                				
                			
                		}
                    	
                    	
                    		
                    		Thread.sleep(2500);
                    		


                    		break;
  
                	}
                	
                	
                	
                	break;
                case "l","L": 
                	try {
                    	for(int c =1 ; c<5 ;c++)
                		{
                    		
                			byte[] supplierWrittenBytes = FileOperations.readBlock(c, SupplierFeature.SUPPLIER_DATA_BLOCK_SIZE, "supplier.dat");
                			
                			
                			
                				
                				SupplierFeature supplierWrittenObject = SupplierFeature.ByteArrayBlockToBook(supplierWrittenBytes);
                				
                			
                    	
        					
        					System.out.print(" Supplier ID: " + supplierWrittenObject.getId() + "\n");
        					System.out.print(" Supplier Num: " + supplierWrittenObject.getContactNum() + "\n");
        					System.out.print(" Supplier Name: " + supplierWrittenObject.getSupplierName() + "\n");
        					System.out.print(" Suppliers City: " + supplierWrittenObject.getCityName() + "\n");
        					System.out.print(" Supplier Mail: " + supplierWrittenObject.getEmail() + "\n");
        					System.out.println("|---------------------------------------------------------------------------------------------|");
                		}
                    	}
                    	catch(NullPointerException e)
    						{
                    		
                    		Thread.sleep(2500);
                    		
    							}
                    		break;
                case "m","M": break;
                
            }
        }
        catch (Exception ex){
            
        }
	        
	        
	    }
	    private static void option2() {
	    	Scanner scanner = new Scanner(System.in);
	    	String customerInput;
	    	System.out.println("-----------------------------------------------------------------------------------------------");
	    	System.out.println("|                                       Customer Info                                         |");
	    	System.out.println("-----------------------------------------------------------------------------------------------");
	    	for(int i=0;i<=2;i++) {
        		System.out.println("|                                                                                             |");
        	}
	    	
	        System.out.println("|                                      Add New Customer                                       |");
	        for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
	        System.out.println("|                                     Uptade New Customer                                     |");
	        for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
	        System.out.println("|                                       Search Customer                                       |");
	        for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
	        System.out.println("|                                        List Customer                                        |");
	        for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
	        System.out.println("|                                          Main Menu                                          |");
	        for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
	        System.out.println("-----------------------------------------------------------------------------------------------");
	        try {
	        	
	        	System.out.print("|    Enter Operations Number Which You Want:");
	        customerInput = scanner.next();
            
            switch (customerInput){
                case "a","A": 
                	
                	
                	
                	int customerId;
        	    	long contactNum;
        	    	String customerName;
        	    	String cityName;
        	    	String email;
        	    	String customInput;
                
                
                
                
                
	                System.out.println("-----------------------------------------------------------------------------------------------");
	            	System.out.println("|                                       Add New Customer                                      |");
	            	System.out.println("-----------------------------------------------------------------------------------------------");
	            	for(int i=0;i<=1;i++) {
	            		System.out.println("|                                                                                             |");
	            	}
	            	System.out.print("|  Customer ID:");
	            	customerId = scanner.nextInt();
	            	System.out.println("|                                                                                             |");
	            	
	            	System.out.print("|  Customer Name:");
	    	    	customerName=scanner.next();
	    	    	System.out.println("|                                                                                             |");
	
	            	System.out.print("|  Contact Number:");
	            	contactNum = scanner.nextLong();
	    	    	System.out.println("|                                                                                             |");
	    	    	
	    	    	System.out.print("|  City Name:");
	    	    	cityName=scanner.next();
	    	    	System.out.println("|                                                                                             |");
	    	    	
	    	    	System.out.print("|  Email:");
	    	    	email=scanner.next();
	    	    	System.out.println("|                                                                                             |");
	    	    	
	    	    	System.out.print("|                           <<Press s for Save,Press c for Cancel[s/c]>>");
	    	    	customInput=scanner.next();
	    	    	switch(customInput) {
	    	    	case "s","S":
	    	    		MainFunctions.AddCustomer(customerId, contactNum, customerName, cityName, email);
	    	    		for(int i=0;i<=2;i++) {
	                		System.out.println("|                                                                                             |");
	                	}
	    	    		System.out.println("-----------------------------------------------------------------------------------------------");
	                	System.out.println("|                               Customer Added Successfully                                   |");
	                	System.out.println("-----------------------------------------------------------------------------------------------");
	                	
	                	Thread.sleep(2500);
	                	break;
	    	    	case "c":
        	    		
        	    		break;
        	    	}
                
                
                case "u","U": MainFunctions.customerUptade(); break;
                case "s","S": 
                	
                	
                	String searchCustomerInput;
                	int searchId;
                	String searchName;
                	System.out.println("-----------------------------------------------------------------------------------------------");
                	System.out.println("|                                       Search Customer                                       |");
                	System.out.println("-----------------------------------------------------------------------------------------------");
                	for(int i=0;i<=1;i++) {
                		System.out.println("|                                                                                             |");
                	}
                	System.out.println("|                                          Search By ID                                       |");
                	for(int i=0;i<=1;i++) {
                		System.out.println("|                                                                                             |");
                	}
                	System.out.println("|                                         Search By Name                                      |");
        	    	System.out.println("|                                                                                             |");
                	
        	    	for(int i=0;i<=3;i++) {
                		System.out.println("|                                                                                             |");
                	}
                	
        	    
        	    	System.out.println("-----------------------------------------------------------------------------------------------");
                	System.out.print("                      <<Press ı for Search By Id,Press n for Search By Name>>");
                	searchCustomerInput=scanner.next();
                	switch(searchCustomerInput) {
                	
                	case "ı","I":
                		System.out.println("-----------------------------------------------------------------------------------------------");
                		System.out.println("|                                        Search By ID                                         |");
                		System.out.println("-----------------------------------------------------------------------------------------------");
                		for(int i=0;i<=1;i++) {
                			System.out.println("|                                                                                             |");
                		}
                		System.out.print("Customer ID:");
                		searchId=scanner.nextInt();
                		
                		
                        	for(int c =1 ; c<5 ;c++)
                    		{
                        		
                        		
                    			byte[] customerWrittenBytes = FileOperations.readBlock(c, CustomerFeature.CUSTOMER_DATA_BLOCK_SIZE, "customer.dat");
                    			
                    			
                    			
                    				
                    				CustomerFeature customerWrittenObject = CustomerFeature.ByteArrayBlockToBook(customerWrittenBytes);
                    				
                    			
                    			if(searchId==customerWrittenObject.getId()) {
            					
                    			System.out.println(" Customer Name: " + customerWrittenObject.getCustomerName());
            					System.out.println(" Customer Number: " + customerWrittenObject.getContactNum());         					
            					System.out.println(" Customers City: " + customerWrittenObject.getCityName());
            					System.out.println(" Customer Mail: " + customerWrittenObject.getEmail());
            					System.out.println("|---------------------------------------------------------------------------------------------|");
                    			break;
                    			}
                    			
                    				
                    			
                    		}
                        	
                        	
                        		
                        		Thread.sleep(2500);
                        		


                        		break;
                	
                	case "n","N":
                		
                		System.out.println("-----------------------------------------------------------------------------------------------");
            		System.out.println("|                                       Search By Name                                        |");
            		System.out.println("-----------------------------------------------------------------------------------------------");
            		for(int i=0;i<=1;i++) {
            			System.out.println("|                                                                                             |");
            		}
            		System.out.print(" Customer Name:");
            		searchName=scanner.next();
            		
            		
                    	for(int c =1 ; c<5 ;c++)
                		{
                    		
                    		
                			byte[] customerWrittenBytes = FileOperations.readBlock(c, CustomerFeature.CUSTOMER_DATA_BLOCK_SIZE, "customer.dat");
                			
                			
                			
                				
                				CustomerFeature customerWrittenObject = CustomerFeature.ByteArrayBlockToBook(customerWrittenBytes);
                				
                			
                			if(searchName.equals(customerWrittenObject.getCustomerName())) {
        					
                			System.out.println(" Supplier ID: " + customerWrittenObject.getId());
        					System.out.println(" Supplier Num: " + customerWrittenObject.getContactNum());
        					System.out.println(" Suppliers City: " + customerWrittenObject.getCityName());
        					System.out.println(" Supplier Mail: " + customerWrittenObject.getEmail());
        					System.out.println("|---------------------------------------------------------------------------------------------|");
                			
                			break;
                			}
                			
                				
                			
                		}
                    	
                    	
                    		
                    		Thread.sleep(2500);
                    		


                    		break;
  
                	}
                	
                	
                	
                	break;
                	
                case "l","L": 
                	 
                	
                	try {
	                    	for(int c =1 ; c<5 ;c++)
	                		{
	                    		
	                			byte[] customerWrittenBytes = FileOperations.readBlock(c, CustomerFeature.CUSTOMER_DATA_BLOCK_SIZE, "customer.dat");
	                			
	                			
	                			
	                				
	                			CustomerFeature customerWrittenObject = CustomerFeature.ByteArrayBlockToBook(customerWrittenBytes);
	                				
	                			
	                			
	
	
	        					
	        					
	        					System.out.println(" Customer ID: " + customerWrittenObject.getId());
	        					System.out.println(" Customer Number: " + customerWrittenObject.getContactNum());
	        					System.out.println(" Customer Name: " + customerWrittenObject.getCustomerName());
	        					System.out.println(" Customers City: " + customerWrittenObject.getCityName());
	        					System.out.println(" Customer Mail: " + customerWrittenObject.getEmail());
	        					System.out.println("|---------------------------------------------------------------------------------------------|");
	                		}
                    	}
                    	catch(NullPointerException e)
    						{
                    		
                    		Thread.sleep(2500);
                    		
    							}
                    		break;
                	
                	
			case "m": break;
                
            }
        }
        catch (Exception ex){
            System.out.println("Please enter an integer value between 1 and 5");
            scanner.next();
        }
	        
	    }
	    private static void option3() {
	    	Scanner scanner = new Scanner(System.in);
	    	String medicineInput;
	    	System.out.println("-----------------------------------------------------------------------------------------------");
	    	System.out.println("|                                       Medicine Info                                         |");
	    	System.out.println("-----------------------------------------------------------------------------------------------");
	    	for(int i=0;i<=2;i++) {
        		System.out.println("|                                                                                             |");
        	}
	    	
	        System.out.println("|                                   Purchase New Medicine                                     |");
	        for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
	        System.out.println("|                                     Sale Medicine(a)                                        |");
	        for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
	        System.out.println("|                                      Medicine Stock                                         |");
	        for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
	        System.out.println("|                                    Search medicine(s)                                       |");
	        for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
	        System.out.println("|                                       Main Menu(x)                                          |");
	        for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
	        System.out.println("-----------------------------------------------------------------------------------------------");
	        try {
	        	
	        	System.out.print("|    Enter Operations Number Which You Want:");
	        medicineInput = scanner.next();
            
            switch (medicineInput){
                case "p","P": 
                	int medicineId;
                	String medicineSupplier;
        	    	String companyName;
        	    	int Quantity;
        	    	int Rack;
        	    	int Cabnit;
        	    	double Price;
        	    	String medicineAddInput;
        	    	String medicineName;
        	    	
        	    	
                
        	    	
                
	                System.out.println("-----------------------------------------------------------------------------------------------");
	            	System.out.println("|                                    Purchase New Medicine                                    |");
	            	System.out.println("-----------------------------------------------------------------------------------------------");
	            	for(int i=0;i<=1;i++) {
	            		System.out.println("|                                                                                             |");
	            	}
	            	System.out.print("|  Medicine ID:");
	            	medicineId = scanner.nextInt();
	            	System.out.println("|                                                                                             |");
	            	
	            	System.out.print("|  Medicine Name:");
	    	    	medicineName=scanner.next();
	    	    	System.out.println("|                                                                                             |");
	
	    	    	
	            	System.out.print("|  Medicine Supplier:");
	    	    	medicineSupplier=scanner.next();
	    	    	System.out.println("|                                                                                             |");
	
	            	System.out.print("|  Company Name:");
	            	companyName = scanner.next();
	    	    	System.out.println("|                                                                                             |");
	    	    	
	    	    	
	    	    	Scanner klavye = new Scanner(System.in);
		    	    System.out.print("|  Price:");
		            Price = klavye.nextDouble();
	    	    	
	    	    	
	            	
	    	    	System.out.println("|                                                                                             |");
	    	    	
	    	    	System.out.print("|  Quantity:");
	    	    	Quantity=scanner.nextInt();
	    	    	System.out.println("|                                                                                             |");
	    	    	
	    	    	System.out.print("|  Rack:");
	    	    	Rack=scanner.nextInt();
	    	    	System.out.println("|                                                                                             |");
	    	    	
	    	    	System.out.print("|  Cabnit:");
	    	    	Cabnit =scanner.nextInt();
	    	    	System.out.println("|                                                                                             |");
	    	    	
	    	    	System.out.print("|                           <<Press s for Save,Press c for Cancel[s/c]>>");
	    	    	medicineAddInput=scanner.next();
	    	    	switch(medicineAddInput) {
	    	    	case "s":
	    	    		MainFunctions.AddMedicine(medicineId,medicineName,medicineSupplier,companyName,Price,Quantity,Rack,Cabnit);
	    	    		for(int i=0;i<=2;i++) {
	                		System.out.println("|                                                                                             |");
	                	}
	    	    		System.out.println("-----------------------------------------------------------------------------------------------");
	                	System.out.println("|                             Medicine Purchased Sucessfully                                  |");
	                	System.out.println("-----------------------------------------------------------------------------------------------");
	                	
	                	Thread.sleep(2500);
	                	break;
	    	    	case "c":
        	    		
        	    		break;
        	    	} 
                	
                	
                	
                	
                	
                	break;
                case "a","A" : MainFunctions.saleMedicine(); break;
                case "m","M": 
                	
                	
                	System.out.println("-----------------------------------------------------------------------------------------------");
	            	System.out.println("|                                      Stock Of Medicine                                      |");
	            	System.out.println("-----------------------------------------------------------------------------------------------");
	            	for(int i=0;i<=1;i++) {
	            		System.out.println("|                                                                                             |");
	            	}
                	
	            	
	            	for(int i=0;i<=1;i++) {
	            		System.out.println("|                                                                                             |");
	            	}
                	
	            	System.out.println("-----------------------------------------------------------------------------------------------");
	    	    	System.out.println("|       Medicine Name       Supplier       Company Name       Quantity       Sale Price       |");
	    	    	System.out.println("-----------------------------------------------------------------------------------------------");
                	
                		for(int c =1 ; c<5 ;c++)
            			{
                		
                		
            			byte[] medicineWrittenBytes = FileOperations.readBlock(c, MedicineFeature.MEDICINE_DATA_BLOCK_SIZE, "medicine.dat");
            			
            			
            			
            			
            			MedicineFeature medicineWrittenObject = MedicineFeature.ByteArrayBlockToBook(medicineWrittenBytes);
            			
            			
            			//if(medicineStockId==medicineWrittenObject.getMedicineId()) {
    					
            			System.out.print("|           "+medicineWrittenObject.getMedicineName());
            			System.out.print("     |    "+medicineWrittenObject.getMedicineSupplier());
            			System.out.print("      |    "+medicineWrittenObject.getCompanyName());
            			System.out.print("    |         "+medicineWrittenObject.getQuantity());
            			System.out.print("     |       "+medicineWrittenObject.getPrice());
            		
            			
    					System.out.println("\n|---------------------------------------------------------------------------------------------|");
            			
            			//}
            		
                	
            				
            			
            		
            			}
                	
                		
                		Thread.sleep(2500);
                		


                		break;
                	
                	
                	
                	
                case "s","S": 
                	
                	
                	int medicineSearchId;
                for(int i=0;i<=2;i++) {
            		System.out.println("|                                                                                             |");
            	}
                	System.out.print("|  Please Enter Medicine ID:");
            	medicineSearchId = scanner.nextInt();
            	for(int i=0;i<=1;i++) {
            		System.out.println("|                                                                                             |");
            	}
            	
            	System.out.println("-----------------------------------------------------------------------------------------------");
    	    	System.out.println("|       Medicine Name       Supplier       Company Name       Quantity       Sale Price       |");
    	    	System.out.println("-----------------------------------------------------------------------------------------------");
            	
    	    	try {
            		for(int c =1 ; c<5 ;c++)
        			{
            		
            		
        			byte[] medicineWrittenBytes = FileOperations.readBlock(c, MedicineFeature.MEDICINE_DATA_BLOCK_SIZE, "medicine.dat");
        			
        			
        			
        			
        			MedicineFeature medicineWrittenObject = MedicineFeature.ByteArrayBlockToBook(medicineWrittenBytes);
        			
        			
        			if(medicineSearchId==medicineWrittenObject.getMedicineId()) {
					
        			System.out.print("|           "+medicineWrittenObject.getMedicineName());
        			System.out.print("     |    "+medicineWrittenObject.getMedicineSupplier());
        			System.out.print("      |    "+medicineWrittenObject.getCompanyName());
        			System.out.print("    |         "+medicineWrittenObject.getQuantity());
        			System.out.print("     |       "+medicineWrittenObject.getPrice());
        		
        			
					System.out.println("\n|---------------------------------------------------------------------------------------------|");
        			break;
        			}
        			}
            		}
            		catch(Exception ex) {
            			System.out.print("*********************************Medicine Not In Stock****************************************");
            		}
        			
        				
        			
        				
    	    	
        		
        			
            	
            		
            		Thread.sleep(2500);
            		


            		break;
            	
                
                
                
                
                
                
                
                
                
                
                case "x","X": break;
                
            }
        }
        catch (Exception ex){
            System.out.println("Please enter an integer value between 1 and 5");
            scanner.next();
        }
	        
	    }
	    private static void option4() {
	        System.out.println("Thanks for choosing option 4");
	    }
	    private static void option5() {
	    	Scanner scanner = new Scanner(System.in);
	    	int billInput;
	    	int billNo;
	    	int medicineID;
	    	String customerName;
	    	
	    	System.out.println("-----------------------------------------------------------------------------------------------");
	    	System.out.print("|       Bill No:");
	    	billNo=scanner.nextInt();
	    	
	    	scanner.nextLine(); 
	    	System.out.println("-----------------------------------------------------------------------------------------------");
	    	System.out.print("|       Customer Name:");
	    	customerName=scanner.next();
	    	
	    	System.out.println("-----------------------------------------------------------------------------------------------");
	    	System.out.print("|       Medicine ID:");
	    	medicineID=scanner.nextInt();
	    	
	    	System.out.println("-----------------------------------------------------------------------------------------------");
	    	for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
	    	System.out.println("-----------------------------------------------------------------------------------------------");
	    	System.out.println("|     Medicine Name          Stock of Medicine          Company Name          Sale Price      |");
	    	System.out.println("-----------------------------------------------------------------------------------------------");
	    	
	    	
	    	
	    	for(int i=0;i<=2;i++) {
        		System.out.println("|                                                                                             |");
        	}
	    	
	       
	        
	        for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
	        System.out.println("-----------------------------------------------------------------------------------------------");
	        try {
	        	
	       
	        billInput = scanner.nextInt();
            
            switch (billInput){
                case 1: break;
                
                
            }
        }
        catch (Exception ex){
            System.out.println("Please enter an integer value between 1 and 5");
            scanner.next();
        }
	    	
	    	
	        System.out.println("Thanks for choosing option 5");
	    }
	    private static void option6() {
	    	
	    	Scanner scanner = new Scanner(System.in);
	    	int aboutInput;
	    	System.out.println("-----------------------------------------------------------------------------------------------");
	    	System.out.println("|                                           ABOUT                                             |");
	    	System.out.println("-----------------------------------------------------------------------------------------------");
	    	for(int i=0;i<=2;i++) {
        		System.out.println("|                                                                                             |");
        	}
	    	
	        System.out.println("|                    => This project is about Medical Store Management<=                      |");
	        for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
	        System.out.println("|              =>In This Project we Can Add Medicine ,Customer,Supplier Details<=             |");
	        for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
	        System.out.println("|                        =>You Can Modifed & Delete Existing Record<=                         |");
	        for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
	        System.out.println("|                 =>You Can Also Search Medicine ,Customer,Supplier Details<=                 |");
	        for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
	        
	        System.out.println("|                                 <Press 1 for Return Main Menu>                              |");
	        for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
	        System.out.println("-----------------------------------------------------------------------------------------------");
	        try {
	        	
	       
	        aboutInput = scanner.nextInt();
            
            switch (aboutInput){
                case 1: break;
                
                
            }
        }
        catch (Exception ex){
            System.out.println("Please enter an integer value between 1 and 5");
            scanner.next();
        }
	        
	    }
	    
	    private static void option0() {
	        System.out.println("Thanks for choosing option 0");
	    }
	    
	}
	
	


