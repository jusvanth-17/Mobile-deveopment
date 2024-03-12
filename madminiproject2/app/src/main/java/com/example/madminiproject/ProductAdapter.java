package com.example.madminiproject;

public class ProductAdapter extends ArrayAdapter<Product> {

    public ProductAdapter(Context context, List<Product> products) {
        super(context, 0, products);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Product product = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);
        }
        TextView productNameTextView = convertView.findViewById(android.R.id.text1);
        if (product != null) {
            productNameTextView.setText(product.getName() + " - $" + product.getPrice());
        }
        return convertView;
    }
}
