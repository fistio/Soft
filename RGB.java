class RGB {
    private int r;
    private int g;
    private int b;

    // Конструктор класа. Записує потрібні значення в відповідні перемінні.
    RGB(int r, int g, int b){
        this.r = r;
        this.g = g;
        this.b = b;
    }

    // Вивід на  екран
    void print(){
        String out = "R = " + r + ", G = " + g + ", B = " + b;
        System.out.println(out);
    }
}
