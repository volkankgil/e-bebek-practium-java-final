package PatikaStore;

public abstract class productFeature extends brand {

    int productId;
    String productName;
    int productUn�tPrice;
    int productDiscountRatio;
    int productStockQuantity;

    public productFeature(String BrandName, int BrandId, int productId, String productName, int productUn�tPrice, int productDiscountRatio, int productStockQuantity){
        super(BrandName, BrandId);
        this.productId = productId;
        this.productName = productName;
        this.productUn�tPrice = productUn�tPrice;
        this.productDiscountRatio = productDiscountRatio;
        this.productStockQuantity = productStockQuantity;
    }
    public productFeature(){
    }

    public abstract void menu();
    public abstract void addProduct();
    public abstract void delete();
    public abstract void search();
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductUn�tPrice() {
        return productUn�tPrice;
    }
    public void setProductUn�tPrice(int productUn�tPrice) {
        this.productUn�tPrice = productUn�tPrice;
    }
    public int getProductDiscountRatio() {
        return productDiscountRatio;
    }
    public void setProductDiscountRatio(int productDiscountRatio) {
        this.productDiscountRatio = productDiscountRatio;
    }
    public int getProductStockQuantity() {
        return productStockQuantity;
    }
    public void setProductStockQuantity(int productStockQuantity) {
        this.productStockQuantity = productStockQuantity;
    }
}

