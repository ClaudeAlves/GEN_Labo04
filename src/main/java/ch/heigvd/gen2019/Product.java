package ch.heigvd.gen2019;

public class Product {
    private String code;
    private Color color;
    private Size size;
    private double price;
    private String currency;

    public Product(String code, Color color, Size size, double price, String currency) {
        this.code = code;
        this.color = color;
        this.size = size;
        this.price = price;
        this.currency = currency;
    }

    void getProductContent(StringBuffer sb) {
        sb.append("{");
        sb.append("\"code\": \"");
        sb.append(code);
        sb.append("\", ");
        sb.append("\"color\": \"");
        sb.append(color.toString());
        sb.append("\", ");

        if (!size.equals(Size.SIZE_NOT_APPLICABLE)) {
            sb.append("\"size\": \"");
            sb.append(size.toString());
            sb.append("\", ");
        }

        sb.append("\"price\": ");
        sb.append(price);
        sb.append(", ");
        sb.append("\"currency\": \"");
        sb.append(currency);
        sb.append("\"}, ");
    }
}