package sample;

import P_Strateg_R.*;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controller {
    public TextField tx_array;
    public TextField tx_bubble;
    public TextField tx_selection;
    public TextField tx_insertion;
    public Button b_bubble;
    public Button b_selection;
    public Button b_insertion;
    public ListView list_view;
    private Context_R context;
    int n=0;
    StringBuffer sb_bubble=new StringBuffer();
    StringBuffer sb_select=new StringBuffer();
    StringBuffer sb_insert=new StringBuffer();
    StringBuffer sb=new StringBuffer();
    private int[] array_n = new int[5];
    public int[]array_b=new int[]{1,5,9,3,6};


    public void on_array(ActionEvent actionEvent) {
        sb.setLength(0);
        for (int i = 0; i < array_n.length; i++) {
            array_n[i] = ((int) (Math.random() * 11) + 1);
            sb.append(String.valueOf(array_n[i]+" | "));
            }
        tx_array.setText(sb.toString());

    }

    public void bubbleSort(ActionEvent actionEvent) {
        sb_bubble.setLength(0);
        context = new Context_R(new Bubble_Sort_R());
        context.sortArray_R(array_n);
        for(int i = 0; i <  array_n.length; i++) {
            sb_bubble.append(String.valueOf(array_n[i]+" | "));
        }
        tx_bubble.setText(sb_bubble.toString());
        }


    public void selectionSort(ActionEvent actionEvent) {
        sb_select.setLength(0);
        context = new Context_R(new Selection_Sort_R());
        context.sortArray_R(array_n);
        for(int i = 0; i <  array_n.length; i++) {
            sb_select.append(String.valueOf(array_n[i]+" | "));
        }
        tx_selection.setText(sb_select.toString());
    }


    public void insertionSort(ActionEvent actionEvent) {
        sb_insert.setLength(0);
        context = new Context_R(new Insertion_Sort_R());
        context.sortArray_R(array_n);
        for(int i = 0; i <  array_n.length; i++) {
            sb_insert.append(String.valueOf(array_n[i]+" | "));
        }
        tx_insertion.setText(sb_insert.toString());
    }


}
