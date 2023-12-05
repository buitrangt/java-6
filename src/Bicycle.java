class Bicycle extends Vehicle {
    @Override
    void speedUp() {
        System.out.println("Xe đạp tăng tốc!");
    }

    @Override
    void applyBrakes() {
        System.out.println("Xe đạp áp dụng phanh!");
    }
}
