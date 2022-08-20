public class Main {
    public static void main(String[] args) {
        Product product = new Product(1,"Laptop", "MSI Laptop", 20_000, 3, "Black");

        /* Product product = new Product();
        product.setId(1);
        product.setName("Laptop");
        product.setDescription("MSI Laptop");
        product.setPrice(20_000);
        product.setStockAmount(3);
        product.setColor("Black");*/

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.getCode());

    }
}
