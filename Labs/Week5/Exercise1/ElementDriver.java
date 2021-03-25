import java.util.Arrays;

public class ElementDriver
{

    public static void main(String args[])
    {
        String[] covalentBondsH = {"H", "O", "N", "C"};
        ChemicalElement hydrogen = new ChemicalElement(
            "Hydrogen", "H", 1, covalentBondsH
        );

        String[] covalentBondsO = {"O", "H", "C"};
        ChemicalElement oxygen = new ChemicalElement(
            "Oxygen", "O", 8, covalentBondsO
        );

        String[] covalentBondsN = {"H", "N"};
        ChemicalElement nitrogen = new ChemicalElement(
            "Nitrogen", "N", 7, covalentBondsN
        );

        System.out.println(hydrogen.toJSON());
        System.out.println(oxygen.toJSON());
        System.out.println(nitrogen.toJSON());

        System.out.println(Arrays.toString(hydrogen.toJSONLines()));
        System.out.println(Arrays.toString(oxygen.toJSONLines()));
        System.out.println(Arrays.toString(nitrogen.toJSONLines()));

        hydrogen.writeJSON();
        oxygen.writeJSON();
        nitrogen.writeJSON();

        ChemicalElement phosphorus = ChemicalElement.readJSON("Phosphorus.txt");
        System.out.println(phosphorus.toJSON());
    }
}