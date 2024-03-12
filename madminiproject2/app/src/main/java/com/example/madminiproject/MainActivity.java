package com.example.madminiproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ListView productListView;
    private Button addToCartButton;
    private List<Product> products;
    private ProductAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        productListView = findViewById(R.id.productListView);
        addToCartButton = findViewById(R.id.addToCartButton);

        // Sample product data
        products = new ArrayList<>();
        products.add(new Product("Product 1", 10.99));
        products.add(new Product("Product 2", 15.99));
        products.add(new Product("Product 3", 20.49));

        // Set up the adapter
        adapter = new ProductAdapter(this, products);
        productListView.setAdapter(adapter);

        // Handle button click event
        addToCartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle adding products to cart logic here
                // For simplicity, you can just display a toast message
                Toast.makeText(MainActivity.this, "Product added to cart!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
