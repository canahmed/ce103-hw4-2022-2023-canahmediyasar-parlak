package ce103.hw4.library.cmd;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOperations
{
	public static byte[] readBlock(int count, int blocksize, String path) 
			throws IOException 
	{
	    byte[] buffer = new byte[blocksize];
	    try (FileInputStream fileStream = new FileInputStream(path)) 
	    {
	        fileStream.skip((count - 1) * blocksize);
	        fileStream.read(buffer);
	    }
	    return buffer;
	}
	
	
	public static boolean appendBlock(byte[] data, String path) throws IOException 
	{
	    try (FileOutputStream fileStream = new FileOutputStream(path, true))
	    {
	        fileStream.write(data);
	    }
	    
	    return true;
	}
	public static boolean updateBlock(byte[] data, int count, int blocksize, String path)
			throws IOException 
		{
		try( FileOutputStream fileStream = new FileOutputStream(path))
		{
			fileStream.getChannel().position((count - 1) * blocksize);
	        fileStream.write(data);

		}
		catch(FileNotFoundException e)
		{
		e.printStackTrace();
		}
		return false;
	
		}
	
	public static boolean deleteBlock(int count, int blocksize, String path) throws IOException 
	{
	    byte[] data = new byte[blocksize];
	    try (FileOutputStream fileStream = new FileOutputStream(path)) {
	        fileStream.getChannel().position((count - 1) * blocksize);
	        fileStream.write(data);
	    }
	    return true;
	}
	
}
	
