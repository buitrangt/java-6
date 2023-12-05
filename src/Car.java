class Car extends Vehicle {
    @Override
    void speedUp() {
        System.out.println("Ô tô tăng tốc!");
    }

    @Override
    void applyBrakes() {
        System.out.println("Ô tô áp dụng phanh!");
    }
}
