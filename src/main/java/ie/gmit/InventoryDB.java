package ie.gmit;

import java.util.ArrayList;
import java.util.Arrays;

public class InventoryDB {

    public static Item getInventory(String itemName) {

        Item item = null;
        String[] productInventory = {"vasaline", "shampoo", "glasses"};
        String[] perscriptionInventory = {"ventolin", "adderall xr", "benzonatate"};

        ArrayList<String> productsList = new ArrayList<>();
        ArrayList<String> perscriptionList = new ArrayList<>();

        productsList.addAll(Arrays.asList(productInventory));
        perscriptionList.addAll(Arrays.asList(perscriptionInventory));

        if(productsList.contains(itemName)){
            Products product = new Products();
            switch (itemName) {
                case "vasaline":
                    product.setName(itemName);
                    product.setPrice(2.50);
                    product.setQuantity(50);
                    product.setProductID("P000125");
                    product.setProductShelf("A01");
                    break;
                case "shampoo":
                    product.setName(itemName);
                    product.setPrice(5.00);
                    product.setQuantity(42);
                    product.setProductID("P456123");
                    product.setProductShelf("B03");
                    break;
                case "glasses":
                    product.setName(itemName);
                    product.setPrice(21.99);
                    product.setQuantity(15);
                    product.setProductID("P452777");
                    product.setProductShelf("C05");
                    break;
            }
            item = product;

        } else if(perscriptionList.contains(itemName)) {
            Prescription prescription = new Prescription();
            switch (itemName) {
                case "ventolin":
                    prescription.setName(itemName);
                    prescription.setPrice(4.75);
                    prescription.setQuantity(15);
                    prescription.setPrescriptionID("D464853");
                    prescription.setPrescription(true);
                    break;
                case "adderall xr":
                    prescription.setName(itemName);
                    prescription.setPrice(184.00);
                    prescription.setQuantity(500);
                    prescription.setPrescriptionID("D114875");
                    prescription.setPrescription(true);
                    break;
                case "benzonatate":
                    prescription.setName(itemName);
                    prescription.setPrice(21.60);
                    prescription.setQuantity(457);
                    prescription.setPrescriptionID("D236967");
                    prescription.setPrescription(true);
                    break;
            }
            item = prescription;

        } else {
            throw new IllegalArgumentException("Item not in stock");
        }

        return item;
    }
}
