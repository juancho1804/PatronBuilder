package entities;

public class Item {
    Producto product;
    int cantidad;
    double importe;

    public Item(Producto product, int cantidad) {
        this.product = product;
        this.cantidad = cantidad;
        this.importe=cantidad*product.getPrice();
    }

    public Producto getProduct() {
        return product;
    }

    public void setProduct(Producto product) {
        this.product = product;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
}
