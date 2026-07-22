// 2. Online Coupon Validator
// An e-commerce website validates discount coupons.
// ● Create an interface CouponValidator containing:
// ○ abstract method validateCoupon(String code)
// ○ static method isLengthValid(String code)
// ● Store coupon codes in a String[].
// ● Implement the interface in a class ShoppingCart.
// Task: Check each coupon from the array and print whether it is valid or
// invalid.


interface CouponValidator {
    boolean validateCoupon(String code);

    static boolean isLengthValid(String code) {
        return code != null && code.length() == 8;
    }
}

class ShoppingCart implements CouponValidator {
    private final String[] coupons;

    public ShoppingCart(String[] coupons) {
        this.coupons = coupons;
    }

    @Override
    public boolean validateCoupon(String code) {
        for (String coupon : coupons) {
            if (coupon.equals(code) && CouponValidator.isLengthValid(code)) {
                return true;
            }
        }
        return false;
    }

    public void checkCoupons() {
        for (String coupon : coupons) {
            if (validateCoupon(coupon)) {
                System.out.println("Coupon " + coupon + " is valid.");
            } else {
                System.out.println("Coupon " + coupon + " is invalid.");
            }
        }
    }
}


public class OnlineCouponValidator {
    public static void main(String[] args) {
        String[] coupons = {"SAVE20A", "DISCOUNT", "WELCOME1", "INVALID", "SAVE20B"};
        ShoppingCart cart = new ShoppingCart(coupons);
        cart.checkCoupons();
    }
}