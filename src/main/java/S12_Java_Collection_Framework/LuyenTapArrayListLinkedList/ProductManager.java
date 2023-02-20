package S12_Java_Collection_Framework.LuyenTapArrayListLinkedList;

import java.util.*;

public class ProductManager {
    private List<Product> products = new ArrayList<>();

    public ProductManager() {

    }

    public void addProduct(int id, String name, int price) {
        products.add(new Product(id,name,price));
    }

    public void editProductById(int id, String name, int price) {
        for (int i = 0; i < products.size(); i++) {
            Product item = products.get(i);
            if (item.getId() == id) {
                products.set(i, new Product(id, name, price));
            }
        }
    }

    public void removeProductByID(int id) {
        for (int i = 0; i < products.size(); i++) {
            Product item = products.get(i);
            if (item.getId() == id) {
                products.remove(i);
            }
        }
    }

    public void showProductList() {
        for (Product item : products) {
            System.out.println(item.toString());
        }
    }

    public void searchProductByName(String name) {
        for (Product item : products) {
            if (item.getName() == name) {
                System.out.println(item.toString());
                return;
            }
        }
        System.out.println(name + " invalid");
    }

    public void ASCSort() {
        Collections.sort(products);
    }

    public void DSCSort() {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() < o2.getPrice()) {
                    return 1;
                } else if (o1.getPrice() > o2.getPrice()) {
                    return -1;
                } else
                    return 0;
            }
        });
    }
}
