package ce103.hw4.library.lib;

	import java.io.IOException;
public class CustomerFeature {
	
	

		public static final int ID_LENGTH = 4;

		public static final int CUSTOMER_NAME_MAX_LENGTH = 50;

		public static final int CITY_NAME_MAX_LENGTH = 50;
		
		

		public static final int CONTACT_NUMBER_MAX_LENGTH = 15;

		public static final int EMAİL_MAX_LENGTH = 51;

		public static final int CUSTOMER_DATA_BLOCK_SIZE = ID_LENGTH + CUSTOMER_NAME_MAX_LENGTH + CITY_NAME_MAX_LENGTH + CONTACT_NUMBER_MAX_LENGTH + EMAİL_MAX_LENGTH ;

		


		private int _id;
		private long _contactNum;
		private String _customerName;
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
		public final String getCustomerName()
		{
			return _customerName;
		}
		public final void setCustomerName(String value)
		{
			_customerName = value;
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
		

		

		
		public static byte[] BookToByteArrayBlock(CustomerFeature customer)
		{
			int index = 0;

			byte[] dataBuffer = new byte[CUSTOMER_DATA_BLOCK_SIZE];


			byte[] idBytes = DataOperations.integerToByteArray(customer.getId());
			System.arraycopy(idBytes, 0, dataBuffer, index, idBytes.length);
			index += CustomerFeature.ID_LENGTH;

			byte[] contactNumBytes = DataOperations.convertLongToByteArray(customer.getContactNum());
			System.arraycopy(contactNumBytes, 0, dataBuffer, index, contactNumBytes.length);
			index += CustomerFeature.CONTACT_NUMBER_MAX_LENGTH;
			
			byte[] customerNameBytes = DataOperations.StringToByteArray(customer.getCustomerName());
			System.arraycopy(customerNameBytes, 0, dataBuffer, index, customerNameBytes.length);
			index += CustomerFeature.CUSTOMER_NAME_MAX_LENGTH;
			
			byte[] cityNameBytes = DataOperations.StringToByteArray(customer.getCityName());
			System.arraycopy(cityNameBytes, 0, dataBuffer, index, cityNameBytes.length);
			index += CustomerFeature.CITY_NAME_MAX_LENGTH;

			byte[] emailBytes = DataOperations.StringToByteArray(customer.getEmail());
			System.arraycopy(emailBytes, 0, dataBuffer, index, emailBytes.length);
			index += CustomerFeature.EMAİL_MAX_LENGTH;

			


			if (index != dataBuffer.length)
			{

				throw new IllegalArgumentException("Index and DataBuffer Size Not Matched");
			}

			return dataBuffer;
		}

		
		public static CustomerFeature ByteArrayBlockToBook(byte[] byteArray)
		{

			CustomerFeature customer = new CustomerFeature();

			if (byteArray.length != CUSTOMER_DATA_BLOCK_SIZE)
			{
				throw new IllegalArgumentException("Byte Array Size Not Match with Constant Data Block Size");
			}

			int index = 0;

			//byte[] dataBuffer = new byte[BOOK_DATA_BLOCK_SIZE];

			byte[] idBytes = new byte[SupplierFeature.ID_LENGTH];
			System.arraycopy(byteArray, index, idBytes, 0, idBytes.length);
			customer.setId(DataOperations.byteArrayToInteger(idBytes));

			index += CustomerFeature.ID_LENGTH;

			byte[] contactNumBytes = new byte[CustomerFeature.CONTACT_NUMBER_MAX_LENGTH];
			System.arraycopy(byteArray, index, contactNumBytes, 0, contactNumBytes.length);
			customer.setContactNum(DataOperations.byteArrayToLong(contactNumBytes));

			index += CustomerFeature.CONTACT_NUMBER_MAX_LENGTH;

			
			byte[] customerNameBytes = new byte[CustomerFeature.CUSTOMER_NAME_MAX_LENGTH];
			System.arraycopy(byteArray, index, customerNameBytes, 0, customerNameBytes.length);
			customer.setCustomerName(DataOperations.byteArrayToString(customerNameBytes));

			index += CustomerFeature.CUSTOMER_NAME_MAX_LENGTH;

			
			byte[] cityNameBytes = new byte[CustomerFeature.CITY_NAME_MAX_LENGTH];
			System.arraycopy(byteArray, index, cityNameBytes, 0, cityNameBytes.length);
			customer.setCityName(DataOperations.byteArrayToString(cityNameBytes));

			index += CustomerFeature.CITY_NAME_MAX_LENGTH;

			byte[] emailBytes = new byte[CustomerFeature.EMAİL_MAX_LENGTH];
			System.arraycopy(byteArray, index, emailBytes, 0, emailBytes.length);
			customer.setEmail(DataOperations.byteArrayToString(emailBytes));
			
			index += CustomerFeature.EMAİL_MAX_LENGTH;


			if (index != byteArray.length)
			{

				throw new IllegalArgumentException("Index and DataBuffer Size Not Matched");
			}

			if (customer.getId() == 0)
			{
				return null;
			}
			else
			{
				return customer;
			}


		}

	}

