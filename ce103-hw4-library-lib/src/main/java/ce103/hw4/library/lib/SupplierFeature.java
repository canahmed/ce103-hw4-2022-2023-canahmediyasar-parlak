package ce103.hw4.library.lib;

import java.io.IOException;
public class SupplierFeature
{

	public static final int ID_LENGTH = 4;

	public static final int SUPPLIER_NAME_MAX_LENGTH = 50;

	public static final int CITY_NAME_MAX_LENGTH = 50;
	
	

	public static final int CONTACT_NUMBER_MAX_LENGTH = 20;

	public static final int EMAİL_MAX_LENGTH = 50;

	public static final int SUPPLIER_DATA_BLOCK_SIZE = ID_LENGTH + SUPPLIER_NAME_MAX_LENGTH + CITY_NAME_MAX_LENGTH + CONTACT_NUMBER_MAX_LENGTH + EMAİL_MAX_LENGTH ;

	


	private int _id;
	private long _contactNum;
	private String _supplierName;
	private String _cityName;
	private String _email;
	


	public final int getId()
	{
		return _id;
	}
	public final void setId(int value)
	{
		_id = value;
	}
	public final long getContactNum()
	{
		return _contactNum;
	}
	public final void setContactNum(long value)
	{
		_contactNum = value;
	}
	public final String getSupplierName()
	{
		return _supplierName;
	}
	public final void setSupplierName(String value)
	{
		_supplierName = value;
	}
	public final String getCityName()
	{
		return _cityName;
	}
	public final void setCityName(String value)
	{
		_cityName = value;
	}
	public final String getEmail()
	{
		return _email;
	}
	public final void setEmail(String value)
	{
		_email = value;
	}
	

	

	
	public static byte[] BookToByteArrayBlock(SupplierFeature supplier)
	{
		int index = 0;

		byte[] dataBuffer = new byte[SUPPLIER_DATA_BLOCK_SIZE];


		byte[] idBytes = DataOperations.integerToByteArray(supplier.getId());
		System.arraycopy(idBytes, 0, dataBuffer, index, idBytes.length);
		index += SupplierFeature.ID_LENGTH;

		byte[] contactNumBytes = DataOperations.convertLongToByteArray(supplier.getContactNum());
		System.arraycopy(contactNumBytes, 0, dataBuffer, index, contactNumBytes.length);
		index += SupplierFeature.CONTACT_NUMBER_MAX_LENGTH;
		
		byte[] supplierNameBytes = DataOperations.StringToByteArray(supplier.getSupplierName());
		System.arraycopy(supplierNameBytes, 0, dataBuffer, index, supplierNameBytes.length);
		index += SupplierFeature.SUPPLIER_NAME_MAX_LENGTH;
		
		byte[] cityNameBytes = DataOperations.StringToByteArray(supplier.getCityName());
		System.arraycopy(cityNameBytes, 0, dataBuffer, index, cityNameBytes.length);
		index += SupplierFeature.CITY_NAME_MAX_LENGTH;

		byte[] emailBytes = DataOperations.StringToByteArray(supplier.getEmail());
		System.arraycopy(emailBytes, 0, dataBuffer, index, emailBytes.length);
		index += SupplierFeature.EMAİL_MAX_LENGTH;

		


		if (index != dataBuffer.length)
		{

			throw new IllegalArgumentException("Index and DataBuffer Size Not Matched");
		}

		return dataBuffer;
	}

	
	public static SupplierFeature ByteArrayBlockToBook(byte[] byteArray)
	{

		SupplierFeature supplier = new SupplierFeature();

		if (byteArray.length != SUPPLIER_DATA_BLOCK_SIZE)
		{
			throw new IllegalArgumentException("Byte Array Size Not Match with Constant Data Block Size");
		}

		int index = 0;

		//byte[] dataBuffer = new byte[SUPPLIER_DATA_BLOCK_SIZE];

		byte[] idBytes = new byte[SupplierFeature.ID_LENGTH];
		System.arraycopy(byteArray, index, idBytes, 0, idBytes.length);
		supplier.setId(DataOperations.byteArrayToInteger(idBytes));

		index += SupplierFeature.ID_LENGTH;
		
		byte[] contactNumBytes = new byte[SupplierFeature.CONTACT_NUMBER_MAX_LENGTH];
		System.arraycopy(byteArray, index, contactNumBytes, 0, contactNumBytes.length);
		supplier.setContactNum(DataOperations.byteArrayToLong(contactNumBytes));
		
		index += SupplierFeature.CONTACT_NUMBER_MAX_LENGTH;
		
		
		byte[] supplierNameBytes = new byte[SupplierFeature.SUPPLIER_NAME_MAX_LENGTH];
		System.arraycopy(byteArray, index, supplierNameBytes, 0, supplierNameBytes.length);
		supplier.setSupplierName(DataOperations.byteArrayToString(supplierNameBytes));

		index += SupplierFeature.SUPPLIER_NAME_MAX_LENGTH;
		
		
		
		byte[] cityNameBytes = new byte[SupplierFeature.CITY_NAME_MAX_LENGTH];
		System.arraycopy(byteArray, index, cityNameBytes, 0, cityNameBytes.length);
		supplier.setCityName(DataOperations.byteArrayToString(cityNameBytes));

		index += SupplierFeature.CITY_NAME_MAX_LENGTH;

		
		byte[] emailBytes= new byte[SupplierFeature.EMAİL_MAX_LENGTH];
		System.arraycopy(byteArray, index, emailBytes, 0, emailBytes.length);
		supplier.setEmail(DataOperations.byteArrayToString(emailBytes));
		
		index += SupplierFeature.EMAİL_MAX_LENGTH;
		
		
		
		
		if (index != byteArray.length)
		{

			throw new IllegalArgumentException("Index and DataBuffer Size Not Matched");
			
		}
		
		if (supplier.getId() == 0)
		{
			return null;
		}
		else
		{
			
			return supplier;
			
		}


	}

}