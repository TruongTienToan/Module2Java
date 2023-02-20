package S12_Java_Collection_Framework.LuyenTapArrayListLinkedList;

public class Test {
    public static void main(String[] args) {

        ProductManager list = new ProductManager();

        list.addProduct(01,"Ban",700000);
        list.addProduct(02,"Ghe",900000);
        list.addProduct(03,"Tu",300000);
        list.addProduct(04,"Giuong",500000);
        list.showProductList();

        list.editProductById(1,"Ban xep",10000);
        list.showProductList();

        list.removeProductByID(2);
        list.showProductList();

        list.searchProductByName("Tu");
        list.searchProductByName("Laptop");

        list.ASCSort();
        list.showProductList();

        list.DSCSort();
        list.showProductList();

    }
}
