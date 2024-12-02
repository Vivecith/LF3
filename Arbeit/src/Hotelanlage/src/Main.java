import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Gebaeude> ResortList = new ArrayList<>();

        //Gebäude A

        ArrayList<Etage> gebaeudeAList = new ArrayList<>();

        ArrayList<Zimmer> etageA1List = new ArrayList<>();
        Zimmer zimmerA11 = new Zimmer("A11");
        Zimmer zimmerA12 = new Zimmer("A12");
        Zimmer zimmerA13 = new Zimmer("A13");
        etageA1List.add(zimmerA11);
        etageA1List.add(zimmerA12);
        etageA1List.add(zimmerA13);
        Etage etageA1 = new Etage("A1",etageA1List);

        gebaeudeAList.add(etageA1);

        ArrayList<Zimmer> etageA2List = new ArrayList<>();
        Zimmer zimmerA21 = new Zimmer("A21");
        Zimmer zimmerA22 = new Zimmer("A22");
        Zimmer zimmerA23 = new Zimmer("A23");
        Zimmer zimmerA24 = new Zimmer("A24");
        etageA2List.add(zimmerA21);
        etageA2List.add(zimmerA22);
        etageA2List.add(zimmerA23);
        etageA2List.add(zimmerA24);
        Etage etageA2 = new Etage("A2",etageA2List);

        gebaeudeAList.add(etageA2);

        ArrayList<Zimmer> etageA3List = new ArrayList<>();
        Zimmer zimmerA31 = new Zimmer("A31");
        Zimmer zimmerA32 = new Zimmer("A32");
        Zimmer zimmerA33 = new Zimmer("A33");
        etageA3List.add(zimmerA31);
        etageA3List.add(zimmerA32);
        etageA3List.add(zimmerA33);
        Etage etageA3 = new Etage("A3",etageA3List);

        gebaeudeAList.add(etageA3);

        ArrayList<Zimmer> etageA4List = new ArrayList<>();
        Zimmer zimmerA41 = new Zimmer("A41");
        Zimmer zimmerA42 = new Zimmer("A42");
        Zimmer zimmerA43 = new Zimmer("A43");
        etageA4List.add(zimmerA41);
        etageA4List.add(zimmerA42);
        etageA4List.add(zimmerA43);
        Etage etageA4 = new Etage("A4",etageA4List);

        gebaeudeAList.add(etageA4);

        Gebaeude gebaeudeA = new Gebaeude("A", gebaeudeAList);

        ResortList.add(gebaeudeA);

        //Gebäude B

        ArrayList<Etage> gebaeudeBList = new ArrayList<>();

        ArrayList<Zimmer> etageB1List = new ArrayList<>();
        Zimmer zimmerB11 = new Zimmer("B11");
        Zimmer zimmerB12 = new Zimmer("B12");
        Zimmer zimmerB13 = new Zimmer("B13");
        etageB1List.add(zimmerB11);
        etageB1List.add(zimmerB12);
        etageB1List.add(zimmerB13);
        Etage etageB1 = new Etage("B1",etageB1List);

        gebaeudeBList.add(etageB1);

        ArrayList<Zimmer> etageB2List = new ArrayList<>();
        Zimmer zimmerB21 = new Zimmer("B21");
        Zimmer zimmerB22 = new Zimmer("B22");
        Zimmer zimmerB23 = new Zimmer("B23");
        Zimmer zimmerB24 = new Zimmer("B24");
        etageB2List.add(zimmerB21);
        etageB2List.add(zimmerB22);
        etageB2List.add(zimmerB23);
        etageB2List.add(zimmerB24);
        Etage etageB2 = new Etage("B2",etageB2List);

        gebaeudeBList.add(etageB2);

        ArrayList<Zimmer> etageB3List = new ArrayList<>();
        Zimmer zimmerB31 = new Zimmer("B31");
        Zimmer zimmerB32 = new Zimmer("B32");
        etageB3List.add(zimmerB31);
        etageB3List.add(zimmerB32);
        Etage etageB3 = new Etage("B3",etageB3List);

        gebaeudeBList.add(etageB3);

        Gebaeude gebaeudeB = new Gebaeude("B", gebaeudeBList);

        ResortList.add(gebaeudeB);

        //Gebäude C

        ArrayList<Etage> gebaeudeCList = new ArrayList<>();

        ArrayList<Zimmer> etageC1List = new ArrayList<>();
        Zimmer zimmerC11 = new Zimmer("C11");
        Zimmer zimmerC12 = new Zimmer("C12");
        Zimmer zimmerC13 = new Zimmer("C13");
        Zimmer zimmerC14 = new Zimmer("C14");
        etageC1List.add(zimmerC11);
        etageC1List.add(zimmerC12);
        etageC1List.add(zimmerC13);
        etageC1List.add(zimmerC14);
        Etage etageC1 = new Etage("C1",etageC1List);

        gebaeudeCList.add(etageC1);

        ArrayList<Zimmer> etageC2List = new ArrayList<>();
        Zimmer zimmerC21 = new Zimmer("C21");
        Zimmer zimmerC22 = new Zimmer("C22");
        Zimmer zimmerC23 = new Zimmer("C23");
        Zimmer zimmerC24 = new Zimmer("C24");
        Zimmer zimmerC25 = new Zimmer("C25");
        etageC2List.add(zimmerC21);
        etageC2List.add(zimmerC22);
        etageC2List.add(zimmerC23);
        etageC2List.add(zimmerC24);
        etageC2List.add(zimmerC25);
        Etage etageC2 = new Etage("C2",etageC2List);

        gebaeudeCList.add(etageC2);

        ArrayList<Zimmer> etageC3List = new ArrayList<>();
        Zimmer zimmerC31 = new Zimmer("C31");
        Zimmer zimmerC32 = new Zimmer("C32");
        Zimmer zimmerC33 = new Zimmer("C33");
        Zimmer zimmerC34 = new Zimmer("C34");
        etageC3List.add(zimmerC31);
        etageC3List.add(zimmerC32);
        etageC3List.add(zimmerC33);
        etageC3List.add(zimmerC34);
        Etage etageC3 = new Etage("C3",etageC3List);

        gebaeudeCList.add(etageC3);

        Gebaeude gebaeudeC = new Gebaeude("C", gebaeudeCList);

        ResortList.add(gebaeudeC);

        Adresse adresse = new Adresse("Am Howich", "6d", "20217", "Bremen");
        Hotelanlage anlage = new Hotelanlage("Am Howich-Hotel", ResortList);
        anlage.setAdresse(adresse);

        System.out.println(anlage.toString());

        Gast gast = new Gast("Jonas Marvin", "Meyer", adresse);

        System.out.println(anlage.locGast(gast));

        anlage.initializeGastA(gast, "A11");
    }
}