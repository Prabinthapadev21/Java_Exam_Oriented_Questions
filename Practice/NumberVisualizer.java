package Practice;
import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class NumberVisualizer extends JPanel {
    private int[] array;
    private int i = 0, j = 0;

    public NumberVisualizer(int[] array) {
        this.array = array;
        Timer timer = new Timer(1500, e -> {
            bubbleSortStep();
            repaint();
        });
        timer.start();
    }

    private void bubbleSortStep() {
        if (i < array.length - 1) {
            if (j < array.length - i - 1) {
                if (array[j] > array[j + 1]) {
                    // swap
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                j++;
            } else {
                j = 0;
                i++;
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int boxWidth = 50;
        int startX = 30;

        for (int k = 0; k < array.length; k++) {
            if (k == j || k == j + 1) {
                g.setColor(Color.RED); // highlight comparison
            } else {
                g.setColor(Color.BLUE);
            }
            g.fillRect(startX + k * boxWidth, 100, boxWidth - 5, 50);
            g.setColor(Color.WHITE);
            g.drawString(String.valueOf(array[k]), startX + k * boxWidth + 20, 130);
        }
    }

    public static void main(String[] args) {
        // Input dialog
        String input = JOptionPane.showInputDialog("Enter numbers separated by space:");
        int[] numbers = Arrays.stream(input.trim().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        JFrame frame = new JFrame("Bubble Sort Visualizer");
        NumberVisualizer panel = new NumberVisualizer(numbers);
        frame.add(panel);
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
