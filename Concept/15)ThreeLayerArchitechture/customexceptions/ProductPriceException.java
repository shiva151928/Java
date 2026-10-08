package org.example.customexceptions;

public class ProductPriceException extends Exception {

    public ProductPriceException()
    {
        super("Product price cant be 0");
    }

    public ProductPriceException(String msg)
    {
        super(msg);
    }
}
