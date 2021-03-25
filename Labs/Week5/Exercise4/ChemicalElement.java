import java.util.Arrays;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.InvalidClassException;

class ChemicalElement
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

	public void writeBinary()
	{
		String fileName = name + ".bin";
		try
		(
			DataOutputStream dataOut = new DataOutputStream(new FileOutputStream(fileName));
		)
		{
			dataOut.writeBytes(toJSON());
			System.out.println(fileName + " created successfully.");
		}
		catch (IOException e)
		{
			System.out.println("An error occured.");
		}
	}

	public static ChemicalElement readBinary(String fileName)
	{
		String name = "";
		String symbol = "";
		int atomicNumber = -1;
		String[] bonds = {};
		String line;
		ChemicalElement chemical = null;

		try
		( 
			DataInputStream dataIn = new DataInputStream(new FileInputStream(fileName));
		)
		{
			while ((line = dataIn.readLine()) != null)
			{
				String[] parts = line.strip().split(":");
				if (!(parts[0].equals("{")) && !(parts[0].equals("}")))
				{
					String clean_value = parts[1].split(",")[0].strip();

					switch (parts[0])
					{
						case "\"atomicNumber\"":
							atomicNumber = Integer.parseInt(clean_value);
							break;
						case "\"bondsWith\"":
							clean_value = parts[1].strip();
							clean_value = clean_value.substring(
							1, clean_value.length()-2
							);
							bonds = clean_value.split(",");
							break;
						case "\"name\"":
							name = clean_value;
							break;
						case "\"symbol\"":
							symbol = clean_value;
							break;
					}
				}
			}
			System.out.println(fileName + " read successfully.");
			chemical = new ChemicalElement(name, symbol, atomicNumber, bonds);
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
			return chemical;
		}
	}
}
