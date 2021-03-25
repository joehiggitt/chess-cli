import java.util.Arrays;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.InvalidClassException;

class ChemicalElement implements Serializable
{
	private String name;
	private String symbol;
	private int atomicNumber;

	/*
	* Symbols for elements with which this element can form a covalent bond.
	*/
	private String[] bondsWith;

	public ChemicalElement(String name, String symbol, int atomicNumber, String[] bonds)
	{
		this.setName(name);
		this.setSymbol(symbol);
		this.setAtomicNumber(atomicNumber);
		this.setBonds(bonds);
	}

	public boolean bondsWith(String symbol)
	{
		return Arrays.asList(this.getBonds()).contains(symbol);
	}

	public int getAtomicNumber()
	{
		return this.atomicNumber;
	}

	public String[] getBonds()
	{
		return this.bondsWith;
	}

	public String getName()
	{
		return this.name;
	}

	public String getSymbol()
	{
		return this.symbol;
	}

	public void print()
	{
		System.out.println("=== " + this.getName() + " ===");
		System.out.println("Symbol: " + this.getSymbol());
		System.out.println("Atomic Number: " + this.getAtomicNumber());
		System.out.println("bondsWith: " + Arrays.toString(this.getBonds()));
	}

	public void setAtomicNumber(int atomicNumber)
	{
		this.atomicNumber = atomicNumber;
	}

	public void setBonds(String[] bonds)
	{
		this.bondsWith = bonds;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setSymbol(String symbol)
	{
		this.symbol = symbol;
	}

	public String toJSON()
	{
		String bondsWithList = "[";
		for (int i = 0; i < bondsWith.length; i++)
		{
			bondsWithList += "\"" + bondsWith[i] + "\"";
			if (i + 1 < bondsWith.length)
			{
				bondsWithList += ", ";
			}
		}
		bondsWithList += "]";
		return "{\n"
			.concat("	\"atomicNumber\": " + atomicNumber + ",\n")
			.concat("	\"bondsWith\": " + bondsWithList + ",\n")
			.concat("	\"name\": \"" + name.toLowerCase() + "\",\n")
			.concat("	\"symbol\": " + symbol + ",\n")
			.concat("}");
	}

	public String[] toJSONLines()
	{
		String bondsWithList = "[";
		for (int i = 0; i < bondsWith.length; i++)
		{
			bondsWithList += "\"" + bondsWith[i] + "\"";
			if (i + 1 < bondsWith.length)
			{
				bondsWithList += ", ";
			}
		}
		bondsWithList += "]";
		String[] list =
		{
			"{",
			"	\"atomicNumber\": " + atomicNumber + ",",
			"	\"bondsWith\": " + bondsWithList + ",",
			"	\"name\": \"" + name.toLowerCase() + "\",",
			"	\"symbol\": " + symbol + ",",
			"}"
		};
		return list;
	}

	public void writeObject()
	{
		String fileName = name + ".obj";
		FileOutputStream fileOut = null;
		ObjectOutputStream objectOut = null;
		try
		{
			fileOut = new FileOutputStream(fileName);
			objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(this);
			System.out.println(fileName + " created successfully.");
		}
		catch (IOException e)
		{
			System.out.println("An error occured.");
		}
		finally
		{
			if (objectOut != null)
			{
				try
				{
					objectOut.close();
				}
				catch (IOException e)
				{
					System.out.println("An error occured.");
				}
			}
			if (fileOut != null)
			{
				try
				{
					fileOut.close();
				}
				catch (IOException e)
				{
					System.out.println("An error occured.");
				}
			}
		}
	}

	public static Object readObject(String fileName)
	{
		FileInputStream fileIn = null;
		ObjectInputStream objectIn = null;
		Object chemical = null;
		try
		{
			fileIn = new FileInputStream(fileName);
			objectIn = new ObjectInputStream(fileIn);
			chemical = objectIn.readObject();
			System.out.println(fileName + " read successfully.");
		}
		catch (FileNotFoundException e)
		{
			System.out.println(fileName + " not found.");
		}
		catch (InvalidClassException e)
		{
			System.out.println(fileName + " is not compatible.");
		}
		catch (IOException e)
		{
			System.out.println("An error occured.");
			e.printStackTrace();
		}
		finally
		{
			if (objectIn != null)
			{
				try
				{
					objectIn.close();
				}
				catch (IOException e)
				{
					System.out.println("An error occured.");
				}
			}
			if (fileIn != null)
			{
				try
				{
					fileIn.close();
				}
				catch (IOException e)
				{
					System.out.println("An error occured.");
				}
			}
			return chemical;
		}
	}
}
