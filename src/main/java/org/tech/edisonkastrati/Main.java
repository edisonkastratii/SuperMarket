package org.tech.edisonkastrati;

import com.google.gson.GsonBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Main {
    double tempSubTotalWater = 0, tempSubTotalChips = 0, tempSubTotalCocaCola = 0, tempSubTotalChocolateBars = 0, tempSubTotalHandSoup = 0, tempSubTotalFishMeat = 0,
            tempSubTotalHumus = 0, tempSubTotalBanana = 0, tempSubTotalTV = 0, tempSubTotalLotions = 0, tempSubTotalWine = 0, tempSubTotalWhiteWine = 0,
            tempSubTotalOil = 0, tempSubTotalCigarette = 0, tempSubTotalCookie = 0, tempSubTotalYogurt = 0, tempSubTotalBleach = 0, tempSubTotalNapkin = 0,
            tempSubTotalEgg = 0, tempSubTotalPlasticBags = 0, tempSubTotalAluminumFoils = 0, tempSubTotalRazors = 0;
    double tempVATWater = 0, tempVATChips = 0, tempVATCocaCola = 0, tempVATChocolateBars = 0, tempVATHandSoup = 0, tempVATFishMeat = 0,
            tempVATHumus = 0, tempVATBanana = 0, tempVATTV = 0, tempVATLotions = 0, tempVATWine = 0, tempVATWhiteWine = 0, tempVATOil = 0, tempVatCigarette = 0,
            tempVATCookie = 0, tempVATYogurt = 0, tempVATBleach = 0, tempVATNapkin = 0, tempVATEgg = 0, tempVATPlasticBags = 0, tempVATAluminumFoils = 0, tempVATRazors = 0;
    double tempTotalWater = 0, tempTotalChips = 0, tempTotalCocaCola = 0, tempTotalChocolateBars = 0, tempTotalHandSoup = 0, tempTotalFishMeat = 0,
        tempTotalHumus = 0, tempTotalBanana = 0, tempTotalTV = 0, tempTotalLotions = 0, tempTotalWine = 0, tempTotalWhiteWine = 0, tempTotalOil = 0, tempTotalCigarette = 0,
        tempTotalCookie = 0, tempTotalYogurt = 0, tempTotalBleach = 0, tempTotalNapkin = 0, tempTotalEgg = 0, tempTotalPlasticBags = 0, tempTotalAluminumFoils = 0, tempTotalRazors = 0;



    public void calculate(Product product){
        if(product.getName().equals("Water")){
            double v = product.getQuantity() * product.getPrice();
            tempSubTotalWater = v;
            tempVATWater = (v / 100) * product.getVAT();
            tempTotalWater = v + tempVATWater;
        }
        if (product.getName().equals("Chips")) {
            double v = product.getQuantity() * product.getPrice();
            tempSubTotalChips = v;
            tempVATChips = (v / 100) * product.getVAT();
            tempTotalChips = v + tempVATChips;
        }
        if (product.getName().equals("Coca Cola")) {
            double v = product.getQuantity() * (product.getPrice() - product.getDiscount());
            tempSubTotalCocaCola = v;
            tempVATCocaCola = (v / 100) * product.getVAT();
            tempTotalCocaCola = v + tempVATCocaCola;
        }
        if (product.getName().equals("Chocolate Bars")) {
            double v = product.getQuantity() * product.getPrice();
            tempSubTotalChocolateBars = v;
            tempVATChocolateBars = (v / 100) * product.getVAT();
            tempTotalChocolateBars = v + tempVATChocolateBars;
        }
        if (product.getName().equals("Hand Soup")) {
            double v = product.getQuantity() * product.getPrice();
            tempSubTotalHandSoup = v;
            tempVATHandSoup= (v / 100) * product.getVAT();
            tempTotalHandSoup = v + tempVATHandSoup;
        }
        if (product.getName().equals("Fish Meat")) {
            double v = product.getQuantity() * product.getPrice();
            tempSubTotalFishMeat = v;
            tempVATFishMeat= (v / 100) * product.getVAT();
            tempTotalFishMeat = v + tempVATFishMeat;
        }
        if (product.getName().equals("Humus")) {
            double v = product.getQuantity() * product.getPrice();
            tempSubTotalHumus = v;
            tempVATHumus= (v / 100) * product.getVAT();
            tempTotalHumus= v + tempVATHumus;
        }
        if (product.getName().equals("Banana")) {
            double v = product.getQuantity() * product.getPrice();
            tempSubTotalBanana = v;
            tempVATBanana= (v / 100) * product.getVAT();
            tempTotalBanana = v + tempVATBanana;
        }
        if (product.getName().equals("TV")) {
            double v = product.getQuantity() * product.getPrice();
            tempSubTotalTV = v;
            tempVATTV= (v / 100) * product.getVAT();
            tempTotalTV = v + tempVATTV;
        }
        if (product.getName().equals("Lotions")) {
            double v = product.getQuantity() * product.getPrice();
            tempSubTotalLotions = v;
            tempVATLotions= (v / 100) * product.getVAT();
            tempTotalLotions = v + tempVATLotions;
        }
        if (product.getName().equals("Wine")) {
            double v = product.getQuantity() * product.getPrice();
            tempSubTotalWine = v;
            tempVATWine= (v / 100) * product.getVAT();
            tempTotalWine = v + tempVATWine;
        }
        if (product.getName().equals("White Wine")) {
            double v = product.getQuantity() * (product.getPrice() - product.getDiscount());
            tempSubTotalWhiteWine = v;
            tempVATWhiteWine = (v / 100) * product.getVAT();
            tempTotalWhiteWine = v + tempVATWhiteWine;
        }
        if (product.getName().equals("Oil")) {
            double v = product.getQuantity() * product.getPrice();
            tempSubTotalOil = v;
            tempVATOil= (v / 100) * product.getVAT();
            tempTotalOil = v + tempVATOil;
        }
        if (product.getName().equals("Cigarettes")) {
            double v = product.getQuantity() * product.getPrice();
            tempSubTotalCigarette = v;
            tempVatCigarette= (v / 100) * product.getVAT();
            tempTotalCigarette = v + tempVatCigarette;
        }
        if (product.getName().equals("Cookie")) {
            double v = product.getQuantity() * product.getPrice();
            tempSubTotalCookie = v;
            tempVATCookie= (v / 100) * product.getVAT();
            tempTotalCookie = v + tempVATCookie;
        }if (product.getName().equals("Yogurt")) {
            double v = product.getQuantity() * product.getPrice();
            tempSubTotalYogurt = v;
            tempVATYogurt = (v / 100) * product.getVAT();
            tempTotalYogurt = v + tempVATYogurt;
        }
        if (product.getName().equals("Bleach")) {
            double v = product.getQuantity() * product.getPrice();
            tempSubTotalBleach = v;
            tempVATBleach = (v / 100) * product.getVAT();
            tempTotalBleach = v + tempVATBleach;
        }
        if (product.getName().equals("Napkin")) {
            double v = product.getQuantity() * product.getPrice();
            tempSubTotalNapkin = v;
            tempVATNapkin = (v / 100) * product.getVAT();
            tempTotalNapkin = v + tempVATNapkin;
        }
        if (product.getName().equals("Egg")) {
            double v = product.getQuantity() * product.getPrice();
            tempSubTotalEgg = v;
            tempVATEgg = (v / 100) * product.getVAT();
            tempTotalEgg = v + tempVATEgg;
        }
        if (product.getName().equals("Plastic Bags")) {
            double v = product.getQuantity() * product.getPrice();
            tempSubTotalPlasticBags = v;
            tempVATPlasticBags = (v / 100) * product.getVAT();
            tempTotalPlasticBags = v + tempVATPlasticBags;
        }
        if (product.getName().equals("Aluminum Foils")) {
            double v = product.getQuantity() * product.getPrice();
            tempSubTotalAluminumFoils = v;
            tempVATAluminumFoils = (v / 100) * product.getVAT();
            tempTotalAluminumFoils = v + tempVATAluminumFoils;
        }
        if (product.getName().equals("Razors")) {
            double v = product.getQuantity() * product.getPrice();
            tempSubTotalRazors = v;
            tempVATRazors = (v / 100) * product.getVAT();
            tempTotalRazors = v + tempVATRazors;
        }
    }
    double subTotal = 0;
    double VAT = 0;
    double total = 0;
    public void print(){
        subTotal = tempSubTotalWater + tempSubTotalChips + tempSubTotalCocaCola + tempSubTotalChocolateBars + tempSubTotalHandSoup + tempSubTotalFishMeat
                + tempSubTotalHumus + tempSubTotalBanana + tempSubTotalTV + tempSubTotalLotions + tempSubTotalWine + tempSubTotalWhiteWine + tempSubTotalOil +
                tempSubTotalCigarette + tempSubTotalCookie + tempSubTotalYogurt + tempSubTotalBleach + tempSubTotalNapkin + tempSubTotalEgg + tempSubTotalPlasticBags +
                tempSubTotalAluminumFoils + tempSubTotalRazors;

        VAT = tempVATWater + tempVATChips + tempVATCocaCola + tempVATChocolateBars + tempVATHandSoup + tempVATFishMeat
                + tempVATHumus + tempVATBanana + tempVATTV + tempVATLotions + tempVATWine + tempVATWhiteWine + tempVATOil + tempVatCigarette + tempVATCookie + tempVATYogurt +
                tempVATBleach + tempVATNapkin + tempVATEgg + tempVATPlasticBags + tempVATAluminumFoils + tempVATRazors;

        total = tempTotalChips + tempTotalWater + tempTotalCocaCola + tempTotalChocolateBars + tempTotalHandSoup + tempTotalFishMeat
                + tempTotalHumus + tempTotalBanana + tempTotalTV + tempTotalLotions + tempTotalWine + tempTotalWhiteWine + tempTotalOil + tempTotalCigarette + tempTotalCookie +
                tempTotalYogurt + tempTotalBleach + tempTotalNapkin + tempTotalEgg + tempTotalPlasticBags + tempTotalAluminumFoils + tempTotalRazors;

        Map<String, Double> list = new HashMap<>();
            list.put("Sub Total: ",subTotal);
            list.put("Vat: ",VAT);
            list.put("Total: ",total);

        String json = new GsonBuilder().setPrettyPrinting().create().toJson(list);

        System.out.println("Invoice: " + json);

    }

    public static void main(String[] args) {
        Main m = new Main();
        Product chips = new Product(38,"Chips",2.4, 8);
        Product water = new Product(50,"Water",0.25, 8);
        Product cocaCola = new Product(50,"Coca Cola",0.50, 18, 0.10);
        Product chocolateBars = new Product(38,"Chocolate Bars",1.25, 22);
        Product handSoup = new Product(50,"Hand Soup",3.78, 8);
        Product fishMeat = new Product(9,"Fish Meat",8.30, 18);
        Product humus = new Product(4,"Humus",2.66, 18);
        Product banana = new Product(1,"Banana",1.25, 22);
        Product tv = new Product(1,"TV",760, 22);
        Product lotions = new Product(205,"Lotions",12, 22);
        Product wine = new Product(22,"Wine",9.78, 22);
        Product whiteWine = new Product(18,"White Wine",9.20, 18,0.02);
        Product oil = new Product(10,"Oil",8.30, 18);
        Product cigarette = new Product(89,"Cigarettes",5.46, 22);
        Product cookie = new Product(33,"Cookie",1.34, 8);
        Product yogurt = new Product(14,"Yogurt",0.66, 18);
        Product bleach = new Product(11,"Bleach",1.23, 22);
        Product napkin = new Product(85,"Napkin",0.21, 8);
        Product egg = new Product(104,"Egg",0.16, 18);
        Product plasticBags = new Product(398,"Plastic Bags",0.05, 18);
        Product aluminumFoils = new Product(21,"Aluminum Foils",1.12, 8);
        Product razors = new Product(51,"Razors",8.10, 8);
        m.calculate(chips);
        m.calculate(water);
        m.calculate(cocaCola);
        m.calculate(chocolateBars);
        m.calculate(handSoup);
        m.calculate(fishMeat);
        m.calculate(humus);
        m.calculate(banana);
        m.calculate(tv);
        m.calculate(lotions);
        m.calculate(wine);
        m.calculate(whiteWine);
        m.calculate(oil);
        m.calculate(cigarette);
        m.calculate(cookie);
        m.calculate(yogurt);
        m.calculate(bleach);
        m.calculate(napkin);
        m.calculate(egg);
        m.calculate(plasticBags);
        m.calculate(aluminumFoils);
        m.calculate(razors);
        m.print();
    }
}
