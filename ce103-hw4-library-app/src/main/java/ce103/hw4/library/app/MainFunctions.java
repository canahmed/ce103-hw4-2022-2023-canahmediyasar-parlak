package ce103.hw4.library.app;

import java.io.File;
import java.io.IOException;

import ce103.hw4.library.cmd.FileOperations;
import ce103.hw4.library.lib.CustomerFeature;
import ce103.hw4.library.lib.MedicineFeature;
import ce103.hw4.library.lib.SupplierFeature;

public class MainFunctions {

	
	
	
	public static void supplierUptade() {
		
	}
	
	public static void supplierSearch(){
		
	}
	
	
	
	
	
	
	public static void customerUptade() {
		
	}
	
	public static void customerSearch() {
		
	}
	
	public static void customerList() {
		
	}
	
	

	
	
	public static void saleMedicine() {
		
	}
	
	public static void stockMedicine() {
		
	}
	
	public static void searchMedicine() {
		
	}
	
	public final static void AddSupplier(int Id, long ContactNumber, String SupplierName, String CityName, String Email) 
			throws IOException
	{
		SupplierFeature supplier = new SupplierFeature();

		supplier.setId(Id);
		supplier.setContactNum(ContactNumber);
		supplier.setSupplierName(SupplierName);
		supplier.setCityName(CityName);
		supplier.setEmail(Email);
		

		byte[] supplierBytes = SupplierFeature.BookToByteArrayBlock(supplier);
		ControlFile("supplier.dat");
		FileOperations.appendBlock(supplierBytes,"supplier.dat");
		//FileOperations.DeleteBlock();



	}

	public final static void AddCustomer(int Id, long ContactNumber, String CustomerName, String CityName, String Email) 
			throws IOException
	{
		CustomerFeature customer = new CustomerFeature();

		customer.setId(Id);
		customer.setContactNum(ContactNumber);
		customer.setCustomerName(CustomerName);
		customer.setCityName(CityName);
		customer.setEmail(Email);
		

		byte[] customerBytes = CustomerFeature.BookToByteArrayBlock(customer);
		ControlFile("customer.dat");
		FileOperations.appendBlock(customerBytes,"customer.dat");
		//FileOperations.DeleteBlock();



	}
	
	
	public final static void AddMedicine(int Id,String MedicineName, String MedicineSupplier, String CompanyName,double Price,int Quantity, int Rack,int Cabnit) 
			throws IOException
	{
		MedicineFeature medicine= new MedicineFeature();

		
		
		
		medicine.setMedicineId(Id);
		medicine.setMedicineName(MedicineName);
		medicine.setMedicineSupplier(MedicineSupplier);
		medicine.setCompanyName(CompanyName);
		medicine.setPrice(Price);
		medicine.setQuantity(Quantity);
		medicine.setRack(Rack);
		medicine.setCabnit(Cabnit);

		byte[] medicineBytes = MedicineFeature.BookToByteArrayBlock(medicine);
		ControlFile("medicine.dat");
		FileOperations.appendBlock(medicineBytes,"medicine.dat");
		//FileOperations.DeleteBlock();



	}
	
	public final static void Pull(String FileName) throws IOException
	{


	
		
		byte [] supplierWrittenBytes = FileOperations.readBlock(1, SupplierFeature.SUPPLIER_DATA_BLOCK_SIZE, FileName);
		
		SupplierFeature.ByteArrayBlockToBook(supplierWrittenBytes);
		
		


	}
	
	public final static void ControlFile(String FileName) throws IOException 
	{
		File file =new File(FileName);
		
		if(!file.exists()) {
			file.createNewFile();
		}
		
		
	}
	
	
}
