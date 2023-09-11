package lab4.task2;

public class Main {
    public static void main(String[] args) {
        TShirt tShirt = new TShirt(ClothingSize.M, 400.0, "Черный");
        Pants pants = new Pants(ClothingSize.L, 700.0, "Синий");
        Skirt skirt = new Skirt(ClothingSize.XS, 200.0, "Красный");
        Tie tie = new Tie(ClothingSize.L, 15.0, "Черный");

        Clothes[] allClothes = {tShirt, pants, skirt, tie};

        Atelier atelier = new Atelier();
        atelier.dressWomen(allClothes);
        atelier.dressMan(allClothes);
    }
}
