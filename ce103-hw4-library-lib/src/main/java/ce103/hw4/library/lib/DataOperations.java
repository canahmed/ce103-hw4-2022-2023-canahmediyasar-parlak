package ce103.hw4.library.lib;

import java.util.stream.*;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;

public final class DataOperations
{


	public static int[] ToByte(String hexString)
	{

		return IntStream.range(0, hexString.length()).filter(x -> x % 2 == 0).map(x -> Byte.parseByte(hexString.substring(x, x + 2), 16)).toArray();
	}


	public static String ToHex(byte[] arr)
	{
		StringBuilder sb = new StringBuilder(arr.length * 2);

		for (byte b : arr)
		{
			sb.append(String.format("%1$.2X", b));
		}

		return sb.toString();
	}


	public static boolean IsHex(String str)
	{
		boolean returnValue = true;
		try
		{
			DataOperations.ToByte(str);
		}
		catch (RuntimeException e)
		{
			return false;
		}

		return returnValue;
	}


	public static int GetInt(byte[] data, int offset, int length)
	{
		int result = 0;
		for (int i = 0; i < length; i++)
		{
			result = (result << 8) | data[offset + i];
		}

		return result;
	}


	public static String ToAscii(String hexString)
	{
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= hexString.length() - 2; i += 2)
		{
			sb.append(String.valueOf((char)Integer.parseInt(hexString.substring(i, i + 2), 16)));
		}
		return sb.toString();
	}
	public static long byteArrayToLong(byte[] byteArray) {
	    ByteBuffer buffer = ByteBuffer.wrap(byteArray);
	    return buffer.getLong();

	  }

	public static int byteArrayToInteger(byte[] byteArray) {
	    ByteBuffer buffer = ByteBuffer.wrap(byteArray);
	    return buffer.getInt();
	}

	public static byte[] integerToByteArray(int value)
	{
	    ByteBuffer buffer = ByteBuffer.allocate(Integer.BYTES);
	    buffer.putInt(value);
	    return buffer.array();
	}

	public static byte[] convertLongToByteArray(long value) {
	      
	      byte[] bytes = new byte[8];
	      ByteBuffer buffer = ByteBuffer.allocate(bytes.length);
	      buffer.putLong(value);
	      return buffer.array();

	}

	public static byte[] floatToByteArray(float value){
		
		return ByteBuffer.allocate(4).putFloat(value).array();
		
	}
	
	public static float byteArrayToFloat(byte[] byteArray) {
		int intBits = byteArray[0]<<24|(byteArray[1]& 0xFF)<<16 | (byteArray[2] & 0xFF)<< 8 | (byteArray[3] & 0xFF);
		return Float.intBitsToFloat(intBits);
		
	}
	
	public static byte[] StringToByteArray(String data)
	{



		return data.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
		
	}
	
	public static double byteArrayToDouble(byte[] byteArray) {
		return ByteBuffer.wrap(byteArray).getDouble();
		
	}
	
	public static byte[] doubleToByteArray(double value) {
	      
	      byte[] bytes = new byte[8];
	      ByteBuffer.wrap(bytes).putDouble(value);
	      
	      return bytes;

	}
	
	

	public static String byteArrayToString(byte[] byteArray) {
	    return new String(byteArray, StandardCharsets.US_ASCII).replace("\0", "");
	}








}