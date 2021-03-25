import java.util.Arrays;
// import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.InvalidClassException;

public class Test //implements Serializable
{
	public static void main(String[] args)
	{
		String fileName = "Hydrogen.bin";
		try
		( 
			DataInputStream dataIn = new DataInputStream(new FileInputStream(fileName));
		)
		{
			String data = dataIn.readLine();
			System.out.println(data);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}