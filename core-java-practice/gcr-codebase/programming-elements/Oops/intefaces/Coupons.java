package intefaces;

// Interface
interface CouponValidator {

    // Abstract method
    void validateCoupon(String code);

    // Static method
    static boolean isLengthValid(String code) {
        return code.length() >= 5;
    }
}

// Class implementing the interface
class ShoppingCart implements CouponValidator {

    public void validateCoupon(String code) {

        if (CouponValidator.isLengthValid(code)) {
            System.out.println(code + " -> Valid");
        } else {
            System.out.println(code + " -> Invalid");
        }
    }
}

// Main class
public class Coupons {
    public static void main(String[] args) {

        // Array of coupon codes
        String[] coupons = {
            "SAVE10",
            "OFF",
            "WELCOME",
            "ABC",
            "SALE20"
        };

        ShoppingCart cart = new ShoppingCart();

        // Check each coupon
        for (String code : coupons) {
            cart.validateCoupon(code);
        }
    }
}
