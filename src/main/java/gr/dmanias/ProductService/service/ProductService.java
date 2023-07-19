package gr.dmanias.ProductService.service;

import gr.dmanias.ProductService.model.ProductRequest;
import gr.dmanias.ProductService.model.ProductResponse;

public interface ProductService {
    long addProduct(ProductRequest productRequest);

    ProductResponse getProductById(long productId);

    void reduceQuantity(long productId, long quantity);
}