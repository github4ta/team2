package itacademy.team2;

/**
 * Расчет идеального веса по формуле Лоренца
 * Это уже третий калькулятор, связанный с расчетом идеального веса.
 * Надо конечно, понимать, что все эти формулы условны и дают «примерный» идеальный вес.
 * Тем не менее, вот еще одна методика определения идеального веса.
 * Проще не бывает: учитывается только рост.
 * Согласно формуле Лоренца,
 * идеальный вес — это (рост в сантиметрах - 100) - (рост в сантиметрах - 150)/2.
 *
 */
public class CalculatorWeight {
    private int height;

    public CalculatorWeight(int height) {
        if (height <= 0) {
            System.out.println("Height should be more than 0");
        } else {
            this.height = height;
        }
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}
