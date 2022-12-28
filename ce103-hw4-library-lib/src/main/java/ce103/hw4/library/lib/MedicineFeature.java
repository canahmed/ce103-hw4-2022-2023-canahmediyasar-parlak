package ce103.hw4.library.lib;

public class MedicineFeature {
	
	
	public static final int MEDICINE_ID_LENGTH = 4;
	
	public static final int MEDICINE_NAME_MAX_LENGTH=50;
	
	public static final int QUANTITY_MAX_LENGTH = 4;
	
	public static final int RACK_NUMBER_MAX_LENGTH = 4;

	public static final int CABNIT_NUMBER_MAX_LENGTH = 4;
	
	public static final int MEDICINE_PRICE_LENGTH=8;
	
	public static final int MEDICINE_SUPPLIER_NAME_MAX_LENGTH = 50;

	public static final int COMPANY_NAME_MAX_LENGTH = 50;
	
	public static final int MEDICINE_DATA_BLOCK_SIZE = MEDICINE_ID_LENGTH +QUANTITY_MAX_LENGTH + MEDICINE_NAME_MAX_LENGTH + MEDICINE_PRICE_LENGTH + RACK_NUMBER_MAX_LENGTH + CABNIT_NUMBER_MAX_LENGTH + MEDICINE_SUPPLIER_NAME_MAX_LENGTH + COMPANY_NAME_MAX_LENGTH ;

	


	private int _medicineId;
	private String _medicineName;
	private int _quantity;
	private int _rack;
	private double _price;
	private int _cabnit;
	private String _medicineSupplier;
	private String _companyName;
	
	


