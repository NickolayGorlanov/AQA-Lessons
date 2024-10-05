package Animals;

class Bowl {
    private int foodAmount;

    public Bowl(int initialFood) {
        this.foodAmount = initialFood;
    }

    public void addFood(int amount) {
        foodAmount += amount;
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public boolean feedCat(Cat cat) {
        if (foodAmount > 0) {
            foodAmount--; // Уменьшаем количество еды в миске
            return true;
        } else {
            return false; // Если еды нет, возвращаем false
        }
    }
}