	public final int getMedicineId()
	{
		return _medicineId;
	}
	public final void setMedicineId(int value)
	{
		_medicineId = value;
	}
	public final String getMedicineName()
	{
		return _medicineName;
	}
	public final void setMedicineName(String value)
	{
		_medicineName = value;
	}
	public final int getQuantity()
	{
		return _quantity;
	}
	public final void setQuantity(int value)
	{
		_quantity = value;
	}
	public final double getPrice()
	{
		return _price;
	}
	public final void setPrice(double value)
	{
		_price = value;
	}
	public final int getRack()
	{
		return _rack;
	}
	public final void setRack(int value)
	{
		_rack = value;
	}
	public final int getCabnit()
	{
		return _cabnit;
	}
	public final void setCabnit(int value)
	{
		_cabnit = value;
	}
	public final String getMedicineSupplier()
	{
		return _medicineSupplier;
	}
	public final void setMedicineSupplier(String value)
	{
		_medicineSupplier = value;
	}
	public final String getCompanyName()
	{
		return _companyName;
	}
	public final void setCompanyName(String value)
	{
		_companyName = value;
	}

	

	
	public static byte[] BookToByteArrayBlock(MedicineFeature medicine)
	{
		int index = 0;

		byte[] dataBuffer = new byte[MEDICINE_DATA_BLOCK_SIZE];


		byte[] medicineIdBytes = DataOperations.integerToByteArray(medicine.getMedicineId());
		System.arraycopy(medicineIdBytes, 0, dataBuffer, index, medicineIdBytes.length);
		index += MedicineFeature.MEDICINE_ID_LENGTH;

		byte[] quantityBytes = DataOperations.integerToByteArray(medicine.getQuantity());
		System.arraycopy(quantityBytes, 0, dataBuffer, index, quantityBytes.length);
		index += MedicineFeature.QUANTITY_MAX_LENGTH;
		
		byte[] medicineNameBytes = DataOperations.StringToByteArray(medicine.getMedicineName());
		System.arraycopy(medicineNameBytes, 0, dataBuffer, index, medicineNameBytes.length);
		index += MedicineFeature.MEDICINE_NAME_MAX_LENGTH;
		
		byte[] priceBytes = DataOperations.doubleToByteArray(medicine.getPrice());
		System.arraycopy(priceBytes, 0, dataBuffer, index, priceBytes.length);
		index += MedicineFeature.MEDICINE_PRICE_LENGTH;
		
		byte[] rackBytes = DataOperations.integerToByteArray(medicine.getRack());
		System.arraycopy(rackBytes, 0, dataBuffer, index, rackBytes.length);
		index += MedicineFeature.RACK_NUMBER_MAX_LENGTH;
		
		byte[] cabnitBytes = DataOperations.integerToByteArray(medicine.getCabnit());
		System.arraycopy(cabnitBytes, 0, dataBuffer, index, cabnitBytes.length);
		index += MedicineFeature.CABNIT_NUMBER_MAX_LENGTH;
		
		byte[] medicineSupplierNameBytes = DataOperations.StringToByteArray(medicine.getMedicineSupplier());
		System.arraycopy(medicineSupplierNameBytes, 0, dataBuffer, index, medicineSupplierNameBytes.length);
		index += MedicineFeature.MEDICINE_SUPPLIER_NAME_MAX_LENGTH;
		
		byte[] companyBytes = DataOperations.StringToByteArray(medicine.getCompanyName());
		System.arraycopy(companyBytes, 0, dataBuffer, index, companyBytes.length);
		index += MedicineFeature.COMPANY_NAME_MAX_LENGTH;

		
		


		if (index != dataBuffer.length)
		{

			throw new IllegalArgumentException("Index and DataBuffer Size Not Matched");
		}

		return dataBuffer;
	}

	
	public static MedicineFeature ByteArrayBlockToBook(byte[] byteArray)
	{

		MedicineFeature medicine = new MedicineFeature();

		if (byteArray.length != MEDICINE_DATA_BLOCK_SIZE)
		{
			throw new IllegalArgumentException("Byte Array Size Not Match with Constant Data Block Size");
		}

		int index = 0;
		
		//byte[] dataBuffer = new byte[BOOK_DATA_BLOCK_SIZE];

		byte[] medicineIdBytes = new byte[MedicineFeature.MEDICINE_ID_LENGTH];
		System.arraycopy(byteArray, index, medicineIdBytes, 0, medicineIdBytes.length);
		medicine.setMedicineId(DataOperations.byteArrayToInteger(medicineIdBytes));

		index += MedicineFeature.MEDICINE_ID_LENGTH;
		
		byte[] quantityBytes = new byte[MedicineFeature.QUANTITY_MAX_LENGTH];
		System.arraycopy(byteArray, index, quantityBytes, 0, quantityBytes.length);
		medicine.setQuantity(DataOperations.byteArrayToInteger(quantityBytes));

		index += MedicineFeature.QUANTITY_MAX_LENGTH;

		byte[] medicineNameBytes = new byte[MedicineFeature.MEDICINE_NAME_MAX_LENGTH];
		System.arraycopy(byteArray, index, medicineNameBytes, 0, medicineNameBytes.length);
		medicine.setMedicineName(DataOperations.byteArrayToString(medicineNameBytes));
		
		index += MedicineFeature.MEDICINE_NAME_MAX_LENGTH;
		
		byte[] priceBytes = new byte[MedicineFeature.MEDICINE_PRICE_LENGTH];
		System.arraycopy(byteArray, index, priceBytes, 0, priceBytes.length);
		
		
		medicine.setPrice(DataOperations.byteArrayToDouble(priceBytes));
		
		index += MedicineFeature.MEDICINE_PRICE_LENGTH;
		
		
		
		
		

		byte[] rackBytes = new byte[MedicineFeature.RACK_NUMBER_MAX_LENGTH];
		System.arraycopy(byteArray, index, rackBytes, 0, rackBytes.length);
		medicine.setRack(DataOperations.byteArrayToInteger(rackBytes));

		index += MedicineFeature.RACK_NUMBER_MAX_LENGTH;
		
		byte[] cabnitBytes = new byte[MedicineFeature.CABNIT_NUMBER_MAX_LENGTH];
		System.arraycopy(byteArray, index, cabnitBytes, 0, cabnitBytes.length);
		medicine.setCabnit(DataOperations.byteArrayToInteger(cabnitBytes));

		index += MedicineFeature.CABNIT_NUMBER_MAX_LENGTH;
		
		byte[] medicineSupplierNameBytes = new byte[MedicineFeature.MEDICINE_SUPPLIER_NAME_MAX_LENGTH];
		System.arraycopy(byteArray, index, medicineSupplierNameBytes, 0, medicineSupplierNameBytes.length);
		medicine.setMedicineSupplier(DataOperations.byteArrayToString(medicineSupplierNameBytes));

		index += MedicineFeature.MEDICINE_SUPPLIER_NAME_MAX_LENGTH;

		
		byte[] companyNameBytes = new byte[MedicineFeature.COMPANY_NAME_MAX_LENGTH];
		System.arraycopy(byteArray, index, companyNameBytes, 0, companyNameBytes.length);
		medicine.setCompanyName(DataOperations.byteArrayToString(companyNameBytes));

		index += MedicineFeature.COMPANY_NAME_MAX_LENGTH;

		


		if (index != byteArray.length)
		{

			throw new IllegalArgumentException("Index and DataBuffer Size Not Matched");
		}

		if (medicine.getMedicineId() == 0)
		{
			return null;
		}
		else
		{
			return medicine;
		}


	}
}
